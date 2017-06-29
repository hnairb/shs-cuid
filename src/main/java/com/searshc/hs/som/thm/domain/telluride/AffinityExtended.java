
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epsilon.com/webservices/}Affinity">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AffinityStartDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="AffinityEndDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
