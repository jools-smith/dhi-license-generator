
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartDateOptionsENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StartDateOptionsENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFINE_NOW"/>
 *     &lt;enumeration value="DEFINE_AT_FIRST_ACTIVATION"/>
 *     &lt;enumeration value="DEFINE_AT_EACH_ACTIVATION"/>
 *     &lt;enumeration value="DEFINE_AS_ACTIVATION_DATE_AT_FIRST_ACTIVATION"/>
 *     &lt;enumeration value="DEFINE_AS_ACTIVATION_DATE_AT_EACH_ACTIVATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StartDateOptionsENC")
@XmlEnum
public enum StartDateOptionsENC {

    DEFINE_NOW,
    DEFINE_AT_FIRST_ACTIVATION,
    DEFINE_AT_EACH_ACTIVATION,
    DEFINE_AS_ACTIVATION_DATE_AT_FIRST_ACTIVATION,
    DEFINE_AS_ACTIVATION_DATE_AT_EACH_ACTIVATION;

    public String value() {
        return name();
    }

    public static StartDateOptionsENC fromValue(String v) {
        return valueOf(v);
    }

}
