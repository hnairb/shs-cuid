
package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.QueueCancelPayment;
import com.searshc.hs.agreement.agreementservice.domain.RefundSYWRDetail;


/**
 * <p>Java class for QueueCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueCancelRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelTs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "QueueCancelRequest")

public class QueueCancelRequest
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String agmtSfx;
    @XmlElement(required = true, nillable = true)
    protected String cancelTs;
    @XmlElement(required = true, nillable = true)
    protected String custNum;
    @XmlElement(required = true, nillable = true)
    protected String action;
    @XmlElement(required = true, nillable = true)
    protected String posFl;
    @XmlElement(required = true, nillable = true)
    protected String unitNo;
    @XmlElement(required = true, nillable = true)
    protected String refundTypeCd;
    @XmlElement(required = true, nillable = true)
    protected String sywrMemberId;
    @XmlElement(required = false, nillable = true)
    protected List<RefundSYWRDetail> refundSYWRDetail;
    @XmlElement(required = false, nillable = true)
    protected List<QueueCancelPayment> refundPayment;


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
     * Gets the value of the cancelTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelTs() {
        return cancelTs;
    }

    /**
     * Sets the value of the cancelTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelTs(String value) {
        this.cancelTs = value;
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
    

	public String getRefundTypeCd() {
		return refundTypeCd;
	}

	public void setRefundTypeCd(String refundTypeCd) {
		this.refundTypeCd = refundTypeCd;
	}

	public String getSywrMemberId() {
		return sywrMemberId;
	}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}
		

	public List<RefundSYWRDetail> getRefundSYWRDetail() {
		return refundSYWRDetail;
	}

	public void setRefundSYWRDetail(List<RefundSYWRDetail> refundSYWRDetail) {
		this.refundSYWRDetail = refundSYWRDetail;
	}

	public List<QueueCancelPayment> getRefundPayment() {
		return refundPayment;
	}

	public void setRefundPayment(List<QueueCancelPayment> refundPayment) {
		this.refundPayment = refundPayment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancelRequest [agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", cancelTs=");
		builder.append(cancelTs);
		builder.append(", custNum=");
		builder.append(custNum);
		builder.append(", action=");
		builder.append(action);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", unitNo=");
		builder.append(unitNo);
		builder.append(", refundTypeCd=");
		builder.append(refundTypeCd);
		builder.append(", sywrMemberId=");
		builder.append(sywrMemberId);
		builder.append(", refundSYWRDetail=");
		builder.append(refundSYWRDetail);
		builder.append(", refundPayment=");
		builder.append(refundPayment);
		builder.append("]");
		return builder.toString();
	}
    

}
