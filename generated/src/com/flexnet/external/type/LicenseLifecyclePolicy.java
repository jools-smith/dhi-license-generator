
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseLifecyclePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseLifecyclePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOperations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="duration" type="{urn:com.flexnet.external.type}Duration"/>
 *         &lt;element name="IsIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseLifecyclePolicy", propOrder = {
    "numOperations",
    "duration",
    "isIgnored"
})
public class LicenseLifecyclePolicy {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numOperations;
    @XmlElement(required = true, nillable = true)
    protected Duration duration;
    @XmlElement(name = "IsIgnored", required = true, type = Boolean.class, nillable = true)
    protected Boolean isIgnored;

    /**
     * Gets the value of the numOperations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOperations() {
        return numOperations;
    }

    /**
     * Sets the value of the numOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOperations(Integer value) {
        this.numOperations = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

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

}
