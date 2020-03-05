/**
 * ERP1WebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public interface ERP1WebServiceSoap extends java.rmi.Remote {
    public boolean createEmployee(java.lang.String no_, java.lang.String firstName, java.lang.String lastName, java.lang.String jobTitle, java.lang.String address, java.lang.String phoneNumber) throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.Employee[] readEmployee() throws java.rmi.RemoteException;
    public boolean updateEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName, java.lang.String jobTitle, java.lang.String address, java.lang.String phoneNumber) throws java.rmi.RemoteException;
    public boolean deleteEmployee(java.lang.String no) throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAllKeys() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAllConstraints() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAllIndexes() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAllTables() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAllColumns() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataEmployee() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataAbsence() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataPortalSetup() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataQualification() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataRelatives() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getMetadataStatisticsGroup() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] mostAbsentEmployee() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getEmployeeInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAbsenceInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getPortalInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getQualificationInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getRelativeInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getStatisticsGroupInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getEmployeeRelativeInfo() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.GridViewContent[] getAbsence2004Info() throws java.rmi.RemoteException;
}
