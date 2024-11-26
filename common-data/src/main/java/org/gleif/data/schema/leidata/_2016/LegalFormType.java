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


/**
 * <p>Java class for LegalFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityLegalFormCode" type="{http://www.gleif.org/data/schema/leidata/2016}LegalFormEnum"/&gt;
 *         &lt;element name="OtherLegalForm" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormType", propOrder = {
    "entityLegalFormCode",
    "otherLegalForm"
})
public class LegalFormType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "EntityLegalFormCode", required = true)
    protected String entityLegalFormCode;
    @XmlElement(name = "OtherLegalForm")
    protected String otherLegalForm;

    /**
     * Gets the value of the entityLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLegalFormCode() {
        return entityLegalFormCode;
    }

    /**
     * Sets the value of the entityLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLegalFormCode(String value) {
        this.entityLegalFormCode = value;
    }

    /**
     * Gets the value of the otherLegalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLegalForm() {
        return otherLegalForm;
    }

    /**
     * Sets the value of the otherLegalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLegalForm(String value) {
        this.otherLegalForm = value;
    }

}
