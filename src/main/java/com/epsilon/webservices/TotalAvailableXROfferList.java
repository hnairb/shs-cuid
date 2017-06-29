
package com.epsilon.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalAvailableXROfferList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalAvailableXROfferList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalAvailableXROffers" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XROfferPointsAvailableFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="XROfferMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="XROfferQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="XROfferConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="XROfferExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="XRPointsExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OfferStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RegistrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RegistrationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TotalAvailableXROfferList", propOrder = {
    "totalAvailableXROffers"
})
public class TotalAvailableXROfferList {

    @XmlElement(name = "TotalAvailableXROffers")
    protected List<TotalAvailableXROfferList.TotalAvailableXROffers> totalAvailableXROffers;

    /**
     * Gets the value of the totalAvailableXROffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAvailableXROffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAvailableXROffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalAvailableXROfferList.TotalAvailableXROffers }
     * 
     * 
     */
    public List<TotalAvailableXROfferList.TotalAvailableXROffers> getTotalAvailableXROffers() {
        if (totalAvailableXROffers == null) {
            totalAvailableXROffers = new ArrayList<TotalAvailableXROfferList.TotalAvailableXROffers>();
        }
        return this.totalAvailableXROffers;
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
     *         &lt;element name="XROfferPointsAvailableFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="XROfferMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="XROfferQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="XROfferConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="XROfferExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="XRPointsExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OfferStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RegistrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RegistrationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "xrOfferPointsAvailableFor",
        "xrOfferMultiplier",
        "xrOfferQualifier",
        "xrOfferConditions",
        "xrOfferExpiryDate",
        "xrPointsExclusion",
        "offerCode",
        "offerName",
        "offerStartDate",
        "offerEndDate",
        "registrationStartDate",
        "registrationEndDate"
    })
    public static class TotalAvailableXROffers {

        @XmlElement(name = "XROfferPointsAvailableFor")
        protected String xrOfferPointsAvailableFor;
        @XmlElement(name = "XROfferMultiplier")
        protected String xrOfferMultiplier;
        @XmlElement(name = "XROfferQualifier")
        protected String xrOfferQualifier;
        @XmlElement(name = "XROfferConditions")
        protected String xrOfferConditions;
        @XmlElement(name = "XROfferExpiryDate")
        protected String xrOfferExpiryDate;
        @XmlElement(name = "XRPointsExclusion")
        protected String xrPointsExclusion;
        @XmlElement(name = "OfferCode")
        protected String offerCode;
        @XmlElement(name = "OfferName")
        protected String offerName;
        @XmlElement(name = "OfferStartDate")
        protected String offerStartDate;
        @XmlElement(name = "OfferEndDate")
        protected String offerEndDate;
        @XmlElement(name = "RegistrationStartDate")
        protected String registrationStartDate;
        @XmlElement(name = "RegistrationEndDate")
        protected String registrationEndDate;

        /**
         * Gets the value of the xrOfferPointsAvailableFor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXROfferPointsAvailableFor() {
            return xrOfferPointsAvailableFor;
        }

        /**
         * Sets the value of the xrOfferPointsAvailableFor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXROfferPointsAvailableFor(String value) {
            this.xrOfferPointsAvailableFor = value;
        }

        /**
         * Gets the value of the xrOfferMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXROfferMultiplier() {
            return xrOfferMultiplier;
        }

        /**
         * Sets the value of the xrOfferMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXROfferMultiplier(String value) {
            this.xrOfferMultiplier = value;
        }

        /**
         * Gets the value of the xrOfferQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXROfferQualifier() {
            return xrOfferQualifier;
        }

        /**
         * Sets the value of the xrOfferQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXROfferQualifier(String value) {
            this.xrOfferQualifier = value;
        }

        /**
         * Gets the value of the xrOfferConditions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXROfferConditions() {
            return xrOfferConditions;
        }

        /**
         * Sets the value of the xrOfferConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXROfferConditions(String value) {
            this.xrOfferConditions = value;
        }

        /**
         * Gets the value of the xrOfferExpiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXROfferExpiryDate() {
            return xrOfferExpiryDate;
        }

        /**
         * Sets the value of the xrOfferExpiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXROfferExpiryDate(String value) {
            this.xrOfferExpiryDate = value;
        }

        /**
         * Gets the value of the xrPointsExclusion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXRPointsExclusion() {
            return xrPointsExclusion;
        }

        /**
         * Sets the value of the xrPointsExclusion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXRPointsExclusion(String value) {
            this.xrPointsExclusion = value;
        }

        /**
         * Gets the value of the offerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferCode() {
            return offerCode;
        }

        /**
         * Sets the value of the offerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferCode(String value) {
            this.offerCode = value;
        }

        /**
         * Gets the value of the offerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferName() {
            return offerName;
        }

        /**
         * Sets the value of the offerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferName(String value) {
            this.offerName = value;
        }

        /**
         * Gets the value of the offerStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferStartDate() {
            return offerStartDate;
        }

        /**
         * Sets the value of the offerStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferStartDate(String value) {
            this.offerStartDate = value;
        }

        /**
         * Gets the value of the offerEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferEndDate() {
            return offerEndDate;
        }

        /**
         * Sets the value of the offerEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferEndDate(String value) {
            this.offerEndDate = value;
        }

        /**
         * Gets the value of the registrationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationStartDate() {
            return registrationStartDate;
        }

        /**
         * Sets the value of the registrationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationStartDate(String value) {
            this.registrationStartDate = value;
        }

        /**
         * Gets the value of the registrationEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationEndDate() {
            return registrationEndDate;
        }

        /**
         * Sets the value of the registrationEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationEndDate(String value) {
            this.registrationEndDate = value;
        }

    }

}
