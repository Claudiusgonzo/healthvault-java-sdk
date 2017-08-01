//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetUpdatedRecordsForApplication2.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetUpdatedRecordsForApplication2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the response that contains the method
 *                         specific return value(s).
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetUpdatedRecordsForApplication2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All response schemas contain the info element which
 *                         contain the return value of the method. If the method
 *                         does not define an info element, the method has no
 *                         return value.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updated-records" type="{urn:com.microsoft.wc.methods.response.GetUpdatedRecordsForApplication2}UpdatedRecords"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updatedRecords"
})
public class GetUpdatedRecordsForApplication2Response {

    @XmlElement(name = "updated-records", required = true)
    protected UpdatedRecords updatedRecords;

    /**
     * Gets the value of the updatedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedRecords }
     *     
     */
    public UpdatedRecords getUpdatedRecords() {
        return updatedRecords;
    }

    /**
     * Sets the value of the updatedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedRecords }
     *     
     */
    public void setUpdatedRecords(UpdatedRecords value) {
        this.updatedRecords = value;
    }

}