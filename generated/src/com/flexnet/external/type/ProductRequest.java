
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *     &lt;extension base="{urn:com.flexnet.external.type}Product">
 *       &lt;sequence>
 *         &lt;element name="partNumbers" type="{urn:com.flexnet.external.type}PartNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hostType" type="{urn:com.flexnet.external.type}HostType"/>
 *         &lt;element name="headerResourceBundleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trailerResourceBundleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="licenseGeneratorConfig" type="{urn:com.flexnet.external.type}LicenseGeneratorConfig"/>
 *         &lt;element name="deployed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "partNumbers",
    "hostType",
    "headerResourceBundleKey",
    "trailerResourceBundleKey",
    "licenseTechnology",
    "licenseGeneratorConfig",
    "deployed"
})
@XmlRootElement(name = "ProductRequest")
public class ProductRequest
    extends Product
{

    @XmlElement(nillable = true)
    protected List<PartNumber> partNumbers;
    @XmlElement(required = true, nillable = true)
    protected HostType hostType;
    @XmlElementRef(name = "headerResourceBundleKey", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerResourceBundleKey;
    @XmlElementRef(name = "trailerResourceBundleKey", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trailerResourceBundleKey;
    @XmlElement(required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(required = true, nillable = true)
    protected LicenseGeneratorConfig licenseGeneratorConfig;
    protected boolean deployed;

    /**
     * Gets the value of the partNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartNumber }
     * 
     * 
     */
    public List<PartNumber> getPartNumbers() {
        if (partNumbers == null) {
            partNumbers = new ArrayList<PartNumber>();
        }
        return this.partNumbers;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link HostType }
     *     
     */
    public HostType getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostType }
     *     
     */
    public void setHostType(HostType value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the headerResourceBundleKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderResourceBundleKey() {
        return headerResourceBundleKey;
    }

    /**
     * Sets the value of the headerResourceBundleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderResourceBundleKey(JAXBElement<String> value) {
        this.headerResourceBundleKey = value;
    }

    /**
     * Gets the value of the trailerResourceBundleKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrailerResourceBundleKey() {
        return trailerResourceBundleKey;
    }

    /**
     * Sets the value of the trailerResourceBundleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrailerResourceBundleKey(JAXBElement<String> value) {
        this.trailerResourceBundleKey = value;
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
     * Gets the value of the licenseGeneratorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseGeneratorConfig }
     *     
     */
    public LicenseGeneratorConfig getLicenseGeneratorConfig() {
        return licenseGeneratorConfig;
    }

    /**
     * Sets the value of the licenseGeneratorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseGeneratorConfig }
     *     
     */
    public void setLicenseGeneratorConfig(LicenseGeneratorConfig value) {
        this.licenseGeneratorConfig = value;
    }

    /**
     * Gets the value of the deployed property.
     * 
     */
    public boolean isDeployed() {
        return deployed;
    }

    /**
     * Sets the value of the deployed property.
     * 
     */
    public void setDeployed(boolean value) {
        this.deployed = value;
    }

    /**
     * Sets the value of the partNumbers property.
     * 
     * @param partNumbers
     *     allowed object is
     *     {@link PartNumber }
     *     
     */
    public void setPartNumbers(List<PartNumber> partNumbers) {
        this.partNumbers = partNumbers;
    }

}
