
/**
 * GestionUsuariosSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.gestionusuarios;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * GestionUsuariosSkeleton java skeleton for the axisService
 */
public class GestionUsuariosSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param crearUsuario
	 * @return crearUsuarioResponse
	 */

	public org.example.www.gestionusuarios.CrearUsuarioResponse crearUsuario(
			org.example.www.gestionusuarios.CrearUsuario crearUsuario) {
		// Creacion de variable respuesta
		CrearUsuarioResponse respuesta = new CrearUsuarioResponse();

		// Recogida de datos
		Usuario user = crearUsuario.getCrearUsuario();
		String dni = user.getDni();
		String nombre = user.getNombre();
		String telefono = user.getTelefono();
		String email = user.getEmail();
		String password = user.getPassword();
		String direccion = user.getDireccion();
		boolean suscripcion = user.getSuscripcion();

		// salida default
		respuesta.setResultado(false);
		respuesta.setSalida("No se han recogido datos");

		// conexion a bbdd y negocio
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd",
					"root", "root");

			// Preparamos la consulta
			Statement s = (Statement) conexion.createStatement();
			String consulta = "INSERT INTO usuarios(`dni`, `nombre`, `telefono`, `email`, `password`, `direccion`,`suscripcion`) VALUES ("
					+ "\"" + dni + "\"," + "\"" + nombre + "\"," + "\"" + telefono + "\"," + "\"" + email + "\"," + "\""
					+ password + "\"," + "\"" + direccion + "\",\"";
			
			if(suscripcion == true)
				consulta +="si";
			else
				consulta +="no";
			
			consulta += "\")";

			Integer x = s.executeUpdate(consulta);
			respuesta.setResultado(true);
			respuesta.setSalida("Se ha registrado con éxito");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			respuesta.setResultado(false);
			respuesta.setSalida(e.toString());
			e.printStackTrace();
		}

		return respuesta;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public org.example.www.gestionusuarios.LoginResponse login(org.example.www.gestionusuarios.Login login) {
		// Creacion de variable respuesta
		LoginResponse respuesta = new LoginResponse();

		// Recogida de datos
		String email = login.getEmail();
		String password = login.getPassword();

		// salida default
		respuesta.setResultado(false);
		respuesta.setSalida("No se ha realizado el login todavía.");

		// conexion a bbdd y negocio
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd",
					"root", "root");

			// Preparamos la consulta
			Statement s = (Statement) conexion.createStatement();
			String consulta = "SELECT * FROM usuarios WHERE email LIKE \"" + email + "\" AND password LIKE \""
					+ password + "\"";

			ResultSet rs = s.executeQuery(consulta);

			if (rs.next()) {
				respuesta.setResultado(true);
				respuesta.setSalida("Usuario autenticado.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			respuesta.setResultado(false);
			respuesta.setSalida(e.toString());
			e.printStackTrace();
		}

		return respuesta;
	}

}
