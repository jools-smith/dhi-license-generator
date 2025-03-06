
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.flexnet.external.type}LicenseModel">
 *       &lt;sequence>
 *         &lt;element name="deployed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LicenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="licenseGeneratorConfiguration" type="{urn:com.flexnet.external.type}LicenseGeneratorConfig"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deployed",
    "licenseTechnology",
    "licenseGeneratorConfiguration"
})
@XmlRootElement(name = "LicenseModelRequest")
public class LicenseModelRequest
    extends LicenseModel
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deployed;
    @XmlElement(name = "LicenseTechnology", required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(required = true, nillable = true)
    protected LicenseGeneratorConfig licenseGeneratorConfiguration;

    /**
     * Gets the value of the deployed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeployed() {
        return deployed;
    }

    /**
     * Sets the value of the deployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeployed(Boolean value) {
        this.deployed = value;
    }

    /**
     * Gets the value of the licenseTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTechnology }
     *     
     */
    public LicenseTechnology getLicenseTechnology() {
        return licenseTechnology;
    }

    /**
     * Sets the value of the licenseTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTechnology }
     *     
     */
    public void setLicenseTechnology(LicenseTechnology value) {
        this.licenseTechnology = value;
    }

    /**
     * Gets the value of the licenseGeneratorConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseGeneratorConfig }
     *     
     */
    public LicenseGeneratorConfig getLicenseGeneratorConfiguration() {
        return licenseGeneratorConfiguration;
    }

    /**
     * Sets the value of the licenseGeneratorConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseGeneratorConfig }
     *     
     */
    public void setLicenseGeneratorConfiguration(LicenseGeneratorConfig value) {
        this.licenseGeneratorConfiguration = value;
    }

}
