
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigInteger;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxRecords" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Offers"/>
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
    "startDTTM",
    "endDTTM",
    "maxRecords",
    "offers"
})
@XmlRootElement(name = "GetAvailableOffersReply")
public class GetAvailableOffersReply {

    @XmlElement(name = "StartDTTM", required = true)
    protected String startDTTM;
    @XmlElement(name = "EndDTTM", required = true)
    protected String endDTTM;
    @XmlElement(name = "MaxRecords", required = true, defaultValue = "50")
    protected BigInteger maxRecords;
    @XmlElement(name = "Offers", required = true)
    protected Offers offers;

    /**
     * Gets the value of the startDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDTTM() {
        return startDTTM;
    }

    /**
     * Sets the value of the startDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDTTM(String value) {
        this.startDTTM = value;
    }

    /**
     * Gets the value of the endDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDTTM() {
        return endDTTM;
    }

    /**
     * Sets the value of the endDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDTTM(String value) {
        this.endDTTM = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRecords(BigInteger value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link Offers }
     *     
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offers }
     *     
     */
    public void setOffers(Offers value) {
        this.offers = value;
    }

}
