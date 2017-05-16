
/**
 * Proveedor1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.proveedor1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
     *  Proveedor1Skeleton java skeleton for the axisService
     */
    public class Proveedor1Skeleton{
        
    	private Connection connect = null;
        private Statement statement = null;
        private ResultSet resultSet = null;
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPresupuesto 
             * @return solicitarPresupuestoResponse 
         */
        
        public void readDataBase() throws Exception {
    		try{
		    	Class.forName("com.mysql.jdbc.Driver");
		    	connect = DriverManager.getConnection("jdbc:mysql://localhost:3311/proyectoskibd?" + "user=root&password=root");
		    	statement = connect.createStatement();
	    	}catch (Exception e){
	    		System.out.println("falla base de datos");
	    	}
    	}
        
        
        
                 public org.example.www.proveedor1.SolicitarPresupuestoResponse solicitarPresupuesto
                  (
                  org.example.www.proveedor1.SolicitarPresupuesto solicitarPresupuesto
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
    }
    