
package com.flexnet.external.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaintenanceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="partNumber" type="{urn:com.flexnet.external.type}PartNumber"/>
 *         &lt;element name="maintenanceProduct" type="{urn:com.flexnet.external.type}Product"/>
 *         &lt;element name="parentEntitlement" type="{urn:com.flexnet.external.type}Entitlement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceItem", propOrder = {
    "activationID",
    "orderID",
    "orderLineNumber",
    "expirationDate",
    "partNumber",
    "maintenanceProduct",
    "parentEntitlement"
})
public class MaintenanceItem {

    @XmlElement(required = true, nillable = true)
    protected String activationID;
    @XmlElement(required = true, nillable = true)
    protected String orderID;
    @XmlElement(required = true, nillable = true)
    protected String orderLineNumber;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(required = true, nillable = true)
    protected PartNumber partNumber;
    @XmlElement(required = true, nillable = true)
    protected Product maintenanceProduct;
    @XmlElement(required = true, nillable = true)
    protected Entitlement parentEntitlement;

    /**
     * Gets the value of the activationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationID() {
        return activationID;
    }

    /**
     * Sets the value of the activationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationID(String value) {
        this.activationID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * Sets the value of the orderLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineNumber(String value) {
        this.orderLineNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PartNumber }
     *     
     */
    public PartNumber getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartNumber }
     *     
     */
    public void setPartNumber(PartNumber value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the maintenanceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getMaintenanceProduct() {
        return maintenanceProduct;
    }

    /**
     * Sets the value of the maintenanceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setMaintenanceProduct(Product value) {
        this.maintenanceProduct = value;
    }

    /**
     * Gets the value of the parentEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement }
     *     
     */
    public Entitlement getParentEntitlement() {
        return parentEntitlement;
    }

    /**
     * Sets the value of the parentEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement }
     *     
     */
    public void setParentEntitlement(Entitlement value) {
        this.parentEntitlement = value;
    }

}
