
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomAttributeDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomAttributeDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="whenChoices" type="{urn:com.flexnet.external.type}AttributeWhenENC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com.flexnet.external.type}AttributeTypeENC"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenseAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomAttributeDescriptor", propOrder = {
    "whenChoices",
    "type",
    "name",
    "value",
    "licenseAttribute",
    "required",
    "displayType"
})
public class CustomAttributeDescriptor {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<AttributeWhenENC> whenChoices;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AttributeTypeENC type;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean licenseAttribute;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean required;
    @XmlElement(required = true, nillable = true)
    protected String displayType;

    /**
     * Gets the value of the whenChoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whenChoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhenChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeWhenENC }
     * 
     * 
     */
    public List<AttributeWhenENC> getWhenChoices() {
        if (whenChoices == null) {
            whenChoices = new ArrayList<AttributeWhenENC>();
        }
        return this.whenChoices;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeENC }
     *     
     */
    public AttributeTypeENC getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeENC }
     *     
     */
    public void setType(AttributeTypeENC value) {
        this.type = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the licenseAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLicenseAttribute() {
        return licenseAttribute;
    }

    /**
     * Sets the value of the licenseAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseAttribute(Boolean value) {
        this.licenseAttribute = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Sets the value of the whenChoices property.
     * 
     * @param whenChoices
     *     allowed object is
     *     {@link AttributeWhenENC }
     *     
     */
    public void setWhenChoices(List<AttributeWhenENC> whenChoices) {
        this.whenChoices = whenChoices;
    }

}
