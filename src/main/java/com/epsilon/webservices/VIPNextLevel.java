
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
 *         &lt;element name="DollarsToThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "dollarsToThreshold",
    "tripsToThreshold"
})
@XmlRootElement(name = "VIPNextLevel")
public class VIPNextLevel {

    @XmlElement(name = "DollarsToThreshold", required = true)
    protected BigDecimal dollarsToThreshold;
    @XmlElement(name = "TripsToThreshold", required = true)
    protected BigInteger tripsToThreshold;

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
