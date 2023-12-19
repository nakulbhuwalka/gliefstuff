//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 11:28:53 AM IST 
//


package org.gleif.data.schema.leidata._2016;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LEIData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LEIData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LEIHeader" type="{http://www.gleif.org/data/schema/leidata/2016}LEIHeaderType"/&gt;
 *         &lt;element name="LEIRecords" type="{http://www.gleif.org/data/schema/leidata/2016}LEIRecordsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LEIData", propOrder = {
    "leiHeader",
    "leiRecords"
})
@XmlRootElement(name = "LEIData")
public class LEIData
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "LEIHeader", required = true)
    protected LEIHeaderType leiHeader;
    @XmlElement(name = "LEIRecords", required = true)
    protected LEIRecordsType leiRecords;

    /**
     * Gets the value of the leiHeader property.
     * 
     * @return
     *     possible object is
     *     {@link LEIHeaderType }
     *     
     */
    public LEIHeaderType getLEIHeader() {
        return leiHeader;
    }

    /**
     * Sets the value of the leiHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEIHeaderType }
     *     
     */
    public void setLEIHeader(LEIHeaderType value) {
        this.leiHeader = value;
    }

    /**
     * Gets the value of the leiRecords property.
     * 
     * @return
     *     possible object is
     *     {@link LEIRecordsType }
     *     
     */
    public LEIRecordsType getLEIRecords() {
        return leiRecords;
    }

    /**
     * Sets the value of the leiRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEIRecordsType }
     *     
     */
    public void setLEIRecords(LEIRecordsType value) {
        this.leiRecords = value;
    }

}
