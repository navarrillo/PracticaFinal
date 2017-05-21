
/**
 * GestionReservaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.gestionreserva;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.sql.*;

/**
 * GestionReservaSkeleton java skeleton for the axisService
 */
public class GestionReservaSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param crearReserva
	 * @return crearReservaResponse
	 */

	public org.example.www.gestionreserva.CrearReservaResponse crearReserva(
			org.example.www.gestionreserva.CrearReserva crearReserva) {
		System.out.println("ENTRO AL METODO");
		// Variable respuesta y datos iniciales
		CrearReservaResponse respuesta = new CrearReservaResponse();
		respuesta.setResultado(false);
		respuesta.setSalida("No se ha llegado a crear");

		// variable de entrada y recogida de datos en subvariables

		Reserva reserva = crearReserva.getCrearReserva();
		// int id = reserva.getId();
		Date fechaEntrada = reserva.getFechaEntrada();
		System.out.println("aqui1");
		Date fechaSalida = reserva.getFechaSalida();
		System.out.println("aqui2");
		String nombreCliente = reserva.getNombreCliente();
		String emailCliente = reserva.getEmailCliente();
		int precio = reserva.getPrecio();
		boolean ski = reserva.getSki();
		boolean material = reserva.getMaterial();
		boolean profesor = reserva.getProfesor();
		boolean alojamiento = reserva.getAlojamiento();

		DateFormat outputFormatter = new SimpleDateFormat("yyyy/MM/dd");
		String fechaEntradaFormateada = outputFormatter.format(fechaEntrada);
		System.out.println("aqui3");
		String fechaSalidaFormateada = outputFormatter.format(fechaSalida);
		System.out.println("aqui4");

		// conexion a la bbdd y negocio
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
			// Preparamos la consulta
			Statement s = conexion.createStatement();
			String consulta = "INSERT INTO reservas(`fechaEntrada`, `fechaSalida`, `nombreCliente`, `emailCliente`, `precio`, `ski`, `material`, `profesor`, `alojamiento`"
					+ ") VALUES (" +
					// Eliminada la ID: es AI en la DB no se usa para crear.
					"\"" + fechaEntradaFormateada + "\"," + "\"" + fechaSalidaFormateada + "\"," + "\"" + nombreCliente
					+ "\"," + "\"" + emailCliente + "\"," + "\"" + precio + "\"," + "\"" + ski + "\"," + "\"" + material
					+ "\"," + "\"" + profesor + "\"," + "\"" + alojamiento + "\")";

			Integer x = s.executeUpdate(consulta);
			respuesta.setResultado(true);
			respuesta.setSalida("Se ha creado la reserva con éxito");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR2");
			respuesta.setResultado(false);
			respuesta.setSalida(e.toString());
			e.printStackTrace();
			System.out.println("ERROR");
		}

		return respuesta;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param leerReserva
	 * @return leerReservaResponse
	 */

	public org.example.www.gestionreserva.LeerReservaResponse leerReserva(
			org.example.www.gestionreserva.LeerReserva leerReserva) {
		LeerReservaResponse respuesta = new LeerReservaResponse();
		int idReserva = leerReserva.getId();
		Reserva r = new Reserva();

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

			String sql2 = "SELECT * FROM reservas r WHERE r.id=" + idReserva + " ORDER BY id DESC LIMIT 1";
			rs = cmd.executeQuery(sql2);

			while (rs.next()) {
				r.localAlojamiento = rs.getBoolean("alojamiento");
				r.localEmailCliente = rs.getString("emailCliente");
				r.localFechaEntrada = rs.getDate("fechaEntrada");
				r.localFechaSalida = rs.getDate("fechaSalida");
				r.localMaterial = rs.getBoolean("material");
				r.localProfesor = rs.getBoolean("profesor");
				r.localSki = rs.getBoolean("ski");
				r.localPrecio = rs.getInt("precio");
				r.localNombreCliente = rs.getString("nombreCliente");

			}

			rs.close();

		} catch (SQLException ex) {

			// Mantener el control sobre el tipo de error
			System.out.println("SQLException: " + ex.getMessage());

		}

		/*
		 * r.localAlojamiento = true; r.localEmailCliente= "melli@melli.com";
		 * r.localFechaEntrada = new Date(); r.localFechaSalida = new Date();
		 * r.localMaterial = false; r.localProfesor = true; r.localSki = true;
		 * r.localPrecio = 20; r.localNombreCliente= "melli";
		 */

		System.out.println("LEIDO");
		respuesta.setLeerReservaResponse(r);

		return respuesta;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param eliminarReserva
	 * @return eliminarReservaResponse
	 */

	public org.example.www.gestionreserva.EliminarReservaResponse eliminarReserva(
			org.example.www.gestionreserva.EliminarReserva eliminarReserva) {
		EliminarReservaResponse respuesta = new EliminarReservaResponse();
		respuesta.setResultado(false);
		respuesta.setSalida("No se ha podido eliminar la reserva");

		int idReserva = eliminarReserva.getId();
		int res = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Registro exitoso");

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		Connection con = null;
		// ResultSet rs = null;
		Statement cmd = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");

			// Otros y operaciones sobre la base de datos...

			cmd = con.createStatement();

			String sql2 = "DELETE FROM reservas WHERE id=" + idReserva;
			res = cmd.executeUpdate(sql2);

		} catch (SQLException ex) {

			// Mantener el control sobre el tipo de error
			System.out.println("SQLException: " + ex.getMessage());

		}

		System.out.println("Valor de res" + res);
		if (res == 1) {
			respuesta.setResultado(true);
			respuesta.setSalida("La reserva ha sido eliminada.");
		}

		return respuesta;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param editarReserva
	 * @return editarReservaResponse
	 */

	public org.example.www.gestionreserva.EditarReservaResponse editarReserva(
			org.example.www.gestionreserva.EditarReserva editarReserva) {
		System.out.println("ENTRO AL METODO");
		// Variable respuesta y datos iniciales
		EditarReservaResponse respuesta = new EditarReservaResponse();
		respuesta.setResultado(false);
		respuesta.setSalida("No se ha llegado a modificar");

		// variable de entrada y recogida de datos en subvariables
		ReservaEdicion reserva = editarReserva.getEditarReserva();
		System.out.println("antes id");
		int id = reserva.getId();
		System.out.println("despues id");

		Date fechaEntrada = reserva.getFechaEntrada();
		System.out.println("aqui1");
		Date fechaSalida = reserva.getFechaSalida();
		System.out.println("aqui2");
		String nombreCliente = reserva.getNombreCliente();
		String emailCliente = reserva.getEmailCliente();
		int precio = reserva.getPrecio();
		boolean ski = reserva.getSki();
		boolean material = reserva.getMaterial();
		boolean profesor = reserva.getProfesor();
		boolean alojamiento = reserva.getAlojamiento();

		DateFormat outputFormatter = new SimpleDateFormat("yyyy/MM/dd");
		String fechaEntradaFormateada = outputFormatter.format(fechaEntrada);
		System.out.println("aqui3");
		String fechaSalidaFormateada = outputFormatter.format(fechaSalida);
		System.out.println("aqui4");

		// conexion a la bbdd y negocio
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
			// Preparamos la consulta
			Statement s = conexion.createStatement();
			String consulta = "UPDATE reservas SET" + "`fechaEntrada` = \"" + fechaEntradaFormateada + "\","
					+ "`fechaSalida` = \"" + fechaSalidaFormateada + "\"," + "`nombreCliente` = \"" + nombreCliente
					+ "\"," + "`emailCliente` = \"" + emailCliente + "\"," + "`precio` = \"" + precio + "\","
					+ "`ski` = \"" + ski + "\"," + "`material` = \"" + material + "\"," + "`profesor` = \"" + profesor
					+ "\"," + "`alojamiento` = \"" + alojamiento + "\"" + " WHERE `id`=\"" + id + "\"";

			Integer x = s.executeUpdate(consulta);
			respuesta.setResultado(true);
			respuesta.setSalida(emailCliente);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR2");
			respuesta.setResultado(false);
			respuesta.setSalida(e.toString());
			e.printStackTrace();
			System.out.println("ERROR");
		}

		return respuesta;
	}

}
