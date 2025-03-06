
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
 *         &lt;element name="binaryLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="complete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="licenseFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseFiles" type="{urn:com.flexnet.external.type}LicenseFileMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "binaryLicense",
    "complete",
    "licenseFileName",
    "licenseFiles",
    "licenseText",
    "message"
})
@XmlRootElement(name = "GeneratorResponse")
public class GeneratorResponse {

    @XmlElement(required = true, nillable = true)
    protected byte[] binaryLicense;
    protected boolean complete;
    @XmlElement(required = true, nillable = true)
    protected String licenseFileName;
    @XmlElement(nillable = true)
    protected List<LicenseFileMapItem> licenseFiles;
    @XmlElement(required = true, nillable = true)
    protected String licenseText;
    @XmlElement(required = true, nillable = true)
    protected String message;

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
     * Gets the value of the complete property.
     * 
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets the value of the complete property.
     * 
     */
    public void setComplete(boolean value) {
        this.complete = value;
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
     * Gets the value of the licenseFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFileMapItem }
     * 
     * 
     */
    public List<LicenseFileMapItem> getLicenseFiles() {
        if (licenseFiles == null) {
            licenseFiles = new ArrayList<LicenseFileMapItem>();
        }
        return this.licenseFiles;
    }

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
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Sets the value of the licenseFiles property.
     * 
     * @param licenseFiles
     *     allowed object is
     *     {@link LicenseFileMapItem }
     *     
     */
    public void setLicenseFiles(List<LicenseFileMapItem> licenseFiles) {
        this.licenseFiles = licenseFiles;
    }

}
