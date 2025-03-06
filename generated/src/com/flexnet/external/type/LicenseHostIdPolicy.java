
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseHostIdPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseHostIdPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hostIdTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseHostIdPolicy", propOrder = {
    "isIgnored",
    "hostIdTypes"
})
public class LicenseHostIdPolicy {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isIgnored;
    @XmlElement(nillable = true)
    protected List<String> hostIdTypes;

    /**
     * Gets the value of the isIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIgnored() {
        return isIgnored;
    }

    /**
     * Sets the value of the isIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIgnored(Boolean value) {
        this.isIgnored = value;
    }

    /**
     * Gets the value of the hostIdTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIdTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIdTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHostIdTypes() {
        if (hostIdTypes == null) {
            hostIdTypes = new ArrayList<String>();
        }
        return this.hostIdTypes;
    }

    /**
     * Sets the value of the hostIdTypes property.
     * 
     * @param hostIdTypes
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdTypes(List<String> hostIdTypes) {
        this.hostIdTypes = hostIdTypes;
    }

}
