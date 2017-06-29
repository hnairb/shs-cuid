
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartOrderDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderDetailVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderDetailVO", propOrder = {
    "partOrderNo",
    "partOrderDate"
})
public class PartOrderDetailVO {

    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;

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

}
