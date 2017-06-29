
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
 *         &lt;element name="ApplicableStoreFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "applicableStoreFormat",
    "include"
})
@XmlRootElement(name = "ApplicableStoreFormats")
public class ApplicableStoreFormats {

    @XmlElement(name = "ApplicableStoreFormat", required = true)
    protected String applicableStoreFormat;
    @XmlElement(name = "Include", required = true)
    protected String include;

    /**
     * Gets the value of the applicableStoreFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableStoreFormat() {
        return applicableStoreFormat;
    }

    /**
     * Sets the value of the applicableStoreFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableStoreFormat(String value) {
        this.applicableStoreFormat = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclude(String value) {
        this.include = value;
    }

}
