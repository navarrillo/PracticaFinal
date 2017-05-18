
/**
 * ServiciosExternosSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.serviciosexternos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * ServiciosExternosSkeleton java skeleton for the axisService
 */
public class ServiciosExternosSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param obtenerEmail
	 * @return obtenerEmailResponse
	 */

	public org.example.www.serviciosexternos.ObtenerEmailResponse obtenerEmail(
			org.example.www.serviciosexternos.ObtenerEmail obtenerEmail) {
ObtenerEmailResponse respuesta = new ObtenerEmailResponse();
		
		String dni = obtenerEmail.getDni();
		String mail = "";
		
		//BÚSQUEDA DEL EMAIL EN LA TABLA USUARIOS 
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
			
			String tabla = "SELECT email FROM usuarios WHERE dni like '"+ dni +"';";
			rs = cmd.executeQuery(tabla);
			
			while (rs.next()) {
				mail = rs.getString("email");
			}			
			cmd = con.createStatement();
			
			rs.close();

		} catch (SQLException ex) {
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + ex.getMessage());
			respuesta.setEmail("");
			respuesta.setMensaje("Ha ocurrido un problema con la consulta");
			return respuesta;
		}
		if(mail.equals("")){
			respuesta.setEmail("");
			respuesta.setMensaje("No existe el DNI en la base de datos");
			return respuesta;
		}else{
			respuesta.setEmail(mail);
			respuesta.setMensaje("Búsqueda correcta");
			return respuesta;
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param obtenerEmails
	 * @return obtenerEmailsResponse
	 */

	public org.example.www.serviciosexternos.ObtenerEmailsResponse obtenerEmails(
			org.example.www.serviciosexternos.ObtenerEmails obtenerEmails) {
		ObtenerEmailsResponse respuesta = new ObtenerEmailsResponse();
		String[] mails = new String[50];
		System.out.println(mails);

		//BÚSQUEDA DEL EMAIL EN LA TABLA USUARIOS 
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
			
			String tabla = "SELECT email FROM usuarios;";
			rs = cmd.executeQuery(tabla);
			int i = 0;
			while (rs.next()) {
				mails[i] = rs.getString("email");
				i++;
			}
			cmd = con.createStatement();
			
			rs.close();

		} catch (SQLException ex) {
			System.out.println("ESTÁS EN LA B DEBIDO AL ERROR: SQLException: " + ex.getMessage());
		}

			respuesta.setEmails(mails);
			return respuesta;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param validarCIF
	 * @return validarCIFResponse
	 */

	public org.example.www.serviciosexternos.ValidarCIFResponse validarCIF(
			org.example.www.serviciosexternos.ValidarCIF validarCIF) {
		try {
			ValidarCIFResponse resp = new ValidarCIFResponse();
			resp.setError("");
			
			boolean resultado = false;
			int digito_de_control;
			String letras_validas = "ABCDEFGHJPQRSUV";
			String caracteres_de_control = "JABCDEFGHI";
			String tipo_de_letra = "PQS";
			String tipo_de_nombre = "ABEH";
			
			try {
				/* Un CIF tiene que tener nueve dígitos */
				if (validarCIF.getCif().length() == 9) {

					/* Toma la primera letra del CIF */
					char letra_CIF = validarCIF.getCif().charAt(0);

					/* Comprueba si la primera letra del CIF es válida */
					if (letras_validas.indexOf(letra_CIF) >= 0) {

						if (Character.isDigit(validarCIF.getCif().charAt(8))) {
							digito_de_control = Character.getNumericValue(validarCIF.getCif().charAt(8));
							if (tipo_de_letra.indexOf(letra_CIF) >= 0)
								digito_de_control = 100;
						} else {
							digito_de_control = caracteres_de_control.indexOf(validarCIF.getCif().charAt(8));
							if (tipo_de_nombre.indexOf(letra_CIF) >= 0)
								digito_de_control = 100;
						}

						int a = 0, b = 0, c = 0;
						byte[] impares = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };

						/* Calcula A y B. */
						for (int t = 1; t <= 6; t = t + 2) {

							/* Suma los pares */
							a = a + Character.getNumericValue(validarCIF.getCif().charAt(t + 1));
							b = b
									+ impares[Character.getNumericValue(validarCIF.getCif().charAt(t))];
						}

						b = b + impares[Character.getNumericValue(validarCIF.getCif().charAt(7))];
						/* Calcula C */
						c = 10 - ((a + b) % 10);
						/* Compara C con los dígitos de control */
						resultado = (c == digito_de_control);
					}
				}
			} catch (Exception e) {
				resultado = false;
			}
			resp.setValidacion(resultado);
			if(!resultado){
				resp.setError("CIF Inválido");
			}
			return resp;

		} catch (Exception e) {
			throw new java.lang.UnsupportedOperationException(
					"Please implement " + this.getClass().getName() + "#validarCIF");

		}
	}
}
