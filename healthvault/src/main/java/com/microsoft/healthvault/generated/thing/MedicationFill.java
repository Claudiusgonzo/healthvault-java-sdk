//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.thing;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import com.microsoft.healthvault.generated.types.CodableValue;
import com.microsoft.healthvault.generated.types.Organization;
import com.microsoft.healthvault.generated.types.dates.ApproxDateTime;
import com.microsoft.healthvault.generated.types.dates.Date;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication-fill" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to filling a medication.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication-fill" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This type contains information related to filling a medication, and is related to the medication type.
 *                         Instances of this type are typically linked to a medication instance using related items. 
 *                         For example, if the medication is prescribed, the medication fill describes typical information that a
 *                         pharmacy would add. 
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
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="date-filled" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="days-supply" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="next-refill-date" type="{urn:com.microsoft.wc.dates}date" minOccurs="0"/>
 *         &lt;element name="refills-left" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="pharmacy" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="prescription-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lot-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(name="medication-fill")
@Order(elements = {
    "name",
    "dateFilled",
    "daysSupply",
    "nextRefillDate",
    "refillsLeft",
    "pharmacy",
    "prescriptionNumber",
    "lotNumber"
})
public class MedicationFill {

    @Element(required = true)
    protected CodableValue name;
    @Element(name = "date-filled")
    protected ApproxDateTime dateFilled;
    @Element(name = "days-supply")
    protected Integer daysSupply;
    @Element(name = "next-refill-date")
    protected Date nextRefillDate;
    @Element(name = "refills-left")
    protected Integer refillsLeft;
    protected Organization pharmacy;
    @Element(name = "prescription-number")
    protected String prescriptionNumber;
    @Element(name = "lot-number")
    protected String lotNumber;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateFilled property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getDateFilled() {
        return dateFilled;
    }

    /**
     * Sets the value of the dateFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setDateFilled(ApproxDateTime value) {
        this.dateFilled = value;
    }

    /**
     * Gets the value of the daysSupply property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysSupply(Integer value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the nextRefillDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getNextRefillDate() {
        return nextRefillDate;
    }

    /**
     * Sets the value of the nextRefillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setNextRefillDate(Date value) {
        this.nextRefillDate = value;
    }

    /**
     * Gets the value of the refillsLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefillsLeft() {
        return refillsLeft;
    }

    /**
     * Sets the value of the refillsLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefillsLeft(Integer value) {
        this.refillsLeft = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setPharmacy(Organization value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionNumber(String value) {
        this.prescriptionNumber = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

}