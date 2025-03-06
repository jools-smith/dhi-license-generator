
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FulfillmentRequestTypeENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FulfillmentRequestTypeENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATION"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="REHOST"/>
 *     &lt;enumeration value="EMERGENCY"/>
 *     &lt;enumeration value="STOPGAP"/>
 *     &lt;enumeration value="PUBLISHER_ERROR"/>
 *     &lt;enumeration value="SHORT_CODE_ACTIVATION"/>
 *     &lt;enumeration value="SHORT_CODE_REPAIR"/>
 *     &lt;enumeration value="SHORT_CODE_RETURN"/>
 *     &lt;enumeration value="UPGRADE"/>
 *     &lt;enumeration value="UPSELL"/>
 *     &lt;enumeration value="RENEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FulfillmentRequestTypeENC")
@XmlEnum
public enum FulfillmentRequestTypeENC {

    ACTIVATION,
    RETURN,
    REPAIR,
    REHOST,
    EMERGENCY,
    STOPGAP,
    PUBLISHER_ERROR,
    SHORT_CODE_ACTIVATION,
    SHORT_CODE_REPAIR,
    SHORT_CODE_RETURN,
    UPGRADE,
    UPSELL,
    RENEW;

    public String value() {
        return name();
    }

    public static FulfillmentRequestTypeENC fromValue(String v) {
        return valueOf(v);
    }

}
