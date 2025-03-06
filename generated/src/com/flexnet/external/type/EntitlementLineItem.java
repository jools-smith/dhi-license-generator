
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EntitlementLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licenseTerm" type="{urn:com.flexnet.external.type}LicenseTerm"/>
 *         &lt;element name="activationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entitledProducts" type="{urn:com.flexnet.external.type}Product" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{urn:com.flexnet.external.type}PartNumber"/>
 *         &lt;element name="licenseModel" type="{urn:com.flexnet.external.type}LicenseModel"/>
 *         &lt;element name="licenseModelAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="parentEntitlement" type="{urn:com.flexnet.external.type}SimpleEntitlement"/>
 *         &lt;element name="lineItemState" type="{urn:com.flexnet.external.type}EntityStateENC"/>
 *         &lt;element name="parentLineItem" type="{urn:com.flexnet.external.type}EntitlementLineItem"/>
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberOfCopies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfRemainingCopies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exactAvailableCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfilledAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftFulfilled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableOverdraftCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftFloor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftFloorPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overdraftCeiling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftCeilingPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extraActivationsMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extraActivationsPolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="numberOfReturnsPolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="numberOfRehostsPolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="numberOfRepairsPolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="entitlementSupportAction" type="{urn:com.flexnet.external.type}EntitlementSupportActionENC"/>
 *         &lt;element name="VersionDateOption" type="{urn:com.flexnet.external.type}VersionDateOptionsENC"/>
 *         &lt;element name="versionDateDuration" type="{urn:com.flexnet.external.type}Duration"/>
 *         &lt;element name="redundantServerPolicy" type="{urn:com.flexnet.external.type}LicenseRedundantServerPolicy"/>
 *         &lt;element name="reinstallPolicy" type="{urn:com.flexnet.external.type}ReinstallPolicy"/>
 *         &lt;element name="CancelLicensePolicy" type="{urn:com.flexnet.external.type}LicenseCancelPolicy"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upsell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="renew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startDateOption" type="{urn:com.flexnet.external.type}StartDateOptionsENC"/>
 *         &lt;element name="licenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="maintenanceItems" type="{urn:com.flexnet.external.type}MaintenanceItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="versionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customAttributes" type="{urn:com.flexnet.external.type}CustomAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementLineItem", propOrder = {
    "licenseTerm",
    "activationID",
    "orderId",
    "orderLineNumber",
    "entitledProducts",
    "partNumber",
    "licenseModel",
    "licenseModelAttributes",
    "parentEntitlement",
    "lineItemState",
    "parentLineItem",
    "inactive",
    "test",
    "numberOfCopies",
    "numberOfRemainingCopies",
    "exactAvailableCount",
    "fulfilledAmount",
    "overdraftMax",
    "overdraftFulfilled",
    "availableOverdraftCount",
    "overdraftFloor",
    "overdraftFloorPercent",
    "overdraftCeiling",
    "overdraftCeilingPercent",
    "extraActivationsMax",
    "extraActivationsPolicy",
    "numberOfReturnsPolicy",
    "numberOfRehostsPolicy",
    "numberOfRepairsPolicy",
    "entitlementSupportAction",
    "versionDateOption",
    "versionDateDuration",
    "redundantServerPolicy",
    "reinstallPolicy",
    "cancelLicensePolicy",
    "upgrade",
    "upsell",
    "renew",
    "startDateOption",
    "licenseTechnology",
    "maintenanceItems",
    "versionDate",
    "customAttributes"
})
@XmlSeeAlso({
    RenewableEntitlementLineItem.class
})
public class EntitlementLineItem {

    @XmlElement(required = true, nillable = true)
    protected LicenseTerm licenseTerm;
    @XmlElement(required = true, nillable = true)
    protected String activationID;
    @XmlElement(required = true, nillable = true)
    protected String orderId;
    @XmlElement(required = true, nillable = true)
    protected String orderLineNumber;
    @XmlElement(nillable = true)
    protected List<Product> entitledProducts;
    @XmlElement(name = "PartNumber", required = true, nillable = true)
    protected PartNumber partNumber;
    @XmlElement(required = true, nillable = true)
    protected LicenseModel licenseModel;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet licenseModelAttributes;
    @XmlElement(required = true, nillable = true)
    protected SimpleEntitlement parentEntitlement;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityStateENC lineItemState;
    @XmlElement(required = true, nillable = true)
    protected EntitlementLineItem parentLineItem;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean inactive;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfCopies;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfRemainingCopies;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer exactAvailableCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fulfilledAmount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftFulfilled;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer availableOverdraftCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftFloor;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean overdraftFloorPercent;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftCeiling;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean overdraftCeilingPercent;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extraActivationsMax;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy extraActivationsPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy numberOfReturnsPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy numberOfRehostsPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy numberOfRepairsPolicy;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EntitlementSupportActionENC entitlementSupportAction;
    @XmlElement(name = "VersionDateOption", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected VersionDateOptionsENC versionDateOption;
    @XmlElement(required = true, nillable = true)
    protected Duration versionDateDuration;
    @XmlElement(required = true, nillable = true)
    protected LicenseRedundantServerPolicy redundantServerPolicy;
    @XmlElement(required = true, nillable = true)
    protected ReinstallPolicy reinstallPolicy;
    @XmlElement(name = "CancelLicensePolicy", required = true, nillable = true)
    protected LicenseCancelPolicy cancelLicensePolicy;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean upgrade;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean upsell;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean renew;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected StartDateOptionsENC startDateOption;
    @XmlElement(required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(nillable = true)
    protected List<MaintenanceItem> maintenanceItems;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDate;
    @XmlElement(nillable = true)
    protected List<CustomAttribute> customAttributes;

    /**
     * Gets the value of the licenseTerm property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTerm }
     *     
     */
    public LicenseTerm getLicenseTerm() {
        return licenseTerm;
    }

    /**
     * Sets the value of the licenseTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTerm }
     *     
     */
    public void setLicenseTerm(LicenseTerm value) {
        this.licenseTerm = value;
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
     * Gets the value of the parentEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleEntitlement }
     *     
     */
    public SimpleEntitlement getParentEntitlement() {
        return parentEntitlement;
    }

    /**
     * Sets the value of the parentEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleEntitlement }
     *     
     */
    public void setParentEntitlement(SimpleEntitlement value) {
        this.parentEntitlement = value;
    }

    /**
     * Gets the value of the lineItemState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateENC }
     *     
     */
    public EntityStateENC getLineItemState() {
        return lineItemState;
    }

    /**
     * Sets the value of the lineItemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateENC }
     *     
     */
    public void setLineItemState(EntityStateENC value) {
        this.lineItemState = value;
    }

    /**
     * Gets the value of the parentLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementLineItem }
     *     
     */
    public EntitlementLineItem getParentLineItem() {
        return parentLineItem;
    }

    /**
     * Sets the value of the parentLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementLineItem }
     *     
     */
    public void setParentLineItem(EntitlementLineItem value) {
        this.parentLineItem = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    /**
     * Gets the value of the numberOfCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * Sets the value of the numberOfCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCopies(Integer value) {
        this.numberOfCopies = value;
    }

    /**
     * Gets the value of the numberOfRemainingCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRemainingCopies() {
        return numberOfRemainingCopies;
    }

    /**
     * Sets the value of the numberOfRemainingCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRemainingCopies(Integer value) {
        this.numberOfRemainingCopies = value;
    }

    /**
     * Gets the value of the exactAvailableCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExactAvailableCount() {
        return exactAvailableCount;
    }

    /**
     * Sets the value of the exactAvailableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExactAvailableCount(Integer value) {
        this.exactAvailableCount = value;
    }

    /**
     * Gets the value of the fulfilledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfilledAmount() {
        return fulfilledAmount;
    }

    /**
     * Sets the value of the fulfilledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFulfilledAmount(Integer value) {
        this.fulfilledAmount = value;
    }

    /**
     * Gets the value of the overdraftMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdraftMax() {
        return overdraftMax;
    }

    /**
     * Sets the value of the overdraftMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdraftMax(Integer value) {
        this.overdraftMax = value;
    }

    /**
     * Gets the value of the overdraftFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdraftFulfilled() {
        return overdraftFulfilled;
    }

    /**
     * Sets the value of the overdraftFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdraftFulfilled(Integer value) {
        this.overdraftFulfilled = value;
    }

    /**
     * Gets the value of the availableOverdraftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableOverdraftCount() {
        return availableOverdraftCount;
    }

    /**
     * Sets the value of the availableOverdraftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableOverdraftCount(Integer value) {
        this.availableOverdraftCount = value;
    }

    /**
     * Gets the value of the overdraftFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdraftFloor() {
        return overdraftFloor;
    }

    /**
     * Sets the value of the overdraftFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdraftFloor(Integer value) {
        this.overdraftFloor = value;
    }

    /**
     * Gets the value of the overdraftFloorPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverdraftFloorPercent() {
        return overdraftFloorPercent;
    }

    /**
     * Sets the value of the overdraftFloorPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverdraftFloorPercent(Boolean value) {
        this.overdraftFloorPercent = value;
    }

    /**
     * Gets the value of the overdraftCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdraftCeiling() {
        return overdraftCeiling;
    }

    /**
     * Sets the value of the overdraftCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdraftCeiling(Integer value) {
        this.overdraftCeiling = value;
    }

    /**
     * Gets the value of the overdraftCeilingPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverdraftCeilingPercent() {
        return overdraftCeilingPercent;
    }

    /**
     * Sets the value of the overdraftCeilingPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverdraftCeilingPercent(Boolean value) {
        this.overdraftCeilingPercent = value;
    }

    /**
     * Gets the value of the extraActivationsMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtraActivationsMax() {
        return extraActivationsMax;
    }

    /**
     * Sets the value of the extraActivationsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtraActivationsMax(Integer value) {
        this.extraActivationsMax = value;
    }

    /**
     * Gets the value of the extraActivationsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getExtraActivationsPolicy() {
        return extraActivationsPolicy;
    }

    /**
     * Sets the value of the extraActivationsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setExtraActivationsPolicy(LicenseLifecyclePolicy value) {
        this.extraActivationsPolicy = value;
    }

    /**
     * Gets the value of the numberOfReturnsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getNumberOfReturnsPolicy() {
        return numberOfReturnsPolicy;
    }

    /**
     * Sets the value of the numberOfReturnsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setNumberOfReturnsPolicy(LicenseLifecyclePolicy value) {
        this.numberOfReturnsPolicy = value;
    }

    /**
     * Gets the value of the numberOfRehostsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getNumberOfRehostsPolicy() {
        return numberOfRehostsPolicy;
    }

    /**
     * Sets the value of the numberOfRehostsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setNumberOfRehostsPolicy(LicenseLifecyclePolicy value) {
        this.numberOfRehostsPolicy = value;
    }

    /**
     * Gets the value of the numberOfRepairsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getNumberOfRepairsPolicy() {
        return numberOfRepairsPolicy;
    }

    /**
     * Sets the value of the numberOfRepairsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setNumberOfRepairsPolicy(LicenseLifecyclePolicy value) {
        this.numberOfRepairsPolicy = value;
    }

    /**
     * Gets the value of the entitlementSupportAction property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementSupportActionENC }
     *     
     */
    public EntitlementSupportActionENC getEntitlementSupportAction() {
        return entitlementSupportAction;
    }

    /**
     * Sets the value of the entitlementSupportAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementSupportActionENC }
     *     
     */
    public void setEntitlementSupportAction(EntitlementSupportActionENC value) {
        this.entitlementSupportAction = value;
    }

    /**
     * Gets the value of the versionDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDateOptionsENC }
     *     
     */
    public VersionDateOptionsENC getVersionDateOption() {
        return versionDateOption;
    }

    /**
     * Sets the value of the versionDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDateOptionsENC }
     *     
     */
    public void setVersionDateOption(VersionDateOptionsENC value) {
        this.versionDateOption = value;
    }

    /**
     * Gets the value of the versionDateDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVersionDateDuration() {
        return versionDateDuration;
    }

    /**
     * Sets the value of the versionDateDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVersionDateDuration(Duration value) {
        this.versionDateDuration = value;
    }

    /**
     * Gets the value of the redundantServerPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseRedundantServerPolicy }
     *     
     */
    public LicenseRedundantServerPolicy getRedundantServerPolicy() {
        return redundantServerPolicy;
    }

    /**
     * Sets the value of the redundantServerPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseRedundantServerPolicy }
     *     
     */
    public void setRedundantServerPolicy(LicenseRedundantServerPolicy value) {
        this.redundantServerPolicy = value;
    }

    /**
     * Gets the value of the reinstallPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReinstallPolicy }
     *     
     */
    public ReinstallPolicy getReinstallPolicy() {
        return reinstallPolicy;
    }

    /**
     * Sets the value of the reinstallPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinstallPolicy }
     *     
     */
    public void setReinstallPolicy(ReinstallPolicy value) {
        this.reinstallPolicy = value;
    }

    /**
     * Gets the value of the cancelLicensePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseCancelPolicy }
     *     
     */
    public LicenseCancelPolicy getCancelLicensePolicy() {
        return cancelLicensePolicy;
    }

    /**
     * Sets the value of the cancelLicensePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseCancelPolicy }
     *     
     */
    public void setCancelLicensePolicy(LicenseCancelPolicy value) {
        this.cancelLicensePolicy = value;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgrade(Boolean value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the upsell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpsell() {
        return upsell;
    }

    /**
     * Sets the value of the upsell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpsell(Boolean value) {
        this.upsell = value;
    }

    /**
     * Gets the value of the renew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenew() {
        return renew;
    }

    /**
     * Sets the value of the renew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenew(Boolean value) {
        this.renew = value;
    }

    /**
     * Gets the value of the startDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateOptionsENC }
     *     
     */
    public StartDateOptionsENC getStartDateOption() {
        return startDateOption;
    }

    /**
     * Sets the value of the startDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateOptionsENC }
     *     
     */
    public void setStartDateOption(StartDateOptionsENC value) {
        this.startDateOption = value;
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
     * Gets the value of the maintenanceItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceItem }
     * 
     * 
     */
    public List<MaintenanceItem> getMaintenanceItems() {
        if (maintenanceItems == null) {
            maintenanceItems = new ArrayList<MaintenanceItem>();
        }
        return this.maintenanceItems;
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
     * Gets the value of the customAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttribute }
     * 
     * 
     */
    public List<CustomAttribute> getCustomAttributes() {
        if (customAttributes == null) {
            customAttributes = new ArrayList<CustomAttribute>();
        }
        return this.customAttributes;
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
     * Sets the value of the maintenanceItems property.
     * 
     * @param maintenanceItems
     *     allowed object is
     *     {@link MaintenanceItem }
     *     
     */
    public void setMaintenanceItems(List<MaintenanceItem> maintenanceItems) {
        this.maintenanceItems = maintenanceItems;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param customAttributes
     *     allowed object is
     *     {@link CustomAttribute }
     *     
     */
    public void setCustomAttributes(List<CustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

}
