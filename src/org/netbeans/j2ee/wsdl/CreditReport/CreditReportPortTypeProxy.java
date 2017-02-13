package org.netbeans.j2ee.wsdl.CreditReport;

public class CreditReportPortTypeProxy implements org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType {
  private String _endpoint = null;
  private org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType creditReportPortType = null;
  
  public CreditReportPortTypeProxy() {
    _initCreditReportPortTypeProxy();
  }
  
  public CreditReportPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreditReportPortTypeProxy();
  }
  
  private void _initCreditReportPortTypeProxy() {
    try {
      creditReportPortType = (new org.netbeans.j2ee.wsdl.CreditReport.Service1Locator()).getport1();
      if (creditReportPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creditReportPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creditReportPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creditReportPortType != null)
      ((javax.xml.rpc.Stub)creditReportPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType getCreditReportPortType() {
    if (creditReportPortType == null)
      _initCreditReportPortTypeProxy();
    return creditReportPortType;
  }
  
  public org.netbeans.j2ee.wsdl.CreditReport.CreditReport creditReportOperation(org.netbeans.j2ee.wsdl.CreditReport.CreditQuery part1) throws java.rmi.RemoteException{
    if (creditReportPortType == null)
      _initCreditReportPortTypeProxy();
    return creditReportPortType.creditReportOperation(part1);
  }
  
  
}