
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licenseText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fulfillments" type="{urn:com.flexnet.external.type}FulfillmentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="binaryLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="licenseFileNames" type="{urn:com.flexnet.external.type}LicenseFileDefinitionMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licFiles" type="{urn:com.flexnet.external.type}LicenseFileMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "licenseText",
    "criteria",
    "fulfillments",
    "licenseFileName",
    "binaryLicense",
    "licenseFileNames",
    "licFiles"
})
@XmlRootElement(name = "ConsolidatedLicenseResquest")
public class ConsolidatedLicenseResquest {

    @XmlElement(required = true, nillable = true)
    protected String licenseText;
    @XmlElement(required = true, nillable = true)
    protected String criteria;
    @XmlElement(nillable = true)
    protected List<FulfillmentRecord> fulfillments;
    @XmlElement(required = true, nillable = true)
    protected String licenseFileName;
    @XmlElement(required = true, nillable = true)
    protected byte[] binaryLicense;
    @XmlElement(nillable = true)
    protected List<LicenseFileDefinitionMapItem> licenseFileNames;
    @XmlElement(nillable = true)
    protected List<LicenseFileMapItem> licFiles;

    /**
     * Gets the value of the licenseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseText() {
        return licenseText;
    }

    /**
     * Sets the value of the licenseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseText(String value) {
        this.licenseText = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the fulfillments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulfillments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulfillments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FulfillmentRecord }
     * 
     * 
     */
    public List<FulfillmentRecord> getFulfillments() {
        if (fulfillments == null) {
            fulfillments = new ArrayList<FulfillmentRecord>();
        }
        return this.fulfillments;
    }

    /**
     * Gets the value of the licenseFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseFileName() {
        return licenseFileName;
    }

    /**
     * Sets the value of the licenseFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseFileName(String value) {
        this.licenseFileName = value;
    }

    /**
     * Gets the value of the binaryLicense property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryLicense() {
        return binaryLicense;
    }

    /**
     * Sets the value of the binaryLicense property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryLicense(byte[] value) {
        this.binaryLicense = value;
    }

    /**
     * Gets the value of the licenseFileNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseFileNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseFileNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFileDefinitionMapItem }
     * 
     * 
     */
    public List<LicenseFileDefinitionMapItem> getLicenseFileNames() {
        if (licenseFileNames == null) {
            licenseFileNames = new ArrayList<LicenseFileDefinitionMapItem>();
        }
        return this.licenseFileNames;
    }

    /**
     * Gets the value of the licFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFileMapItem }
     * 
     * 
     */
    public List<LicenseFileMapItem> getLicFiles() {
        if (licFiles == null) {
            licFiles = new ArrayList<LicenseFileMapItem>();
        }
        return this.licFiles;
    }

    /**
     * Sets the value of the fulfillments property.
     * 
     * @param fulfillments
     *     allowed object is
     *     {@link FulfillmentRecord }
     *     
     */
    public void setFulfillments(List<FulfillmentRecord> fulfillments) {
        this.fulfillments = fulfillments;
    }

    /**
     * Sets the value of the licenseFileNames property.
     * 
     * @param licenseFileNames
     *     allowed object is
     *     {@link LicenseFileDefinitionMapItem }
     *     
     */
    public void setLicenseFileNames(List<LicenseFileDefinitionMapItem> licenseFileNames) {
        this.licenseFileNames = licenseFileNames;
    }

    /**
     * Sets the value of the licFiles property.
     * 
     * @param licFiles
     *     allowed object is
     *     {@link LicenseFileMapItem }
     *     
     */
    public void setLicFiles(List<LicenseFileMapItem> licFiles) {
        this.licFiles = licFiles;
    }

}
