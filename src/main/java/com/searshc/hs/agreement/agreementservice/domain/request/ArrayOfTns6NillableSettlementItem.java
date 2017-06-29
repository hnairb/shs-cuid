
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.SettlementItem;


/**
 * <p>Java class for ArrayOf_tns6_nillable_SettlementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_SettlementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SettlementItem" type="{http://domain.agreement.hs.sears.com}SettlementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableSettlementItem")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_SettlementItem", propOrder = {
    "settlementItem"
})
public class ArrayOfTns6NillableSettlementItem {

    @XmlElement(name = "SettlementItem", nillable = true)
    protected List<SettlementItem> settlementItem;

    /**
     * Gets the value of the settlementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementItem }
     * 
     * 
     */
    public List<SettlementItem> getSettlementItem() {
        if (settlementItem == null) {
            settlementItem = new ArrayList<SettlementItem>();
        }
        return this.settlementItem;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableSettlementItem [settlementItem=");
		builder.append(settlementItem);
		builder.append("]");
		return builder.toString();
	}
    

}
