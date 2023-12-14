//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.13 at 06:32:38 PM IST 
//


package org.gleif.data.schema.leidata._2016;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for LegalEntityEventContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEntityEventContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalEntityEventType" type="{http://www.gleif.org/data/schema/leidata/2016}LegalEntityEventTypeEnum"/&gt;
 *         &lt;element name="LegalEntityEventEffectiveDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfileGeYear0001" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityEventRecordedDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfileGeYear2000"/&gt;
 *         &lt;element name="ValidationDocuments" type="{http://www.gleif.org/data/schema/leidata/2016}ValidationDocumentsTypeEnum"/&gt;
 *         &lt;element name="ValidationReference" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="AffectedFields" type="{http://www.gleif.org/data/schema/leidata/2016}AffectedFieldsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="group_type" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}LegalEntityEventGroupTypeEnum" /&gt;
 *       &lt;attribute name="event_status" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}LegalEntityEventStatusEnum" /&gt;
 *       &lt;attribute name="group_id" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" /&gt;
 *       &lt;attribute name="group_sequence_no" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntityEventContainerType", propOrder = {
    "legalEntityEventType",
    "legalEntityEventEffectiveDate",
    "legalEntityEventRecordedDate",
    "validationDocuments",
    "validationReference",
    "affectedFields"
})
public class LegalEntityEventContainerType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "LegalEntityEventType", required = true)
    @XmlSchemaType(name = "token")
    protected LegalEntityEventTypeEnum legalEntityEventType;
    @XmlElement(name = "LegalEntityEventEffectiveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar legalEntityEventEffectiveDate;
    @XmlElement(name = "LegalEntityEventRecordedDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar legalEntityEventRecordedDate;
    @XmlElement(name = "ValidationDocuments", required = true)
    @XmlSchemaType(name = "token")
    protected ValidationDocumentsTypeEnum validationDocuments;
    @XmlElement(name = "ValidationReference")
    protected String validationReference;
    @XmlElement(name = "AffectedFields")
    protected AffectedFieldsType affectedFields;
    @XmlAttribute(name = "group_type", required = true)
    protected LegalEntityEventGroupTypeEnum groupType;
    @XmlAttribute(name = "event_status", required = true)
    protected LegalEntityEventStatusEnum eventStatus;
    @XmlAttribute(name = "group_id")
    protected String groupId;
    @XmlAttribute(name = "group_sequence_no")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger groupSequenceNo;

    /**
     * Gets the value of the legalEntityEventType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityEventTypeEnum }
     *     
     */
    public LegalEntityEventTypeEnum getLegalEntityEventType() {
        return legalEntityEventType;
    }

    /**
     * Sets the value of the legalEntityEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityEventTypeEnum }
     *     
     */
    public void setLegalEntityEventType(LegalEntityEventTypeEnum value) {
        this.legalEntityEventType = value;
    }

    /**
     * Gets the value of the legalEntityEventEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLegalEntityEventEffectiveDate() {
        return legalEntityEventEffectiveDate;
    }

    /**
     * Sets the value of the legalEntityEventEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityEventEffectiveDate(Calendar value) {
        this.legalEntityEventEffectiveDate = value;
    }

    /**
     * Gets the value of the legalEntityEventRecordedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLegalEntityEventRecordedDate() {
        return legalEntityEventRecordedDate;
    }

    /**
     * Sets the value of the legalEntityEventRecordedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityEventRecordedDate(Calendar value) {
        this.legalEntityEventRecordedDate = value;
    }

    /**
     * Gets the value of the validationDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDocumentsTypeEnum }
     *     
     */
    public ValidationDocumentsTypeEnum getValidationDocuments() {
        return validationDocuments;
    }

    /**
     * Sets the value of the validationDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDocumentsTypeEnum }
     *     
     */
    public void setValidationDocuments(ValidationDocumentsTypeEnum value) {
        this.validationDocuments = value;
    }

    /**
     * Gets the value of the validationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationReference() {
        return validationReference;
    }

    /**
     * Sets the value of the validationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationReference(String value) {
        this.validationReference = value;
    }

    /**
     * Gets the value of the affectedFields property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedFieldsType }
     *     
     */
    public AffectedFieldsType getAffectedFields() {
        return affectedFields;
    }

    /**
     * Sets the value of the affectedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedFieldsType }
     *     
     */
    public void setAffectedFields(AffectedFieldsType value) {
        this.affectedFields = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityEventGroupTypeEnum }
     *     
     */
    public LegalEntityEventGroupTypeEnum getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityEventGroupTypeEnum }
     *     
     */
    public void setGroupType(LegalEntityEventGroupTypeEnum value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityEventStatusEnum }
     *     
     */
    public LegalEntityEventStatusEnum getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityEventStatusEnum }
     *     
     */
    public void setEventStatus(LegalEntityEventStatusEnum value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupSequenceNo() {
        return groupSequenceNo;
    }

    /**
     * Sets the value of the groupSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupSequenceNo(BigInteger value) {
        this.groupSequenceNo = value;
    }

}
