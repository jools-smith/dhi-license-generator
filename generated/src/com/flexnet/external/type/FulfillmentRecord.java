
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FulfillmentRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="lineItem" type="{urn:com.flexnet.external.type}EntitlementLineItem"/>
 *         &lt;element name="licenseModelAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="lifeCycleStatus" type="{urn:com.flexnet.external.type}FulfillmentLifeCycleStatusENC"/>
 *         &lt;element name="source" type="{urn:com.flexnet.external.type}FulfillmentSourceENC"/>
 *         &lt;element name="state" type="{urn:com.flexnet.external.type}EntityStateENC"/>
 *         &lt;element name="fulfilledRepairCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfillmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="returnedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfillmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="migrationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="activationTypeENC" type="{urn:com.flexnet.external.type}ActivationTypeENC"/>
 *         &lt;element name="licenseHostId" type="{urn:com.flexnet.external.type}LicenseHostId"/>
 *         &lt;element name="licenseFileType" type="{urn:com.flexnet.external.type}LicenseFileTypeENC"/>
 *         &lt;element name="reatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseFiles" type="{urn:com.flexnet.external.type}LicenseFileMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseFileNames" type="{urn:com.flexnet.external.type}LicenseFileDefinitionMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentRecord", propOrder = {
    "binaryLicense",
    "lineItem",
    "licenseModelAttributes",
    "lifeCycleStatus",
    "source",
    "state",
    "fulfilledRepairCount",
    "overdraftCount",
    "fulfillmentCount",
    "fulfillDate",
    "expirationDate",
    "startDate",
    "returnedCount",
    "fulfillmentId",
    "migrationID",
    "shipToAddress",
    "shipToEmail",
    "licenseTechnology",
    "activationTypeENC",
    "licenseHostId",
    "licenseFileType",
    "reatedBy",
    "licenseFilename",
    "licenseFiles",
    "licenseFileNames"
})
public class FulfillmentRecord {

    @XmlElement(required = true, nillable = true)
    protected byte[] binaryLicense;
    @XmlElement(required = true, nillable = true)
    protected EntitlementLineItem lineItem;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet licenseModelAttributes;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected FulfillmentLifeCycleStatusENC lifeCycleStatus;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected FulfillmentSourceENC source;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityStateENC state;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fulfilledRepairCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fulfillmentCount;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fulfillDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer returnedCount;
    @XmlElement(required = true, nillable = true)
    protected String fulfillmentId;
    @XmlElement(required = true, nillable = true)
    protected String migrationID;
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress;
    @XmlElement(required = true, nillable = true)
    protected String shipToEmail;
    @XmlElement(required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ActivationTypeENC activationTypeENC;
    @XmlElement(required = true, nillable = true)
    protected LicenseHostId licenseHostId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected LicenseFileTypeENC licenseFileType;
    @XmlElement(required = true, nillable = true)
    protected String reatedBy;
    @XmlElement(required = true, nillable = true)
    protected String licenseFilename;
    @XmlElement(nillable = true)
    protected List<LicenseFileMapItem> licenseFiles;
    protected List<LicenseFileDefinitionMapItem> licenseFileNames;

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
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementLineItem }
     *     
     */
    public EntitlementLineItem getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementLineItem }
     *     
     */
    public void setLineItem(EntitlementLineItem value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the licenseModelAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getLicenseModelAttributes() {
        return licenseModelAttributes;
    }

    /**
     * Sets the value of the licenseModelAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setLicenseModelAttributes(AttributeSet value) {
        this.licenseModelAttributes = value;
    }

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentLifeCycleStatusENC }
     *     
     */
    public FulfillmentLifeCycleStatusENC getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    /**
     * Sets the value of the lifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentLifeCycleStatusENC }
     *     
     */
    public void setLifeCycleStatus(FulfillmentLifeCycleStatusENC value) {
        this.lifeCycleStatus = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentSourceENC }
     *     
     */
    public FulfillmentSourceENC getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentSourceENC }
     *     
     */
    public void setSource(FulfillmentSourceENC value) {
        this.source = value;
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
     * Gets the value of the fulfilledRepairCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfilledRepairCount() {
        return fulfilledRepairCount;
    }

    /**
     * Sets the value of the fulfilledRepairCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFulfilledRepairCount(Integer value) {
        this.fulfilledRepairCount = value;
    }

    /**
     * Gets the value of the overdraftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdraftCount() {
        return overdraftCount;
    }

    /**
     * Sets the value of the overdraftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdraftCount(Integer value) {
        this.overdraftCount = value;
    }

    /**
     * Gets the value of the fulfillmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfillmentCount() {
        return fulfillmentCount;
    }

    /**
     * Sets the value of the fulfillmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFulfillmentCount(Integer value) {
        this.fulfillmentCount = value;
    }

    /**
     * Gets the value of the fulfillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFulfillDate() {
        return fulfillDate;
    }

    /**
     * Sets the value of the fulfillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFulfillDate(XMLGregorianCalendar value) {
        this.fulfillDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the returnedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedCount() {
        return returnedCount;
    }

    /**
     * Sets the value of the returnedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedCount(Integer value) {
        this.returnedCount = value;
    }

    /**
     * Gets the value of the fulfillmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentId() {
        return fulfillmentId;
    }

    /**
     * Sets the value of the fulfillmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentId(String value) {
        this.fulfillmentId = value;
    }

    /**
     * Gets the value of the migrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationID() {
        return migrationID;
    }

    /**
     * Sets the value of the migrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationID(String value) {
        this.migrationID = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress(String value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEmail() {
        return shipToEmail;
    }

    /**
     * Sets the value of the shipToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEmail(String value) {
        this.shipToEmail = value;
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
     * Gets the value of the activationTypeENC property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationTypeENC }
     *     
     */
    public ActivationTypeENC getActivationTypeENC() {
        return activationTypeENC;
    }

    /**
     * Sets the value of the activationTypeENC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationTypeENC }
     *     
     */
    public void setActivationTypeENC(ActivationTypeENC value) {
        this.activationTypeENC = value;
    }

    /**
     * Gets the value of the licenseHostId property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseHostId }
     *     
     */
    public LicenseHostId getLicenseHostId() {
        return licenseHostId;
    }

    /**
     * Sets the value of the licenseHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHostId }
     *     
     */
    public void setLicenseHostId(LicenseHostId value) {
        this.licenseHostId = value;
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
     * Gets the value of the reatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReatedBy() {
        return reatedBy;
    }

    /**
     * Sets the value of the reatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReatedBy(String value) {
        this.reatedBy = value;
    }

    /**
     * Gets the value of the licenseFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseFilename() {
        return licenseFilename;
    }

    /**
     * Sets the value of the licenseFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseFilename(String value) {
        this.licenseFilename = value;
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

}
