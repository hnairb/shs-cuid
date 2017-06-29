
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Completed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TargetValue"/>
 *         &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ChallengeStatusText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferStartDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TimeLeft"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "completed",
    "targetValue",
    "currentValue",
    "challengeStatusText",
    "offerStartDate",
    "offerEndDate",
    "timeLeft",
    "productInfo"
})
@XmlRootElement(name = "ChallengeOffer")
public class ChallengeOffer {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Completed", required = true)
    protected String completed;
    @XmlElement(name = "TargetValue", required = true)
    protected TargetValue targetValue;
    @XmlElement(name = "CurrentValue", required = true)
    protected BigDecimal currentValue;
    @XmlElement(name = "ChallengeStatusText", required = true)
    protected String challengeStatusText;
    @XmlElement(name = "OfferStartDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object offerStartDate;
    @XmlElement(name = "OfferEndDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object offerEndDate;
    @XmlElement(name = "TimeLeft", required = true)
    protected TimeLeft timeLeft;
    @XmlElement(name = "ProductInfo")
    protected List<ProductInfo> productInfo;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleted(String value) {
        this.completed = value;
    }

    /**
     * Gets the value of the targetValue property.
     * 
     * @return
     *     possible object is
     *     {@link TargetValue }
     *     
     */
    public TargetValue getTargetValue() {
        return targetValue;
    }

    /**
     * Sets the value of the targetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetValue }
     *     
     */
    public void setTargetValue(TargetValue value) {
        this.targetValue = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentValue(BigDecimal value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the challengeStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeStatusText() {
        return challengeStatusText;
    }

    /**
     * Sets the value of the challengeStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeStatusText(String value) {
        this.challengeStatusText = value;
    }

    /**
     * Gets the value of the offerStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferStartDate() {
        return offerStartDate;
    }

    /**
     * Sets the value of the offerStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferStartDate(Object value) {
        this.offerStartDate = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferEndDate(Object value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLeft }
     *     
     */
    public TimeLeft getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLeft }
     *     
     */
    public void setTimeLeft(TimeLeft value) {
        this.timeLeft = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInfo }
     * 
     * 
     */
    public List<ProductInfo> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<ProductInfo>();
        }
        return this.productInfo;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
