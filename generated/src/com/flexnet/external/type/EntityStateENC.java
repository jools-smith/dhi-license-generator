
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityStateENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityStateENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="DEPLOYED"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="OBSOLETE"/>
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ON_HOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityStateENC")
@XmlEnum
public enum EntityStateENC {

    DRAFT,
    DEPLOYED,
    INACTIVE,
    OBSOLETE,
    TEST,
    ACTIVE,
    ON_HOLD;

    public String value() {
        return name();
    }

    public static EntityStateENC fromValue(String v) {
        return valueOf(v);
    }

}
