
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeWhenENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeWhenENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_USED"/>
 *     &lt;enumeration value="MODEL_TIME"/>
 *     &lt;enumeration value="ENTITLEMENT_TIME"/>
 *     &lt;enumeration value="MODEL_TIME_PERCENT"/>
 *     &lt;enumeration value="MODEL_UNLIMITED"/>
 *     &lt;enumeration value="USE_DEFAULT_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeWhenENC")
@XmlEnum
public enum AttributeWhenENC {

    NOT_USED,
    MODEL_TIME,
    ENTITLEMENT_TIME,
    MODEL_TIME_PERCENT,
    MODEL_UNLIMITED,
    USE_DEFAULT_VALUE;

    public String value() {
        return name();
    }

    public static AttributeWhenENC fromValue(String v) {
        return valueOf(v);
    }

}
