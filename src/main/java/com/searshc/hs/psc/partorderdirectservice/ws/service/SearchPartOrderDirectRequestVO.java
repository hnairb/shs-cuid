
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPartOrderDirectRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPartOrderDirectRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceRequestVO">
 *       &lt;sequence>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commChildId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCodeSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commParentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerPhoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAddr1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderReferenceNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extClientOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPartOrderDirectRequestVO", propOrder = {
    "zipCode",
    "commChildId",
    "partOrderNo",
    "customerLastName",
    "creditAccountNo",
    "zipCodeSuffix",
    "commParentId",
    "customerPhoneNo",
    "customerNo",
    "orderType",
    "customerAddr1",
    "partOrderDate",
    "orderReferenceNo",
    "extClientOrderNo"
})
public class SearchPartOrderDirectRequestVO
    extends ABaseServiceRequestVO
{

    @XmlElement(required = true, nillable = true)
    protected String zipCode;
    @XmlElement(required = true, nillable = true)
    protected String commChildId;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String customerLastName;
    @XmlElement(required = true, nillable = true)
    protected String creditAccountNo;
    @XmlElement(required = true, nillable = true)
    protected String zipCodeSuffix;
    @XmlElement(required = true, nillable = true)
    protected String commParentId;
    @XmlElement(required = true, nillable = true)
    protected String customerPhoneNo;
    @XmlElement(required = true, nillable = true)
    protected String customerNo;
    @XmlElement(required = true, nillable = true)
    protected String orderType;
    @XmlElement(required = true, nillable = true)
    protected String customerAddr1;
    @XmlElementRef(name = "partOrderDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partOrderDate;
    @XmlElementRef(name = "orderReferenceNo", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderReferenceNo;
    @XmlElementRef(name = "extClientOrderNo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extClientOrderNo;

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the commChildId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommChildId() {
        return commChildId;
    }

    /**
     * Sets the value of the commChildId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommChildId(String value) {
        this.commChildId = value;
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
     * Gets the value of the creditAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountNo() {
        return creditAccountNo;
    }

    /**
     * Sets the value of the creditAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountNo(String value) {
        this.creditAccountNo = value;
    }

    /**
     * Gets the value of the zipCodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCodeSuffix() {
        return zipCodeSuffix;
    }

    /**
     * Sets the value of the zipCodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCodeSuffix(String value) {
        this.zipCodeSuffix = value;
    }

    /**
     * Gets the value of the commParentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommParentId() {
        return commParentId;
    }

    /**
     * Sets the value of the commParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommParentId(String value) {
        this.commParentId = value;
    }

    /**
     * Gets the value of the customerPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    /**
     * Sets the value of the customerPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneNo(String value) {
        this.customerPhoneNo = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the customerAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddr1() {
        return customerAddr1;
    }

    /**
     * Sets the value of the customerAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddr1(String value) {
        this.customerAddr1 = value;
    }

    /**
     * Gets the value of the partOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartOrderDate() {
        return partOrderDate;
    }

    /**
     * Sets the value of the partOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartOrderDate(JAXBElement<String> value) {
        this.partOrderDate = value;
    }

    /**
     * Gets the value of the orderReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderReferenceNo() {
        return orderReferenceNo;
    }

    /**
     * Sets the value of the orderReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderReferenceNo(JAXBElement<Long> value) {
        this.orderReferenceNo = value;
    }

    /**
     * Gets the value of the extClientOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtClientOrderNo() {
        return extClientOrderNo;
    }

    /**
     * Sets the value of the extClientOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtClientOrderNo(JAXBElement<String> value) {
        this.extClientOrderNo = value;
    }

}
