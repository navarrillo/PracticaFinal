
/**
 * GestionReservaMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.gestionreserva;

        /**
        *  GestionReservaMessageReceiverInOut message receiver
        */

        public class GestionReservaMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GestionReservaSkeleton skel = (GestionReservaSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("crearReserva".equals(methodName)){
                
                org.example.www.gestionreserva.CrearReservaResponse crearReservaResponse21 = null;
	                        org.example.www.gestionreserva.CrearReserva wrappedParam =
                                                             (org.example.www.gestionreserva.CrearReserva)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionreserva.CrearReserva.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               crearReservaResponse21 =
                                                   
                                                   
                                                         skel.crearReserva(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), crearReservaResponse21, false, new javax.xml.namespace.QName("http://www.example.org/GestionReserva/",
                                                    "crearReserva"));
                                    } else 

            if("almacenarReserva".equals(methodName)){
                
                org.example.www.gestionreserva.AlmacenarReservaResponse almacenarReservaResponse23 = null;
	                        org.example.www.gestionreserva.AlmacenarReserva wrappedParam =
                                                             (org.example.www.gestionreserva.AlmacenarReserva)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionreserva.AlmacenarReserva.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               almacenarReservaResponse23 =
                                                   
                                                   
                                                         skel.almacenarReserva(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), almacenarReservaResponse23, false, new javax.xml.namespace.QName("http://www.example.org/GestionReserva/",
                                                    "almacenarReserva"));
                                    } else 

            if("leerReserva".equals(methodName)){
                
                org.example.www.gestionreserva.LeerReservaResponse leerReservaResponse25 = null;
	                        org.example.www.gestionreserva.LeerReserva wrappedParam =
                                                             (org.example.www.gestionreserva.LeerReserva)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionreserva.LeerReserva.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               leerReservaResponse25 =
                                                   
                                                   
                                                         skel.leerReserva(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), leerReservaResponse25, false, new javax.xml.namespace.QName("http://www.example.org/GestionReserva/",
                                                    "leerReserva"));
                                    } else 

            if("eliminarReserva".equals(methodName)){
                
                org.example.www.gestionreserva.EliminarReservaResponse eliminarReservaResponse27 = null;
	                        org.example.www.gestionreserva.EliminarReserva wrappedParam =
                                                             (org.example.www.gestionreserva.EliminarReserva)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionreserva.EliminarReserva.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               eliminarReservaResponse27 =
                                                   
                                                   
                                                         skel.eliminarReserva(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), eliminarReservaResponse27, false, new javax.xml.namespace.QName("http://www.example.org/GestionReserva/",
                                                    "eliminarReserva"));
                                    } else 

            if("editarReserva".equals(methodName)){
                
                org.example.www.gestionreserva.EditarReservaResponse editarReservaResponse29 = null;
	                        org.example.www.gestionreserva.EditarReserva wrappedParam =
                                                             (org.example.www.gestionreserva.EditarReserva)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionreserva.EditarReserva.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               editarReservaResponse29 =
                                                   
                                                   
                                                         skel.editarReserva(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), editarReservaResponse29, false, new javax.xml.namespace.QName("http://www.example.org/GestionReserva/",
                                                    "editarReserva"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.CrearReserva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.CrearReserva.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.CrearReservaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.CrearReservaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.AlmacenarReserva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.AlmacenarReserva.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.AlmacenarReservaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.AlmacenarReservaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.LeerReserva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.LeerReserva.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.LeerReservaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.LeerReservaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.EliminarReserva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.EliminarReserva.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.EliminarReservaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.EliminarReservaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.EditarReserva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.EditarReserva.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionreserva.EditarReservaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionreserva.EditarReservaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionreserva.CrearReservaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionreserva.CrearReservaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionreserva.CrearReservaResponse wrapCrearReserva(){
                                org.example.www.gestionreserva.CrearReservaResponse wrappedElement = new org.example.www.gestionreserva.CrearReservaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionreserva.AlmacenarReservaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionreserva.AlmacenarReservaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionreserva.AlmacenarReservaResponse wrapAlmacenarReserva(){
                                org.example.www.gestionreserva.AlmacenarReservaResponse wrappedElement = new org.example.www.gestionreserva.AlmacenarReservaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionreserva.LeerReservaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionreserva.LeerReservaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionreserva.LeerReservaResponse wrapLeerReserva(){
                                org.example.www.gestionreserva.LeerReservaResponse wrappedElement = new org.example.www.gestionreserva.LeerReservaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionreserva.EliminarReservaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionreserva.EliminarReservaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionreserva.EliminarReservaResponse wrapEliminarReserva(){
                                org.example.www.gestionreserva.EliminarReservaResponse wrappedElement = new org.example.www.gestionreserva.EliminarReservaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionreserva.EditarReservaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionreserva.EditarReservaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionreserva.EditarReservaResponse wrapEditarReserva(){
                                org.example.www.gestionreserva.EditarReservaResponse wrappedElement = new org.example.www.gestionreserva.EditarReservaResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.gestionreserva.AlmacenarReserva.class.equals(type)){
                
                        return org.example.www.gestionreserva.AlmacenarReserva.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.AlmacenarReservaResponse.class.equals(type)){
                
                        return org.example.www.gestionreserva.AlmacenarReservaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.CrearReserva.class.equals(type)){
                
                        return org.example.www.gestionreserva.CrearReserva.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.CrearReservaResponse.class.equals(type)){
                
                        return org.example.www.gestionreserva.CrearReservaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.EditarReserva.class.equals(type)){
                
                        return org.example.www.gestionreserva.EditarReserva.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.EditarReservaResponse.class.equals(type)){
                
                        return org.example.www.gestionreserva.EditarReservaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.EliminarReserva.class.equals(type)){
                
                        return org.example.www.gestionreserva.EliminarReserva.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.EliminarReservaResponse.class.equals(type)){
                
                        return org.example.www.gestionreserva.EliminarReservaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.LeerReserva.class.equals(type)){
                
                        return org.example.www.gestionreserva.LeerReserva.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionreserva.LeerReservaResponse.class.equals(type)){
                
                        return org.example.www.gestionreserva.LeerReservaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    