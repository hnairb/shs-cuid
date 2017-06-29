
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.epsilon.com/webservices/}Affinity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AffinityStartDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="AffinityEndDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createdBy",
    "affinityStartDate",
    "affinityEndDate"
})
@XmlRootElement(name = "AffinityExtended")
public class AffinityExtended
    extends Affinity
{

    @XmlElement(name = "CreatedBy", required = true)
    protected String createdBy;
    @XmlElement(name = "AffinityStartDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object affinityStartDate;
    @XmlElement(name = "AffinityEndDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object affinityEndDate;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the affinityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAffinityStartDate() {
        return affinityStartDate;
    }

    /**
     * Sets the value of the affinityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAffinityStartDate(Object value) {
        this.affinityStartDate = value;
    }

    /**
     * Gets the value of the affinityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAffinityEndDate() {
        return affinityEndDate;
    }

    /**
     * Sets the value of the affinityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAffinityEndDate(Object value) {
        this.affinityEndDate = value;
    }

}
