
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseFileTypeENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseFileTypeENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="BINARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseFileTypeENC")
@XmlEnum
public enum LicenseFileTypeENC {

    TEXT,
    BINARY;

    public String value() {
        return name();
    }

    public static LicenseFileTypeENC fromValue(String v) {
        return valueOf(v);
    }

}
