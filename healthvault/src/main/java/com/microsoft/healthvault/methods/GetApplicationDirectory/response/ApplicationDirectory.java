//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetApplicationDirectory.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.directory.ApplicationDirectoryItem;
import com.microsoft.healthvault.core.directory.DirectoryItemMetadata;


/**
 * <p>Java class for ApplicationDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="application-directory-item" type="{urn:com.microsoft.wc.directory}ApplicationDirectoryItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="application-directory-metadata" type="{urn:com.microsoft.wc.directory}DirectoryItemMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationDirectory", namespace = "urn:com.microsoft.wc.methods.response.GetApplicationDirectory", propOrder = {
    "applicationDirectoryItem",
    "applicationDirectoryMetadata"
})
public class ApplicationDirectory {

    @XmlElement(name = "application-directory-item")
    protected List<ApplicationDirectoryItem> applicationDirectoryItem;
    @XmlElement(name = "application-directory-metadata")
    protected List<DirectoryItemMetadata> applicationDirectoryMetadata;

    /**
     * Gets the value of the applicationDirectoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationDirectoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationDirectoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationDirectoryItem }
     * 
     * 
     */
    public List<ApplicationDirectoryItem> getApplicationDirectoryItem() {
        if (applicationDirectoryItem == null) {
            applicationDirectoryItem = new ArrayList<ApplicationDirectoryItem>();
        }
        return this.applicationDirectoryItem;
    }

    /**
     * Gets the value of the applicationDirectoryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationDirectoryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationDirectoryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectoryItemMetadata }
     * 
     * 
     */
    public List<DirectoryItemMetadata> getApplicationDirectoryMetadata() {
        if (applicationDirectoryMetadata == null) {
            applicationDirectoryMetadata = new ArrayList<DirectoryItemMetadata>();
        }
        return this.applicationDirectoryMetadata;
    }

}