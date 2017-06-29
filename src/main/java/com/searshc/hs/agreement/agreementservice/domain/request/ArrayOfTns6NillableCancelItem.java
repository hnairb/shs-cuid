
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.CancelItem;


/**
 * <p>Java class for ArrayOf_tns6_nillable_CancelItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_CancelItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelItem" type="{http://domain.agreement.hs.sears.com}CancelItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableCancelItem")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_CancelItem", propOrder = {
    "cancelItem"
})
public class ArrayOfTns6NillableCancelItem {

    @XmlElement(name = "CancelItem", nillable = true)
    protected List<CancelItem> cancelItem;

    /**
     * Gets the value of the cancelItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelItem }
     * 
     * 
     */
    public List<CancelItem> getCancelItem() {
        if (cancelItem == null) {
            cancelItem = new ArrayList<CancelItem>();
        }
        return this.cancelItem;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableCancelItem [cancelItem=");
		builder.append(cancelItem);
		builder.append("]");
		return builder.toString();
	}
    

}
