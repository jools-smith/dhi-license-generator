
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partNumberName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseModel" type="{urn:com.flexnet.external.type}LicenseModel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartNumber", propOrder = {
    "partNumberName",
    "licenseModel"
})
public class PartNumber {

    @XmlElement(required = true, nillable = true)
    protected String partNumberName;
    @XmlElement(required = true, nillable = true)
    protected LicenseModel licenseModel;

    /**
     * Gets the value of the partNumberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumberName() {
        return partNumberName;
    }

    /**
     * Sets the value of the partNumberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumberName(String value) {
        this.partNumberName = value;
    }

    /**
     * Gets the value of the licenseModel property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseModel }
     *     
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Sets the value of the licenseModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseModel }
     *     
     */
    public void setLicenseModel(LicenseModel value) {
        this.licenseModel = value;
    }

}
