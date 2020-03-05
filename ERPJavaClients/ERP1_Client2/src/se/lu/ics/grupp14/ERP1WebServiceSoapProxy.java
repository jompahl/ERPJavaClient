package se.lu.ics.grupp14;

public class ERP1WebServiceSoapProxy implements se.lu.ics.grupp14.ERP1WebServiceSoap {
  private String _endpoint = null;
  private se.lu.ics.grupp14.ERP1WebServiceSoap eRP1WebServiceSoap = null;
  
  public ERP1WebServiceSoapProxy() {
    _initERP1WebServiceSoapProxy();
  }
  
  public ERP1WebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initERP1WebServiceSoapProxy();
  }
  
  private void _initERP1WebServiceSoapProxy() {
    try {
      eRP1WebServiceSoap = (new se.lu.ics.grupp14.ERP1WebServiceLocator()).getERP1WebServiceSoap();
      if (eRP1WebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eRP1WebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eRP1WebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eRP1WebServiceSoap != null)
      ((javax.xml.rpc.Stub)eRP1WebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.lu.ics.grupp14.ERP1WebServiceSoap getERP1WebServiceSoap() {
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap;
  }
  
  public boolean createEmployee(java.lang.String no_, java.lang.String firstName, java.lang.String lastName, java.lang.String jobTitle, java.lang.String address, java.lang.String phoneNumber) throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.createEmployee(no_, firstName, lastName, jobTitle, address, phoneNumber);
  }
  
  public se.lu.ics.grupp14.Employee[] readEmployee() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.readEmployee();
  }
  
  public boolean updateEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName, java.lang.String jobTitle, java.lang.String address, java.lang.String phoneNumber) throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.updateEmployee(no, firstName, lastName, jobTitle, address, phoneNumber);
  }
  
  public boolean deleteEmployee(java.lang.String no) throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.deleteEmployee(no);
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAllKeys() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAllKeys();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAllConstraints() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAllConstraints();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAllIndexes() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAllIndexes();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAllTables() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAllTables();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAllColumns() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAllColumns();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataEmployee() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataEmployee();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataAbsence() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataAbsence();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataPortalSetup() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataPortalSetup();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataQualification() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataQualification();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataRelatives() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataRelatives();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getMetadataStatisticsGroup() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getMetadataStatisticsGroup();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] mostAbsentEmployee() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.mostAbsentEmployee();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getEmployeeInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getEmployeeInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAbsenceInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAbsenceInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getPortalInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getPortalInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getQualificationInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getQualificationInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getRelativeInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getRelativeInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getStatisticsGroupInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getStatisticsGroupInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getEmployeeRelativeInfo() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getEmployeeRelativeInfo();
  }
  
  public se.lu.ics.grupp14.GridViewContent[] getAbsence2004Info() throws java.rmi.RemoteException{
    if (eRP1WebServiceSoap == null)
      _initERP1WebServiceSoapProxy();
    return eRP1WebServiceSoap.getAbsence2004Info();
  }
  
  
}