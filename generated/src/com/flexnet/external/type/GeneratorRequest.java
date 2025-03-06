
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
 * <p>Java class for GeneratorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneratorRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fulfilementID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fulfillCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="shipToEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customHost" type="{urn:com.flexnet.external.type}CustomHostId"/>
 *         &lt;element name="overdraftCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentFulfillments" type="{urn:com.flexnet.external.type}FulfillmentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestType" type="{urn:com.flexnet.external.type}FulfillmentRequestTypeENC"/>
 *         &lt;element name="verifyRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="activationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EntitlementLineItemCustomAttributes" type="{urn:com.flexnet.external.type}CustomAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entitlementID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soldTo" type="{urn:com.flexnet.external.type}OrganizationUnit"/>
 *         &lt;element name="soldToUsers" type="{urn:com.flexnet.external.type}OrgUnitUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EntitlementCustomAttributes" type="{urn:com.flexnet.external.type}CustomAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entitledProducts" type="{urn:com.flexnet.external.type}Product" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{urn:com.flexnet.external.type}PartNumber"/>
 *         &lt;element name="licenseModel" type="{urn:com.flexnet.external.type}LicenseModel"/>
 *         &lt;element name="licenseGeneratorConfiguration" type="{urn:com.flexnet.external.type}LicenseGeneratorConfig"/>
 *         &lt;element name="licenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="licenseFileDefinitions" type="{urn:com.flexnet.external.type}LicenseFileDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseFileType" type="{urn:com.flexnet.external.type}LicenseFileTypeENC"/>
 *         &lt;element name="currentLicenseOnHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loggedInUser" type="{urn:com.flexnet.external.type}OrgUnitUser"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneratorRequest", propOrder = {
    "fulfilementID",
    "fulfillCount",
    "startDate",
    "shipToEmail",
    "customHost",
    "overdraftCount",
    "parentFulfillments",
    "requestType",
    "verifyRequest",
    "activationID",
    "versionDate",
    "expirationDate",
    "entitlementLineItemCustomAttributes",
    "entitlementID",
    "orderId",
    "orderLineNumber",
    "soldTo",
    "soldToUsers",
    "entitlementCustomAttributes",
    "entitledProducts",
    "partNumber",
    "licenseModel",
    "licenseGeneratorConfiguration",
    "licenseTechnology",
    "licenseFileDefinitions",
    "licenseFileType",
    "currentLicenseOnHost",
    "loggedInUser"
})
public class GeneratorRequest {

    @XmlElement(required = true)
    protected String fulfilementID;
    protected int fulfillCount;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    protected String shipToEmail;
    @XmlElement(required = true, nillable = true)
    protected CustomHostId customHost;
    protected int overdraftCount;
    @XmlElement(nillable = true)
    protected List<FulfillmentRecord> parentFulfillments;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected FulfillmentRequestTypeENC requestType;
    protected boolean verifyRequest;
    @XmlElement(required = true)
    protected String activationID;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "EntitlementLineItemCustomAttributes", nillable = true)
    protected List<CustomAttribute> entitlementLineItemCustomAttributes;
    @XmlElement(required = true)
    protected String entitlementID;
    @XmlElement(required = true, nillable = true)
    protected String orderId;
    @XmlElement(required = true, nillable = true)
    protected String orderLineNumber;
    @XmlElement(required = true, nillable = true)
    protected OrganizationUnit soldTo;
    @XmlElement(nillable = true)
    protected List<OrgUnitUser> soldToUsers;
    @XmlElement(name = "EntitlementCustomAttributes", nillable = true)
    protected List<CustomAttribute> entitlementCustomAttributes;
    @XmlElement(nillable = true)
    protected List<Product> entitledProducts;
    @XmlElement(required = true, nillable = true)
    protected PartNumber partNumber;
    @XmlElement(required = true, nillable = true)
    protected LicenseModel licenseModel;
    @XmlElement(required = true, nillable = true)
    protected LicenseGeneratorConfig licenseGeneratorConfiguration;
    @XmlElement(required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(nillable = true)
    protected List<LicenseFileDefinition> licenseFileDefinitions;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected LicenseFileTypeENC licenseFileType;
    @XmlElement(required = true, nillable = true)
    protected String currentLicenseOnHost;
    @XmlElement(required = true, nillable = true)
    protected OrgUnitUser loggedInUser;

    /**
     * Gets the value of the fulfilementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfilementID() {
        return fulfilementID;
    }

    /**
     * Sets the value of the fulfilementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfilementID(String value) {
        this.fulfilementID = value;
    }

    /**
     * Gets the value of the fulfillCount property.
     * 
     */
    public int getFulfillCount() {
        return fulfillCount;
    }

    /**
     * Sets the value of the fulfillCount property.
     * 
     */
    public void setFulfillCount(int value) {
        this.fulfillCount = value;
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
     * Gets the value of the customHost property.
     * 
     * @return
     *     possible object is
     *     {@link CustomHostId }
     *     
     */
    public CustomHostId getCustomHost() {
        return customHost;
    }

    /**
     * Sets the value of the customHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomHostId }
     *     
     */
    public void setCustomHost(CustomHostId value) {
        this.customHost = value;
    }

    /**
     * Gets the value of the overdraftCount property.
     * 
     */
    public int getOverdraftCount() {
        return overdraftCount;
    }

    /**
     * Sets the value of the overdraftCount property.
     * 
     */
    public void setOverdraftCount(int value) {
        this.overdraftCount = value;
    }

    /**
     * Gets the value of the parentFulfillments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentFulfillments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentFulfillments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FulfillmentRecord }
     * 
     * 
     */
    public List<FulfillmentRecord> getParentFulfillments() {
        if (parentFulfillments == null) {
            parentFulfillments = new ArrayList<FulfillmentRecord>();
        }
        return this.parentFulfillments;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentRequestTypeENC }
     *     
     */
    public FulfillmentRequestTypeENC getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentRequestTypeENC }
     *     
     */
    public void setRequestType(FulfillmentRequestTypeENC value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the verifyRequest property.
     * 
     */
    public boolean isVerifyRequest() {
        return verifyRequest;
    }

    /**
     * Sets the value of the verifyRequest property.
     * 
     */
    public void setVerifyRequest(boolean value) {
        this.verifyRequest = value;
    }

    /**
     * Gets the value of the activationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationID() {
        return activationID;
    }

    /**
     * Sets the value of the activationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationID(String value) {
        this.activationID = value;
    }

    /**
     * Gets the value of the versionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDate() {
        return versionDate;
    }

    /**
     * Sets the value of the versionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDate(XMLGregorianCalendar value) {
        this.versionDate = value;
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
     * Gets the value of the entitlementLineItemCustomAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitlementLineItemCustomAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitlementLineItemCustomAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttribute }
     * 
     * 
     */
    public List<CustomAttribute> getEntitlementLineItemCustomAttributes() {
        if (entitlementLineItemCustomAttributes == null) {
            entitlementLineItemCustomAttributes = new ArrayList<CustomAttribute>();
        }
        return this.entitlementLineItemCustomAttributes;
    }

    /**
     * Gets the value of the entitlementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementID() {
        return entitlementID;
    }

    /**
     * Sets the value of the entitlementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementID(String value) {
        this.entitlementID = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * Sets the value of the orderLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineNumber(String value) {
        this.orderLineNumber = value;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationUnit }
     *     
     */
    public OrganizationUnit getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationUnit }
     *     
     */
    public void setSoldTo(OrganizationUnit value) {
        this.soldTo = value;
    }

    /**
     * Gets the value of the soldToUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soldToUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoldToUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgUnitUser }
     * 
     * 
     */
    public List<OrgUnitUser> getSoldToUsers() {
        if (soldToUsers == null) {
            soldToUsers = new ArrayList<OrgUnitUser>();
        }
        return this.soldToUsers;
    }

    /**
     * Gets the value of the entitlementCustomAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitlementCustomAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitlementCustomAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttribute }
     * 
     * 
     */
    public List<CustomAttribute> getEntitlementCustomAttributes() {
        if (entitlementCustomAttributes == null) {
            entitlementCustomAttributes = new ArrayList<CustomAttribute>();
        }
        return this.entitlementCustomAttributes;
    }

    /**
     * Gets the value of the entitledProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitledProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitledProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getEntitledProducts() {
        if (entitledProducts == null) {
            entitledProducts = new ArrayList<Product>();
        }
        return this.entitledProducts;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PartNumber }
     *     
     */
    public PartNumber getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartNumber }
     *     
     */
    public void setPartNumber(PartNumber value) {
        this.partNumber = value;
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
     * Gets the value of the currentLicenseOnHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLicenseOnHost() {
        return currentLicenseOnHost;
    }

    /**
     * Sets the value of the currentLicenseOnHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLicenseOnHost(String value) {
        this.currentLicenseOnHost = value;
    }

    /**
     * Gets the value of the loggedInUser property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnitUser }
     *     
     */
    public OrgUnitUser getLoggedInUser() {
        return loggedInUser;
    }

    /**
     * Sets the value of the loggedInUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnitUser }
     *     
     */
    public void setLoggedInUser(OrgUnitUser value) {
        this.loggedInUser = value;
    }

    /**
     * Sets the value of the parentFulfillments property.
     * 
     * @param parentFulfillments
     *     allowed object is
     *     {@link FulfillmentRecord }
     *     
     */
    public void setParentFulfillments(List<FulfillmentRecord> parentFulfillments) {
        this.parentFulfillments = parentFulfillments;
    }

    /**
     * Sets the value of the entitlementLineItemCustomAttributes property.
     * 
     * @param entitlementLineItemCustomAttributes
     *     allowed object is
     *     {@link CustomAttribute }
     *     
     */
    public void setEntitlementLineItemCustomAttributes(List<CustomAttribute> entitlementLineItemCustomAttributes) {
        this.entitlementLineItemCustomAttributes = entitlementLineItemCustomAttributes;
    }

    /**
     * Sets the value of the soldToUsers property.
     * 
     * @param soldToUsers
     *     allowed object is
     *     {@link OrgUnitUser }
     *     
     */
    public void setSoldToUsers(List<OrgUnitUser> soldToUsers) {
        this.soldToUsers = soldToUsers;
    }

    /**
     * Sets the value of the entitlementCustomAttributes property.
     * 
     * @param entitlementCustomAttributes
     *     allowed object is
     *     {@link CustomAttribute }
     *     
     */
    public void setEntitlementCustomAttributes(List<CustomAttribute> entitlementCustomAttributes) {
        this.entitlementCustomAttributes = entitlementCustomAttributes;
    }

    /**
     * Sets the value of the entitledProducts property.
     * 
     * @param entitledProducts
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setEntitledProducts(List<Product> entitledProducts) {
        this.entitledProducts = entitledProducts;
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

}
