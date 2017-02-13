/**
 * Binding1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.netbeans.j2ee.wsdl.CreditReport;

public class Binding1Skeleton implements org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType, org.apache.axis.wsdl.Skeleton {
    private org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/CreditReport", "creditQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/CreditReport", ">creditQuery"), org.netbeans.j2ee.wsdl.CreditReport.CreditQuery.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("creditReportOperation", _params, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/CreditReport", "creditReport"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/CreditReport", ">creditReport"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreditReportOperation"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("creditReportOperation") == null) {
            _myOperations.put("creditReportOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("creditReportOperation")).add(_oper);
    }

    public Binding1Skeleton() {
        this.impl = new org.netbeans.j2ee.wsdl.CreditReport.Binding1Impl();
    }

    public Binding1Skeleton(org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType impl) {
        this.impl = impl;
    }
    public org.netbeans.j2ee.wsdl.CreditReport.CreditReport creditReportOperation(org.netbeans.j2ee.wsdl.CreditReport.CreditQuery part1) throws java.rmi.RemoteException
    {
        org.netbeans.j2ee.wsdl.CreditReport.CreditReport ret = impl.creditReportOperation(part1);
        return ret;
    }

}
