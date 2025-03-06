
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseHostId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseHostId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueHostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="owner" type="{urn:com.flexnet.external.type}OrganizationUnit"/>
 *         &lt;element name="licenseTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseTechnologyHostType" type="{urn:com.flexnet.external.type}HostType"/>
 *         &lt;element name="hostType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseHostId", propOrder = {
    "uniqueHostName",
    "uniqueId",
    "owner",
    "licenseTechnology",
    "licenseTechnologyHostType",
    "hostType",
    "status"
})
public class LicenseHostId {

    @XmlElement(required = true, nillable = true)
    protected String uniqueHostName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long uniqueId;
    @XmlElement(required = true, nillable = true)
    protected OrganizationUnit owner;
    @XmlElement(required = true, nillable = true)
    protected String licenseTechnology;
    @XmlElement(required = true, nillable = true)
    protected HostType licenseTechnologyHostType;
    @XmlElement(required = true, nillable = true)
    protected String hostType;
    @XmlElement(required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the uniqueHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueHostName() {
        return uniqueHostName;
    }

    /**
     * Sets the value of the uniqueHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueHostName(String value) {
        this.uniqueHostName = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueId(Long value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationUnit }
     *     
     */
    public OrganizationUnit getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationUnit }
     *     
     */
    public void setOwner(OrganizationUnit value) {
        this.owner = value;
    }

    /**
     * Gets the value of the licenseTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseTechnology() {
        return licenseTechnology;
    }

    /**
     * Sets the value of the licenseTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseTechnology(String value) {
        this.licenseTechnology = value;
    }

    /**
     * Gets the value of the licenseTechnologyHostType property.
     * 
     * @return
     *     possible object is
     *     {@link HostType }
     *     
     */
    public HostType getLicenseTechnologyHostType() {
        return licenseTechnologyHostType;
    }

    /**
     * Sets the value of the licenseTechnologyHostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostType }
     *     
     */
    public void setLicenseTechnologyHostType(HostType value) {
        this.licenseTechnologyHostType = value;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
