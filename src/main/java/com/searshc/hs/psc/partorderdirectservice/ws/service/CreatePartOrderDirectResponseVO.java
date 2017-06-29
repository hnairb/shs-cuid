
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePartOrderDirectResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePartOrderDirectResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceResponseVO">
 *       &lt;sequence>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalPartCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="partOrderDetailVOs" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_PartOrderDetailVO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePartOrderDirectResponseVO", propOrder = {
    "customerLastName",
    "totalPartCount",
    "status",
    "orderNo",
    "partOrderDetailVOs"
})
public class CreatePartOrderDirectResponseVO
    extends ABaseServiceResponseVO
{

    @XmlElement(required = true, nillable = true)
    protected String customerLastName;
    protected int totalPartCount;
    @XmlElement(required = true, nillable = true)
    protected String status;
    protected long orderNo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns5PartOrderDetailVO partOrderDetailVOs;

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the totalPartCount property.
     * 
     */
    public int getTotalPartCount() {
        return totalPartCount;
    }

    /**
     * Sets the value of the totalPartCount property.
     * 
     */
    public void setTotalPartCount(int value) {
        this.totalPartCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     */
    public long getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     */
    public void setOrderNo(long value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the partOrderDetailVOs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5PartOrderDetailVO }
     *     
     */
    public ArrayOfTns5PartOrderDetailVO getPartOrderDetailVOs() {
        return partOrderDetailVOs;
    }

    /**
     * Sets the value of the partOrderDetailVOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5PartOrderDetailVO }
     *     
     */
    public void setPartOrderDetailVOs(ArrayOfTns5PartOrderDetailVO value) {
        this.partOrderDetailVOs = value;
    }

}
