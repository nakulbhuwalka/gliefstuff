//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 05:01:25 PM IST 
//


package org.gleif.data.schema.leidata._2016;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationDocumentsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ValidationDocumentsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACCOUNTS_FILING"/&gt;
 *     &lt;enumeration value="REGULATORY_FILING"/&gt;
 *     &lt;enumeration value="SUPPORTING_DOCUMENTS"/&gt;
 *     &lt;enumeration value="CONTRACTS"/&gt;
 *     &lt;enumeration value="OTHER_OFFICIAL_DOCUMENTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationDocumentsTypeEnum")
@XmlEnum
public enum ValidationDocumentsTypeEnum {


    /**
     * A consolidated financial (accounting) statement, prepared and
     *                         submitted to the relevant authority.
     * 
     */
    ACCOUNTS_FILING,

    /**
     * A regulatory filing providing public information on legal entities and/or their relationships.
     * 
     */
    REGULATORY_FILING,

    /**
     * Other documents supporting the validation of legal entities and/or their relationships.
     * 
     */
    SUPPORTING_DOCUMENTS,

    /**
     * Contract(s) attesting to the validity of egal entities and/or their relationships.
     * 
     */
    CONTRACTS,

    /**
     * Other official document(s) attesting to the validity of legal entities and/or their relationships.
     * 
     */
    OTHER_OFFICIAL_DOCUMENTS;

    public String value() {
        return name();
    }

    public static ValidationDocumentsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}