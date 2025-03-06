
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseRedundantServerPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseRedundantServerPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="redundant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseRedundantServerPolicy", propOrder = {
    "isIgnored",
    "redundant"
})
public class LicenseRedundantServerPolicy {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isIgnored;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean redundant;

    /**
     * Gets the value of the isIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIgnored() {
        return isIgnored;
    }

    /**
     * Sets the value of the isIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIgnored(Boolean value) {
        this.isIgnored = value;
    }

    /**
     * Gets the value of the redundant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedundant() {
        return redundant;
    }

    /**
     * Sets the value of the redundant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedundant(Boolean value) {
        this.redundant = value;
    }

}
