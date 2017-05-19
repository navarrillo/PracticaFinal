
/**
 * GestionProveedoresSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.gestionproveedores;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
/**
 * GestionProveedoresSkeleton java skeleton for the axisService
 */
public class GestionProveedoresSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param generarOferta
	 * @return generarOfertaResponse
	 */

	public org.example.www.gestionproveedores.GenerarOfertaResponse generarOferta(
			org.example.www.gestionproveedores.GenerarOferta generarOferta) {
GenerarOfertaResponse respuesta = new GenerarOfertaResponse();
		
		if(generarOferta.getNuevaOfeta() < 0 || generarOferta.getNuevaOfeta() > 1  ){
			respuesta.setConfirmacion(false);
			respuesta.setMensaje("el valor de la nueva oferta debe estár en el rango [0.0 , 1.0]");
			return respuesta;
		}
		
		String tablaProveedor = "";
		
		//BÚSQUEDA DE LA TABLA CORRESPONDIENTE AL PROVEEDOR INDICADO POR EL CIF (COLUMNA DBTABLA EN LA TABLA PROVEEDORES)
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		Connection con = null;
		ResultSet rs = null;
		Statement cmd = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");
			cmd = con.createStatement();
			
			//proveedor 1
			String tabla = "SELECT dbtabla FROM proveedores WHERE cif like '"+generarOferta.getCif()+"';";
			rs = cmd.executeQuery(tabla);
			
			while (rs.next()) {
				tablaProveedor = rs.getString("dbtabla");;
			}			
			cmd = con.createStatement();
			
			rs.close();

		} catch (SQLException ex) {
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + ex.getMessage());
			respuesta.setConfirmacion(false);
			respuesta.setMensaje("No existe el CIF en la base de datos");
			return respuesta;
		}
		
		if(tablaProveedor.equals("")){
			respuesta.setConfirmacion(false);
			respuesta.setMensaje("No existe el CIF en la base de datos");
			return respuesta;
		}
		
		//UPDATE DE LA COLUMNA OFERTA EN LA TABLA CORRESPONDIENTE AL PROVEEDOR INDICADO CON EL CIF
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.out.println("ERROR1");
			e.printStackTrace();
		}
		try {
			Connection conexion;
			conexion = DriverManager
					.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");
			Statement s = conexion.createStatement();
			String consulta = "UPDATE `"+ tablaProveedor +"` SET" + "`oferta` = '"+ generarOferta.getNuevaOfeta() +"' WHERE CIF LIKE '"+ generarOferta.getCif() +"';";

			s.executeUpdate(consulta);
			respuesta.setConfirmacion(true);
			respuesta.setMensaje("Se ha generado la oferta correctamente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + e.getMessage());
			respuesta.setConfirmacion(false);
			respuesta.setMensaje("No existe el CIF en la base de datos");
			return respuesta;
		}
		
		return respuesta;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param leerOfertas
	 * @return leerOfertasResponse
	 */

	public org.example.www.gestionproveedores.LeerOfertasResponse leerOfertas(
			org.example.www.gestionproveedores.LeerOfertas leerOfertas) {
		
		LeerOfertasResponse respuesta = new LeerOfertasResponse();
		
		//proveedor 1
		double ski1 = 0;
		double material1 = 0;
		double profesor1 = 0; 
		double alojamiento1 = 0;
		//proveedor 2
		double ski2 = 0;
		double material2 = 0;
		double profesor2 = 0; 
		double alojamiento2 = 0;
		//proveedor 2
		double ski3 = 0;
		double material3 = 0;
		double profesor3 = 0; 
		double alojamiento3 = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Registro exitoso");

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		Connection con = null;
		ResultSet rs = null;
		Statement cmd = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");

			// Otros y operaciones sobre la base de datos...

			cmd = con.createStatement();
			
			//proveedor 1
			String prov = "SELECT * FROM serviciosproveedor";
			rs = cmd.executeQuery(prov);
			
			while (rs.next()) {
				ski1 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material1 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor1 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento1 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}			
			cmd = con.createStatement();
		
			//proveedor 2
			String prov1 = "SELECT * FROM serviciosproveedor1";
			rs = cmd.executeQuery(prov1);
			
			while (rs.next()) {
				ski2 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material2 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor2 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento2 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}
			cmd = con.createStatement();
			
			//proveedor 3
			String prov2 = "SELECT * FROM serviciosproveedor2";
			rs = cmd.executeQuery(prov2);
			
			while (rs.next()) {
				ski3 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material3 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor3 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento3 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}			
			cmd = con.createStatement();
			
			rs.close();

		} catch (SQLException ex) {

			// Mantener el control sobre el tipo de error
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + ex.getMessage());

		}
		
		String prov1 = ""+ski1+","+material1+","+profesor1+","+alojamiento1;
		String prov2 = ""+ski2+","+material2+","+profesor2+","+alojamiento2; 
		String prov3 = ""+ski3+","+material3+","+profesor3+","+alojamiento3; 
		
		respuesta.setMensaje("todo perfe primo, no estás en la B");
		respuesta.setProv1(prov1);
		respuesta.setProv2(prov2);
		respuesta.setProv3(prov3);
		return respuesta;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param leerOfertasSiHay
	 * @return leerOfertasSiHayResponse
	 */

	public org.example.www.gestionproveedores.LeerOfertasSiHayResponse leerOfertasSiHay(
			org.example.www.gestionproveedores.LeerOfertasSiHay leerOfertasSiHay) {
		
		LeerOfertasSiHayResponse respuesta = new LeerOfertasSiHayResponse();
		
		
		//proveedor 1
		double oferta1 = 0.0; 
		double ski1 = 0;
		double material1 = 0;
		double profesor1 = 0; 
		double alojamiento1 = 0;
		//proveedor 2
		double oferta2 = 0.0; 
		double ski2 = 0;
		double material2 = 0;
		double profesor2 = 0; 
		double alojamiento2 = 0;
		//proveedor 2
		double oferta3 = 0.0; 
		double ski3 = 0;
		double material3 = 0;
		double profesor3 = 0; 
		double alojamiento3 = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Registro exitoso");

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		Connection con = null;
		ResultSet rs = null;
		Statement cmd = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");

			// Otros y operaciones sobre la base de datos...

			cmd = con.createStatement();
			
			//proveedor 1
			String prov = "SELECT * FROM serviciosproveedor";
			rs = cmd.executeQuery(prov);
			
			while (rs.next()) {
				oferta1 = rs.getDouble("oferta");
				ski1 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material1 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor1 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento1 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}			
			cmd = con.createStatement();
		
			//proveedor 2
			String prov1 = "SELECT * FROM serviciosproveedor1";
			rs = cmd.executeQuery(prov1);
			
			while (rs.next()) {
				oferta2 = rs.getDouble("oferta");
				ski2 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material2 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor2 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento2 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}
			cmd = con.createStatement();
			
			//proveedor 3
			String prov2 = "SELECT * FROM serviciosproveedor2";
			rs = cmd.executeQuery(prov2);
			
			while (rs.next()) {
				oferta3 = rs.getDouble("oferta");
				ski3 = (rs.getInt("ski")* rs.getDouble("oferta"));
				material3 = (rs.getInt("material")* rs.getDouble("oferta"));
				profesor3 = (rs.getInt("profesor")* rs.getDouble("oferta"));
				alojamiento3 = (rs.getInt("alojamiento")* rs.getDouble("oferta"));
			}			
			cmd = con.createStatement();
			
			rs.close();

		} catch (SQLException ex) {

			// Mantener el control sobre el tipo de error
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + ex.getMessage());

		}
		String prov1 = "";
		String prov2 = "";
		String prov3 = "";
		
		if(oferta1 != 1){
			prov1 = ""+ski1+","+material1+","+profesor1+","+alojamiento1;
		}
		if(oferta2 != 1){
			prov2 = ""+ski2+","+material2+","+profesor2+","+alojamiento2; 
		}
		if(oferta3 != 1){
			prov3 = ""+ski3+","+material3+","+profesor3+","+alojamiento3; 
		}
		
		respuesta.setMensaje("Consulta correcta");
		respuesta.setProv1(prov1);
		respuesta.setProv2(prov2);
		respuesta.setProv3(prov3);
		return respuesta;
	}

}
