<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCreditReportPortTypeProxyid" scope="session" class="org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCreditReportPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCreditReportPortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCreditReportPortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.netbeans.j2ee.wsdl.CreditReport.CreditReportPortType getCreditReportPortType10mtemp = sampleCreditReportPortTypeProxyid.getCreditReportPortType();
if(getCreditReportPortType10mtemp == null){
%>
<%=getCreditReportPortType10mtemp %>
<%
}else{
        if(getCreditReportPortType10mtemp!= null){
        String tempreturnp11 = getCreditReportPortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String queryType_2id=  request.getParameter("queryType48");
            java.lang.String queryType_2idTemp = null;
        if(!queryType_2id.equals("")){
         queryType_2idTemp  = queryType_2id;
        }
        String ssn_3id=  request.getParameter("ssn50");
            java.lang.String ssn_3idTemp = null;
        if(!ssn_3id.equals("")){
         ssn_3idTemp  = ssn_3id;
        }
        String lastName_4id=  request.getParameter("lastName52");
            java.lang.String lastName_4idTemp = null;
        if(!lastName_4id.equals("")){
         lastName_4idTemp  = lastName_4id;
        }
        String firstName_5id=  request.getParameter("firstName54");
            java.lang.String firstName_5idTemp = null;
        if(!firstName_5id.equals("")){
         firstName_5idTemp  = firstName_5id;
        }
        %>
        <jsp:useBean id="org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id" scope="session" class="org.netbeans.j2ee.wsdl.CreditReport.CreditQuery" />
        <%
        org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id.setQueryType(queryType_2idTemp);
        org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id.setSsn(ssn_3idTemp);
        org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id.setLastName(lastName_4idTemp);
        org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id.setFirstName(firstName_5idTemp);
        org.netbeans.j2ee.wsdl.CreditReport.CreditReport creditReportOperation13mtemp = sampleCreditReportPortTypeProxyid.creditReportOperation(org1netbeans1j2ee1wsdl1CreditReport1CreditQuery_1id);
if(creditReportOperation13mtemp == null){
%>
<%=creditReportOperation13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typepostalCode16 = creditReportOperation13mtemp.getPostalCode();
        String tempResultpostalCode16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode16));
        %>
        <%= tempResultpostalCode16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">state:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typestate18 = creditReportOperation13mtemp.getState();
        String tempResultstate18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestate18));
        %>
        <%= tempResultstate18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typecountry20 = creditReportOperation13mtemp.getCountry();
        String tempResultcountry20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry20));
        %>
        <%= tempResultcountry20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ssn:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typessn22 = creditReportOperation13mtemp.getSsn();
        String tempResultssn22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typessn22));
        %>
        <%= tempResultssn22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">score:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typescore24 = creditReportOperation13mtemp.getScore();
        String tempResultscore24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typescore24));
        %>
        <%= tempResultscore24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">liability:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.math.BigInteger typeliability26 = creditReportOperation13mtemp.getLiability();
        String tempResultliability26 = org.eclipse.jst.ws.util.JspUtils.markup(typeliability26.toString());
        %>
        <%= tempResultliability26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">city:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typecity28 = creditReportOperation13mtemp.getCity();
        String tempResultcity28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity28));
        %>
        <%= tempResultcity28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">latestAddress2:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typelatestAddress230 = creditReportOperation13mtemp.getLatestAddress2();
        String tempResultlatestAddress230 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelatestAddress230));
        %>
        <%= tempResultlatestAddress230 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">latestAddress1:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typelatestAddress132 = creditReportOperation13mtemp.getLatestAddress1();
        String tempResultlatestAddress132 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelatestAddress132));
        %>
        <%= tempResultlatestAddress132 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">liquidAssests:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.math.BigInteger typeliquidAssests34 = creditReportOperation13mtemp.getLiquidAssests();
        String tempResultliquidAssests34 = org.eclipse.jst.ws.util.JspUtils.markup(typeliquidAssests34.toString());
        %>
        <%= tempResultliquidAssests34 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currency:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typecurrency36 = creditReportOperation13mtemp.getCurrency();
        String tempResultcurrency36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecurrency36));
        %>
        <%= tempResultcurrency36 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">immovableAssests:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.math.BigInteger typeimmovableAssests38 = creditReportOperation13mtemp.getImmovableAssests();
        String tempResultimmovableAssests38 = org.eclipse.jst.ws.util.JspUtils.markup(typeimmovableAssests38.toString());
        %>
        <%= tempResultimmovableAssests38 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dob:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typedob40 = creditReportOperation13mtemp.getDob();
        String tempResultdob40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedob40));
        %>
        <%= tempResultdob40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typefirstName42 = creditReportOperation13mtemp.getFirstName();
        String tempResultfirstName42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName42));
        %>
        <%= tempResultfirstName42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(creditReportOperation13mtemp != null){
java.lang.String typelastName44 = creditReportOperation13mtemp.getLastName();
        String tempResultlastName44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName44));
        %>
        <%= tempResultlastName44 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>