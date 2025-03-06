
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleEntitlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleEntitlement">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.flexnet.external.type}Entitlement">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allLineItems" type="{urn:com.flexnet.external.type}EntitlementLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleEntitlement", propOrder = {
    "comments",
    "allLineItems"
})
public class SimpleEntitlement
    extends Entitlement
{

    @XmlElement(required = true, nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected List<EntitlementLineItem> allLineItems;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the allLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementLineItem }
     * 
     * 
     */
    public List<EntitlementLineItem> getAllLineItems() {
        if (allLineItems == null) {
            allLineItems = new ArrayList<EntitlementLineItem>();
        }
        return this.allLineItems;
    }

    /**
     * Sets the value of the allLineItems property.
     * 
     * @param allLineItems
     *     allowed object is
     *     {@link EntitlementLineItem }
     *     
     */
    public void setAllLineItems(List<EntitlementLineItem> allLineItems) {
        this.allLineItems = allLineItems;
    }

}
