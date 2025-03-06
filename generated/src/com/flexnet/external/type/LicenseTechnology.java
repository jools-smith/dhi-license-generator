
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseTechnology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseTechnology">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emergencyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="publisherErrorCorrectionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rehostAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repairAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="returnAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stopGapAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customFilenameGenerator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="generatorAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="licenseGeneratorConfigurationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{urn:com.flexnet.external.type}EntityStateENC"/>
 *         &lt;element name="licenseFileType" type="{urn:com.flexnet.external.type}LicenseFileTypeENC"/>
 *         &lt;element name="licenseFileDefinitions" type="{urn:com.flexnet.external.type}LicenseFileDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hostTypes" type="{urn:com.flexnet.external.type}HostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseTechnology", propOrder = {
    "name",
    "emergencyAllowed",
    "publisherErrorCorrectionAllowed",
    "rehostAllowed",
    "repairAllowed",
    "returnAllowed",
    "stopGapAllowed",
    "customFilenameGenerator",
    "licenseAttributes",
    "generatorAttributes",
    "licenseGeneratorConfigurationName",
    "state",
    "licenseFileType",
    "licenseFileDefinitions",
    "hostTypes"
})
public class LicenseTechnology {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean emergencyAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean publisherErrorCorrectionAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rehostAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean repairAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean returnAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean stopGapAllowed;
    @XmlElement(required = true, nillable = true)
    protected String customFilenameGenerator;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet licenseAttributes;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet generatorAttributes;
    @XmlElement(required = true, nillable = true)
    protected String licenseGeneratorConfigurationName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityStateENC state;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected LicenseFileTypeENC licenseFileType;
    @XmlElement(nillable = true)
    protected List<LicenseFileDefinition> licenseFileDefinitions;
    @XmlElement(nillable = true)
    protected List<HostType> hostTypes;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the emergencyAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergencyAllowed() {
        return emergencyAllowed;
    }

    /**
     * Sets the value of the emergencyAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergencyAllowed(Boolean value) {
        this.emergencyAllowed = value;
    }

    /**
     * Gets the value of the publisherErrorCorrectionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublisherErrorCorrectionAllowed() {
        return publisherErrorCorrectionAllowed;
    }

    /**
     * Sets the value of the publisherErrorCorrectionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublisherErrorCorrectionAllowed(Boolean value) {
        this.publisherErrorCorrectionAllowed = value;
    }

    /**
     * Gets the value of the rehostAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRehostAllowed() {
        return rehostAllowed;
    }

    /**
     * Sets the value of the rehostAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRehostAllowed(Boolean value) {
        this.rehostAllowed = value;
    }

    /**
     * Gets the value of the repairAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairAllowed() {
        return repairAllowed;
    }

    /**
     * Sets the value of the repairAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairAllowed(Boolean value) {
        this.repairAllowed = value;
    }

    /**
     * Gets the value of the returnAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAllowed() {
        return returnAllowed;
    }

    /**
     * Sets the value of the returnAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAllowed(Boolean value) {
        this.returnAllowed = value;
    }

    /**
     * Gets the value of the stopGapAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopGapAllowed() {
        return stopGapAllowed;
    }

    /**
     * Sets the value of the stopGapAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopGapAllowed(Boolean value) {
        this.stopGapAllowed = value;
    }

    /**
     * Gets the value of the customFilenameGenerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFilenameGenerator() {
        return customFilenameGenerator;
    }

    /**
     * Sets the value of the customFilenameGenerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFilenameGenerator(String value) {
        this.customFilenameGenerator = value;
    }

    /**
     * Gets the value of the licenseAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getLicenseAttributes() {
        return licenseAttributes;
    }

    /**
     * Sets the value of the licenseAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setLicenseAttributes(AttributeSet value) {
        this.licenseAttributes = value;
    }

    /**
     * Gets the value of the generatorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getGeneratorAttributes() {
        return generatorAttributes;
    }

    /**
     * Sets the value of the generatorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setGeneratorAttributes(AttributeSet value) {
        this.generatorAttributes = value;
    }

    /**
     * Gets the value of the licenseGeneratorConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGeneratorConfigurationName() {
        return licenseGeneratorConfigurationName;
    }

    /**
     * Sets the value of the licenseGeneratorConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseGeneratorConfigurationName(String value) {
        this.licenseGeneratorConfigurationName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateENC }
     *     
     */
    public EntityStateENC getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateENC }
     *     
     */
    public void setState(EntityStateENC value) {
        this.state = value;
    }

    /**
     * Gets the value of the licenseFileType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseFileTypeENC }
     *     
     */
    public LicenseFileTypeENC getLicenseFileType() {
        return licenseFileType;
    }

    /**
     * Sets the value of the licenseFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseFileTypeENC }
     *     
     */
    public void setLicenseFileType(LicenseFileTypeENC value) {
        this.licenseFileType = value;
    }

    /**
     * Gets the value of the licenseFileDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseFileDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseFileDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFileDefinition }
     * 
     * 
     */
    public List<LicenseFileDefinition> getLicenseFileDefinitions() {
        if (licenseFileDefinitions == null) {
            licenseFileDefinitions = new ArrayList<LicenseFileDefinition>();
        }
        return this.licenseFileDefinitions;
    }

    /**
     * Gets the value of the hostTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostType }
     * 
     * 
     */
    public List<HostType> getHostTypes() {
        if (hostTypes == null) {
            hostTypes = new ArrayList<HostType>();
        }
        return this.hostTypes;
    }

    /**
     * Sets the value of the licenseFileDefinitions property.
     * 
     * @param licenseFileDefinitions
     *     allowed object is
     *     {@link LicenseFileDefinition }
     *     
     */
    public void setLicenseFileDefinitions(List<LicenseFileDefinition> licenseFileDefinitions) {
        this.licenseFileDefinitions = licenseFileDefinitions;
    }

    /**
     * Sets the value of the hostTypes property.
     * 
     * @param hostTypes
     *     allowed object is
     *     {@link HostType }
     *     
     */
    public void setHostTypes(List<HostType> hostTypes) {
        this.hostTypes = hostTypes;
    }

}
