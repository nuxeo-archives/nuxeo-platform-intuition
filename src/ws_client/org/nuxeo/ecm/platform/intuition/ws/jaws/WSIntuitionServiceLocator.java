/**
 * WSIntuitionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nuxeo.ecm.platform.intuition.ws.jaws;

public class WSIntuitionServiceLocator extends org.apache.axis.client.Service implements org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionService {

    public WSIntuitionServiceLocator() {
    }


    public WSIntuitionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSIntuitionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSIntuitionInterfacePort
    private java.lang.String WSIntuitionInterfacePort_address = "http://boka:8080/nuxeo-platform-intuition-5/WSIntuitionBean";

    public java.lang.String getWSIntuitionInterfacePortAddress() {
        return WSIntuitionInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSIntuitionInterfacePortWSDDServiceName = "WSIntuitionInterfacePort";

    public java.lang.String getWSIntuitionInterfacePortWSDDServiceName() {
        return WSIntuitionInterfacePortWSDDServiceName;
    }

    public void setWSIntuitionInterfacePortWSDDServiceName(java.lang.String name) {
        WSIntuitionInterfacePortWSDDServiceName = name;
    }

    public org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface getWSIntuitionInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSIntuitionInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSIntuitionInterfacePort(endpoint);
    }

    public org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface getWSIntuitionInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterfaceBindingStub _stub = new org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterfaceBindingStub(portAddress, this);
            _stub.setPortName(getWSIntuitionInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSIntuitionInterfacePortEndpointAddress(java.lang.String address) {
        WSIntuitionInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterfaceBindingStub _stub = new org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterfaceBindingStub(new java.net.URL(WSIntuitionInterfacePort_address), this);
                _stub.setPortName(getWSIntuitionInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSIntuitionInterfacePort".equals(inputPortName)) {
            return getWSIntuitionInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.intuition.platform.ecm.nuxeo.org/jaws", "WSIntuitionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.intuition.platform.ecm.nuxeo.org/jaws", "WSIntuitionInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSIntuitionInterfacePort".equals(portName)) {
            setWSIntuitionInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
