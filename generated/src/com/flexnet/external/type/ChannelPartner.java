
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelPartner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgUnit" type="{urn:com.flexnet.external.type}OrganizationUnit"/>
 *         &lt;element name="contact" type="{urn:com.flexnet.external.type}OrgUnitContact"/>
 *         &lt;element name="partnerTierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPartner", propOrder = {
    "orgUnit",
    "contact",
    "partnerTierName"
})
public class ChannelPartner {

    @XmlElement(required = true, nillable = true)
    protected OrganizationUnit orgUnit;
    @XmlElement(required = true, nillable = true)
    protected OrgUnitContact contact;
    @XmlElement(required = true, nillable = true)
    protected String partnerTierName;

    /**
     * Gets the value of the orgUnit property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationUnit }
     *     
     */
    public OrganizationUnit getOrgUnit() {
        return orgUnit;
    }

    /**
     * Sets the value of the orgUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationUnit }
     *     
     */
    public void setOrgUnit(OrganizationUnit value) {
        this.orgUnit = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnitContact }
     *     
     */
    public OrgUnitContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnitContact }
     *     
     */
    public void setContact(OrgUnitContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the partnerTierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerTierName() {
        return partnerTierName;
    }

    /**
     * Sets the value of the partnerTierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerTierName(String value) {
        this.partnerTierName = value;
    }

}
