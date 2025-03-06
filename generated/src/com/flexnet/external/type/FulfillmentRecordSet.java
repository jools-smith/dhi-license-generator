
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FulfillmentRecordSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentRecordSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fulfillments" type="{urn:com.flexnet.external.type}FulfillmentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentRecordSet", propOrder = {
    "fulfillments"
})
public class FulfillmentRecordSet {

    @XmlElement(nillable = true)
    protected List<FulfillmentRecord> fulfillments;

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

}
