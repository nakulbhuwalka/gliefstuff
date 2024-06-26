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
 * <p>Java class for LegalEntityEventTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LegalEntityEventTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CHANGE_LEGAL_NAME"/&gt;
 *     &lt;enumeration value="CHANGE_OTHER_NAMES"/&gt;
 *     &lt;enumeration value="CHANGE_LEGAL_ADDRESS"/&gt;
 *     &lt;enumeration value="CHANGE_HQ_ADDRESS"/&gt;
 *     &lt;enumeration value="CHANGE_LEGAL_FORM"/&gt;
 *     &lt;enumeration value="DEMERGER"/&gt;
 *     &lt;enumeration value="SPINOFF"/&gt;
 *     &lt;enumeration value="ABSORPTION"/&gt;
 *     &lt;enumeration value="ACQUISITION_BRANCH"/&gt;
 *     &lt;enumeration value="TRANSFORMATION_BRANCH_TO_SUBSIDIARY"/&gt;
 *     &lt;enumeration value="TRANSFORMATION_SUBSIDIARY_TO_BRANCH"/&gt;
 *     &lt;enumeration value="TRANSFORMATION_UMBRELLA_TO_STANDALONE"/&gt;
 *     &lt;enumeration value="BREAKUP"/&gt;
 *     &lt;enumeration value="MERGERS_AND_ACQUISITIONS"/&gt;
 *     &lt;enumeration value="BANKRUPTCY"/&gt;
 *     &lt;enumeration value="LIQUIDATION"/&gt;
 *     &lt;enumeration value="VOLUNTARY_ARRANGEMENT"/&gt;
 *     &lt;enumeration value="INSOLVENCY"/&gt;
 *     &lt;enumeration value="DISSOLUTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalEntityEventTypeEnum")
@XmlEnum
public enum LegalEntityEventTypeEnum {


    /**
     * Change in the legal name of the legal entity.
     * 
     */
    CHANGE_LEGAL_NAME,

    /**
     * Change in the trade- or doing business name of the legal entity.
     * 
     */
    CHANGE_OTHER_NAMES,

    /**
     * Change in the legal address of the legal entity.
     * 
     */
    CHANGE_LEGAL_ADDRESS,

    /**
     * Change in the headquarters address of the legal entity.
     * 
     */
    CHANGE_HQ_ADDRESS,

    /**
     * Change in the legal form of the legal entity.
     * 
     */
    CHANGE_LEGAL_FORM,

    /**
     * Distribution of securities issued by another legal entity. The distributed securities may either be of a newly created or of an existing legal entity. For example, spin-off, demerger, unbundling, divestment.
     * 
     */
    DEMERGER,

    /**
     * A special case of demerger where the shareholders of the original entity are compensated for the value loss of the original entity via shares of the new entity or via dividend.
     * 
     */
    SPINOFF,

    /**
     * Absorption is a form of merger where there is a combination of two or more companies into an 'existing company'. In the case of absorption, only one company survives and all others lose their identity.
     * 
     */
    ABSORPTION,

    /**
     * The acquiring legal entity purchases an international branch entity.
     * 
     */
    ACQUISITION_BRANCH,

    /**
     * The transfer of all of the assets and liabilities of an International Branch to the new subsidiary entity in exchange for the transfer of securities representing the capital of the subsidiary entity receiving the transfer.
     * 
     */
    TRANSFORMATION_BRANCH_TO_SUBSIDIARY,

    /**
     * The transfer of all of the assets and liabilities of a subsidiary to an International Branch entity in exchange for the transfer of securities representing the capital of the International Branch entity receiving the transfer.
     * 
     */
    TRANSFORMATION_SUBSIDIARY_TO_BRANCH,

    /**
     * Change in legal form from a Fund legal entity structure with one or more than one sub-funds/compartments to a Fund legal entity structure without sub-funds/compartments.
     * 
     */
    TRANSFORMATION_UMBRELLA_TO_STANDALONE,

    /**
     * A break-up is a corporate action in which a single company splits into two or more independent, separately-run companies.  Regulators also can mandate break-ups of companies for anti-trust reasons.
     * 
     */
    BREAKUP,

    /**
     * The consolidation of Legal Entities or assets through various types of financial transactions, including mergers, acquisitions, consolidations, tender offers, purchase of assets and management acquisitions.
     * 
     */
    MERGERS_AND_ACQUISITIONS,

    /**
     * Legal status of a legal entity unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless (event completed).
     * 
     */
    BANKRUPTCY,

    /**
     * Distribution of cash, assets or both of a legal entity. Debt may be paid in order of priority based on preferred claims to assets specified by the security (event completed).
     * 
     */
    LIQUIDATION,

    /**
     * A procedure that allows a legal entity to settle debts by paying only a proportion of the amount that it owes to creditors or to come to some other arrangement with its creditors over the payment of its debts (event completed).
     * 
     */
    VOLUNTARY_ARRANGEMENT,

    /**
     * The entry of a decree or order by a court or agency or supervisory authority having jurisdiction in the premises the appointment of a trustee-in-bankruptcy or similar official for such party in any insolvency, readjustment of debt, marshalling of assets and liabilities, or similar proceedings, or for the winding up or liquidation of their respective affairs (event completed).
     * 
     */
    INSOLVENCY,

    /**
     * (i) A voluntary termination of operations, (ii) a general assignment for the benefit of the legal entity’s creditors or (iii) any other liquidation, dissolution or winding up of the legal entity (excluding a Liquidity Event), whether voluntary or involuntary (event completed).
     * 
     */
    DISSOLUTION;

    public String value() {
        return name();
    }

    public static LegalEntityEventTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
