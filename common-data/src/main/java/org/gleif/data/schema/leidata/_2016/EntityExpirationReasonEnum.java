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
 * <p>Java class for EntityExpirationReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntityExpirationReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISSOLVED"/&gt;
 *     &lt;enumeration value="CORPORATE_ACTION"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityExpirationReasonEnum")
@XmlEnum
public enum EntityExpirationReasonEnum {


    /**
     * The entity ceased to operate. 
     * 
     */
    DISSOLVED,

    /**
     * The entity was acquired or merged with another entity.
     *           
     * 
     */
    CORPORATE_ACTION,

    /**
     * The reason for expiry is neither of 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:p398136_="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:p839522_="https://jakarta.ee/xml/ns/jaxb" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DISSOLVED&lt;/code&gt;
     * </pre>
     *  nor
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:p398136_="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:p839522_="https://jakarta.ee/xml/ns/jaxb" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CORPORATE_ACTION&lt;/code&gt;
     * </pre>
     * 
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static EntityExpirationReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
