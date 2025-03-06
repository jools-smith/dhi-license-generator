
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostIdType" type="{urn:com.flexnet.external.type}HostIdType"/>
 *         &lt;element name="defaultHostIdType" type="{urn:com.flexnet.external.type}HostIdType"/>
 *         &lt;element name="visibleOnPortal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="licenseTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostIdentifierGenerator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostType", propOrder = {
    "id",
    "name",
    "hostIdType",
    "defaultHostIdType",
    "visibleOnPortal",
    "licenseTechnology",
    "hostIdentifierGenerator",
    "hostTypeId"
})
public class HostType {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HostIdType hostIdType;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HostIdType defaultHostIdType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean visibleOnPortal;
    @XmlElement(required = true, nillable = true)
    protected String licenseTechnology;
    @XmlElement(required = true, nillable = true)
    protected String hostIdentifierGenerator;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long hostTypeId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the hostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdType }
     *     
     */
    public HostIdType getHostIdType() {
        return hostIdType;
    }

    /**
     * Sets the value of the hostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdType }
     *     
     */
    public void setHostIdType(HostIdType value) {
        this.hostIdType = value;
    }

    /**
     * Gets the value of the defaultHostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdType }
     *     
     */
    public HostIdType getDefaultHostIdType() {
        return defaultHostIdType;
    }

    /**
     * Sets the value of the defaultHostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdType }
     *     
     */
    public void setDefaultHostIdType(HostIdType value) {
        this.defaultHostIdType = value;
    }

    /**
     * Gets the value of the visibleOnPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibleOnPortal() {
        return visibleOnPortal;
    }

    /**
     * Sets the value of the visibleOnPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibleOnPortal(Boolean value) {
        this.visibleOnPortal = value;
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
     * Gets the value of the hostIdentifierGenerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIdentifierGenerator() {
        return hostIdentifierGenerator;
    }

    /**
     * Sets the value of the hostIdentifierGenerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdentifierGenerator(String value) {
        this.hostIdentifierGenerator = value;
    }

    /**
     * Gets the value of the hostTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHostTypeId() {
        return hostTypeId;
    }

    /**
     * Sets the value of the hostTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHostTypeId(Long value) {
        this.hostTypeId = value;
    }

}
