
package com.epsilon.webservices;

import java.math.BigDecimal;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DollarThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DollarsToThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TripThreshold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TripsToThreshold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "dollarThreshold",
    "dollarsToThreshold",
    "tripThreshold",
    "tripsToThreshold"
})
@XmlRootElement(name = "VIPThreshold")
public class VIPThreshold {

    @XmlElement(name = "DollarThreshold", required = true)
    protected BigDecimal dollarThreshold;
    @XmlElement(name = "DollarsToThreshold", required = true)
    protected BigDecimal dollarsToThreshold;
    @XmlElement(name = "TripThreshold", required = true)
    protected BigInteger tripThreshold;
    @XmlElement(name = "TripsToThreshold", required = true)
    protected BigInteger tripsToThreshold;

    /**
     * Gets the value of the dollarThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDollarThreshold() {
        return dollarThreshold;
    }

    /**
     * Sets the value of the dollarThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDollarThreshold(BigDecimal value) {
        this.dollarThreshold = value;
    }

    /**
     * Gets the value of the dollarsToThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDollarsToThreshold() {
        return dollarsToThreshold;
    }

    /**
     * Sets the value of the dollarsToThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDollarsToThreshold(BigDecimal value) {
        this.dollarsToThreshold = value;
    }

    /**
     * Gets the value of the tripThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTripThreshold() {
        return tripThreshold;
    }

    /**
     * Sets the value of the tripThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTripThreshold(BigInteger value) {
        this.tripThreshold = value;
    }

    /**
     * Gets the value of the tripsToThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTripsToThreshold() {
        return tripsToThreshold;
    }

    /**
     * Sets the value of the tripsToThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTripsToThreshold(BigInteger value) {
        this.tripsToThreshold = value;
    }

}
