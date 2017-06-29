
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.QueueCancel;


/**
 * <p>Java class for ArrayOf_tns6_nillable_QueueCancel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_QueueCancel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueueCancel" type="{http://domain.agreement.hs.sears.com}QueueCancel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableQueueCancel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_QueueCancel", propOrder = {
    "queueCancel"
})
public class ArrayOfTns6NillableQueueCancel {

    @XmlElement(name = "QueueCancel", nillable = true)
    protected List<QueueCancel> queueCancel;

    /**
     * Gets the value of the queueCancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueCancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueCancel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueCancel }
     * 
     * 
     */
    public List<QueueCancel> getQueueCancel() {
        if (queueCancel == null) {
            queueCancel = new ArrayList<QueueCancel>();
        }
        return this.queueCancel;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableQueueCancel [queueCancel=");
		builder.append(queueCancel);
		builder.append("]");
		return builder.toString();
	}

}
