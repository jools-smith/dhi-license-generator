
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNSUPPORTED"/>
 *     &lt;enumeration value="LONGHOSTID"/>
 *     &lt;enumeration value="ETHERNET"/>
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="DISPLAY"/>
 *     &lt;enumeration value="HOSTNAME"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="FLEXID7"/>
 *     &lt;enumeration value="VSN"/>
 *     &lt;enumeration value="INTERNET"/>
 *     &lt;enumeration value="INTERNET6"/>
 *     &lt;enumeration value="FLEXID9"/>
 *     &lt;enumeration value="HOSTDOMAIN"/>
 *     &lt;enumeration value="FLEXID6"/>
 *     &lt;enumeration value="COMPOSITE"/>
 *     &lt;enumeration value="VENDOR"/>
 *     &lt;enumeration value="FLEXID10"/>
 *     &lt;enumeration value="VM_UUID"/>
 *     &lt;enumeration value="AMAZON_EIP"/>
 *     &lt;enumeration value="AMAZON_AMI"/>
 *     &lt;enumeration value="AMAZON_IID"/>
 *     &lt;enumeration value="PUBLISHER_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostIdType")
@XmlEnum
public enum HostIdType {

    UNKNOWN("UNKNOWN"),
    UNSUPPORTED("UNSUPPORTED"),
    LONGHOSTID("LONGHOSTID"),
    ETHERNET("ETHERNET"),
    ANY("ANY"),
    USER("USER"),
    DISPLAY("DISPLAY"),
    HOSTNAME("HOSTNAME"),
    STRING("STRING"),
    @XmlEnumValue("FLEXID7")
    FLEXID_7("FLEXID7"),
    VSN("VSN"),
    INTERNET("INTERNET"),
    @XmlEnumValue("INTERNET6")
    INTERNET_6("INTERNET6"),
    @XmlEnumValue("FLEXID9")
    FLEXID_9("FLEXID9"),
    HOSTDOMAIN("HOSTDOMAIN"),
    @XmlEnumValue("FLEXID6")
    FLEXID_6("FLEXID6"),
    COMPOSITE("COMPOSITE"),
    VENDOR("VENDOR"),
    @XmlEnumValue("FLEXID10")
    FLEXID_10("FLEXID10"),
    VM_UUID("VM_UUID"),
    AMAZON_EIP("AMAZON_EIP"),
    AMAZON_AMI("AMAZON_AMI"),
    AMAZON_IID("AMAZON_IID"),
    PUBLISHER_DEFINED("PUBLISHER_DEFINED");
    private final String value;

    HostIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostIdType fromValue(String v) {
        for (HostIdType c: HostIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
