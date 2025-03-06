
package com.flexnet.external.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{urn:com.flexnet.external.type}CustomAttributeDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeSet", propOrder = {
    "attributes"
})
public class AttributeSet {

    protected List<CustomAttributeDescriptor> attributes;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttributeDescriptor }
     * 
     * 
     */
    public List<CustomAttributeDescriptor> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<CustomAttributeDescriptor>();
        }
        return this.attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param attributes
     *     allowed object is
     *     {@link CustomAttributeDescriptor }
     *     
     */
    public void setAttributes(List<CustomAttributeDescriptor> attributes) {
        this.attributes = attributes;
    }

}
