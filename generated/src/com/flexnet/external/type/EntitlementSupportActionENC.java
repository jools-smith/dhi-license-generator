
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementSupportActionENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntitlementSupportActionENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RENEWAL"/>
 *     &lt;enumeration value="UPGRADE"/>
 *     &lt;enumeration value="UPSELL"/>
 *     &lt;enumeration value="RENEWING"/>
 *     &lt;enumeration value="UPGRADING"/>
 *     &lt;enumeration value="UPSELLING"/>
 *     &lt;enumeration value="ADDLINEITEMS"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntitlementSupportActionENC")
@XmlEnum
public enum EntitlementSupportActionENC {

    RENEWAL,
    UPGRADE,
    UPSELL,
    RENEWING,
    UPGRADING,
    UPSELLING,
    ADDLINEITEMS,
    NONE;

    public String value() {
        return name();
    }

    public static EntitlementSupportActionENC fromValue(String v) {
        return valueOf(v);
    }

}
