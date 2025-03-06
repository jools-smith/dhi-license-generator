
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedLicenseRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedLicenseRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licenseTechnology" type="{urn:com.flexnet.external.type}LicenseTechnology"/>
 *         &lt;element name="consolidatedLicenseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fulfillments" type="{urn:com.flexnet.external.type}FulfillmentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soldTo" type="{urn:com.flexnet.external.type}OrganizationUnit"/>
 *         &lt;element name="licenseFileNames" type="{urn:com.flexnet.external.type}LicenseFileDefinitionMapItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedLicenseRecord", propOrder = {
    "licenseTechnology",
    "consolidatedLicenseId",
    "criteria",
    "status",
    "fulfillments",
    "soldTo",
    "licenseFileNames"
})
public class ConsolidatedLicenseRecord {

    @XmlElement(required = true, nillable = true)
    protected LicenseTechnology licenseTechnology;
    @XmlElement(required = true, nillable = true)
    protected String consolidatedLicenseId;
    @XmlElement(required = true, nillable = true)
    protected String criteria;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(nillable = true)
    protected List<FulfillmentRecord> fulfillments;
    @XmlElement(required = true, nillable = true)
    protected OrganizationUnit soldTo;
    @XmlElement(nillable = true)
    protected List<LicenseFileDefinitionMapItem> licenseFileNames;

    /**
     * Gets the value of the licenseTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTechnology }
     *     
     */
    public LicenseTechnology getLicenseTechnology() {
        return licenseTechnology;
    }

    /**
     * Sets the value of the licenseTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTechnology }
     *     
     */
    public void setLicenseTechnology(LicenseTechnology value) {
        this.licenseTechnology = value;
    }

    /**
     * Gets the value of the consolidatedLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidatedLicenseId() {
        return consolidatedLicenseId;
    }

    /**
     * Sets the value of the consolidatedLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidatedLicenseId(String value) {
        this.consolidatedLicenseId = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
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

    /**
     * Gets the value of the fulfillments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulfillments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulfillments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FulfillmentRecord }
     * 
     * 
     */
    public List<FulfillmentRecord> getFulfillments() {
        if (fulfillments == null) {
            fulfillments = new ArrayList<FulfillmentRecord>();
        }
        return this.fulfillments;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationUnit }
     *     
     */
    public OrganizationUnit getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationUnit }
     *     
     */
    public void setSoldTo(OrganizationUnit value) {
        this.soldTo = value;
    }

    /**
     * Gets the value of the licenseFileNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseFileNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseFileNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFileDefinitionMapItem }
     * 
     * 
     */
    public List<LicenseFileDefinitionMapItem> getLicenseFileNames() {
        if (licenseFileNames == null) {
            licenseFileNames = new ArrayList<LicenseFileDefinitionMapItem>();
        }
        return this.licenseFileNames;
    }

    /**
     * Sets the value of the fulfillments property.
     * 
     * @param fulfillments
     *     allowed object is
     *     {@link FulfillmentRecord }
     *     
     */
    public void setFulfillments(List<FulfillmentRecord> fulfillments) {
        this.fulfillments = fulfillments;
    }

    /**
     * Sets the value of the licenseFileNames property.
     * 
     * @param licenseFileNames
     *     allowed object is
     *     {@link LicenseFileDefinitionMapItem }
     *     
     */
    public void setLicenseFileNames(List<LicenseFileDefinitionMapItem> licenseFileNames) {
        this.licenseFileNames = licenseFileNames;
    }

}
