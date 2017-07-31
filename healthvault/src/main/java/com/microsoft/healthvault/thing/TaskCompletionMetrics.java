//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
 *                     The definition for evaluating a health measurement or activity to decide whether
 *                     a task was completed.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for task-completion-metrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task-completion-metrics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recurrence-type" type="{urn:com.microsoft.wc.thing.task}task-recurrence-type"/>
 *         &lt;element name="completion-type" type="{urn:com.microsoft.wc.thing.task}task-completion-type"/>
 *         &lt;element name="occurrence-count" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task-completion-metrics", namespace = "urn:com.microsoft.wc.thing.task", propOrder = {
    "recurrenceType",
    "completionType",
    "occurrenceCount"
})
public class TaskCompletionMetrics {

    @XmlElement(name = "recurrence-type", required = true)
    @XmlSchemaType(name = "string")
    protected TaskRecurrenceType recurrenceType;
    @XmlElement(name = "completion-type", required = true)
    @XmlSchemaType(name = "string")
    protected TaskCompletionType completionType;
    @XmlElement(name = "occurrence-count")
    protected Integer occurrenceCount;

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskRecurrenceType }
     *     
     */
    public TaskRecurrenceType getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskRecurrenceType }
     *     
     */
    public void setRecurrenceType(TaskRecurrenceType value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the completionType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskCompletionType }
     *     
     */
    public TaskCompletionType getCompletionType() {
        return completionType;
    }

    /**
     * Sets the value of the completionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskCompletionType }
     *     
     */
    public void setCompletionType(TaskCompletionType value) {
        this.completionType = value;
    }

    /**
     * Gets the value of the occurrenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrenceCount() {
        return occurrenceCount;
    }

    /**
     * Sets the value of the occurrenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrenceCount(Integer value) {
        this.occurrenceCount = value;
    }

}