
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.AddItemStatus;

 
/**
 * <p>Java class for ArrayOf_tns6_nillable_AddItemStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_AddItemStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddItemStatus" type="{http://domain.agreement.hs.sears.com}AddItemStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableAddItemStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_AddItemStatus", propOrder = {
    "addItemStatus"
})
public class ArrayOfTns6NillableAddItemStatus {

    @XmlElement(name = "AddItemStatus", nillable = true)
    protected List<AddItemStatus> addItemStatus;

    /**
     * Gets the value of the addItemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addItemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddItemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddItemStatus }
     * 
     * 
     */
    public List<AddItemStatus> getAddItemStatus() {
        if (addItemStatus == null) {
            addItemStatus = new ArrayList<AddItemStatus>();
        }
        return this.addItemStatus;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableAddItemStatus [addItemStatus=");
		builder.append(addItemStatus);
		builder.append("]");
		return builder.toString();
	}

}
