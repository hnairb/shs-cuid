
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.SettlementPayment;


/**
 * <p>Java class for SettlementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="custNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cvgNoDollarInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_SettlementItem"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadAssignFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadQueueNameCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prdNameCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prtCertifInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spokeTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcProdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxCountyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxExemptFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxExemptNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxGeoCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="triggerCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posPassedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="payment" type="{http://domain.agreement.hs.sears.com}SettlementPayment"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capPrdPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capPrdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capCvrMths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capGrossAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capAssocDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capNetAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capTotalAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capCvrCreditAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capCvrCreditTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capDeductAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capOtherDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capCashDepAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="onlinePostFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manualLeadFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sywrMemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "SettlementRequest")

public class SettlementRequest
    extends ABaseRequest
{

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
    protected long contactNo;
    protected long custNo;
    @XmlElement(required = true, nillable = true)
    protected String cvgNoDollarInd;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableSettlementItem items;
    @XmlElement(required = true, nillable = true)
    protected String lastModifiedDate;
    @XmlElement(required = true, nillable = true)
    protected String leadAssignFl;
    protected int leadNo;
    @XmlElement(required = true, nillable = true)
    protected String leadQueueNameCd;
    @XmlElement(required = true, nillable = true)
    protected String leadStatusCd;
    protected int locNo;
    @XmlElement(required = true, nillable = true)
    protected String posFl;
    @XmlElement(required = true, nillable = true)
    protected String prdNameCd;
    @XmlElement(required = true, nillable = true)
    protected String prtCertifInd;
    @XmlElement(required = true, nillable = true)
    protected String purchaseDate;
    @XmlElement(required = true, nillable = true)
    protected String queueUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String recEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String recUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String sellEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String spokeTo;
    @XmlElement(required = true, nillable = true)
    protected String svcProdTypeCd;
    @XmlElement(required = true, nillable = true)
    protected String taxCountyCd;
    @XmlElement(required = true, nillable = true)
    protected String taxExemptFl;
    @XmlElement(required = true, nillable = true)
    protected String taxExemptNo;
    @XmlElement(required = true, nillable = true)
    protected String taxGeoCd;
    @XmlElement(required = true, nillable = true)
    protected String triggerCd;
    @XmlElement(required = true, nillable = true)
    protected String jurCd;
    @XmlElement(required = true, nillable = true)
    protected String sellUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String posPassedDate;
    protected double taxRate;
    @XmlElement(required = true, nillable = true)
    protected List<SettlementPayment> payment;
    protected int sessionId;
    @XmlElement(required = true, nillable = true)
    protected String capStartDate;
    @XmlElement(required = true, nillable = true)
    protected String capExpireDate;
    @XmlElement(required = true, nillable = true)
    protected String capPrdPlanCd;
    @XmlElement(required = true, nillable = true)
    protected String capPrdTypeCd;
    protected int capCvrMths;
    protected double capGrossAmt; 
    protected double capDiscAmt;
    protected double capAssocDiscAmt;
    protected double capNetAmt;
    protected double capTaxAmt;
    protected double capTotalAmt;
    protected double capCvrCreditAmt;
    protected double capCvrCreditTaxAmt;
    protected double capDeductAmt;
    protected double capOtherDiscAmt;
    protected double capCashDepAmt;
    @XmlElement(required = true, nillable = true)
    protected String onlinePostFl;
    @XmlElement(required = true, nillable = true)
    protected String manualLeadFl;
    @XmlElement(required = true, nillable = true)
    protected String sywrMemID;
    @XmlElement(required = false, nillable = true)
    protected String capsywrUsePoints;
    @XmlElement(required = false, nillable = true)
    protected String capsywrUseDollars;

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
     */
    public long getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     */
    public void setContactNo(long value) {
        this.contactNo = value;
    }

    /**
     * Gets the value of the custNo property.
     * 
     */
    public long getCustNo() {
        return custNo;
    }

    /**
     * Sets the value of the custNo property.
     * 
     */
    public void setCustNo(long value) {
        this.custNo = value;
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
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableSettlementItem }
     *     
     */
    public ArrayOfTns6NillableSettlementItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableSettlementItem }
     *     
     */
    public void setItems(ArrayOfTns6NillableSettlementItem value) {
        this.items = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(String value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the leadAssignFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadAssignFl() {
        return leadAssignFl;
    }

    /**
     * Sets the value of the leadAssignFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadAssignFl(String value) {
        this.leadAssignFl = value;
    }

    /**
     * Gets the value of the leadNo property.
     * 
     */
    public int getLeadNo() {
        return leadNo;
    }

    /**
     * Sets the value of the leadNo property.
     * 
     */
    public void setLeadNo(int value) {
        this.leadNo = value;
    }

    /**
     * Gets the value of the leadQueueNameCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadQueueNameCd() {
        return leadQueueNameCd;
    }

    /**
     * Sets the value of the leadQueueNameCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadQueueNameCd(String value) {
        this.leadQueueNameCd = value;
    }

    /**
     * Gets the value of the leadStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadStatusCd() {
        return leadStatusCd;
    }

    /**
     * Sets the value of the leadStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadStatusCd(String value) {
        this.leadStatusCd = value;
    }

    /**
     * Gets the value of the locNo property.
     * 
     */
    public int getLocNo() {
        return locNo;
    }

    /**
     * Sets the value of the locNo property.
     * 
     */
    public void setLocNo(int value) {
        this.locNo = value;
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
     * Gets the value of the prdNameCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNameCd() {
        return prdNameCd;
    }

    /**
     * Sets the value of the prdNameCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNameCd(String value) {
        this.prdNameCd = value;
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
     * Gets the value of the queueUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueUnitNo() {
        return queueUnitNo;
    }

    /**
     * Sets the value of the queueUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueUnitNo(String value) {
        this.queueUnitNo = value;
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
     * Gets the value of the spokeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokeTo() {
        return spokeTo;
    }

    /**
     * Sets the value of the spokeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokeTo(String value) {
        this.spokeTo = value;
    }

    /**
     * Gets the value of the svcProdTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProdTypeCd() {
        return svcProdTypeCd;
    }

    /**
     * Sets the value of the svcProdTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProdTypeCd(String value) {
        this.svcProdTypeCd = value;
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
     * Gets the value of the taxExemptFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptFl() {
        return taxExemptFl;
    }

    /**
     * Sets the value of the taxExemptFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptFl(String value) {
        this.taxExemptFl = value;
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
     * Gets the value of the jurCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurCd() {
        return jurCd;
    }

    /**
     * Sets the value of the jurCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurCd(String value) {
        this.jurCd = value;
    }

    /**
     * Gets the value of the sellUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellUnitNo() {
        return sellUnitNo;
    }

    /**
     * Sets the value of the sellUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellUnitNo(String value) {
        this.sellUnitNo = value;
    }

    /**
     * Gets the value of the posPassedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosPassedDate() {
        return posPassedDate;
    }

    /**
     * Sets the value of the posPassedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosPassedDate(String value) {
        this.posPassedDate = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPayment }
     *     
     */
    public List<SettlementPayment> getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPayment }
     *     
     */
    public void setPayment(List<SettlementPayment> value) {
        this.payment = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public int getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(int value) {
        this.sessionId = value;
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
     * Gets the value of the capCvrMths property.
     * 
     */
    public int getCapCvrMths() {
        return capCvrMths;
    }

    /**
     * Sets the value of the capCvrMths property.
     * 
     */
    public void setCapCvrMths(int value) {
        this.capCvrMths = value;
    }

    /**
     * Gets the value of the capGrossAmt property.
     * 
     */
    public double getCapGrossAmt() {
        return capGrossAmt;
    }

    /**
     * Sets the value of the capGrossAmt property.
     * 
     */
    public void setCapGrossAmt(double value) {
        this.capGrossAmt = value;
    }

    /**
     * Gets the value of the capDiscAmt property.
     * 
     */
    public double getCapDiscAmt() {
        return capDiscAmt;
    }

    /**
     * Sets the value of the capDiscAmt property.
     * 
     */
    public void setCapDiscAmt(double value) {
        this.capDiscAmt = value;
    }

    /**
     * Gets the value of the capAssocDiscAmt property.
     * 
     */
    public double getCapAssocDiscAmt() {
        return capAssocDiscAmt;
    }

    /**
     * Sets the value of the capAssocDiscAmt property.
     * 
     */
    public void setCapAssocDiscAmt(double value) {
        this.capAssocDiscAmt = value;
    }

    /**
     * Gets the value of the capNetAmt property.
     * 
     */
    public double getCapNetAmt() {
        return capNetAmt;
    }

    /**
     * Sets the value of the capNetAmt property.
     * 
     */
    public void setCapNetAmt(double value) {
        this.capNetAmt = value;
    }

    /**
     * Gets the value of the capTaxAmt property.
     * 
     */
    public double getCapTaxAmt() {
        return capTaxAmt;
    }

    /**
     * Sets the value of the capTaxAmt property.
     * 
     */
    public void setCapTaxAmt(double value) {
        this.capTaxAmt = value;
    }

    /**
     * Gets the value of the capTotalAmt property.
     * 
     */
    public double getCapTotalAmt() {
        return capTotalAmt;
    }

    /**
     * Sets the value of the capTotalAmt property.
     * 
     */
    public void setCapTotalAmt(double value) {
        this.capTotalAmt = value;
    }

    /**
     * Gets the value of the capCvrCreditAmt property.
     * 
     */
    public double getCapCvrCreditAmt() {
        return capCvrCreditAmt;
    }

    /**
     * Sets the value of the capCvrCreditAmt property.
     * 
     */
    public void setCapCvrCreditAmt(double value) {
        this.capCvrCreditAmt = value;
    }

    /**
     * Gets the value of the capCvrCreditTaxAmt property.
     * 
     */
    public double getCapCvrCreditTaxAmt() {
        return capCvrCreditTaxAmt;
    }

    /**
     * Sets the value of the capCvrCreditTaxAmt property.
     * 
     */
    public void setCapCvrCreditTaxAmt(double value) {
        this.capCvrCreditTaxAmt = value;
    }

    /**
     * Gets the value of the capDeductAmt property.
     * 
     */
    public double getCapDeductAmt() {
        return capDeductAmt;
    }

    /**
     * Sets the value of the capDeductAmt property.
     * 
     */
    public void setCapDeductAmt(double value) {
        this.capDeductAmt = value;
    }

    /**
     * Gets the value of the capOtherDiscAmt property.
     * 
     */
    public double getCapOtherDiscAmt() {
        return capOtherDiscAmt;
    }

    /**
     * Sets the value of the capOtherDiscAmt property.
     * 
     */
    public void setCapOtherDiscAmt(double value) {
        this.capOtherDiscAmt = value;
    }

    /**
     * Gets the value of the capCashDepAmt property.
     * 
     */
    public double getCapCashDepAmt() {
        return capCashDepAmt;
    }

    /**
     * Sets the value of the capCashDepAmt property.
     * 
     */
    public void setCapCashDepAmt(double value) {
        this.capCashDepAmt = value;
    }

    /**
     * Gets the value of the onlinePostFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlinePostFl() {
        return onlinePostFl;
    }

    /**
     * Sets the value of the onlinePostFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlinePostFl(String value) {
        this.onlinePostFl = value;
    }

    /**
     * Gets the value of the manualLeadFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualLeadFl() {
        return manualLeadFl;
    }

    /**
     * Sets the value of the manualLeadFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualLeadFl(String value) {
        this.manualLeadFl = value;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SettlementRequest [comment1=");
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
		builder.append(", custNo=");
		builder.append(custNo);
		builder.append(", cvgNoDollarInd=");
		builder.append(cvgNoDollarInd);
		builder.append(", items=");
		builder.append(items);
		builder.append(", lastModifiedDate=");
		builder.append(lastModifiedDate);
		builder.append(", leadAssignFl=");
		builder.append(leadAssignFl);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", leadQueueNameCd=");
		builder.append(leadQueueNameCd);
		builder.append(", leadStatusCd=");
		builder.append(leadStatusCd);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", prdNameCd=");
		builder.append(prdNameCd);
		builder.append(", prtCertifInd=");
		builder.append(prtCertifInd);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", queueUnitNo=");
		builder.append(queueUnitNo);
		builder.append(", recEmpNo=");
		builder.append(recEmpNo);
		builder.append(", recUnitNo=");
		builder.append(recUnitNo);
		builder.append(", sellEmpNo=");
		builder.append(sellEmpNo);
		builder.append(", spokeTo=");
		builder.append(spokeTo);
		builder.append(", svcProdTypeCd=");
		builder.append(svcProdTypeCd);
		builder.append(", taxCountyCd=");
		builder.append(taxCountyCd);
		builder.append(", taxExemptFl=");
		builder.append(taxExemptFl);
		builder.append(", taxExemptNo=");
		builder.append(taxExemptNo);
		builder.append(", taxGeoCd=");
		builder.append(taxGeoCd);
		builder.append(", triggerCd=");
		builder.append(triggerCd);
		builder.append(", jurCd=");
		builder.append(jurCd);
		builder.append(", sellUnitNo=");
		builder.append(sellUnitNo);
		builder.append(", posPassedDate=");
		builder.append(posPassedDate);
		builder.append(", taxRate=");
		builder.append(taxRate);
		builder.append(", payment=");
		builder.append(payment);
		builder.append(", sessionId=");
		builder.append(sessionId);
		builder.append(", capStartDate=");
		builder.append(capStartDate);
		builder.append(", capExpireDate=");
		builder.append(capExpireDate);
		builder.append(", capPrdPlanCd=");
		builder.append(capPrdPlanCd);
		builder.append(", capPrdTypeCd=");
		builder.append(capPrdTypeCd);
		builder.append(", capCvrMths=");
		builder.append(capCvrMths);
		builder.append(", capGrossAmt=");
		builder.append(capGrossAmt);
		builder.append(", capDiscAmt=");
		builder.append(capDiscAmt);
		builder.append(", capAssocDiscAmt=");
		builder.append(capAssocDiscAmt);
		builder.append(", capNetAmt=");
		builder.append(capNetAmt);
		builder.append(", capTaxAmt=");
		builder.append(capTaxAmt);
		builder.append(", capTotalAmt=");
		builder.append(capTotalAmt);
		builder.append(", capCvrCreditAmt=");
		builder.append(capCvrCreditAmt);
		builder.append(", capCvrCreditTaxAmt=");
		builder.append(capCvrCreditTaxAmt);
		builder.append(", capDeductAmt=");
		builder.append(capDeductAmt);
		builder.append(", capOtherDiscAmt=");
		builder.append(capOtherDiscAmt);
		builder.append(", capCashDepAmt=");
		builder.append(capCashDepAmt);
		builder.append(", onlinePostFl=");
		builder.append(onlinePostFl);
		builder.append(", manualLeadFl=");
		builder.append(manualLeadFl);
		builder.append(", sywrMemID=");
		builder.append(sywrMemID);
		builder.append(", capsywrUsePoints=");
		builder.append(capsywrUsePoints);
		builder.append(", capsywrUseDollars=");
		builder.append(capsywrUseDollars);
		builder.append("]");
		return builder.toString();
	}
    
    

}
