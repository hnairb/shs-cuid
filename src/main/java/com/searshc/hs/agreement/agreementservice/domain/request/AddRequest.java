
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.AddPayment;


/**
 * <p>Java class for AddRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ledTypCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noComRsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adjustNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvgNoDollarInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delayBillDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deleteFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdrBatchNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemsOwned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdCityCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdCitySpecCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdCountryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdCountrySpecCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdOtherCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdSpecCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdTransitCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naicb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prdCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prtCertifInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesAuthNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxCountyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxExemptInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxExemptNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxGeoCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teleMarketNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="triggerCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroPercInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_AddItem"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capPrdPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capDeductAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capCvrCreditTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capCvrCreditAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capTotalAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capNetAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capAssocDiscAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capDiscAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capGrossAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capCashDepAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capCvrMths" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capAgreeFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonCapAgreeFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capPrdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sywrMemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AddRequest")

public class AddRequest
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String ledTypCd;
    @XmlElement(required = true, nillable = true)
    protected String agmtSrc;
    @XmlElement(required = true, nillable = true)
    protected String noComRsn;
    @XmlElement(required = true, nillable = true)
    protected String adjustNo;
    @XmlElement(required = true, nillable = true)
    protected String batchNo;
    @XmlElement(required = true, nillable = true)
    protected String comment1;
    @XmlElement(required = true, nillable = true)
    protected String comment2;
    @XmlElement(required = true, nillable = true)
    protected String contactDate;
    @XmlElement(required = true, nillable = true)
    protected String contactMethodCd;
    @XmlElement(required = true, nillable = true)
    protected String contactName;
    @XmlElement(required = true, nillable = true)
    protected String contactNo;
    @XmlElement(required = true, nillable = true)
    protected String custNum;
    @XmlElement(required = true, nillable = true)
    protected String cvgNoDollarInd;    
    @XmlElement(required = true, nillable = true)
    protected String deleteFl;
    @XmlElement(required = true, nillable = true)
    protected String hdrBatchNo;
    @XmlElement(required = true, nillable = true)
    protected String itemsOwned;
    @XmlElement(required = true, nillable = true)
    protected String jurisdCityCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdCitySpecCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdCountryCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdCountrySpecCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdOtherCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdSpecCd;
    @XmlElement(required = true, nillable = true)
    protected String jurisdTransitCd;
    @XmlElement(required = true, nillable = true)
    protected String leadNo;
    @XmlElement(required = true, nillable = true)
    protected String leadSubType;
    @XmlElement(required = true, nillable = true)
    protected String leadType;
    @XmlElement(required = true, nillable = true)
    protected String locNo;
    @XmlElement(required = true, nillable = true)
    protected String naicb;
    @XmlElement(required = true, nillable = true)
    protected String posFl;
    @XmlElement(required = true, nillable = true)
    protected String prdCd;
    @XmlElement(required = true, nillable = true)
    protected String prtCertifInd;
    @XmlElement(required = true, nillable = true)
    protected String purchaseDate;
    @XmlElement(required = true, nillable = true)
    protected String recEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String recUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String registerNo;
   
    @XmlElement(required = true, nillable = true)
    protected String sellEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String svcUnit;
    @XmlElement(required = true, nillable = true)
    protected String taxCountyCd;
    @XmlElement(required = true, nillable = true)
    protected String taxExemptInfo;
    @XmlElement(required = true, nillable = true)
    protected String taxExemptNo;
    @XmlElement(required = true, nillable = true)
    protected String taxGeoCd;
    @XmlElement(required = true, nillable = true)
    protected String teleMarketNo;
    @XmlElement(required = true, nillable = true)
    protected String triggerCd;
  
    @XmlElement(name="addItems", required = true, nillable = true)
    protected ArrayOfTns6NillableAddItem items;
      @XmlElement(required = true, nillable = true)
    protected String capPrdPlanCd;
    @XmlElement(required = true, nillable = true)
    protected String capDeductAmt;
    @XmlElement(required = true, nillable = true)
    protected String capCvrCreditTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String capCvrCreditAmt;
    @XmlElement(required = true, nillable = true)
    protected String capTotalAmt;
    @XmlElement(required = true, nillable = true)
    protected String capTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String capNetAmt;
    @XmlElement(required = true, nillable = true)
    protected String capAssocDiscAmt;
    @XmlElement(required = true, nillable = true)
    protected String capDiscAmt;
    @XmlElement(required = true, nillable = true)
    protected String capGrossAmt;
    @XmlElement(required = true, nillable = true)
    protected String capCashDepAmt;
    @XmlElement(required = true, nillable = true)
    protected String capExpireDate;
    @XmlElement(required = true, nillable = true)
    protected String capStartDate;
    @XmlElement(required = true, nillable = true)
    protected String capCvrMths;
    @XmlElement(required = true, nillable = true)
    protected String capAgreeFl;
    @XmlElement(required = true, nillable = true)
    protected String nonCapAgreeFl;
    
    @XmlElement(required=true,nillable=true)
    protected String capsywrUsePoints;
    @XmlElement(required=false,nillable=true)
    protected String capsywrUseDollars;
    @XmlElement(required = true, nillable = true)
    protected String capPrdTypeCd;
    @XmlElement(required = true, nillable = true)
    protected String sywrMemID;
    @XmlElement(required = true, nillable = true)
    private String npjxtcdFlg;
    @XmlElement(required = true, nillable = true)
    private String oriStrNo;
    @XmlElement(required = true, nillable = true)
    private String oriRegNo;
    @XmlElement(required = true, nillable = true)
    private String oriTranNo;
    @XmlElement(required = true, nillable = true)
    private String oriTranDt;
    @XmlElement(required = true, nillable = true)
    private String oriMscAcnNo;
    @XmlElement(required = true, nillable = true)
    private String oriItmNo;
    @XmlElement(required = true, nillable = true)
    private String oriFiller;
    @XmlElement(required = false, nillable = true)
    private List<AddPayment> addPayment;
 

    /**
     * Gets the value of the ledTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedTypCd() {
        return ledTypCd;
    }

    /**
     * Sets the value of the ledTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedTypCd(String value) {
        this.ledTypCd = value;
    }

    /**
     * Gets the value of the agmtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtSrc() {
        return agmtSrc;
    }

    /**
     * Sets the value of the agmtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtSrc(String value) {
        this.agmtSrc = value;
    }

    /**
     * Gets the value of the noComRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoComRsn() {
        return noComRsn;
    }

    /**
     * Sets the value of the noComRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoComRsn(String value) {
        this.noComRsn = value;
    }

    /**
     * Gets the value of the adjustNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustNo() {
        return adjustNo;
    }

    /**
     * Sets the value of the adjustNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustNo(String value) {
        this.adjustNo = value;
    }

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the comment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * Sets the value of the comment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment1(String value) {
        this.comment1 = value;
    }

    /**
     * Gets the value of the comment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * Sets the value of the comment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment2(String value) {
        this.comment2 = value;
    }

    /**
     * Gets the value of the contactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDate() {
        return contactDate;
    }

    /**
     * Sets the value of the contactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDate(String value) {
        this.contactDate = value;
    }

    /**
     * Gets the value of the contactMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodCd() {
        return contactMethodCd;
    }

    /**
     * Sets the value of the contactMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodCd(String value) {
        this.contactMethodCd = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNo(String value) {
        this.contactNo = value;
    }

   


  

    /**
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNum(String value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the cvgNoDollarInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvgNoDollarInd() {
        return cvgNoDollarInd;
    }

    /**
     * Sets the value of the cvgNoDollarInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvgNoDollarInd(String value) {
        this.cvgNoDollarInd = value;
    }

   

    /**
     * Gets the value of the deleteFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteFl() {
        return deleteFl;
    }

    /**
     * Sets the value of the deleteFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteFl(String value) {
        this.deleteFl = value;
    }

    /**
     * Gets the value of the hdrBatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrBatchNo() {
        return hdrBatchNo;
    }

    /**
     * Sets the value of the hdrBatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrBatchNo(String value) {
        this.hdrBatchNo = value;
    }

    /**
     * Gets the value of the itemsOwned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemsOwned() {
        return itemsOwned;
    }

    /**
     * Sets the value of the itemsOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemsOwned(String value) {
        this.itemsOwned = value;
    }

    /**
     * Gets the value of the jurisdCityCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdCityCd() {
        return jurisdCityCd;
    }

    /**
     * Sets the value of the jurisdCityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdCityCd(String value) {
        this.jurisdCityCd = value;
    }

    /**
     * Gets the value of the jurisdCitySpecCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdCitySpecCd() {
        return jurisdCitySpecCd;
    }

    /**
     * Sets the value of the jurisdCitySpecCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdCitySpecCd(String value) {
        this.jurisdCitySpecCd = value;
    }

    /**
     * Gets the value of the jurisdCountryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdCountryCd() {
        return jurisdCountryCd;
    }

    /**
     * Sets the value of the jurisdCountryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdCountryCd(String value) {
        this.jurisdCountryCd = value;
    }

    /**
     * Gets the value of the jurisdCountrySpecCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdCountrySpecCd() {
        return jurisdCountrySpecCd;
    }

    /**
     * Sets the value of the jurisdCountrySpecCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdCountrySpecCd(String value) {
        this.jurisdCountrySpecCd = value;
    }

    /**
     * Gets the value of the jurisdOtherCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdOtherCd() {
        return jurisdOtherCd;
    }

    /**
     * Sets the value of the jurisdOtherCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdOtherCd(String value) {
        this.jurisdOtherCd = value;
    }

    /**
     * Gets the value of the jurisdSpecCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdSpecCd() {
        return jurisdSpecCd;
    }

    /**
     * Sets the value of the jurisdSpecCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdSpecCd(String value) {
        this.jurisdSpecCd = value;
    }

    /**
     * Gets the value of the jurisdTransitCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdTransitCd() {
        return jurisdTransitCd;
    }

    /**
     * Sets the value of the jurisdTransitCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdTransitCd(String value) {
        this.jurisdTransitCd = value;
    }

    /**
     * Gets the value of the leadNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadNo() {
        return leadNo;
    }

    /**
     * Sets the value of the leadNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadNo(String value) {
        this.leadNo = value;
    }

    /**
     * Gets the value of the leadSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSubType() {
        return leadSubType;
    }

    /**
     * Sets the value of the leadSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSubType(String value) {
        this.leadSubType = value;
    }

    /**
     * Gets the value of the leadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadType() {
        return leadType;
    }

    /**
     * Sets the value of the leadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadType(String value) {
        this.leadType = value;
    }

    /**
     * Gets the value of the locNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocNo() {
        return locNo;
    }

    /**
     * Sets the value of the locNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocNo(String value) {
        this.locNo = value;
    }

    /**
     * Gets the value of the naicb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaicb() {
        return naicb;
    }

    /**
     * Sets the value of the naicb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaicb(String value) {
        this.naicb = value;
    }

    /**
     * Gets the value of the posFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosFl() {
        return posFl;
    }

    /**
     * Sets the value of the posFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosFl(String value) {
        this.posFl = value;
    }

    /**
     * Gets the value of the prdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdCd() {
        return prdCd;
    }

    /**
     * Sets the value of the prdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdCd(String value) {
        this.prdCd = value;
    }

    /**
     * Gets the value of the prtCertifInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtCertifInd() {
        return prtCertifInd;
    }

    /**
     * Sets the value of the prtCertifInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtCertifInd(String value) {
        this.prtCertifInd = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDate(String value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the recEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecEmpNo() {
        return recEmpNo;
    }

    /**
     * Sets the value of the recEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecEmpNo(String value) {
        this.recEmpNo = value;
    }

    /**
     * Gets the value of the recUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecUnitNo() {
        return recUnitNo;
    }

    /**
     * Sets the value of the recUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecUnitNo(String value) {
        this.recUnitNo = value;
    }

    /**
     * Gets the value of the registerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * Sets the value of the registerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNo(String value) {
        this.registerNo = value;
    }

  

   
    /**
     * Gets the value of the sellEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellEmpNo() {
        return sellEmpNo;
    }

    /**
     * Sets the value of the sellEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellEmpNo(String value) {
        this.sellEmpNo = value;
    }

    /**
     * Gets the value of the svcUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcUnit() {
        return svcUnit;
    }

    /**
     * Sets the value of the svcUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcUnit(String value) {
        this.svcUnit = value;
    }

    /**
     * Gets the value of the taxCountyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountyCd() {
        return taxCountyCd;
    }

    /**
     * Sets the value of the taxCountyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountyCd(String value) {
        this.taxCountyCd = value;
    }

    /**
     * Gets the value of the taxExemptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptInfo() {
        return taxExemptInfo;
    }

    /**
     * Sets the value of the taxExemptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptInfo(String value) {
        this.taxExemptInfo = value;
    }

    /**
     * Gets the value of the taxExemptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptNo() {
        return taxExemptNo;
    }

    /**
     * Sets the value of the taxExemptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptNo(String value) {
        this.taxExemptNo = value;
    }

    /**
     * Gets the value of the taxGeoCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGeoCd() {
        return taxGeoCd;
    }

    /**
     * Sets the value of the taxGeoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGeoCd(String value) {
        this.taxGeoCd = value;
    }

    /**
     * Gets the value of the teleMarketNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleMarketNo() {
        return teleMarketNo;
    }

    /**
     * Sets the value of the teleMarketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleMarketNo(String value) {
        this.teleMarketNo = value;
    }

    /**
     * Gets the value of the triggerCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerCd() {
        return triggerCd;
    }

    /**
     * Sets the value of the triggerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerCd(String value) {
        this.triggerCd = value;
    }

   
  
    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableAddItem }
     *     
     */
    public ArrayOfTns6NillableAddItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableAddItem }
     *     
     */
    public void setItems(ArrayOfTns6NillableAddItem value) {
        this.items = value;
    }

   
    /**
     * Gets the value of the capPrdPlanCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapPrdPlanCd() {
        return capPrdPlanCd;
    }

    /**
     * Sets the value of the capPrdPlanCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapPrdPlanCd(String value) {
        this.capPrdPlanCd = value;
    }

    /**
     * Gets the value of the capDeductAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapDeductAmt() {
        return capDeductAmt;
    }

    /**
     * Sets the value of the capDeductAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapDeductAmt(String value) {
        this.capDeductAmt = value;
    }

    /**
     * Gets the value of the capCvrCreditTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCvrCreditTaxAmt() {
        return capCvrCreditTaxAmt;
    }

    /**
     * Sets the value of the capCvrCreditTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCvrCreditTaxAmt(String value) {
        this.capCvrCreditTaxAmt = value;
    }

    /**
     * Gets the value of the capCvrCreditAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCvrCreditAmt() {
        return capCvrCreditAmt;
    }

    /**
     * Sets the value of the capCvrCreditAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCvrCreditAmt(String value) {
        this.capCvrCreditAmt = value;
    }

    /**
     * Gets the value of the capTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapTotalAmt() {
        return capTotalAmt;
    }

    /**
     * Sets the value of the capTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapTotalAmt(String value) {
        this.capTotalAmt = value;
    }

    /**
     * Gets the value of the capTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapTaxAmt() {
        return capTaxAmt;
    }

    /**
     * Sets the value of the capTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapTaxAmt(String value) {
        this.capTaxAmt = value;
    }

    /**
     * Gets the value of the capNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapNetAmt() {
        return capNetAmt;
    }

    /**
     * Sets the value of the capNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapNetAmt(String value) {
        this.capNetAmt = value;
    }

    /**
     * Gets the value of the capAssocDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapAssocDiscAmt() {
        return capAssocDiscAmt;
    }

    /**
     * Sets the value of the capAssocDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapAssocDiscAmt(String value) {
        this.capAssocDiscAmt = value;
    }

    /**
     * Gets the value of the capDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapDiscAmt() {
        return capDiscAmt;
    }

    /**
     * Sets the value of the capDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapDiscAmt(String value) {
        this.capDiscAmt = value;
    }

    /**
     * Gets the value of the capGrossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapGrossAmt() {
        return capGrossAmt;
    }

    /**
     * Sets the value of the capGrossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapGrossAmt(String value) {
        this.capGrossAmt = value;
    }

    /**
     * Gets the value of the capCashDepAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCashDepAmt() {
        return capCashDepAmt;
    }

    /**
     * Sets the value of the capCashDepAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCashDepAmt(String value) {
        this.capCashDepAmt = value;
    }

    /**
     * Gets the value of the capExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapExpireDate() {
        return capExpireDate;
    }

    /**
     * Sets the value of the capExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapExpireDate(String value) {
        this.capExpireDate = value;
    }

    /**
     * Gets the value of the capStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapStartDate() {
        return capStartDate;
    }

    /**
     * Sets the value of the capStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapStartDate(String value) {
        this.capStartDate = value;
    }

    /**
     * Gets the value of the capCvrMths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCvrMths() {
        return capCvrMths;
    }

    /**
     * Sets the value of the capCvrMths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCvrMths(String value) {
        this.capCvrMths = value;
    }

    /**
     * Gets the value of the capAgreeFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapAgreeFl() {
        return capAgreeFl;
    }

    /**
     * Sets the value of the capAgreeFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapAgreeFl(String value) {
        this.capAgreeFl = value;
    }

    /**
     * Gets the value of the nonCapAgreeFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCapAgreeFl() {
        return nonCapAgreeFl;
    }

    /**
     * Sets the value of the nonCapAgreeFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCapAgreeFl(String value) {
        this.nonCapAgreeFl = value;
    }

    /**
     * Gets the value of the capPrdTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapPrdTypeCd() {
        return capPrdTypeCd;
    }

    /**
     * Sets the value of the capPrdTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapPrdTypeCd(String value) {
        this.capPrdTypeCd = value;
    }

    /**
     * Gets the value of the sywrMemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSywrMemID() {
        return sywrMemID;
    }

    /**
     * Sets the value of the sywrMemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSywrMemID(String value) {
        this.sywrMemID = value;
    }
    
    

	public String getNpjxtcdFlg() {
		return npjxtcdFlg;
	}

	public void setNpjxtcdFlg(String npjxtcdFlg) {
		this.npjxtcdFlg = npjxtcdFlg;
	}

	public String getOriStrNo() {
		return oriStrNo;
	}

	public void setOriStrNo(String oriStrNo) {
		this.oriStrNo = oriStrNo;
	}

	public String getOriRegNo() {
		return oriRegNo;
	}

	public void setOriRegNo(String oriRegNo) {
		this.oriRegNo = oriRegNo;
	}

	public String getOriTranNo() {
		return oriTranNo;
	}

	public void setOriTranNo(String oriTranNo) {
		this.oriTranNo = oriTranNo;
	}

	public String getOriTranDt() {
		return oriTranDt;
	}

	public void setOriTranDt(String oriTranDt) {
		this.oriTranDt = oriTranDt;
	}

	public String getOriMscAcnNo() {
		return oriMscAcnNo;
	}

	public void setOriMscAcnNo(String oriMscAcnNo) {
		this.oriMscAcnNo = oriMscAcnNo;
	}

	public String getOriItmNo() {
		return oriItmNo;
	}

	public void setOriItmNo(String oriItmNo) {
		this.oriItmNo = oriItmNo;
	}

	public String getOriFiller() {
		return oriFiller;
	}

	public void setOriFiller(String oriFiller) {
		this.oriFiller = oriFiller;
	}
	
	
	

	public String getCapsywrUsePoints() {
		return capsywrUsePoints;
	}

	public void setCapsywrUsePoints(String capsywrUsePoints) {
		this.capsywrUsePoints = capsywrUsePoints;
	}

	public String getCapsywrUseDollars() {
		return capsywrUseDollars;
	}

	public void setCapsywrUseDollars(String capsywrUseDollars) {
		this.capsywrUseDollars = capsywrUseDollars;
	}


	public List<AddPayment> getAddPayment() {
		return addPayment;
	}

	public void setAddPayment(List<AddPayment> addPayment) {
		this.addPayment = addPayment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddRequest [ledTypCd=");
		builder.append(ledTypCd);
		builder.append(", agmtSrc=");
		builder.append(agmtSrc);
		builder.append(", noComRsn=");
		builder.append(noComRsn);
		builder.append(", adjustNo=");
		builder.append(adjustNo);
		builder.append(", batchNo=");
		builder.append(batchNo);
		builder.append(", comment1=");
		builder.append(comment1);
		builder.append(", comment2=");
		builder.append(comment2);
		builder.append(", contactDate=");
		builder.append(contactDate);
		builder.append(", contactMethodCd=");
		builder.append(contactMethodCd);
		builder.append(", contactName=");
		builder.append(contactName);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", custNum=");
		builder.append(custNum);
		builder.append(", cvgNoDollarInd=");
		builder.append(cvgNoDollarInd);
		builder.append(", deleteFl=");
		builder.append(deleteFl);
		builder.append(", hdrBatchNo=");
		builder.append(hdrBatchNo);
		builder.append(", itemsOwned=");
		builder.append(itemsOwned);
		builder.append(", jurisdCityCd=");
		builder.append(jurisdCityCd);
		builder.append(", jurisdCitySpecCd=");
		builder.append(jurisdCitySpecCd);
		builder.append(", jurisdCountryCd=");
		builder.append(jurisdCountryCd);
		builder.append(", jurisdCountrySpecCd=");
		builder.append(jurisdCountrySpecCd);
		builder.append(", jurisdOtherCd=");
		builder.append(jurisdOtherCd);
		builder.append(", jurisdSpecCd=");
		builder.append(jurisdSpecCd);
		builder.append(", jurisdTransitCd=");
		builder.append(jurisdTransitCd);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", leadSubType=");
		builder.append(leadSubType);
		builder.append(", leadType=");
		builder.append(leadType);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", naicb=");
		builder.append(naicb);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", prdCd=");
		builder.append(prdCd);
		builder.append(", prtCertifInd=");
		builder.append(prtCertifInd);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", recEmpNo=");
		builder.append(recEmpNo);
		builder.append(", recUnitNo=");
		builder.append(recUnitNo);
		builder.append(", registerNo=");
		builder.append(registerNo);
		builder.append(", sellEmpNo=");
		builder.append(sellEmpNo);
		builder.append(", svcUnit=");
		builder.append(svcUnit);
		builder.append(", taxCountyCd=");
		builder.append(taxCountyCd);
		builder.append(", taxExemptInfo=");
		builder.append(taxExemptInfo);
		builder.append(", taxExemptNo=");
		builder.append(taxExemptNo);
		builder.append(", taxGeoCd=");
		builder.append(taxGeoCd);
		builder.append(", teleMarketNo=");
		builder.append(teleMarketNo);
		builder.append(", triggerCd=");
		builder.append(triggerCd);
		builder.append(", items=");
		builder.append(items);
		builder.append(", capPrdPlanCd=");
		builder.append(capPrdPlanCd);
		builder.append(", capDeductAmt=");
		builder.append(capDeductAmt);
		builder.append(", capCvrCreditTaxAmt=");
		builder.append(capCvrCreditTaxAmt);
		builder.append(", capCvrCreditAmt=");
		builder.append(capCvrCreditAmt);
		builder.append(", capTotalAmt=");
		builder.append(capTotalAmt);
		builder.append(", capTaxAmt=");
		builder.append(capTaxAmt);
		builder.append(", capNetAmt=");
		builder.append(capNetAmt);
		builder.append(", capAssocDiscAmt=");
		builder.append(capAssocDiscAmt);
		builder.append(", capDiscAmt=");
		builder.append(capDiscAmt);
		builder.append(", capGrossAmt=");
		builder.append(capGrossAmt);
		builder.append(", capCashDepAmt=");
		builder.append(capCashDepAmt);
		builder.append(", capExpireDate=");
		builder.append(capExpireDate);
		builder.append(", capStartDate=");
		builder.append(capStartDate);
		builder.append(", capCvrMths=");
		builder.append(capCvrMths);
		builder.append(", capAgreeFl=");
		builder.append(capAgreeFl);
		builder.append(", nonCapAgreeFl=");
		builder.append(nonCapAgreeFl);
		builder.append(", capsywrUsePoints=");
		builder.append(capsywrUsePoints);
		builder.append(", capsywrUseDollars=");
		builder.append(capsywrUseDollars);
		builder.append(", capPrdTypeCd=");
		builder.append(capPrdTypeCd);
		builder.append(", sywrMemID=");
		builder.append(sywrMemID);
		builder.append(", npjxtcdFlg=");
		builder.append(npjxtcdFlg);
		builder.append(", oriStrNo=");
		builder.append(oriStrNo);
		builder.append(", oriRegNo=");
		builder.append(oriRegNo);
		builder.append(", oriTranNo=");
		builder.append(oriTranNo);
		builder.append(", oriTranDt=");
		builder.append(oriTranDt);
		builder.append(", oriMscAcnNo=");
		builder.append(oriMscAcnNo);
		builder.append(", oriItmNo=");
		builder.append(oriItmNo);
		builder.append(", oriFiller=");
		builder.append(oriFiller);
		builder.append(", addPayment=");
		builder.append(addPayment);
		builder.append("]");
		return builder.toString();
	}

}
