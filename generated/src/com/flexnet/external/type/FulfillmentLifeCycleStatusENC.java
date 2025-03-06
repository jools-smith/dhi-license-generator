
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FulfillmentLifeCycleStatusENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FulfillmentLifeCycleStatusENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIFECYCLE_STATUS_STOPGAP"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_EMERGENCY"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_REHOST"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_RETURN"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_PUBLISHER_ERROR"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_REPAIR"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_UPGRADE"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_TRANSFER"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_UPSELL"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_RENEW"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_REINSTALL"/>
 *     &lt;enumeration value="LIFECYCLE_STATUS_DELETE"/>
 *     &lt;enumeration value="MASTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FulfillmentLifeCycleStatusENC")
@XmlEnum
public enum FulfillmentLifeCycleStatusENC {

    LIFECYCLE_STATUS_STOPGAP,
    LIFECYCLE_STATUS_EMERGENCY,
    LIFECYCLE_STATUS_REHOST,
    LIFECYCLE_STATUS_RETURN,
    LIFECYCLE_STATUS_PUBLISHER_ERROR,
    LIFECYCLE_STATUS_REPAIR,
    LIFECYCLE_STATUS_UPGRADE,
    LIFECYCLE_STATUS_TRANSFER,
    LIFECYCLE_STATUS_UPSELL,
    LIFECYCLE_STATUS_RENEW,
    LIFECYCLE_STATUS_REINSTALL,
    LIFECYCLE_STATUS_DELETE,
    MASTER;

    public String value() {
        return name();
    }

    public static FulfillmentLifeCycleStatusENC fromValue(String v) {
        return valueOf(v);
    }

}
