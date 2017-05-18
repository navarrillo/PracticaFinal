
/**
 * Proveedor1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.proveedor2;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
/**
     *  Proveedor1Skeleton java skeleton for the axisService
     */
    public class Proveedor2Skeleton{
        
    	private Connection connect = null;
        private Statement statement = null;
        private ResultSet resultSet = null;
        
        
    	 public void readDataBase() throws Exception {
     		try{
 		    	Class.forName("com.mysql.jdbc.Driver");
 		    	connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");
 		    	statement = (Statement) connect.createStatement();
 	    	}catch (Exception e){
 	    		System.out.println("falla base de datos");
 	    	}
     	}
         
         
         
                  public org.example.www.proveedor2.SolicitarPresupuestoResponse solicitarPresupuesto
                   (
                   org.example.www.proveedor2.SolicitarPresupuesto solicitarPresupuesto
                   )throws Exception
             {
                 	 SolicitarPresupuestoResponse respuesta = new SolicitarPresupuestoResponse();
                 	 readDataBase();
                 	 double precio = (double) 0;
                 	 try{
                 		 resultSet = statement.executeQuery("SELECT (ski + profesor + material + alojamiento)* oferta as 'Total' FROM serviciosproveedor");
                 		 while (resultSet.next()) {
               			 
                 				 precio = resultSet.getDouble("Total")*solicitarPresupuesto.getUnidades();
                 			 
                 		 }
                 		 
          				
          				} catch (SQLException e) {
          				// TODO Auto-generated catch block
          				
          				e.printStackTrace();
          				}
                 	 
                 	 respuesta.setSalida(precio);
                 	 return respuesta;
             }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPersonalizado 
             * @return solicitarPersonalizadoResponse 
         */
        
                 public org.example.www.proveedor2.SolicitarPersonalizadoResponse solicitarPersonalizado
                  (
                  org.example.www.proveedor2.SolicitarPersonalizado solicitarPersonalizado
                  )throws Exception
            {
                	 SolicitarPersonalizadoResponse respuesta = new SolicitarPersonalizadoResponse();
                	 
                	 //variables de entrada 
                	 boolean ski = solicitarPersonalizado.getSki();
                	 boolean material = solicitarPersonalizado.getMaterial();
                	 boolean profesor = solicitarPersonalizado.getProfesor();
                	 boolean alojamiento = solicitarPersonalizado.getAlojamiento();
                	 int unidades = solicitarPersonalizado.getUnidades();
                 	 readDataBase();
                 	 double precio = (double) 0;
                 	 try{
                 		 //montamos la consulta personalizada
                 		 String consulta = "SELECT (";
                 		 if(ski==true)
                 			 consulta+="ski +";
                 		 if(material==true)
                 			 consulta+="material +";
                 		 if(profesor==true)
                 			 consulta+="profesor +";
                 		 if(alojamiento==true)
                 			 consulta+="alojamiento";
                 		 
                 		 //si la ultima es una coma, se la quitamos
                 		 if(consulta.substring(consulta.length() - 1).equals("+"))
                 			 consulta=consulta.substring(0,consulta.length() - 1);
                 		 
                 		 consulta+=")* oferta as 'Total' FROM serviciosproveedor";
                 		 
                 		 System.out.println(consulta);
                 		 resultSet = statement.executeQuery(consulta);
                 		 //resultSet = statement.executeQuery("SELECT (ski + profesor + material + alojamiento)* oferta as 'Total' FROM serviciosproveedor");
                 		 while (resultSet.next()) {
               			 
                 				 precio = resultSet.getDouble("Total")*unidades;
                 			 
                 		 }
                 		 
          				
          				} catch (SQLException e) {
          				// TODO Auto-generated catch block
          				
          				e.printStackTrace();
          				}
                 	 
                 	 respuesta.setSalida(precio);
                 	 return respuesta;
            	}
     
    }
    