
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssociateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AffinityStartDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="AffinityEndDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
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
    "requestorID",
    "storeNumber",
    "terminal",
    "associateId",
    "createdBy",
    "affinityStartDate",
    "affinityEndDate"
})
@XmlRootElement(name = "AffinityForMemberPricing")
public class AffinityForMemberPricing
    extends Affinity
{

    @XmlElement(name = "RequestorID", required = true)
    protected String requestorID;
    @XmlElement(name = "StoreNumber", required = true)
    protected String storeNumber;
    @XmlElement(name = "Terminal", required = true)
    protected String terminal;
    @XmlElement(name = "AssociateId", required = true)
    protected String associateId;
    @XmlElement(name = "CreatedBy", required = true)
    protected String createdBy;
    @XmlElement(name = "AffinityStartDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object affinityStartDate;
    @XmlElement(name = "AffinityEndDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object affinityEndDate;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the associateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateId() {
        return associateId;
    }

    /**
     * Sets the value of the associateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateId(String value) {
        this.associateId = value;
    }

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
