
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderPaymentVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeCrgbkStoreNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inWarrPurDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCdExpMthYrDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serContractExpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elcCheckAppvCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elcCheckExtlRecNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeCrgbkItmPurDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iniCreditAuthFlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="storeCrgbkAccCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="storeCrgbkCallFlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderPaymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="creditAuthNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAuthBatchNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elcCheckTrsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeCrgbkAthEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAuthAppvFlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="serContractCertNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inWarrExpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAuthRespCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elcCheckServiceAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="storeCrgbkAthEmpNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftCardPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardTokenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskedCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentVO", propOrder = {
    "storeCrgbkStoreNo",
    "inWarrPurDate",
    "creditCdExpMthYrDt",
    "serContractExpDate",
    "transType",
    "elcCheckAppvCode",
    "creditAccountNo",
    "checkNumber",
    "elcCheckExtlRecNo",
    "storeCrgbkItmPurDt",
    "iniCreditAuthFlg",
    "orderRefNo",
    "storeCrgbkAccCode",
    "paymentSeqNo",
    "storeCrgbkCallFlg",
    "orderPaymentAmt",
    "creditAuthNo",
    "creditAuthBatchNo",
    "elcCheckTrsID",
    "storeCrgbkAthEmpNo",
    "creditAuthAppvFlg",
    "lastUpdate",
    "serContractCertNo",
    "inWarrExpDate",
    "paymentMethodCode",
    "creditAuthRespCode",
    "elcCheckServiceAmt",
    "storeCrgbkAthEmpNm",
    "giftCardPin",
    "creditCardTokenNo",
    "maskedCreditCardNo",
    "settlementKey"
})
public class OrderPaymentVO {

    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkStoreNo;
    @XmlElement(required = true, nillable = true)
    protected String inWarrPurDate;
    @XmlElement(required = true, nillable = true)
    protected String creditCdExpMthYrDt;
    @XmlElement(required = true, nillable = true)
    protected String serContractExpDate;
    @XmlElement(required = true, nillable = true)
    protected String transType;
    @XmlElement(required = true, nillable = true)
    protected String elcCheckAppvCode;
    @XmlElement(required = true, nillable = true)
    protected String creditAccountNo;
    @XmlElement(required = true, nillable = true)
    protected String checkNumber;
    @XmlElement(required = true, nillable = true)
    protected String elcCheckExtlRecNo;
    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkItmPurDt;
    @XmlElement(required = true, nillable = true)
    protected String iniCreditAuthFlg;
    protected long orderRefNo;
    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkAccCode;
    protected int paymentSeqNo;
    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkCallFlg;
    protected double orderPaymentAmt;
    @XmlElement(required = true, nillable = true)
    protected String creditAuthNo;
    @XmlElement(required = true, nillable = true)
    protected String creditAuthBatchNo;
    @XmlElement(required = true, nillable = true)
    protected String elcCheckTrsID;
    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkAthEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String creditAuthAppvFlg;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true, nillable = true)
    protected String serContractCertNo;
    @XmlElement(required = true, nillable = true)
    protected String inWarrExpDate;
    @XmlElement(required = true, nillable = true)
    protected String paymentMethodCode;
    @XmlElement(required = true, nillable = true)
    protected String creditAuthRespCode;
    protected double elcCheckServiceAmt;
    @XmlElement(required = true, nillable = true)
    protected String storeCrgbkAthEmpNm;
    protected String giftCardPin;
    protected String creditCardTokenNo;
    protected String maskedCreditCardNo;
    protected String settlementKey;

    /**
     * Gets the value of the storeCrgbkStoreNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkStoreNo() {
        return storeCrgbkStoreNo;
    }

    /**
     * Sets the value of the storeCrgbkStoreNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkStoreNo(String value) {
        this.storeCrgbkStoreNo = value;
    }

    /**
     * Gets the value of the inWarrPurDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInWarrPurDate() {
        return inWarrPurDate;
    }

    /**
     * Sets the value of the inWarrPurDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInWarrPurDate(String value) {
        this.inWarrPurDate = value;
    }

    /**
     * Gets the value of the creditCdExpMthYrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCdExpMthYrDt() {
        return creditCdExpMthYrDt;
    }

    /**
     * Sets the value of the creditCdExpMthYrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCdExpMthYrDt(String value) {
        this.creditCdExpMthYrDt = value;
    }

    /**
     * Gets the value of the serContractExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerContractExpDate() {
        return serContractExpDate;
    }

    /**
     * Sets the value of the serContractExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerContractExpDate(String value) {
        this.serContractExpDate = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the elcCheckAppvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElcCheckAppvCode() {
        return elcCheckAppvCode;
    }

    /**
     * Sets the value of the elcCheckAppvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElcCheckAppvCode(String value) {
        this.elcCheckAppvCode = value;
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
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the elcCheckExtlRecNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElcCheckExtlRecNo() {
        return elcCheckExtlRecNo;
    }

    /**
     * Sets the value of the elcCheckExtlRecNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElcCheckExtlRecNo(String value) {
        this.elcCheckExtlRecNo = value;
    }

    /**
     * Gets the value of the storeCrgbkItmPurDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkItmPurDt() {
        return storeCrgbkItmPurDt;
    }

    /**
     * Sets the value of the storeCrgbkItmPurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkItmPurDt(String value) {
        this.storeCrgbkItmPurDt = value;
    }

    /**
     * Gets the value of the iniCreditAuthFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniCreditAuthFlg() {
        return iniCreditAuthFlg;
    }

    /**
     * Sets the value of the iniCreditAuthFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniCreditAuthFlg(String value) {
        this.iniCreditAuthFlg = value;
    }

    /**
     * Gets the value of the orderRefNo property.
     * 
     */
    public long getOrderRefNo() {
        return orderRefNo;
    }

    /**
     * Sets the value of the orderRefNo property.
     * 
     */
    public void setOrderRefNo(long value) {
        this.orderRefNo = value;
    }

    /**
     * Gets the value of the storeCrgbkAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkAccCode() {
        return storeCrgbkAccCode;
    }

    /**
     * Sets the value of the storeCrgbkAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkAccCode(String value) {
        this.storeCrgbkAccCode = value;
    }

    /**
     * Gets the value of the paymentSeqNo property.
     * 
     */
    public int getPaymentSeqNo() {
        return paymentSeqNo;
    }

    /**
     * Sets the value of the paymentSeqNo property.
     * 
     */
    public void setPaymentSeqNo(int value) {
        this.paymentSeqNo = value;
    }

    /**
     * Gets the value of the storeCrgbkCallFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkCallFlg() {
        return storeCrgbkCallFlg;
    }

    /**
     * Sets the value of the storeCrgbkCallFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkCallFlg(String value) {
        this.storeCrgbkCallFlg = value;
    }

    /**
     * Gets the value of the orderPaymentAmt property.
     * 
     */
    public double getOrderPaymentAmt() {
        return orderPaymentAmt;
    }

    /**
     * Sets the value of the orderPaymentAmt property.
     * 
     */
    public void setOrderPaymentAmt(double value) {
        this.orderPaymentAmt = value;
    }

    /**
     * Gets the value of the creditAuthNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthNo() {
        return creditAuthNo;
    }

    /**
     * Sets the value of the creditAuthNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthNo(String value) {
        this.creditAuthNo = value;
    }

    /**
     * Gets the value of the creditAuthBatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthBatchNo() {
        return creditAuthBatchNo;
    }

    /**
     * Sets the value of the creditAuthBatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthBatchNo(String value) {
        this.creditAuthBatchNo = value;
    }

    /**
     * Gets the value of the elcCheckTrsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElcCheckTrsID() {
        return elcCheckTrsID;
    }

    /**
     * Sets the value of the elcCheckTrsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElcCheckTrsID(String value) {
        this.elcCheckTrsID = value;
    }

    /**
     * Gets the value of the storeCrgbkAthEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkAthEmpNo() {
        return storeCrgbkAthEmpNo;
    }

    /**
     * Sets the value of the storeCrgbkAthEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkAthEmpNo(String value) {
        this.storeCrgbkAthEmpNo = value;
    }

    /**
     * Gets the value of the creditAuthAppvFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthAppvFlg() {
        return creditAuthAppvFlg;
    }

    /**
     * Sets the value of the creditAuthAppvFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthAppvFlg(String value) {
        this.creditAuthAppvFlg = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the serContractCertNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerContractCertNo() {
        return serContractCertNo;
    }

    /**
     * Sets the value of the serContractCertNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerContractCertNo(String value) {
        this.serContractCertNo = value;
    }

    /**
     * Gets the value of the inWarrExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInWarrExpDate() {
        return inWarrExpDate;
    }

    /**
     * Sets the value of the inWarrExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInWarrExpDate(String value) {
        this.inWarrExpDate = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the creditAuthRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthRespCode() {
        return creditAuthRespCode;
    }

    /**
     * Sets the value of the creditAuthRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthRespCode(String value) {
        this.creditAuthRespCode = value;
    }

    /**
     * Gets the value of the elcCheckServiceAmt property.
     * 
     */
    public double getElcCheckServiceAmt() {
        return elcCheckServiceAmt;
    }

    /**
     * Sets the value of the elcCheckServiceAmt property.
     * 
     */
    public void setElcCheckServiceAmt(double value) {
        this.elcCheckServiceAmt = value;
    }

    /**
     * Gets the value of the storeCrgbkAthEmpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCrgbkAthEmpNm() {
        return storeCrgbkAthEmpNm;
    }

    /**
     * Sets the value of the storeCrgbkAthEmpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCrgbkAthEmpNm(String value) {
        this.storeCrgbkAthEmpNm = value;
    }

    /**
     * Gets the value of the giftCardPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardPin() {
        return giftCardPin;
    }

    /**
     * Sets the value of the giftCardPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardPin(String value) {
        this.giftCardPin = value;
    }

    /**
     * Gets the value of the creditCardTokenNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTokenNo() {
        return creditCardTokenNo;
    }

    /**
     * Sets the value of the creditCardTokenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTokenNo(String value) {
        this.creditCardTokenNo = value;
    }

    /**
     * Gets the value of the maskedCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditCardNo() {
        return maskedCreditCardNo;
    }

    /**
     * Sets the value of the maskedCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditCardNo(String value) {
        this.maskedCreditCardNo = value;
    }

    /**
     * Gets the value of the settlementKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementKey() {
        return settlementKey;
    }

    /**
     * Sets the value of the settlementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementKey(String value) {
        this.settlementKey = value;
    }

}
