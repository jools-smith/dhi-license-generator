
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomHostId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomHostId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicenseTechnologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostAttributeValues" type="{urn:com.flexnet.external.type}StringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomHostId", propOrder = {
    "hostIdentifier",
    "licenseTechnologyName",
    "hostAttributeValues"
})
public class CustomHostId {

    @XmlElement(required = true, nillable = true)
    protected String hostIdentifier;
    @XmlElement(name = "LicenseTechnologyName", required = true, nillable = true)
    protected String licenseTechnologyName;
    @XmlElement(name = "HostAttributeValues", nillable = true)
    protected List<StringPair> hostAttributeValues;

    /**
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdentifier(String value) {
        this.hostIdentifier = value;
    }

    /**
     * Gets the value of the licenseTechnologyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseTechnologyName() {
        return licenseTechnologyName;
    }

    /**
     * Sets the value of the licenseTechnologyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseTechnologyName(String value) {
        this.licenseTechnologyName = value;
    }

    /**
     * Gets the value of the hostAttributeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostAttributeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostAttributeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPair }
     * 
     * 
     */
    public List<StringPair> getHostAttributeValues() {
        if (hostAttributeValues == null) {
            hostAttributeValues = new ArrayList<StringPair>();
        }
        return this.hostAttributeValues;
    }

    /**
     * Sets the value of the hostAttributeValues property.
     * 
     * @param hostAttributeValues
     *     allowed object is
     *     {@link StringPair }
     *     
     */
    public void setHostAttributeValues(List<StringPair> hostAttributeValues) {
        this.hostAttributeValues = hostAttributeValues;
    }

}
