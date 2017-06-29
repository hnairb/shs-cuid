
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.CancelPayment;
import com.searshc.hs.agreement.agreementservice.domain.RefundSYWRDetail;


/**
 * <p>Java class for CancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="acctExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actCoverCreditAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actCoverCreditTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actRefundAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreePosFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelPosFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverCreditAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerTs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCnt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_CancelItem"/>
 *         &lt;element name="netRefundAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonRefundAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reqDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reqEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reqUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reqBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "CancelRequest")

public class CancelRequest
    extends ABaseRequest
{

   
	@XmlElement(required = true, nillable = true)
    protected String actCoverCreditAmt;
    @XmlElement(required = true, nillable = true)
    protected String actCoverCreditTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String action;
    @XmlElement(required = true, nillable = true)
    protected String actRefundAmt;
    @XmlElement(required = true, nillable = true)
    protected String actTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String agmtSfx;
    @XmlElement(required = true, nillable = true)
    protected String agreePosFl;
    @XmlElement(required = true, nillable = true)
    protected String batchNo;
    @XmlElement(required = true, nillable = true)
    protected String cancelPosFl;
    @XmlElement(required = true, nillable = true)
    protected String coverCreditAmt;
    @XmlElement(required = true, nillable = true)
    protected String customerTs;
    @XmlElement(required = true, nillable = true)
    protected String custNum;
    @XmlElement(required = true, nillable = true)
    protected String effDate;
    @XmlElement(required = true, nillable = true)
    protected String itemCnt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableCancelItem items;
    @XmlElement(required = true, nillable = true)
    protected String nonRefundAmt;
    @XmlElement(required = true, nillable = true)
    protected String phoneNo;
    @XmlElement(required = true, nillable = true)
    protected String productType;
    @XmlElement(required = true, nillable = true)
    protected String reasonCd;
    @XmlElement(required = true, nillable = true)
    protected String refundMethodCd;
    @XmlElement(required = true, nillable = true)
    protected String refundType;
    @XmlElement(required = true, nillable = true)
    protected String reqDate;
    @XmlElement(required = true, nillable = true)
    protected String reqEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String reqUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String reqBy;
    @XmlElement(required = true, nillable = true)
    protected String comments;
    @XmlElement(required = true, nillable = true)
    protected String recEmpNo;
    @XmlElement(required = true, nillable = true)
    protected String recUnitNo;
    @XmlElement(required = true, nillable = true)
    protected List<CancelPayment> cancelPayment;
    @XmlElement(required = true, nillable = true)
    protected List<RefundSYWRDetail> refundSYWRDetail;
    @XmlElement(required = false, nillable = true)
    protected String sywrMemberId;


    /**
     * Gets the value of the actCoverCreditAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCoverCreditAmt() {
        return actCoverCreditAmt;
    }

    /**
     * Sets the value of the actCoverCreditAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCoverCreditAmt(String value) {
        this.actCoverCreditAmt = value;
    }

    /**
     * Gets the value of the actCoverCreditTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCoverCreditTaxAmt() {
        return actCoverCreditTaxAmt;
    }

    /**
     * Sets the value of the actCoverCreditTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCoverCreditTaxAmt(String value) {
        this.actCoverCreditTaxAmt = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actRefundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActRefundAmt() {
        return actRefundAmt;
    }

    /**
     * Sets the value of the actRefundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActRefundAmt(String value) {
        this.actRefundAmt = value;
    }

    /**
     * Gets the value of the actTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActTaxAmt() {
        return actTaxAmt;
    }

    /**
     * Sets the value of the actTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActTaxAmt(String value) {
        this.actTaxAmt = value;
    }

    /**
     * Gets the value of the agmtSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtSfx() {
        return agmtSfx;
    }

    /**
     * Sets the value of the agmtSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtSfx(String value) {
        this.agmtSfx = value;
    }

    /**
     * Gets the value of the agreePosFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreePosFl() {
        return agreePosFl;
    }

    /**
     * Sets the value of the agreePosFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreePosFl(String value) {
        this.agreePosFl = value;
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
     * Gets the value of the cancelPosFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPosFl() {
        return cancelPosFl;
    }

    /**
     * Sets the value of the cancelPosFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPosFl(String value) {
        this.cancelPosFl = value;
    }

    /**
     * Gets the value of the coverCreditAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverCreditAmt() {
        return coverCreditAmt;
    }

    /**
     * Sets the value of the coverCreditAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverCreditAmt(String value) {
        this.coverCreditAmt = value;
    }

    /**
     * Gets the value of the customerTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTs() {
        return customerTs;
    }

    /**
     * Sets the value of the customerTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTs(String value) {
        this.customerTs = value;
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
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDate(String value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the itemCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCnt() {
        return itemCnt;
    }

    /**
     * Sets the value of the itemCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCnt(String value) {
        this.itemCnt = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableCancelItem }
     *     
     */
    public ArrayOfTns6NillableCancelItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableCancelItem }
     *     
     */
    public void setItems(ArrayOfTns6NillableCancelItem value) {
        this.items = value;
    }

    

    /**
     * Gets the value of the nonRefundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRefundAmt() {
        return nonRefundAmt;
    }

    /**
     * Sets the value of the nonRefundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRefundAmt(String value) {
        this.nonRefundAmt = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the reasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCd() {
        return reasonCd;
    }

    /**
     * Sets the value of the reasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCd(String value) {
        this.reasonCd = value;
    }

    /**
     * Gets the value of the refundMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundMethodCd() {
        return refundMethodCd;
    }

    /**
     * Sets the value of the refundMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundMethodCd(String value) {
        this.refundMethodCd = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the reqDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDate() {
        return reqDate;
    }

    /**
     * Sets the value of the reqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDate(String value) {
        this.reqDate = value;
    }

    /**
     * Gets the value of the reqEmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqEmpNo() {
        return reqEmpNo;
    }

    /**
     * Sets the value of the reqEmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqEmpNo(String value) {
        this.reqEmpNo = value;
    }

    /**
     * Gets the value of the reqUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqUnitNo() {
        return reqUnitNo;
    }

    /**
     * Sets the value of the reqUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqUnitNo(String value) {
        this.reqUnitNo = value;
    }

    /**
     * Gets the value of the reqBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqBy() {
        return reqBy;
    }

    /**
     * Sets the value of the reqBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqBy(String value) {
        this.reqBy = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
    
    

	public List<CancelPayment> getCancelPayment() {
		return cancelPayment;
	}

	public void setCancelPayment(List<CancelPayment> cancelPayment) {
		this.cancelPayment = cancelPayment;
	}
	
	
	

	public List<RefundSYWRDetail> getRefundSYWRDetail() {
		return refundSYWRDetail;
	}

	public void setRefundSYWRDetail(List<RefundSYWRDetail> refundSYWRDetail) {
		this.refundSYWRDetail = refundSYWRDetail;
	}
	
	 public String getSywrMemberId() {
			return sywrMemberId;
		}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CancelRequest [actCoverCreditAmt=");
		builder.append(actCoverCreditAmt);
		builder.append(", actCoverCreditTaxAmt=");
		builder.append(actCoverCreditTaxAmt);
		builder.append(", action=");
		builder.append(action);
		builder.append(", actRefundAmt=");
		builder.append(actRefundAmt);
		builder.append(", actTaxAmt=");
		builder.append(actTaxAmt);
		builder.append(", agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", agreePosFl=");
		builder.append(agreePosFl);
		builder.append(", batchNo=");
		builder.append(batchNo);
		builder.append(", cancelPosFl=");
		builder.append(cancelPosFl);
		builder.append(", coverCreditAmt=");
		builder.append(coverCreditAmt);
		builder.append(", customerTs=");
		builder.append(customerTs);
		builder.append(", custNum=");
		builder.append(custNum);
		builder.append(", effDate=");
		builder.append(effDate);
		builder.append(", itemCnt=");
		builder.append(itemCnt);
		builder.append(", items=");
		builder.append(items);
		builder.append(", nonRefundAmt=");
		builder.append(nonRefundAmt);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", productType=");
		builder.append(productType);
		builder.append(", reasonCd=");
		builder.append(reasonCd);
		builder.append(", refundMethodCd=");
		builder.append(refundMethodCd);
		builder.append(", refundType=");
		builder.append(refundType);
		builder.append(", reqDate=");
		builder.append(reqDate);
		builder.append(", reqEmpNo=");
		builder.append(reqEmpNo);
		builder.append(", reqUnitNo=");
		builder.append(reqUnitNo);
		builder.append(", reqBy=");
		builder.append(reqBy);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", recEmpNo=");
		builder.append(recEmpNo);
		builder.append(", recUnitNo=");
		builder.append(recUnitNo);
		builder.append(", cancelPayment=");
		builder.append(cancelPayment);
		builder.append(", refundSYWRDetail=");
		builder.append(refundSYWRDetail);
		builder.append(", sywrMemberId=");
		builder.append(sywrMemberId);
		builder.append("]");
		return builder.toString();
	}
    
    

}
