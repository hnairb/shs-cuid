
package com.epsilon.webservices;

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
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointsPerDollar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Flat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ForEvery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "min",
    "max",
    "pointsPerDollar",
    "flat",
    "forEvery"
})
@XmlRootElement(name = "ApplicableOfferTier")
public class ApplicableOfferTier {

    @XmlElement(name = "Min", required = true)
    protected String min;
    @XmlElement(name = "Max", required = true)
    protected String max;
    @XmlElement(name = "PointsPerDollar", required = true)
    protected String pointsPerDollar;
    @XmlElement(name = "Flat", required = true)
    protected String flat;
    @XmlElement(name = "ForEvery", required = true)
    protected String forEvery;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    /**
     * Gets the value of the pointsPerDollar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsPerDollar() {
        return pointsPerDollar;
    }

    /**
     * Sets the value of the pointsPerDollar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsPerDollar(String value) {
        this.pointsPerDollar = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

    /**
     * Gets the value of the forEvery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForEvery() {
        return forEvery;
    }

    /**
     * Sets the value of the forEvery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForEvery(String value) {
        this.forEvery = value;
    }

}
