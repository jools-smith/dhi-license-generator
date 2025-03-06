
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
 * <p>Java class for BulkEntitlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkEntitlement">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.flexnet.external.type}Entitlement">
 *       &lt;sequence>
 *         &lt;element name="permanent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="duration" type="{urn:com.flexnet.external.type}Duration"/>
 *         &lt;element name="licenseTerm" type="{urn:com.flexnet.external.type}LicenseTerm"/>
 *         &lt;element name="versionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="totalNumberOfWebRegkeys" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entitledProducts" type="{urn:com.flexnet.external.type}Product" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{urn:com.flexnet.external.type}PartNumber"/>
 *         &lt;element name="licenseModel" type="{urn:com.flexnet.external.type}LicenseModel"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseModelAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="extraActivationsMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableExtraActivations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftFloor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftFloorPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overdraftCeiling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overdraftCeilingPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VersionDateOption" type="{urn:com.flexnet.external.type}VersionDateOptionsENC"/>
 *         &lt;element name="versionDateDuration" type="{urn:com.flexnet.external.type}Duration"/>
 *         &lt;element name="numberOfCopies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upsell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="renew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startDateOption" type="{urn:com.flexnet.external.type}StartDateOptionsENC"/>
 *         &lt;element name="numberOfRedeemedWebRegKeys" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkEntitlement", propOrder = {
    "permanent",
    "expirationDate",
    "duration",
    "licenseTerm",
    "versionDate",
    "totalNumberOfWebRegkeys",
    "entitledProducts",
    "partNumber",
    "licenseModel",
    "orderId",
    "licenseModelAttributes",
    "extraActivationsMax",
    "availableExtraActivations",
    "overdraftMax",
    "overdraftFloor",
    "overdraftFloorPercent",
    "overdraftCeiling",
    "overdraftCeilingPercent",
    "orderLineNumber",
    "versionDateOption",
    "versionDateDuration",
    "numberOfCopies",
    "upgrade",
    "upsell",
    "renew",
    "startDateOption",
    "numberOfRedeemedWebRegKeys",
    "timezone"
})
public class BulkEntitlement
    extends Entitlement
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean permanent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(required = true, nillable = true)
    protected Duration duration;
    @XmlElement(required = true, nillable = true)
    protected LicenseTerm licenseTerm;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer totalNumberOfWebRegkeys;
    @XmlElement(nillable = true)
    protected List<Product> entitledProducts;
    @XmlElement(required = true, nillable = true)
    protected PartNumber partNumber;
    @XmlElement(required = true, nillable = true)
    protected LicenseModel licenseModel;
    @XmlElement(required = true, nillable = true)
    protected String orderId;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet licenseModelAttributes;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extraActivationsMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer availableExtraActivations;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftFloor;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean overdraftFloorPercent;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overdraftCeiling;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean overdraftCeilingPercent;
    @XmlElement(required = true, nillable = true)
    protected String orderLineNumber;
    @XmlElement(name = "VersionDateOption", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected VersionDateOptionsENC versionDateOption;
    @XmlElement(required = true, nillable = true)
    protected Duration versionDateDuration;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfCopies;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean upgrade;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean upsell;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean renew;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected StartDateOptionsENC startDateOption;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfRedeemedWebRegKeys;
    @XmlElement(required = true, nillable = true)
    protected String timezone;

    /**
     * Gets the value of the permanent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanent() {
        return permanent;
    }

    /**
     * Sets the value of the permanent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanent(Boolean value) {
        this.permanent = value;
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
     * Gets the value of the totalNumberOfWebRegkeys property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfWebRegkeys() {
        return totalNumberOfWebRegkeys;
    }

    /**
     * Sets the value of the totalNumberOfWebRegkeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfWebRegkeys(Integer value) {
        this.totalNumberOfWebRegkeys = value;
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
     * Gets the value of the availableExtraActivations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableExtraActivations() {
        return availableExtraActivations;
    }

    /**
     * Sets the value of the availableExtraActivations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableExtraActivations(Integer value) {
        this.availableExtraActivations = value;
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
     * Gets the value of the numberOfRedeemedWebRegKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRedeemedWebRegKeys() {
        return numberOfRedeemedWebRegKeys;
    }

    /**
     * Sets the value of the numberOfRedeemedWebRegKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRedeemedWebRegKeys(Integer value) {
        this.numberOfRedeemedWebRegKeys = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
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

}
