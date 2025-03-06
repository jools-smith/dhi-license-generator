
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionDateOptionsENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionDateOptionsENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFINE_NOW"/>
 *     &lt;enumeration value="USE_START_DATE"/>
 *     &lt;enumeration value="USE_ACTIVATION_DATE"/>
 *     &lt;enumeration value="DEFINE_VERSION_STARTDATE_LATER"/>
 *     &lt;enumeration value="DEFINE_VERSION_DATE_LATER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VersionDateOptionsENC")
@XmlEnum
public enum VersionDateOptionsENC {

    DEFINE_NOW,
    USE_START_DATE,
    USE_ACTIVATION_DATE,
    DEFINE_VERSION_STARTDATE_LATER,
    DEFINE_VERSION_DATE_LATER;

    public String value() {
        return name();
    }

    public static VersionDateOptionsENC fromValue(String v) {
        return valueOf(v);
    }

}
