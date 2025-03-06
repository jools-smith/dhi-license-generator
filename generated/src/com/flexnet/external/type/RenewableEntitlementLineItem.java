
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenewableEntitlementLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenewableEntitlementLineItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.flexnet.external.type}EntitlementLineItem">
 *       &lt;sequence>
 *         &lt;element name="remainingDays" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenewableEntitlementLineItem", propOrder = {
    "remainingDays",
    "type",
    "orgName"
})
public class RenewableEntitlementLineItem
    extends EntitlementLineItem
{

    protected long remainingDays;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String orgName;

    /**
     * Gets the value of the remainingDays property.
     * 
     */
    public long getRemainingDays() {
        return remainingDays;
    }

    /**
     * Sets the value of the remainingDays property.
     * 
     */
    public void setRemainingDays(long value) {
        this.remainingDays = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

}
