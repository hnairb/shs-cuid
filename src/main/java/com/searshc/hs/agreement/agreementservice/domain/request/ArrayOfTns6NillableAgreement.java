
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.Agreement;


/**
 * <p>Java class for ArrayOf_tns6_nillable_Agreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns6_nillable_Agreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agreement" type="{http://domain.agreement.hs.sears.com}Agreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ArrayOfTns6NillableAgreement")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns6_nillable_Agreement", propOrder = {
    "agreement"
})
public class ArrayOfTns6NillableAgreement {

    @XmlElement(name = "Agreement", nillable = true)
    protected List<Agreement> agreement;

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agreement }
     * 
     * 
     */
    public List<Agreement> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<Agreement>();
        }
        return this.agreement;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayOfTns6NillableAgreement [agreement=");
		builder.append(agreement);
		builder.append("]");
		return builder.toString();
	}

}
