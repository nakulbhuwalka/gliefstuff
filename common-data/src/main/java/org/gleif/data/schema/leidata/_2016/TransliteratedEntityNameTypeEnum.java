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
 * <p>Java class for TransliteratedEntityNameTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransliteratedEntityNameTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PREFERRED_ASCII_TRANSLITERATED_LEGAL_NAME"/&gt;
 *     &lt;enumeration value="AUTO_ASCII_TRANSLITERATED_LEGAL_NAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransliteratedEntityNameTypeEnum")
@XmlEnum
public enum TransliteratedEntityNameTypeEnum {


    /**
     * Legal name of the entity transliterated to ASCII characters, provided by
     *             the entity for this purpose.
     * 
     */
    PREFERRED_ASCII_TRANSLITERATED_LEGAL_NAME,

    /**
     * Legal name of the entity transliterated to ASCII characters,
     *             auto-transliterated by the managing LOU.
     * 
     */
    AUTO_ASCII_TRANSLITERATED_LEGAL_NAME;

    public String value() {
        return name();
    }

    public static TransliteratedEntityNameTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
