/**
 * CreditReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.netbeans.j2ee.wsdl.CreditReport;

public class CreditReport  implements java.io.Serializable {
    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String dob;

    private java.lang.String ssn;

    private java.lang.String score;

    private java.lang.String latestAddress1;

    private java.lang.String latestAddress2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String country;

    private java.lang.String postalCode;

    private java.math.BigInteger liability;

    private java.math.BigInteger liquidAssests;

    private java.math.BigInteger immovableAssests;

    private java.lang.String currency;

    public CreditReport() {
    }

    public CreditReport(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String dob,
           java.lang.String ssn,
           java.lang.String score,
           java.lang.String latestAddress1,
           java.lang.String latestAddress2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String country,
           java.lang.String postalCode,
           java.math.BigInteger liability,
           java.math.BigInteger liquidAssests,
           java.math.BigInteger immovableAssests,
           java.lang.String currency) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.dob = dob;
           this.ssn = ssn;
           this.score = score;
           this.latestAddress1 = latestAddress1;
           this.latestAddress2 = latestAddress2;
           this.city = city;
           this.state = state;
           this.country = country;
           this.postalCode = postalCode;
           this.liability = liability;
           this.liquidAssests = liquidAssests;
           this.immovableAssests = immovableAssests;
           this.currency = currency;
    }


    /**
     * Gets the firstName value for this CreditReport.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CreditReport.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this CreditReport.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CreditReport.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the dob value for this CreditReport.
     * 
     * @return dob
     */
    public java.lang.String getDob() {
        return dob;
    }


    /**
     * Sets the dob value for this CreditReport.
     * 
     * @param dob
     */
    public void setDob(java.lang.String dob) {
        this.dob = dob;
    }


    /**
     * Gets the ssn value for this CreditReport.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this CreditReport.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the score value for this CreditReport.
     * 
     * @return score
     */
    public java.lang.String getScore() {
        return score;
    }


    /**
     * Sets the score value for this CreditReport.
     * 
     * @param score
     */
    public void setScore(java.lang.String score) {
        this.score = score;
    }


    /**
     * Gets the latestAddress1 value for this CreditReport.
     * 
     * @return latestAddress1
     */
    public java.lang.String getLatestAddress1() {
        return latestAddress1;
    }


    /**
     * Sets the latestAddress1 value for this CreditReport.
     * 
     * @param latestAddress1
     */
    public void setLatestAddress1(java.lang.String latestAddress1) {
        this.latestAddress1 = latestAddress1;
    }


    /**
     * Gets the latestAddress2 value for this CreditReport.
     * 
     * @return latestAddress2
     */
    public java.lang.String getLatestAddress2() {
        return latestAddress2;
    }


    /**
     * Sets the latestAddress2 value for this CreditReport.
     * 
     * @param latestAddress2
     */
    public void setLatestAddress2(java.lang.String latestAddress2) {
        this.latestAddress2 = latestAddress2;
    }


    /**
     * Gets the city value for this CreditReport.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CreditReport.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this CreditReport.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CreditReport.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this CreditReport.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CreditReport.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the postalCode value for this CreditReport.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this CreditReport.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the liability value for this CreditReport.
     * 
     * @return liability
     */
    public java.math.BigInteger getLiability() {
        return liability;
    }


    /**
     * Sets the liability value for this CreditReport.
     * 
     * @param liability
     */
    public void setLiability(java.math.BigInteger liability) {
        this.liability = liability;
    }


    /**
     * Gets the liquidAssests value for this CreditReport.
     * 
     * @return liquidAssests
     */
    public java.math.BigInteger getLiquidAssests() {
        return liquidAssests;
    }


    /**
     * Sets the liquidAssests value for this CreditReport.
     * 
     * @param liquidAssests
     */
    public void setLiquidAssests(java.math.BigInteger liquidAssests) {
        this.liquidAssests = liquidAssests;
    }


    /**
     * Gets the immovableAssests value for this CreditReport.
     * 
     * @return immovableAssests
     */
    public java.math.BigInteger getImmovableAssests() {
        return immovableAssests;
    }


    /**
     * Sets the immovableAssests value for this CreditReport.
     * 
     * @param immovableAssests
     */
    public void setImmovableAssests(java.math.BigInteger immovableAssests) {
        this.immovableAssests = immovableAssests;
    }


    /**
     * Gets the currency value for this CreditReport.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CreditReport.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditReport)) return false;
        CreditReport other = (CreditReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.dob==null && other.getDob()==null) || 
             (this.dob!=null &&
              this.dob.equals(other.getDob()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.latestAddress1==null && other.getLatestAddress1()==null) || 
             (this.latestAddress1!=null &&
              this.latestAddress1.equals(other.getLatestAddress1()))) &&
            ((this.latestAddress2==null && other.getLatestAddress2()==null) || 
             (this.latestAddress2!=null &&
              this.latestAddress2.equals(other.getLatestAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.liability==null && other.getLiability()==null) || 
             (this.liability!=null &&
              this.liability.equals(other.getLiability()))) &&
            ((this.liquidAssests==null && other.getLiquidAssests()==null) || 
             (this.liquidAssests!=null &&
              this.liquidAssests.equals(other.getLiquidAssests()))) &&
            ((this.immovableAssests==null && other.getImmovableAssests()==null) || 
             (this.immovableAssests!=null &&
              this.immovableAssests.equals(other.getImmovableAssests()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getDob() != null) {
            _hashCode += getDob().hashCode();
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getLatestAddress1() != null) {
            _hashCode += getLatestAddress1().hashCode();
        }
        if (getLatestAddress2() != null) {
            _hashCode += getLatestAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getLiability() != null) {
            _hashCode += getLiability().hashCode();
        }
        if (getLiquidAssests() != null) {
            _hashCode += getLiquidAssests().hashCode();
        }
        if (getImmovableAssests() != null) {
            _hashCode += getImmovableAssests().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/CreditReport", ">creditReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latestAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latestAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liquidAssests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liquidAssests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immovableAssests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "immovableAssests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
