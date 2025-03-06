
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeTypeENC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeENC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LONGTEXT"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="MULTI_VALUED_TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeTypeENC")
@XmlEnum
public enum AttributeTypeENC {

    LONGTEXT,
    TEXT,
    NUMBER,
    BOOLEAN,
    DATE,
    MULTI_VALUED_TEXT;

    public String value() {
        return name();
    }

    public static AttributeTypeENC fromValue(String v) {
        return valueOf(v);
    }

}
