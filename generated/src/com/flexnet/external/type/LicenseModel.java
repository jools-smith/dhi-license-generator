
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowPartialFulfillments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelTimeAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="entitlementTimeAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="fulfillmentTimeAttributes" type="{urn:com.flexnet.external.type}AttributeSet"/>
 *         &lt;element name="duration" type="{urn:com.flexnet.external.type}Duration"/>
 *         &lt;element name="rehostsLifeCyclePolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="returnsLifeCyclePolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="repairsLifeCyclePolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="activationsLifecyclePolicy" type="{urn:com.flexnet.external.type}LicenseLifecyclePolicy"/>
 *         &lt;element name="attributeWhen" type="{urn:com.flexnet.external.type}AttributeWhenENC"/>
 *         &lt;element name="timeZoneWhen" type="{urn:com.flexnet.external.type}AttributeWhenENC"/>
 *         &lt;element name="cancelLicensePolicy" type="{urn:com.flexnet.external.type}LicenseCancelPolicy"/>
 *         &lt;element name="serverHostIdPolicy" type="{urn:com.flexnet.external.type}LicenseHostIdPolicy"/>
 *         &lt;element name="nodeLockedHostIdPolicy" type="{urn:com.flexnet.external.type}LicenseHostIdPolicy"/>
 *         &lt;element name="portalServerHostIdPolicy" type="{urn:com.flexnet.external.type}LicenseHostIdPolicy"/>
 *         &lt;element name="portalNodeLockedHostIdPolicy" type="{urn:com.flexnet.external.type}LicenseHostIdPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseModel", propOrder = {
    "allowPartialFulfillments",
    "modelType",
    "name",
    "modelTimeAttributes",
    "entitlementTimeAttributes",
    "fulfillmentTimeAttributes",
    "duration",
    "rehostsLifeCyclePolicy",
    "returnsLifeCyclePolicy",
    "repairsLifeCyclePolicy",
    "activationsLifecyclePolicy",
    "attributeWhen",
    "timeZoneWhen",
    "cancelLicensePolicy",
    "serverHostIdPolicy",
    "nodeLockedHostIdPolicy",
    "portalServerHostIdPolicy",
    "portalNodeLockedHostIdPolicy"
})
@XmlSeeAlso({
    LicenseModelRequest.class
})
public class LicenseModel {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean allowPartialFulfillments;
    @XmlElement(required = true, nillable = true)
    protected String modelType;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet modelTimeAttributes;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet entitlementTimeAttributes;
    @XmlElement(required = true, nillable = true)
    protected AttributeSet fulfillmentTimeAttributes;
    @XmlElement(required = true, nillable = true)
    protected Duration duration;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy rehostsLifeCyclePolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy returnsLifeCyclePolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy repairsLifeCyclePolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseLifecyclePolicy activationsLifecyclePolicy;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AttributeWhenENC attributeWhen;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AttributeWhenENC timeZoneWhen;
    @XmlElement(required = true, nillable = true)
    protected LicenseCancelPolicy cancelLicensePolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseHostIdPolicy serverHostIdPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseHostIdPolicy nodeLockedHostIdPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseHostIdPolicy portalServerHostIdPolicy;
    @XmlElement(required = true, nillable = true)
    protected LicenseHostIdPolicy portalNodeLockedHostIdPolicy;

    /**
     * Gets the value of the allowPartialFulfillments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPartialFulfillments() {
        return allowPartialFulfillments;
    }

    /**
     * Sets the value of the allowPartialFulfillments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPartialFulfillments(Boolean value) {
        this.allowPartialFulfillments = value;
    }

    /**
     * Gets the value of the modelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * Sets the value of the modelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
    }

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
     * Gets the value of the modelTimeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getModelTimeAttributes() {
        return modelTimeAttributes;
    }

    /**
     * Sets the value of the modelTimeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setModelTimeAttributes(AttributeSet value) {
        this.modelTimeAttributes = value;
    }

    /**
     * Gets the value of the entitlementTimeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getEntitlementTimeAttributes() {
        return entitlementTimeAttributes;
    }

    /**
     * Sets the value of the entitlementTimeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setEntitlementTimeAttributes(AttributeSet value) {
        this.entitlementTimeAttributes = value;
    }

    /**
     * Gets the value of the fulfillmentTimeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSet }
     *     
     */
    public AttributeSet getFulfillmentTimeAttributes() {
        return fulfillmentTimeAttributes;
    }

    /**
     * Sets the value of the fulfillmentTimeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSet }
     *     
     */
    public void setFulfillmentTimeAttributes(AttributeSet value) {
        this.fulfillmentTimeAttributes = value;
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
     * Gets the value of the rehostsLifeCyclePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getRehostsLifeCyclePolicy() {
        return rehostsLifeCyclePolicy;
    }

    /**
     * Sets the value of the rehostsLifeCyclePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setRehostsLifeCyclePolicy(LicenseLifecyclePolicy value) {
        this.rehostsLifeCyclePolicy = value;
    }

    /**
     * Gets the value of the returnsLifeCyclePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getReturnsLifeCyclePolicy() {
        return returnsLifeCyclePolicy;
    }

    /**
     * Sets the value of the returnsLifeCyclePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setReturnsLifeCyclePolicy(LicenseLifecyclePolicy value) {
        this.returnsLifeCyclePolicy = value;
    }

    /**
     * Gets the value of the repairsLifeCyclePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getRepairsLifeCyclePolicy() {
        return repairsLifeCyclePolicy;
    }

    /**
     * Sets the value of the repairsLifeCyclePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setRepairsLifeCyclePolicy(LicenseLifecyclePolicy value) {
        this.repairsLifeCyclePolicy = value;
    }

    /**
     * Gets the value of the activationsLifecyclePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public LicenseLifecyclePolicy getActivationsLifecyclePolicy() {
        return activationsLifecyclePolicy;
    }

    /**
     * Sets the value of the activationsLifecyclePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseLifecyclePolicy }
     *     
     */
    public void setActivationsLifecyclePolicy(LicenseLifecyclePolicy value) {
        this.activationsLifecyclePolicy = value;
    }

    /**
     * Gets the value of the attributeWhen property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeWhenENC }
     *     
     */
    public AttributeWhenENC getAttributeWhen() {
        return attributeWhen;
    }

    /**
     * Sets the value of the attributeWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeWhenENC }
     *     
     */
    public void setAttributeWhen(AttributeWhenENC value) {
        this.attributeWhen = value;
    }

    /**
     * Gets the value of the timeZoneWhen property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeWhenENC }
     *     
     */
    public AttributeWhenENC getTimeZoneWhen() {
        return timeZoneWhen;
    }

    /**
     * Sets the value of the timeZoneWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeWhenENC }
     *     
     */
    public void setTimeZoneWhen(AttributeWhenENC value) {
        this.timeZoneWhen = value;
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
     * Gets the value of the serverHostIdPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public LicenseHostIdPolicy getServerHostIdPolicy() {
        return serverHostIdPolicy;
    }

    /**
     * Sets the value of the serverHostIdPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public void setServerHostIdPolicy(LicenseHostIdPolicy value) {
        this.serverHostIdPolicy = value;
    }

    /**
     * Gets the value of the nodeLockedHostIdPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public LicenseHostIdPolicy getNodeLockedHostIdPolicy() {
        return nodeLockedHostIdPolicy;
    }

    /**
     * Sets the value of the nodeLockedHostIdPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public void setNodeLockedHostIdPolicy(LicenseHostIdPolicy value) {
        this.nodeLockedHostIdPolicy = value;
    }

    /**
     * Gets the value of the portalServerHostIdPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public LicenseHostIdPolicy getPortalServerHostIdPolicy() {
        return portalServerHostIdPolicy;
    }

    /**
     * Sets the value of the portalServerHostIdPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public void setPortalServerHostIdPolicy(LicenseHostIdPolicy value) {
        this.portalServerHostIdPolicy = value;
    }

    /**
     * Gets the value of the portalNodeLockedHostIdPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public LicenseHostIdPolicy getPortalNodeLockedHostIdPolicy() {
        return portalNodeLockedHostIdPolicy;
    }

    /**
     * Sets the value of the portalNodeLockedHostIdPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHostIdPolicy }
     *     
     */
    public void setPortalNodeLockedHostIdPolicy(LicenseHostIdPolicy value) {
        this.portalNodeLockedHostIdPolicy = value;
    }

}
