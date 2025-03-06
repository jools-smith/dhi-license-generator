
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuiteProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuiteProductInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttributes" type="{urn:com.flexnet.external.type}CustomAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDateBasedPackageVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="packageVersionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuiteProductInfo", propOrder = {
    "name",
    "version",
    "customAttributes",
    "quantity",
    "packageName",
    "packageVersion",
    "isDateBasedPackageVersion",
    "packageVersionFormat"
})
public class SuiteProductInfo {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String version;
    @XmlElement(nillable = true)
    protected List<CustomAttribute> customAttributes;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer quantity;
    @XmlElementRef(name = "packageName", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageName;
    @XmlElementRef(name = "packageVersion", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageVersion;
    @XmlElementRef(name = "isDateBasedPackageVersion", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDateBasedPackageVersion;
    @XmlElementRef(name = "packageVersionFormat", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageVersionFormat;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageName(JAXBElement<String> value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the packageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageVersion() {
        return packageVersion;
    }

    /**
     * Sets the value of the packageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageVersion(JAXBElement<String> value) {
        this.packageVersion = value;
    }

    /**
     * Gets the value of the isDateBasedPackageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDateBasedPackageVersion() {
        return isDateBasedPackageVersion;
    }

    /**
     * Sets the value of the isDateBasedPackageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDateBasedPackageVersion(JAXBElement<Boolean> value) {
        this.isDateBasedPackageVersion = value;
    }

    /**
     * Gets the value of the packageVersionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageVersionFormat() {
        return packageVersionFormat;
    }

    /**
     * Sets the value of the packageVersionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageVersionFormat(JAXBElement<String> value) {
        this.packageVersionFormat = value;
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
