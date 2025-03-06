
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedPropertyMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPropertyMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subgroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minRangeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxRangeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasValidValues" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasRangeValues" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedPropertyMetadata", propOrder = {
    "className",
    "subgroupName",
    "name",
    "type",
    "minRangeValue",
    "maxRangeValue",
    "maxLength",
    "required",
    "hasValidValues",
    "hasRangeValues"
})
public class ExtendedPropertyMetadata {

    @XmlElement(required = true, nillable = true)
    protected String className;
    @XmlElement(required = true, nillable = true)
    protected String subgroupName;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String minRangeValue;
    @XmlElement(required = true, nillable = true)
    protected String maxRangeValue;
    protected int maxLength;
    protected boolean required;
    protected boolean hasValidValues;
    protected boolean hasRangeValues;

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the subgroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubgroupName() {
        return subgroupName;
    }

    /**
     * Sets the value of the subgroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubgroupName(String value) {
        this.subgroupName = value;
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
     * Gets the value of the minRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinRangeValue() {
        return minRangeValue;
    }

    /**
     * Sets the value of the minRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRangeValue(String value) {
        this.minRangeValue = value;
    }

    /**
     * Gets the value of the maxRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRangeValue() {
        return maxRangeValue;
    }

    /**
     * Sets the value of the maxRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRangeValue(String value) {
        this.maxRangeValue = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     */
    public void setMaxLength(int value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the hasValidValues property.
     * 
     */
    public boolean isHasValidValues() {
        return hasValidValues;
    }

    /**
     * Sets the value of the hasValidValues property.
     * 
     */
    public void setHasValidValues(boolean value) {
        this.hasValidValues = value;
    }

    /**
     * Gets the value of the hasRangeValues property.
     * 
     */
    public boolean isHasRangeValues() {
        return hasRangeValues;
    }

    /**
     * Sets the value of the hasRangeValues property.
     * 
     */
    public void setHasRangeValues(boolean value) {
        this.hasRangeValues = value;
    }

}
