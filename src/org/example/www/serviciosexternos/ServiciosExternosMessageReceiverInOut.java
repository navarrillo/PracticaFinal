
/**
 * ServiciosExternosMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.serviciosexternos;

        /**
        *  ServiciosExternosMessageReceiverInOut message receiver
        */

        public class ServiciosExternosMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServiciosExternosSkeleton skel = (ServiciosExternosSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("obtenerEmail".equals(methodName)){
                
                org.example.www.serviciosexternos.ObtenerEmailResponse obtenerEmailResponse13 = null;
	                        org.example.www.serviciosexternos.ObtenerEmail wrappedParam =
                                                             (org.example.www.serviciosexternos.ObtenerEmail)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.serviciosexternos.ObtenerEmail.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               obtenerEmailResponse13 =
                                                   
                                                   
                                                         skel.obtenerEmail(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), obtenerEmailResponse13, false, new javax.xml.namespace.QName("http://www.example.org/ServiciosExternos/",
                                                    "obtenerEmail"));
                                    } else 

            if("obtenerEmails".equals(methodName)){
                
                org.example.www.serviciosexternos.ObtenerEmailsResponse obtenerEmailsResponse15 = null;
	                        org.example.www.serviciosexternos.ObtenerEmails wrappedParam =
                                                             (org.example.www.serviciosexternos.ObtenerEmails)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.serviciosexternos.ObtenerEmails.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               obtenerEmailsResponse15 =
                                                   
                                                   
                                                         skel.obtenerEmails(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), obtenerEmailsResponse15, false, new javax.xml.namespace.QName("http://www.example.org/ServiciosExternos/",
                                                    "obtenerEmails"));
                                    } else 

            if("validarCIF".equals(methodName)){
                
                org.example.www.serviciosexternos.ValidarCIFResponse validarCIFResponse17 = null;
	                        org.example.www.serviciosexternos.ValidarCIF wrappedParam =
                                                             (org.example.www.serviciosexternos.ValidarCIF)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.serviciosexternos.ValidarCIF.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarCIFResponse17 =
                                                   
                                                   
                                                         skel.validarCIF(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarCIFResponse17, false, new javax.xml.namespace.QName("http://www.example.org/ServiciosExternos/",
                                                    "validarCIF"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ObtenerEmail param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ObtenerEmail.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ObtenerEmailResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ObtenerEmailResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ObtenerEmails param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ObtenerEmails.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ObtenerEmailsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ObtenerEmailsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ValidarCIF param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ValidarCIF.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.serviciosexternos.ValidarCIFResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.serviciosexternos.ValidarCIFResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.serviciosexternos.ObtenerEmailResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.serviciosexternos.ObtenerEmailResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.serviciosexternos.ObtenerEmailResponse wrapobtenerEmail(){
                                org.example.www.serviciosexternos.ObtenerEmailResponse wrappedElement = new org.example.www.serviciosexternos.ObtenerEmailResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.serviciosexternos.ObtenerEmailsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.serviciosexternos.ObtenerEmailsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.serviciosexternos.ObtenerEmailsResponse wrapobtenerEmails(){
                                org.example.www.serviciosexternos.ObtenerEmailsResponse wrappedElement = new org.example.www.serviciosexternos.ObtenerEmailsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.serviciosexternos.ValidarCIFResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.serviciosexternos.ValidarCIFResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.serviciosexternos.ValidarCIFResponse wrapvalidarCIF(){
                                org.example.www.serviciosexternos.ValidarCIFResponse wrappedElement = new org.example.www.serviciosexternos.ValidarCIFResponse();
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
        
                if (org.example.www.serviciosexternos.ObtenerEmail.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ObtenerEmail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.serviciosexternos.ObtenerEmailResponse.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ObtenerEmailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.serviciosexternos.ObtenerEmails.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ObtenerEmails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.serviciosexternos.ObtenerEmailsResponse.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ObtenerEmailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.serviciosexternos.ValidarCIF.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ValidarCIF.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.serviciosexternos.ValidarCIFResponse.class.equals(type)){
                
                        return org.example.www.serviciosexternos.ValidarCIFResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    