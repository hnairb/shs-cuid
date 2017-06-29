
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPartOrderDetailsRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPartOrderDetailsRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceRequestVO">
 *       &lt;sequence>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPartOrderDetailsRequestVO", propOrder = {
    "partOrderDate",
    "partOrderNo"
})
public class SearchPartOrderDetailsRequestVO
    extends ABaseServiceRequestVO
{

    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;

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
