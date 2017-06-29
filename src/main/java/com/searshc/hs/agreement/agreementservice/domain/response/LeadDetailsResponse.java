
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.Customer;
import com.searshc.hs.agreement.agreementservice.domain.request.ArrayOfTns6NillableItemDetail;



/**
 * <p>Java class for LeadDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="associateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coverageEffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageExpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageGrossCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coverageNetCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coveragePurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageTaxCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coverageTotalCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="customer" type="{http://domain.agreement.hs.sears.com}Customer"/>
 *         &lt;element name="employeeDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_ItemDetail"/>
 *         &lt;element name="otherDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="productNameCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custLocSuffix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadContactNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadCustNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="replyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadCreationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterSentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="leadStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "LeadDetailsResponse")

public class LeadDetailsResponse
    extends ABaseResponse
{

    @XmlElement(required = true, nillable = true)
    protected String associateId;
    protected double coverageDiscount;
    @XmlElement(required = true, nillable = true)
    protected String coverageEffDate;
    @XmlElement(required = true, nillable = true)
    protected String coverageExpDate;
    protected double coverageGrossCharge;
    protected double coverageNetCharge;
    @XmlElement(required = true, nillable = true)
    protected String coveragePurchaseDate;
    protected double coverageTaxCharge;
    protected double coverageTotalCharge;
    @XmlElement(required = true, nillable = true)
    protected Customer customer;
    protected double employeeDiscount;
    @XmlElement(required = true, nillable = true)
    protected String facilityId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableItemDetail items;
    protected double otherDiscount;
    @XmlElement(required = true, nillable = true)
    protected String productNameCd;
    @XmlElement(required = true, nillable = true)
    protected String productPlanCd;
    @XmlElement(required = true, nillable = true)
    protected String productTypeCd;
    protected int custLocSuffix;
    protected int leadContactNo;
    protected long leadCustNo;
    protected int leadNo;
    @XmlElement(required = true, nillable = true)
    protected String replyDate;
    @XmlElement(required = true, nillable = true)
    protected String productName;
    @XmlElement(required = true, nillable = true)
    protected String leadCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String letterSentDate;
    protected double coverageTotalDiscount;
    @XmlElement(required = true, nillable = true)
    protected String leadStatusCd;

    /**
     * Gets the value of the associateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateId() {
        return associateId;
    }

    /**
     * Sets the value of the associateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateId(String value) {
        this.associateId = value;
    }

    /**
     * Gets the value of the coverageDiscount property.
     * 
     */
    public double getCoverageDiscount() {
        return coverageDiscount;
    }

    /**
     * Sets the value of the coverageDiscount property.
     * 
     */
    public void setCoverageDiscount(double value) {
        this.coverageDiscount = value;
    }

    /**
     * Gets the value of the coverageEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageEffDate() {
        return coverageEffDate;
    }

    /**
     * Sets the value of the coverageEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageEffDate(String value) {
        this.coverageEffDate = value;
    }

    /**
     * Gets the value of the coverageExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageExpDate() {
        return coverageExpDate;
    }

    /**
     * Sets the value of the coverageExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageExpDate(String value) {
        this.coverageExpDate = value;
    }

    /**
     * Gets the value of the coverageGrossCharge property.
     * 
     */
    public double getCoverageGrossCharge() {
        return coverageGrossCharge;
    }

    /**
     * Sets the value of the coverageGrossCharge property.
     * 
     */
    public void setCoverageGrossCharge(double value) {
        this.coverageGrossCharge = value;
    }

    /**
     * Gets the value of the coverageNetCharge property.
     * 
     */
    public double getCoverageNetCharge() {
        return coverageNetCharge;
    }

    /**
     * Sets the value of the coverageNetCharge property.
     * 
     */
    public void setCoverageNetCharge(double value) {
        this.coverageNetCharge = value;
    }

    /**
     * Gets the value of the coveragePurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePurchaseDate() {
        return coveragePurchaseDate;
    }

    /**
     * Sets the value of the coveragePurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePurchaseDate(String value) {
        this.coveragePurchaseDate = value;
    }

    /**
     * Gets the value of the coverageTaxCharge property.
     * 
     */
    public double getCoverageTaxCharge() {
        return coverageTaxCharge;
    }

    /**
     * Sets the value of the coverageTaxCharge property.
     * 
     */
    public void setCoverageTaxCharge(double value) {
        this.coverageTaxCharge = value;
    }

    /**
     * Gets the value of the coverageTotalCharge property.
     * 
     */
    public double getCoverageTotalCharge() {
        return coverageTotalCharge;
    }

    /**
     * Sets the value of the coverageTotalCharge property.
     * 
     */
    public void setCoverageTotalCharge(double value) {
        this.coverageTotalCharge = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the employeeDiscount property.
     * 
     */
    public double getEmployeeDiscount() {
        return employeeDiscount;
    }

    /**
     * Sets the value of the employeeDiscount property.
     * 
     */
    public void setEmployeeDiscount(double value) {
        this.employeeDiscount = value;
    }

    /**
     * Gets the value of the facilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityId() {
        return facilityId;
    }

    /**
     * Sets the value of the facilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityId(String value) {
        this.facilityId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableItemDetail }
     *     
     */
    public ArrayOfTns6NillableItemDetail getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableItemDetail }
     *     
     */
    public void setItems(ArrayOfTns6NillableItemDetail value) {
        this.items = value;
    }

    /**
     * Gets the value of the otherDiscount property.
     * 
     */
    public double getOtherDiscount() {
        return otherDiscount;
    }

    /**
     * Sets the value of the otherDiscount property.
     * 
     */
    public void setOtherDiscount(double value) {
        this.otherDiscount = value;
    }

    /**
     * Gets the value of the productNameCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNameCd() {
        return productNameCd;
    }

    /**
     * Sets the value of the productNameCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNameCd(String value) {
        this.productNameCd = value;
    }

    /**
     * Gets the value of the productPlanCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPlanCd() {
        return productPlanCd;
    }

    /**
     * Sets the value of the productPlanCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPlanCd(String value) {
        this.productPlanCd = value;
    }

    /**
     * Gets the value of the productTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCd() {
        return productTypeCd;
    }

    /**
     * Sets the value of the productTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCd(String value) {
        this.productTypeCd = value;
    }

    /**
     * Gets the value of the custLocSuffix property.
     * 
     */
    public int getCustLocSuffix() {
        return custLocSuffix;
    }

    /**
     * Sets the value of the custLocSuffix property.
     * 
     */
    public void setCustLocSuffix(int value) {
        this.custLocSuffix = value;
    }

    /**
     * Gets the value of the leadContactNo property.
     * 
     */
    public int getLeadContactNo() {
        return leadContactNo;
    }

    /**
     * Sets the value of the leadContactNo property.
     * 
     */
    public void setLeadContactNo(int value) {
        this.leadContactNo = value;
    }

    /**
     * Gets the value of the leadCustNo property.
     * 
     */
    public long getLeadCustNo() {
        return leadCustNo;
    }

    /**
     * Sets the value of the leadCustNo property.
     * 
     */
    public void setLeadCustNo(long value) {
        this.leadCustNo = value;
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
     * Gets the value of the replyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyDate() {
        return replyDate;
    }

    /**
     * Sets the value of the replyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyDate(String value) {
        this.replyDate = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the leadCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadCreationDate() {
        return leadCreationDate;
    }

    /**
     * Sets the value of the leadCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadCreationDate(String value) {
        this.leadCreationDate = value;
    }

    /**
     * Gets the value of the letterSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterSentDate() {
        return letterSentDate;
    }

    /**
     * Sets the value of the letterSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterSentDate(String value) {
        this.letterSentDate = value;
    }

    /**
     * Gets the value of the coverageTotalDiscount property.
     * 
     */
    public double getCoverageTotalDiscount() {
        return coverageTotalDiscount;
    }

    /**
     * Sets the value of the coverageTotalDiscount property.
     * 
     */
    public void setCoverageTotalDiscount(double value) {
        this.coverageTotalDiscount = value;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadDetailsResponse [associateId=");
		builder.append(associateId);
		builder.append(", coverageDiscount=");
		builder.append(coverageDiscount);
		builder.append(", coverageEffDate=");
		builder.append(coverageEffDate);
		builder.append(", coverageExpDate=");
		builder.append(coverageExpDate);
		builder.append(", coverageGrossCharge=");
		builder.append(coverageGrossCharge);
		builder.append(", coverageNetCharge=");
		builder.append(coverageNetCharge);
		builder.append(", coveragePurchaseDate=");
		builder.append(coveragePurchaseDate);
		builder.append(", coverageTaxCharge=");
		builder.append(coverageTaxCharge);
		builder.append(", coverageTotalCharge=");
		builder.append(coverageTotalCharge);
		builder.append(", customer=");
		builder.append(customer);
		builder.append(", employeeDiscount=");
		builder.append(employeeDiscount);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", items=");
		builder.append(items);
		builder.append(", otherDiscount=");
		builder.append(otherDiscount);
		builder.append(", productNameCd=");
		builder.append(productNameCd);
		builder.append(", productPlanCd=");
		builder.append(productPlanCd);
		builder.append(", productTypeCd=");
		builder.append(productTypeCd);
		builder.append(", custLocSuffix=");
		builder.append(custLocSuffix);
		builder.append(", leadContactNo=");
		builder.append(leadContactNo);
		builder.append(", leadCustNo=");
		builder.append(leadCustNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", replyDate=");
		builder.append(replyDate);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", leadCreationDate=");
		builder.append(leadCreationDate);
		builder.append(", letterSentDate=");
		builder.append(letterSentDate);
		builder.append(", coverageTotalDiscount=");
		builder.append(coverageTotalDiscount);
		builder.append(", leadStatusCd=");
		builder.append(leadStatusCd);
		builder.append("]");
		return builder.toString();
	}

    
}
