
package com.searshc.hs.som.thm.domain.telluride;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfferMemberGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfferMemberGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferMemberGroup" type="{http://www.epsilon.com/webservices/}OfferMemberGroup" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfferMemberGroupList", propOrder = {
    "offerMemberGroup"
})
public class ArrayOfOfferMemberGroupList {

    @XmlElement(name = "OfferMemberGroup", nillable = true)
    protected List<OfferMemberGroup> offerMemberGroup;

    /**
     * Gets the value of the offerMemberGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerMemberGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferMemberGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferMemberGroup }
     * 
     * 
     */
    public List<OfferMemberGroup> getOfferMemberGroup() {
        if (offerMemberGroup == null) {
            offerMemberGroup = new ArrayList<OfferMemberGroup>();
        }
        return this.offerMemberGroup;
    }

}
