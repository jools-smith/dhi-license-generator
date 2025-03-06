
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenewalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenewalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="REDIRECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenewalStatus")
@XmlEnum
public enum RenewalStatus {

    SUCCESS,
    FAILURE,
    REDIRECT;

    public String value() {
        return name();
    }

    public static RenewalStatus fromValue(String v) {
        return valueOf(v);
    }

}
