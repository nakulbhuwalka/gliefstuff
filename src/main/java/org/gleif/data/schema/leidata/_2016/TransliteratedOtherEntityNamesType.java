//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 11:28:53 AM IST 
//


package org.gleif.data.schema.leidata._2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedOtherEntityNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedOtherEntityNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransliteratedOtherEntityName" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedOtherEntityNameType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedOtherEntityNamesType", propOrder = {
    "transliteratedOtherEntityNames"
})
public class TransliteratedOtherEntityNamesType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TransliteratedOtherEntityName", required = true)
    protected List<TransliteratedOtherEntityNameType> transliteratedOtherEntityNames;

    /**
     * Gets the value of the transliteratedOtherEntityNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transliteratedOtherEntityNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransliteratedOtherEntityNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransliteratedOtherEntityNameType }
     * 
     * 
     */
    public List<TransliteratedOtherEntityNameType> getTransliteratedOtherEntityNames() {
        if (transliteratedOtherEntityNames == null) {
            transliteratedOtherEntityNames = new ArrayList<TransliteratedOtherEntityNameType>();
        }
        return this.transliteratedOtherEntityNames;
    }

}
