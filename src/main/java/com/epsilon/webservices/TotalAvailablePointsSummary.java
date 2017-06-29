
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
 *         &lt;element name="TotalAvailablePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableMemberOwnPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableSurprisePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableMemberOwnPointsList" type="{http://www.epsilon.com/webservices/}MemberOwnPointsList" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableSurprisePointsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalAvailablePartnerBenefitsPointsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalAvailableXROfferList" minOccurs="0"/&gt;
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
    "totalAvailablePoints",
    "totalAvailableMemberOwnPoints",
    "totalAvailableSurprisePoints",
    "totalAvailableMemberOwnPointsList",
    "totalAvailableSurprisePointsList",
    "totalAvailablePartnerBenefitsPointsList",
    "totalAvailableXROfferList"
})
@XmlRootElement(name = "TotalAvailablePointsSummary")
public class TotalAvailablePointsSummary {

    @XmlElement(name = "TotalAvailablePoints")
    protected String totalAvailablePoints;
    @XmlElement(name = "TotalAvailableMemberOwnPoints")
    protected String totalAvailableMemberOwnPoints;
    @XmlElement(name = "TotalAvailableSurprisePoints")
    protected String totalAvailableSurprisePoints;
    @XmlElement(name = "TotalAvailableMemberOwnPointsList")
    protected MemberOwnPointsList totalAvailableMemberOwnPointsList;
    @XmlElement(name = "TotalAvailableSurprisePointsList")
    protected TotalAvailablePointsSummary.TotalAvailableSurprisePointsList totalAvailableSurprisePointsList;
    @XmlElement(name = "TotalAvailablePartnerBenefitsPointsList")
    protected TotalAvailablePointsSummary.TotalAvailablePartnerBenefitsPointsList totalAvailablePartnerBenefitsPointsList;
    @XmlElement(name = "TotalAvailableXROfferList")
    protected TotalAvailableXROfferList totalAvailableXROfferList;

    /**
     * Gets the value of the totalAvailablePoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailablePoints() {
        return totalAvailablePoints;
    }

    /**
     * Sets the value of the totalAvailablePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailablePoints(String value) {
        this.totalAvailablePoints = value;
    }

    /**
     * Gets the value of the totalAvailableMemberOwnPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailableMemberOwnPoints() {
        return totalAvailableMemberOwnPoints;
    }

    /**
     * Sets the value of the totalAvailableMemberOwnPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailableMemberOwnPoints(String value) {
        this.totalAvailableMemberOwnPoints = value;
    }

    /**
     * Gets the value of the totalAvailableSurprisePoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailableSurprisePoints() {
        return totalAvailableSurprisePoints;
    }

    /**
     * Sets the value of the totalAvailableSurprisePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailableSurprisePoints(String value) {
        this.totalAvailableSurprisePoints = value;
    }

    /**
     * Gets the value of the totalAvailableMemberOwnPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link MemberOwnPointsList }
     *     
     */
    public MemberOwnPointsList getTotalAvailableMemberOwnPointsList() {
        return totalAvailableMemberOwnPointsList;
    }

    /**
     * Sets the value of the totalAvailableMemberOwnPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberOwnPointsList }
     *     
     */
    public void setTotalAvailableMemberOwnPointsList(MemberOwnPointsList value) {
        this.totalAvailableMemberOwnPointsList = value;
    }

    /**
     * Gets the value of the totalAvailableSurprisePointsList property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAvailablePointsSummary.TotalAvailableSurprisePointsList }
     *     
     */
    public TotalAvailablePointsSummary.TotalAvailableSurprisePointsList getTotalAvailableSurprisePointsList() {
        return totalAvailableSurprisePointsList;
    }

    /**
     * Sets the value of the totalAvailableSurprisePointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAvailablePointsSummary.TotalAvailableSurprisePointsList }
     *     
     */
    public void setTotalAvailableSurprisePointsList(TotalAvailablePointsSummary.TotalAvailableSurprisePointsList value) {
        this.totalAvailableSurprisePointsList = value;
    }

    /**
     * Gets the value of the totalAvailablePartnerBenefitsPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAvailablePointsSummary.TotalAvailablePartnerBenefitsPointsList }
     *     
     */
    public TotalAvailablePointsSummary.TotalAvailablePartnerBenefitsPointsList getTotalAvailablePartnerBenefitsPointsList() {
        return totalAvailablePartnerBenefitsPointsList;
    }

    /**
     * Sets the value of the totalAvailablePartnerBenefitsPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAvailablePointsSummary.TotalAvailablePartnerBenefitsPointsList }
     *     
     */
    public void setTotalAvailablePartnerBenefitsPointsList(TotalAvailablePointsSummary.TotalAvailablePartnerBenefitsPointsList value) {
        this.totalAvailablePartnerBenefitsPointsList = value;
    }

    /**
     * Gets the value of the totalAvailableXROfferList property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAvailableXROfferList }
     *     
     */
    public TotalAvailableXROfferList getTotalAvailableXROfferList() {
        return totalAvailableXROfferList;
    }

    /**
     * Sets the value of the totalAvailableXROfferList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAvailableXROfferList }
     *     
     */
    public void setTotalAvailableXROfferList(TotalAvailableXROfferList value) {
        this.totalAvailableXROfferList = value;
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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
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
        "availableSurprisePoints"
    })
    public static class TotalAvailablePartnerBenefitsPointsList {

        @XmlElement(name = "AvailableSurprisePoints", required = true, nillable = true)
        protected List<Object> availableSurprisePoints;

        /**
         * Gets the value of the availableSurprisePoints property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableSurprisePoints property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableSurprisePoints().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAvailableSurprisePoints() {
            if (availableSurprisePoints == null) {
                availableSurprisePoints = new ArrayList<Object>();
            }
            return this.availableSurprisePoints;
        }

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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
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
        "availableSurprisePoints"
    })
    public static class TotalAvailableSurprisePointsList {

        @XmlElement(name = "AvailableSurprisePoints", required = true, nillable = true)
        protected List<Object> availableSurprisePoints;

        /**
         * Gets the value of the availableSurprisePoints property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableSurprisePoints property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableSurprisePoints().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAvailableSurprisePoints() {
            if (availableSurprisePoints == null) {
                availableSurprisePoints = new ArrayList<Object>();
            }
            return this.availableSurprisePoints;
        }

    }

}
