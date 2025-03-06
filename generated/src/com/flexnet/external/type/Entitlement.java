
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entitlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entitlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entitlementID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entitlementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soldTo" type="{urn:com.flexnet.external.type}OrganizationUnit"/>
 *         &lt;element name="shipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entitlementState" type="{urn:com.flexnet.external.type}EntityStateENC"/>
 *         &lt;element name="draft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deployed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supportActions" type="{urn:com.flexnet.external.type}EntitlementSupportActionENC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entChannelPartners" type="{urn:com.flexnet.external.type}ChannelPartner" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Entitlement", propOrder = {
    "entitlementID",
    "entitlementType",
    "shipToEmail",
    "soldTo",
    "shipToAddress",
    "entitlementState",
    "draft",
    "deployed",
    "inactive",
    "test",
    "supportActions",
    "entChannelPartners",
    "customAttributes"
})
@XmlSeeAlso({
    BulkEntitlement.class,
    SimpleEntitlement.class
})
public class Entitlement {

    @XmlElement(required = true, nillable = true)
    protected String entitlementID;
    @XmlElement(required = true, nillable = true)
    protected String entitlementType;
    @XmlElement(required = true, nillable = true)
    protected String shipToEmail;
    @XmlElement(required = true, nillable = true)
    protected OrganizationUnit soldTo;
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityStateENC entitlementState;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean draft;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deployed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean inactive;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<EntitlementSupportActionENC> supportActions;
    @XmlElement(nillable = true)
    protected List<ChannelPartner> entChannelPartners;
    @XmlElement(nillable = true)
    protected List<CustomAttribute> customAttributes;

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
     * Gets the value of the entitlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementType() {
        return entitlementType;
    }

    /**
     * Sets the value of the entitlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementType(String value) {
        this.entitlementType = value;
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
     * Gets the value of the entitlementState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateENC }
     *     
     */
    public EntityStateENC getEntitlementState() {
        return entitlementState;
    }

    /**
     * Sets the value of the entitlementState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateENC }
     *     
     */
    public void setEntitlementState(EntityStateENC value) {
        this.entitlementState = value;
    }

    /**
     * Gets the value of the draft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDraft() {
        return draft;
    }

    /**
     * Sets the value of the draft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDraft(Boolean value) {
        this.draft = value;
    }

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
     * Gets the value of the supportActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementSupportActionENC }
     * 
     * 
     */
    public List<EntitlementSupportActionENC> getSupportActions() {
        if (supportActions == null) {
            supportActions = new ArrayList<EntitlementSupportActionENC>();
        }
        return this.supportActions;
    }

    /**
     * Gets the value of the entChannelPartners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entChannelPartners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntChannelPartners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelPartner }
     * 
     * 
     */
    public List<ChannelPartner> getEntChannelPartners() {
        if (entChannelPartners == null) {
            entChannelPartners = new ArrayList<ChannelPartner>();
        }
        return this.entChannelPartners;
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
     * Sets the value of the supportActions property.
     * 
     * @param supportActions
     *     allowed object is
     *     {@link EntitlementSupportActionENC }
     *     
     */
    public void setSupportActions(List<EntitlementSupportActionENC> supportActions) {
        this.supportActions = supportActions;
    }

    /**
     * Sets the value of the entChannelPartners property.
     * 
     * @param entChannelPartners
     *     allowed object is
     *     {@link ChannelPartner }
     *     
     */
    public void setEntChannelPartners(List<ChannelPartner> entChannelPartners) {
        this.entChannelPartners = entChannelPartners;
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
