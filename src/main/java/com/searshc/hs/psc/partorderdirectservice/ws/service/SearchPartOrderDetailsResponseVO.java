
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPartOrderDetailsResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPartOrderDetailsResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceResponseVO">
 *       &lt;sequence>
 *         &lt;element name="orderReferenceVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}OrderReferenceVO"/>
 *         &lt;element name="orderMarkDownCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderMarkdownVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_PartOrderMarkdownVO"/>
 *         &lt;element name="paymentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}PartOrderVO"/>
 *         &lt;element name="addressCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderLineVO2" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_PartOrderLineVO2"/>
 *         &lt;element name="partsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderNameAddressVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_OrderNameAddressVO"/>
 *         &lt;element name="orderPaymentVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_OrderPaymentVO"/>
 *         &lt;element name="sywrTransCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sywrTransVo" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_SYWRTransVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPartOrderDetailsResponseVO", propOrder = {
    "orderReferenceVO",
    "orderMarkDownCount",
    "orderMarkdownVO",
    "paymentCount",
    "orderVO",
    "addressCount",
    "partOrderLineVO2",
    "partsCount",
    "orderNameAddressVO",
    "orderPaymentVO",
    "sywrTransCount",
    "sywrTransVo"
})
public class SearchPartOrderDetailsResponseVO
    extends ABaseServiceResponseVO
{

	public static final String VO_NAME = "SearchPartOrderDetailsResponseVO";
	
    @XmlElement(required = true, nillable = true)
    protected OrderReferenceVO orderReferenceVO;
    protected int orderMarkDownCount;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns5PartOrderMarkdownVO orderMarkdownVO;
    protected int paymentCount;
    @XmlElement(required = true, nillable = true)
    protected PartOrderVO orderVO;
    protected int addressCount;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3PartOrderLineVO2 partOrderLineVO2;
    protected int partsCount;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3OrderNameAddressVO orderNameAddressVO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3OrderPaymentVO orderPaymentVO;
    protected int sywrTransCount;
    protected ArrayOfTns5SYWRTransVo sywrTransVo;

    /**
     * Gets the value of the orderReferenceVO property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceVO }
     *     
     */
    public OrderReferenceVO getOrderReferenceVO() {
        return orderReferenceVO;
    }

    /**
     * Sets the value of the orderReferenceVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceVO }
     *     
     */
    public void setOrderReferenceVO(OrderReferenceVO value) {
        this.orderReferenceVO = value;
    }

    /**
     * Gets the value of the orderMarkDownCount property.
     * 
     */
    public int getOrderMarkDownCount() {
        return orderMarkDownCount;
    }

    /**
     * Sets the value of the orderMarkDownCount property.
     * 
     */
    public void setOrderMarkDownCount(int value) {
        this.orderMarkDownCount = value;
    }

    /**
     * Gets the value of the orderMarkdownVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public ArrayOfTns5PartOrderMarkdownVO getOrderMarkdownVO() {
        return orderMarkdownVO;
    }

    /**
     * Sets the value of the orderMarkdownVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public void setOrderMarkdownVO(ArrayOfTns5PartOrderMarkdownVO value) {
        this.orderMarkdownVO = value;
    }

    /**
     * Gets the value of the paymentCount property.
     * 
     */
    public int getPaymentCount() {
        return paymentCount;
    }

    /**
     * Sets the value of the paymentCount property.
     * 
     */
    public void setPaymentCount(int value) {
        this.paymentCount = value;
    }

    /**
     * Gets the value of the orderVO property.
     * 
     * @return
     *     possible object is
     *     {@link PartOrderVO }
     *     
     */
    public PartOrderVO getOrderVO() {
        return orderVO;
    }

    /**
     * Sets the value of the orderVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartOrderVO }
     *     
     */
    public void setOrderVO(PartOrderVO value) {
        this.orderVO = value;
    }

    /**
     * Gets the value of the addressCount property.
     * 
     */
    public int getAddressCount() {
        return addressCount;
    }

    /**
     * Sets the value of the addressCount property.
     * 
     */
    public void setAddressCount(int value) {
        this.addressCount = value;
    }

    /**
     * Gets the value of the partOrderLineVO2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3PartOrderLineVO2 }
     *     
     */
    public ArrayOfTns3PartOrderLineVO2 getPartOrderLineVO2() {
        return partOrderLineVO2;
    }

    /**
     * Sets the value of the partOrderLineVO2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3PartOrderLineVO2 }
     *     
     */
    public void setPartOrderLineVO2(ArrayOfTns3PartOrderLineVO2 value) {
        this.partOrderLineVO2 = value;
    }

    /**
     * Gets the value of the partsCount property.
     * 
     */
    public int getPartsCount() {
        return partsCount;
    }

    /**
     * Sets the value of the partsCount property.
     * 
     */
    public void setPartsCount(int value) {
        this.partsCount = value;
    }

    /**
     * Gets the value of the orderNameAddressVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3OrderNameAddressVO }
     *     
     */
    public ArrayOfTns3OrderNameAddressVO getOrderNameAddressVO() {
        return orderNameAddressVO;
    }

    /**
     * Sets the value of the orderNameAddressVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3OrderNameAddressVO }
     *     
     */
    public void setOrderNameAddressVO(ArrayOfTns3OrderNameAddressVO value) {
        this.orderNameAddressVO = value;
    }

    /**
     * Gets the value of the orderPaymentVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3OrderPaymentVO }
     *     
     */
    public ArrayOfTns3OrderPaymentVO getOrderPaymentVO() {
        return orderPaymentVO;
    }

    /**
     * Sets the value of the orderPaymentVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3OrderPaymentVO }
     *     
     */
    public void setOrderPaymentVO(ArrayOfTns3OrderPaymentVO value) {
        this.orderPaymentVO = value;
    }

    /**
     * Gets the value of the sywrTransCount property.
     * 
     */
    public int getSywrTransCount() {
        return sywrTransCount;
    }

    /**
     * Sets the value of the sywrTransCount property.
     * 
     */
    public void setSywrTransCount(int value) {
        this.sywrTransCount = value;
    }

    /**
     * Gets the value of the sywrTransVo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5SYWRTransVo }
     *     
     */
    public ArrayOfTns5SYWRTransVo getSywrTransVo() {
        return sywrTransVo;
    }

    /**
     * Sets the value of the sywrTransVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5SYWRTransVo }
     *     
     */
    public void setSywrTransVo(ArrayOfTns5SYWRTransVo value) {
        this.sywrTransVo = value;
    }

}
