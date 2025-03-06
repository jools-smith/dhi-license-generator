
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maintenance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="licensedProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needsDatedVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trailer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCategory" type="{urn:com.flexnet.external.type}ProductCategory" minOccurs="0"/>
 *         &lt;element name="productCategoryAttributesWithValues" type="{urn:com.flexnet.external.type}ProductCategoryAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customAttributes" type="{urn:com.flexnet.external.type}CustomAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDateBasedPackageVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="features" type="{urn:com.flexnet.external.type}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityPerCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suiteProductInfo" type="{urn:com.flexnet.external.type}SuiteProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "name",
    "version",
    "productType",
    "suite",
    "maintenance",
    "licensedProduct",
    "needsDatedVersion",
    "header",
    "trailer",
    "productCategory",
    "productCategoryAttributesWithValues",
    "customAttributes",
    "packageName",
    "packageVersion",
    "isDateBasedPackageVersion",
    "features",
    "quantityPerCopy",
    "suiteProductInfo"
})
@XmlSeeAlso({
    ProductRequest.class
})
public class Product {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String version;
    @XmlElement(required = true, nillable = true)
    protected String productType;
    protected boolean suite;
    protected boolean maintenance;
    protected boolean licensedProduct;
    protected boolean needsDatedVersion;
    @XmlElementRef(name = "header", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> header;
    @XmlElementRef(name = "trailer", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trailer;
    @XmlElementRef(name = "productCategory", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductCategory> productCategory;
    @XmlElement(nillable = true)
    protected List<ProductCategoryAttributeValue> productCategoryAttributesWithValues;
    @XmlElement(nillable = true)
    protected List<CustomAttribute> customAttributes;
    @XmlElementRef(name = "packageName", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageName;
    @XmlElementRef(name = "packageVersion", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageVersion;
    @XmlElementRef(name = "isDateBasedPackageVersion", namespace = "urn:com.flexnet.external.type", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDateBasedPackageVersion;
    @XmlElement(nillable = true)
    protected List<Feature> features;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer quantityPerCopy;
    @XmlElement(nillable = true)
    protected List<SuiteProductInfo> suiteProductInfo;

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     */
    public boolean isSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     */
    public void setSuite(boolean value) {
        this.suite = value;
    }

    /**
     * Gets the value of the maintenance property.
     * 
     */
    public boolean isMaintenance() {
        return maintenance;
    }

    /**
     * Sets the value of the maintenance property.
     * 
     */
    public void setMaintenance(boolean value) {
        this.maintenance = value;
    }

    /**
     * Gets the value of the licensedProduct property.
     * 
     */
    public boolean isLicensedProduct() {
        return licensedProduct;
    }

    /**
     * Sets the value of the licensedProduct property.
     * 
     */
    public void setLicensedProduct(boolean value) {
        this.licensedProduct = value;
    }

    /**
     * Gets the value of the needsDatedVersion property.
     * 
     */
    public boolean isNeedsDatedVersion() {
        return needsDatedVersion;
    }

    /**
     * Sets the value of the needsDatedVersion property.
     * 
     */
    public void setNeedsDatedVersion(boolean value) {
        this.needsDatedVersion = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeader(JAXBElement<String> value) {
        this.header = value;
    }

    /**
     * Gets the value of the trailer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrailer() {
        return trailer;
    }

    /**
     * Sets the value of the trailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrailer(JAXBElement<String> value) {
        this.trailer = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}
     *     
     */
    public JAXBElement<ProductCategory> getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}
     *     
     */
    public void setProductCategory(JAXBElement<ProductCategory> value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productCategoryAttributesWithValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategoryAttributesWithValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategoryAttributesWithValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategoryAttributeValue }
     * 
     * 
     */
    public List<ProductCategoryAttributeValue> getProductCategoryAttributesWithValues() {
        if (productCategoryAttributesWithValues == null) {
            productCategoryAttributesWithValues = new ArrayList<ProductCategoryAttributeValue>();
        }
        return this.productCategoryAttributesWithValues;
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
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeatures() {
        if (features == null) {
            features = new ArrayList<Feature>();
        }
        return this.features;
    }

    /**
     * Gets the value of the quantityPerCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPerCopy() {
        return quantityPerCopy;
    }

    /**
     * Sets the value of the quantityPerCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPerCopy(Integer value) {
        this.quantityPerCopy = value;
    }

    /**
     * Gets the value of the suiteProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suiteProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuiteProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuiteProductInfo }
     * 
     * 
     */
    public List<SuiteProductInfo> getSuiteProductInfo() {
        if (suiteProductInfo == null) {
            suiteProductInfo = new ArrayList<SuiteProductInfo>();
        }
        return this.suiteProductInfo;
    }

    /**
     * Sets the value of the productCategoryAttributesWithValues property.
     * 
     * @param productCategoryAttributesWithValues
     *     allowed object is
     *     {@link ProductCategoryAttributeValue }
     *     
     */
    public void setProductCategoryAttributesWithValues(List<ProductCategoryAttributeValue> productCategoryAttributesWithValues) {
        this.productCategoryAttributesWithValues = productCategoryAttributesWithValues;
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

    /**
     * Sets the value of the features property.
     * 
     * @param features
     *     allowed object is
     *     {@link Feature }
     *     
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /**
     * Sets the value of the suiteProductInfo property.
     * 
     * @param suiteProductInfo
     *     allowed object is
     *     {@link SuiteProductInfo }
     *     
     */
    public void setSuiteProductInfo(List<SuiteProductInfo> suiteProductInfo) {
        this.suiteProductInfo = suiteProductInfo;
    }

}
