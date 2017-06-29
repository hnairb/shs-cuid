

package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.AddStatus;


/**
 * <p>Java class for ArrayOf_tns6_nillable_AddStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_AddStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddStatus" type="{http://domain.agreement.hs.sears.com}AddStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableAddStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_AddStatus", propOrder = {
    "addStatus"
})
public class ArrayOfTns6NillableAddStatus {

    @XmlElement(name = "AddStatus", nillable = true)
    protected List<AddStatus> addStatus;

    /**
     * Gets the value of the addStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddStatus }
     * 
     * 
     */
    public List<AddStatus> getAddStatus() {
        if (addStatus == null) {
            addStatus = new ArrayList<AddStatus>();
        }
        return this.addStatus;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableAddStatus [addStatus=");
		builder.append(addStatus);
		builder.append("]");
		return builder.toString();
	}
    

}
