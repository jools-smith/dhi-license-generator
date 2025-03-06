
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostIdMap" type="{urn:com.flexnet.external.type}StringPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HostIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostIdMap",
    "hostIdType"
})
@XmlRootElement(name = "HostIdRequest")
public class HostIdRequest {

    @XmlElement(name = "HostIdMap")
    protected List<StringPair> hostIdMap;
    @XmlElement(name = "HostIdType", required = true)
    protected String hostIdType;

    /**
     * Gets the value of the hostIdMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIdMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIdMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPair }
     * 
     * 
     */
    public List<StringPair> getHostIdMap() {
        if (hostIdMap == null) {
            hostIdMap = new ArrayList<StringPair>();
        }
        return this.hostIdMap;
    }

    /**
     * Gets the value of the hostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIdType() {
        return hostIdType;
    }

    /**
     * Sets the value of the hostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdType(String value) {
        this.hostIdType = value;
    }

    /**
     * Sets the value of the hostIdMap property.
     * 
     * @param hostIdMap
     *     allowed object is
     *     {@link StringPair }
     *     
     */
    public void setHostIdMap(List<StringPair> hostIdMap) {
        this.hostIdMap = hostIdMap;
    }

}
