
/**
 * GestionProveedoresMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.gestionproveedores;

        /**
        *  GestionProveedoresMessageReceiverInOut message receiver
        */

        public class GestionProveedoresMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GestionProveedoresSkeleton skel = (GestionProveedoresSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("generarOferta".equals(methodName)){
                
                org.example.www.gestionproveedores.GenerarOfertaResponse generarOfertaResponse13 = null;
	                        org.example.www.gestionproveedores.GenerarOferta wrappedParam =
                                                             (org.example.www.gestionproveedores.GenerarOferta)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionproveedores.GenerarOferta.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               generarOfertaResponse13 =
                                                   
                                                   
                                                         skel.generarOferta(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), generarOfertaResponse13, false, new javax.xml.namespace.QName("http://www.example.org/GestionProveedores/",
                                                    "generarOferta"));
                                    } else 

            if("leerOfertas".equals(methodName)){
                
                org.example.www.gestionproveedores.LeerOfertasResponse leerOfertasResponse15 = null;
	                        org.example.www.gestionproveedores.LeerOfertas wrappedParam =
                                                             (org.example.www.gestionproveedores.LeerOfertas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionproveedores.LeerOfertas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               leerOfertasResponse15 =
                                                   
                                                   
                                                         skel.leerOfertas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), leerOfertasResponse15, false, new javax.xml.namespace.QName("http://www.example.org/GestionProveedores/",
                                                    "leerOfertas"));
                                    } else 

            if("leerOfertasSiHay".equals(methodName)){
                
                org.example.www.gestionproveedores.LeerOfertasSiHayResponse leerOfertasSiHayResponse17 = null;
	                        org.example.www.gestionproveedores.LeerOfertasSiHay wrappedParam =
                                                             (org.example.www.gestionproveedores.LeerOfertasSiHay)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gestionproveedores.LeerOfertasSiHay.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               leerOfertasSiHayResponse17 =
                                                   
                                                   
                                                         skel.leerOfertasSiHay(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), leerOfertasSiHayResponse17, false, new javax.xml.namespace.QName("http://www.example.org/GestionProveedores/",
                                                    "leerOfertasSiHay"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.GenerarOferta param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.GenerarOferta.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.GenerarOfertaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.GenerarOfertaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.LeerOfertas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.LeerOfertas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.LeerOfertasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.LeerOfertasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.LeerOfertasSiHay param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.LeerOfertasSiHay.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gestionproveedores.LeerOfertasSiHayResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gestionproveedores.LeerOfertasSiHayResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionproveedores.GenerarOfertaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionproveedores.GenerarOfertaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionproveedores.GenerarOfertaResponse wrapGenerarOferta(){
                                org.example.www.gestionproveedores.GenerarOfertaResponse wrappedElement = new org.example.www.gestionproveedores.GenerarOfertaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionproveedores.LeerOfertasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionproveedores.LeerOfertasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionproveedores.LeerOfertasResponse wrapLeerOfertas(){
                                org.example.www.gestionproveedores.LeerOfertasResponse wrappedElement = new org.example.www.gestionproveedores.LeerOfertasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gestionproveedores.LeerOfertasSiHayResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gestionproveedores.LeerOfertasSiHayResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gestionproveedores.LeerOfertasSiHayResponse wrapLeerOfertasSiHay(){
                                org.example.www.gestionproveedores.LeerOfertasSiHayResponse wrappedElement = new org.example.www.gestionproveedores.LeerOfertasSiHayResponse();
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
        
                if (org.example.www.gestionproveedores.GenerarOferta.class.equals(type)){
                
                        return org.example.www.gestionproveedores.GenerarOferta.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionproveedores.GenerarOfertaResponse.class.equals(type)){
                
                        return org.example.www.gestionproveedores.GenerarOfertaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionproveedores.LeerOfertas.class.equals(type)){
                
                        return org.example.www.gestionproveedores.LeerOfertas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionproveedores.LeerOfertasResponse.class.equals(type)){
                
                        return org.example.www.gestionproveedores.LeerOfertasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionproveedores.LeerOfertasSiHay.class.equals(type)){
                
                        return org.example.www.gestionproveedores.LeerOfertasSiHay.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.gestionproveedores.LeerOfertasSiHayResponse.class.equals(type)){
                
                        return org.example.www.gestionproveedores.LeerOfertasSiHayResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    