
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Conditional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stackable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferRewardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardBasis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardCalculationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OfferRewardPotential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XRFlatOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XRMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Rules" maxOccurs="unbounded" minOccurs="0"/>
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
    "conditional",
    "stackable",
    "offerRewardType",
    "rewardBasis",
    "rewardCalculationType",
    "offerCode",
    "offerName",
    "description",
    "startDTTM",
    "endDTTM",
    "offerRewardPotential",
    "xrFlatOffer",
    "xrMultiplier",
    "rules"
})
@XmlRootElement(name = "ApplicableOffer")
public class ApplicableOffer {

    @XmlElement(name = "Conditional", required = true)
    protected String conditional;
    @XmlElement(name = "Stackable", required = true)
    protected String stackable;
    @XmlElement(name = "OfferRewardType", required = true)
    protected String offerRewardType;
    @XmlElement(name = "RewardBasis", required = true)
    protected String rewardBasis;
    @XmlElement(name = "RewardCalculationType", required = true)
    protected String rewardCalculationType;
    @XmlElement(name = "OfferCode", required = true)
    protected String offerCode;
    @XmlElement(name = "OfferName", required = true)
    protected String offerName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "StartDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDTTM;
    @XmlElement(name = "EndDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDTTM;
    @XmlElement(name = "OfferRewardPotential")
    protected String offerRewardPotential;
    @XmlElement(name = "XRFlatOffer")
    protected String xrFlatOffer;
    @XmlElement(name = "XRMultiplier")
    protected String xrMultiplier;
    @XmlElement(name = "Rules")
    protected List<Rules> rules;

    /**
     * Gets the value of the conditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditional(String value) {
        this.conditional = value;
    }

    /**
     * Gets the value of the stackable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackable() {
        return stackable;
    }

    /**
     * Sets the value of the stackable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackable(String value) {
        this.stackable = value;
    }

    /**
     * Gets the value of the offerRewardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRewardType() {
        return offerRewardType;
    }

    /**
     * Sets the value of the offerRewardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRewardType(String value) {
        this.offerRewardType = value;
    }

    /**
     * Gets the value of the rewardBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardBasis() {
        return rewardBasis;
    }

    /**
     * Sets the value of the rewardBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardBasis(String value) {
        this.rewardBasis = value;
    }

    /**
     * Gets the value of the rewardCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCalculationType() {
        return rewardCalculationType;
    }

    /**
     * Sets the value of the rewardCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCalculationType(String value) {
        this.rewardCalculationType = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDTTM() {
        return startDTTM;
    }

    /**
     * Sets the value of the startDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDTTM(XMLGregorianCalendar value) {
        this.startDTTM = value;
    }

    /**
     * Gets the value of the endDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDTTM() {
        return endDTTM;
    }

    /**
     * Sets the value of the endDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDTTM(XMLGregorianCalendar value) {
        this.endDTTM = value;
    }

    /**
     * Gets the value of the offerRewardPotential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRewardPotential() {
        return offerRewardPotential;
    }

    /**
     * Sets the value of the offerRewardPotential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRewardPotential(String value) {
        this.offerRewardPotential = value;
    }

    /**
     * Gets the value of the xrFlatOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRFlatOffer() {
        return xrFlatOffer;
    }

    /**
     * Sets the value of the xrFlatOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRFlatOffer(String value) {
        this.xrFlatOffer = value;
    }

    /**
     * Gets the value of the xrMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRMultiplier() {
        return xrMultiplier;
    }

    /**
     * Sets the value of the xrMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRMultiplier(String value) {
        this.xrMultiplier = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rules }
     * 
     * 
     */
    public List<Rules> getRules() {
        if (rules == null) {
            rules = new ArrayList<Rules>();
        }
        return this.rules;
    }

}
