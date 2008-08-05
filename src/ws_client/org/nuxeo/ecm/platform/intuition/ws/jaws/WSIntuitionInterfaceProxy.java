package org.nuxeo.ecm.platform.intuition.ws.jaws;

public class WSIntuitionInterfaceProxy implements org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface {
  private String _endpoint = null;
  private org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface wSIntuitionInterface = null;
  
  public WSIntuitionInterfaceProxy() {
    _initWSIntuitionInterfaceProxy();
  }
  
  public WSIntuitionInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSIntuitionInterfaceProxy();
  }
  
  private void _initWSIntuitionInterfaceProxy() {
    try {
      wSIntuitionInterface = (new org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionServiceLocator()).getWSIntuitionInterfacePort();
      if (wSIntuitionInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSIntuitionInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSIntuitionInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSIntuitionInterface != null)
      ((javax.xml.rpc.Stub)wSIntuitionInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface getWSIntuitionInterface() {
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface;
  }
  
  public java.lang.String connect(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.connect(string_1, string_2);
  }
  
  public void disconnect(java.lang.String string_1) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    wSIntuitionInterface.disconnect(string_1);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor[] getChildren(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getChildren(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor getCurrentVersion(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getCurrentVersion(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor getDocument(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getDocument(string_1, string_2);
  }
  
  public org.nuxeo.ecm.core.api.security.jaws.ACE[] getDocumentACL(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getDocumentACL(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentBlob[] getDocumentBlobs(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getDocumentBlobs(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentProperty[] getDocumentNoBlobProperties(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getDocumentNoBlobProperties(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentProperty[] getDocumentProperties(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getDocumentProperties(string_1, string_2);
  }
  
  public java.lang.String[] getGroups(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getGroups(string_1, string_2);
  }
  
  public java.lang.String getRelativePathAsString(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getRelativePathAsString(string_1, string_2);
  }
  
  public java.lang.String getRepositoryName(java.lang.String string_1) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getRepositoryName(string_1);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor getRootDocument(java.lang.String string_1) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getRootDocument(string_1);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor getSourceDocument(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getSourceDocument(string_1, string_2);
  }
  
  public java.lang.String[] getUsers(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getUsers(string_1, string_2);
  }
  
  public org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor[] getVersions(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.getVersions(string_1, string_2);
  }
  
  public boolean hasPermission(java.lang.String string_1, java.lang.String string_2, java.lang.String string_3) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.hasPermission(string_1, string_2, string_3);
  }
  
  public java.lang.String[] listGroups(java.lang.String string_1, int int_1, int int_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.listGroups(string_1, int_1, int_2);
  }
  
  public org.nuxeo.ecm.platform.audit.ws.api.jaws.ModifiedDocumentDescriptor[] listModifiedDocuments(java.lang.String string_1, java.lang.String string_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.AuditException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.listModifiedDocuments(string_1, string_2);
  }
  
  public java.lang.String[] listUsers(java.lang.String string_1, int int_1, int int_2) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.listUsers(string_1, int_1, int_2);
  }
  
  public java.lang.String uploadDocument(java.lang.String string_1, java.lang.String string_2, java.lang.String string_3, java.lang.String[] string_4) throws java.rmi.RemoteException, org.nuxeo.ecm.platform.intuition.ws.jaws.ClientException{
    if (wSIntuitionInterface == null)
      _initWSIntuitionInterfaceProxy();
    return wSIntuitionInterface.uploadDocument(string_1, string_2, string_3, string_4);
  }
  
  
}