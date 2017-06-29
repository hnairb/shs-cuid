
package com.epsilon.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offerMemberGroupList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferMemberGroupResponse" type="{http://www.epsilon.com/webservices/}OfferMemberGroupResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberNumber",
    "offerMemberGroupList"
})
@XmlRootElement(name = "OfferRegistrationReply")
public class OfferRegistrationReply {

    @XmlElement(required = true)
    protected String memberNumber;
    @XmlElement(required = true)
    protected OfferRegistrationReply.OfferMemberGroupList offerMemberGroupList;

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the offerMemberGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link OfferRegistrationReply.OfferMemberGroupList }
     *     
     */
    public OfferRegistrationReply.OfferMemberGroupList getOfferMemberGroupList() {
        return offerMemberGroupList;
    }

    /**
     * Sets the value of the offerMemberGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferRegistrationReply.OfferMemberGroupList }
     *     
     */
    public void setOfferMemberGroupList(OfferRegistrationReply.OfferMemberGroupList value) {
        this.offerMemberGroupList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OfferMemberGroupResponse" type="{http://www.epsilon.com/webservices/}OfferMemberGroupResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offerMemberGroupResponse"
    })
    public static class OfferMemberGroupList {

        @XmlElement(name = "OfferMemberGroupResponse")
        protected List<OfferMemberGroupResponse> offerMemberGroupResponse;

        /**
         * Gets the value of the offerMemberGroupResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerMemberGroupResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferMemberGroupResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferMemberGroupResponse }
         * 
         * 
         */
        public List<OfferMemberGroupResponse> getOfferMemberGroupResponse() {
            if (offerMemberGroupResponse == null) {
                offerMemberGroupResponse = new ArrayList<OfferMemberGroupResponse>();
            }
            return this.offerMemberGroupResponse;
        }

    }

}
