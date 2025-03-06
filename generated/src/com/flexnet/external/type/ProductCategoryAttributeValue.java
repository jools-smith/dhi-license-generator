
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCategoryAttributeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCategoryAttributeValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productCategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productCategoryAttribute" type="{urn:com.flexnet.external.type}ProductCategoryAttribute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCategoryAttributeValue", propOrder = {
    "productCategoryName",
    "value",
    "productCategoryAttribute"
})
public class ProductCategoryAttributeValue {

    @XmlElement(required = true, nillable = true)
    protected String productCategoryName;
    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElement(required = true, nillable = true)
    protected ProductCategoryAttribute productCategoryAttribute;

    /**
     * Gets the value of the productCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * Sets the value of the productCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryName(String value) {
        this.productCategoryName = value;
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
     * Gets the value of the productCategoryAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryAttribute }
     *     
     */
    public ProductCategoryAttribute getProductCategoryAttribute() {
        return productCategoryAttribute;
    }

    /**
     * Sets the value of the productCategoryAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryAttribute }
     *     
     */
    public void setProductCategoryAttribute(ProductCategoryAttribute value) {
        this.productCategoryAttribute = value;
    }

}
