
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberOwnPointsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberOwnPointsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberOwnPointsToExpire" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MemberOwnExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MemberOwnPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberOwnPointsList", propOrder = {
    "memberOwnPointsToExpire"
})
public class MemberOwnPointsList {

    @XmlElement(name = "MemberOwnPointsToExpire")
    protected List<MemberOwnPointsList.MemberOwnPointsToExpire> memberOwnPointsToExpire;

    /**
     * Gets the value of the memberOwnPointsToExpire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberOwnPointsToExpire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberOwnPointsToExpire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberOwnPointsList.MemberOwnPointsToExpire }
     * 
     * 
     */
    public List<MemberOwnPointsList.MemberOwnPointsToExpire> getMemberOwnPointsToExpire() {
        if (memberOwnPointsToExpire == null) {
            memberOwnPointsToExpire = new ArrayList<MemberOwnPointsList.MemberOwnPointsToExpire>();
        }
        return this.memberOwnPointsToExpire;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MemberOwnExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MemberOwnPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberOwnExpiryDate",
        "memberOwnPoints"
    })
    public static class MemberOwnPointsToExpire {

        @XmlElement(name = "MemberOwnExpiryDate")
        protected String memberOwnExpiryDate;
        @XmlElement(name = "MemberOwnPoints")
        protected String memberOwnPoints;

        /**
         * Gets the value of the memberOwnExpiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberOwnExpiryDate() {
            return memberOwnExpiryDate;
        }

        /**
         * Sets the value of the memberOwnExpiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberOwnExpiryDate(String value) {
            this.memberOwnExpiryDate = value;
        }

        /**
         * Gets the value of the memberOwnPoints property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberOwnPoints() {
            return memberOwnPoints;
        }

        /**
         * Sets the value of the memberOwnPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberOwnPoints(String value) {
            this.memberOwnPoints = value;
        }

    }

}
