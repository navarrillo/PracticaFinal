
/**
 * GestionReservaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.gestionreserva;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
     *  GestionReservaSkeleton java skeleton for the axisService
     */
    public class GestionReservaSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param crearReserva 
             * @return crearReservaResponse 
         */
        
                 public org.example.www.gestionreserva.CrearReservaResponse crearReserva
                  (
                  org.example.www.gestionreserva.CrearReserva crearReserva
                  )
            {		
                	 //Variable respuesta y datos iniciales
                	 CrearReservaResponse respuesta = new CrearReservaResponse();
                	 respuesta.setResultado(false);
                	 respuesta.setSalida("No se ha llegado a crear");
                	 
                	 //variable de entrada y recogida de datos en subvariables
                	 Reserva reserva = new Reserva();
                	 int id = reserva.getId();
                	 Date fechaEntrada = (Date) reserva.getFechaEntrada();
                	 Date fechaSalida = (Date) reserva.getFechaSalida();
                	 String nombreCliente = reserva.getNombreCliente();
                	 String emailCliente = reserva.getEmailCliente();
                	 int precio = reserva.getPrecio();
                	 boolean ski = reserva.getSki();
                	 boolean material = reserva.getMaterial();
                	 boolean profesor = reserva.getProfesor();
                	 boolean alojamiento = reserva.getAlojamiento();
                	 
                	 //conexion a la bbdd y negocio
                	 try
                     {
                        Class.forName("com.mysql.jdbc.Driver");
                     } catch (Exception e)
                     {
                        e.printStackTrace();
                     } 
                     try{
     					Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectoskibd","root", "root");
     					
     					// Preparamos la consulta
     	                Statement s = (Statement) conexion.createStatement();
     	                String consulta = "INSERT INTO reservas(`id`, `fechaEntrada`, `fechaSalida`, `nombreCliente`, `emailCliente`, `precio`, `ski`, `material`, `profesor`, `alojamiento`"
     	                		+ ") VALUES ("+
     	                		"\""+id+"\","+
     	                		"\""+fechaEntrada+"\","+
     	                		"\""+fechaSalida+"\","+
     	                		"\""+nombreCliente+"\","+
     	                		"\""+emailCliente+"\","+
     	                		"\""+precio+"\","+
     	                		"\""+ski+"\","+
     	                		"\""+material+"\","+
     	                		"\""+profesor+"\","+
     	                		"\""+alojamiento+"\")";

     	                Integer x = s.executeUpdate(consulta);
     	                respuesta.setResultado(true);
     	                respuesta.setSalida("Se ha creado la reserva con éxito");
     	               
                     } catch(SQLException e){
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
                                     * @param almacenarReserva 
             * @return almacenarReservaResponse 
         */
        
                 public org.example.www.gestionreserva.AlmacenarReservaResponse almacenarReserva
                  (
                  org.example.www.gestionreserva.AlmacenarReserva almacenarReserva
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#almacenarReserva");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param leerReserva 
             * @return leerReservaResponse 
         */
        
                 public org.example.www.gestionreserva.LeerReservaResponse leerReserva
                  (
                  org.example.www.gestionreserva.LeerReserva leerReserva
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#leerReserva");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param eliminarReserva 
             * @return eliminarReservaResponse 
         */
        
                 public org.example.www.gestionreserva.EliminarReservaResponse eliminarReserva
                  (
                  org.example.www.gestionreserva.EliminarReserva eliminarReserva
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#eliminarReserva");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param editarReserva 
             * @return editarReservaResponse 
         */
        
                 public org.example.www.gestionreserva.EditarReservaResponse editarReserva
                  (
                  org.example.www.gestionreserva.EditarReserva editarReserva
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#editarReserva");
        }
     
    }
    