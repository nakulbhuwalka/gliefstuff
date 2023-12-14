//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.13 at 06:32:38 PM IST 
//


package org.gleif.data.schema.leidata._2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AffectedFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedFieldsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffectedField" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.gleif.org/data/schema/leidata/2016&gt;Tokenized500Type"&gt;
 *                 &lt;attribute name="field_xpath" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedFieldsType", propOrder = {
    "affectedFields"
})
public class AffectedFieldsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AffectedField", required = true)
    protected List<AffectedFieldsType.AffectedField> affectedFields;

    /**
     * Gets the value of the affectedFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedFieldsType.AffectedField }
     * 
     * 
     */
    public List<AffectedFieldsType.AffectedField> getAffectedFields() {
        if (affectedFields == null) {
            affectedFields = new ArrayList<AffectedFieldsType.AffectedField>();
        }
        return this.affectedFields;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.gleif.org/data/schema/leidata/2016&gt;Tokenized500Type"&gt;
     *       &lt;attribute name="field_xpath" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AffectedField
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected String value;
        @XmlAttribute(name = "field_xpath", required = true)
        protected String fieldXpath;

        /**
         * An element of this type has minimum length of one character and may not
         *         contain any of: the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, shall
         *         not begin or end with a space (#x20) character, or a sequence of two or more adjacent space
         *         characters.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the fieldXpath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFieldXpath() {
            return fieldXpath;
        }

        /**
         * Sets the value of the fieldXpath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFieldXpath(String value) {
            this.fieldXpath = value;
        }

    }

}
