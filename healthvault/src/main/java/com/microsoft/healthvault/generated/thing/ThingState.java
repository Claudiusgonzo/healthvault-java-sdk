//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.thing;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * <p>Java class for ThingState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThingState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum ThingState {

    ACTIVE("Active"),
    DELETED("Deleted");
    private final String value;

    ThingState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThingState fromValue(String v) {
        for (ThingState c: ThingState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}