
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartOrderCommentVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderCommentVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sentToNPNFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partorderComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderCommentVO", propOrder = {
    "unitNo",
    "partOrderDate",
    "sentToNPNFlag",
    "empIDNo",
    "partorderComment",
    "partOrderNo"
})
public class PartOrderCommentVO {

    @XmlElement(required = true, nillable = true)
    protected String unitNo;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    @XmlElement(required = true, nillable = true)
    protected String sentToNPNFlag;
    @XmlElement(required = true, nillable = true)
    protected String empIDNo;
    @XmlElement(required = true, nillable = true)
    protected String partorderComment;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;

    /**
     * Gets the value of the unitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNo() {
        return unitNo;
    }

    /**
     * Sets the value of the unitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNo(String value) {
        this.unitNo = value;
    }

    /**
     * Gets the value of the partOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrderDate() {
        return partOrderDate;
    }

    /**
     * Sets the value of the partOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrderDate(String value) {
        this.partOrderDate = value;
    }

    /**
     * Gets the value of the sentToNPNFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentToNPNFlag() {
        return sentToNPNFlag;
    }

    /**
     * Sets the value of the sentToNPNFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentToNPNFlag(String value) {
        this.sentToNPNFlag = value;
    }

    /**
     * Gets the value of the empIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpIDNo() {
        return empIDNo;
    }

    /**
     * Sets the value of the empIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpIDNo(String value) {
        this.empIDNo = value;
    }

    /**
     * Gets the value of the partorderComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartorderComment() {
        return partorderComment;
    }

    /**
     * Sets the value of the partorderComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartorderComment(String value) {
        this.partorderComment = value;
    }

    /**
     * Gets the value of the partOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrderNo() {
        return partOrderNo;
    }

    /**
     * Sets the value of the partOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrderNo(String value) {
        this.partOrderNo = value;
    }

}
