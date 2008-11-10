/**
 * DocumentBlob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nuxeo.ecm.platform.api.ws.jaws;

public class DocumentBlob  implements java.io.Serializable {
    private byte[] blob;

    private java.lang.String encoding;

    private java.lang.String mimetype;

    private java.lang.String name;

    public DocumentBlob() {
    }

    public DocumentBlob(
           byte[] blob,
           java.lang.String encoding,
           java.lang.String mimetype,
           java.lang.String name) {
           this.blob = blob;
           this.encoding = encoding;
           this.mimetype = mimetype;
           this.name = name;
    }


    /**
     * Gets the blob value for this DocumentBlob.
     *
     * @return blob
     */
    public byte[] getBlob() {
        return blob;
    }


    /**
     * Sets the blob value for this DocumentBlob.
     *
     * @param blob
     */
    public void setBlob(byte[] blob) {
        this.blob = blob;
    }


    /**
     * Gets the encoding value for this DocumentBlob.
     *
     * @return encoding
     */
    public java.lang.String getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this DocumentBlob.
     *
     * @param encoding
     */
    public void setEncoding(java.lang.String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the mimetype value for this DocumentBlob.
     *
     * @return mimetype
     */
    public java.lang.String getMimetype() {
        return mimetype;
    }


    /**
     * Sets the mimetype value for this DocumentBlob.
     *
     * @param mimetype
     */
    public void setMimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
    }


    /**
     * Gets the name value for this DocumentBlob.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentBlob.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentBlob)) return false;
        DocumentBlob other = (DocumentBlob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.blob==null && other.getBlob()==null) ||
             (this.blob!=null &&
              java.util.Arrays.equals(this.blob, other.getBlob()))) &&
            ((this.encoding==null && other.getEncoding()==null) ||
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.mimetype==null && other.getMimetype()==null) ||
             (this.mimetype!=null &&
              this.mimetype.equals(other.getMimetype()))) &&
            ((this.name==null && other.getName()==null) ||
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getBlob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlob(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getMimetype() != null) {
            _hashCode += getMimetype().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentBlob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.platform.ecm.nuxeo.org/jaws", "DocumentBlob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.api.platform.ecm.nuxeo.org/jaws", "blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.api.platform.ecm.nuxeo.org/jaws", "encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.api.platform.ecm.nuxeo.org/jaws", "mimetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.api.platform.ecm.nuxeo.org/jaws", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
