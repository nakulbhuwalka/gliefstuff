//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 05:01:25 PM IST 
//


package org.gleif.data.schema.leidata._2016;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for LegalEntityEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEntityEventsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalEntityEvent" type="{http://www.gleif.org/data/schema/leidata/2016}LegalEntityEventContainerType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntityEventsType", propOrder = {
    "legalEntityEvents"
})
public class LegalEntityEventsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "LegalEntityEvent", required = true)
    protected List<LegalEntityEventContainerType> legalEntityEvents;

    /**
     * Gets the value of the legalEntityEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legalEntityEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalEntityEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntityEventContainerType }
     * 
     * 
     */
    public List<LegalEntityEventContainerType> getLegalEntityEvents() {
        if (legalEntityEvents == null) {
            legalEntityEvents = new ArrayList<LegalEntityEventContainerType>();
        }
        return this.legalEntityEvents;
    }

}
