
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descritpion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDateBasedVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="featureOverride" type="{urn:com.flexnet.external.type}FeatureOverride" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feature", propOrder = {
    "name",
    "count",
    "version",
    "descritpion",
    "isDateBasedVersion",
    "featureOverride"
})
public class Feature {

    @XmlElement(required = true)
    protected String name;
    protected long count;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true, nillable = true)
    protected String descritpion;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isDateBasedVersion;
    @XmlElement(nillable = true)
    protected List<FeatureOverride> featureOverride;

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
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the descritpion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescritpion() {
        return descritpion;
    }

    /**
     * Sets the value of the descritpion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescritpion(String value) {
        this.descritpion = value;
    }

    /**
     * Gets the value of the isDateBasedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDateBasedVersion() {
        return isDateBasedVersion;
    }

    /**
     * Sets the value of the isDateBasedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDateBasedVersion(Boolean value) {
        this.isDateBasedVersion = value;
    }

    /**
     * Gets the value of the featureOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureOverride }
     * 
     * 
     */
    public List<FeatureOverride> getFeatureOverride() {
        if (featureOverride == null) {
            featureOverride = new ArrayList<FeatureOverride>();
        }
        return this.featureOverride;
    }

    /**
     * Sets the value of the featureOverride property.
     * 
     * @param featureOverride
     *     allowed object is
     *     {@link FeatureOverride }
     *     
     */
    public void setFeatureOverride(List<FeatureOverride> featureOverride) {
        this.featureOverride = featureOverride;
    }

}
