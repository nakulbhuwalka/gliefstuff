//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 11:28:53 AM IST 
//


package org.gleif.data.schema.leidata._2016;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransliteratedAddressTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTO_ASCII_TRANSLITERATED_LEGAL_ADDRESS"/&gt;
 *     &lt;enumeration value="AUTO_ASCII_TRANSLITERATED_HEADQUARTERS_ADDRESS"/&gt;
 *     &lt;enumeration value="PREFERRED_ASCII_TRANSLITERATED_LEGAL_ADDRESS"/&gt;
 *     &lt;enumeration value="PREFERRED_ASCII_TRANSLITERATED_HEADQUARTERS_ADDRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransliteratedAddressTypeEnum")
@XmlEnum
public enum TransliteratedAddressTypeEnum {


    /**
     * Registered address of the entity in the legal jurisdiction,
     *             transliterated to ASCII characters, auto-transliterated by the managing
     *             LOU.
     * 
     */
    AUTO_ASCII_TRANSLITERATED_LEGAL_ADDRESS,

    /**
     * Address of the headquarters of the entity, transliterated to ASCII
     *             characters, auto-transliterated by the managing LOU.
     * 
     */
    AUTO_ASCII_TRANSLITERATED_HEADQUARTERS_ADDRESS,

    /**
     * Registered address of the entity in the legal jurisdiction,
     *             transliterated to ASCII characters, provided by the entity for this
     *             purpose.
     * 
     */
    PREFERRED_ASCII_TRANSLITERATED_LEGAL_ADDRESS,

    /**
     * Address of the headquarters of the entity, transliterated to ASCII
     *             characters, provided by the entity for this purpose.
     * 
     */
    PREFERRED_ASCII_TRANSLITERATED_HEADQUARTERS_ADDRESS;

    public String value() {
        return name();
    }

    public static TransliteratedAddressTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
