
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationTypeENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationTypeENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHORT_CODE"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="PROGRAMMATIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivationTypeENC")
@XmlEnum
public enum ActivationTypeENC {

    SHORT_CODE,
    MANUAL,
    DEFAULT,
    PROGRAMMATIC;

    public String value() {
        return name();
    }

    public static ActivationTypeENC fromValue(String v) {
        return valueOf(v);
    }

}
