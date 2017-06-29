package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AddItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AddItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assocDiscAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvrCreditAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvrMths" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deductAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discOverFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inOutInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mdseCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obligorCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prdPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcLoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvrCreditTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cashDepAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AddItem", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItem", propOrder = { "assocDiscAmt", "cvrCreditAmt",
		"cvrMths", "deductAmt", "discAmt", "discOverFl", "expireDate",
		"grossAmt", "inOutInd", "itemSfx", "mdseCd", "netAmt", "obligorCd",
		"prdPlanCd", "svcLoc", "startDate", "taxAmt", "taxInd", "totalAmt",
		"updateInd", "cvrCreditTaxAmt", "agmtSfx", "cashDepAmt", "capFl",
		"sywrUsePoints", "sywrUseDollars" })
public class AddItem {

	@XmlElement(required = true, nillable = true)
	protected String assocDiscAmt;
	@XmlElement(required = true, nillable = true)
	protected String cvrCreditAmt;
	@XmlElement(required = true, nillable = true)
	protected String cvrMths;
	@XmlElement(required = true, nillable = true)
	protected String deductAmt;
	@XmlElement(required = true, nillable = true)
	protected String discAmt;
	@XmlElement(required = true, nillable = true)
	protected String discOverFl;
	@XmlElement(required = true, nillable = true)
	protected String expireDate;
	@XmlElement(required = true, nillable = true)
	protected String grossAmt;
	@XmlElement(required = true, nillable = true)
	protected String inOutInd;
	@XmlElement(required = true, nillable = true)
	protected String itemSfx;
	@XmlElement(required = true, nillable = true)
	protected String mdseCd;
	@XmlElement(required = true, nillable = true)
	protected String netAmt;
	@XmlElement(required = true, nillable = true)
	protected String obligorCd;
	@XmlElement(required = true, nillable = true)
	protected String prdPlanCd;
	@XmlElement(required = true, nillable = true)
	protected String svcLoc;
	@XmlElement(required = true, nillable = true)
	protected String startDate;
	@XmlElement(required = true, nillable = true)
	protected String taxAmt;
	@XmlElement(required = true, nillable = true)
	protected String taxInd;
	@XmlElement(required = true, nillable = true)
	protected String totalAmt;
	@XmlElement(required = true, nillable = true)
	protected String updateInd;
	@XmlElement(required = true, nillable = true)
	protected String cvrCreditTaxAmt;
	@XmlElement(required = true, nillable = true)
	protected String agmtSfx;
	@XmlElement(required = true, nillable = true)
	protected String cashDepAmt;
	@XmlElement(required = true, nillable = true)
	protected String capFl;
	@XmlElement(required = true, nillable = true)
	protected String sywrUsePoints;
	@XmlElement(required = true, nillable = true)
	protected String sywrUseDollars;

	/**
	 * Gets the value of the assocDiscAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAssocDiscAmt() {
		return assocDiscAmt;
	}

	/**
	 * Sets the value of the assocDiscAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAssocDiscAmt(String value) {
		this.assocDiscAmt = value;
	}

	/**
	 * Gets the value of the cvrCreditAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCvrCreditAmt() {
		return cvrCreditAmt;
	}

	/**
	 * Sets the value of the cvrCreditAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCvrCreditAmt(String value) {
		this.cvrCreditAmt = value;
	}

	/**
	 * Gets the value of the cvrMths property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCvrMths() {
		return cvrMths;
	}

	/**
	 * Sets the value of the cvrMths property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCvrMths(String value) {
		this.cvrMths = value;
	}

	/**
	 * Gets the value of the deductAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductAmt() {
		return deductAmt;
	}

	/**
	 * Sets the value of the deductAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeductAmt(String value) {
		this.deductAmt = value;
	}

	/**
	 * Gets the value of the discAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDiscAmt() {
		return discAmt;
	}

	/**
	 * Sets the value of the discAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDiscAmt(String value) {
		this.discAmt = value;
	}

	/**
	 * Gets the value of the discOverFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDiscOverFl() {
		return discOverFl;
	}

	/**
	 * Sets the value of the discOverFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDiscOverFl(String value) {
		this.discOverFl = value;
	}

	/**
	 * Gets the value of the expireDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpireDate() {
		return expireDate;
	}

	/**
	 * Sets the value of the expireDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpireDate(String value) {
		this.expireDate = value;
	}

	/**
	 * Gets the value of the grossAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGrossAmt() {
		return grossAmt;
	}

	/**
	 * Sets the value of the grossAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGrossAmt(String value) {
		this.grossAmt = value;
	}

	/**
	 * Gets the value of the inOutInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInOutInd() {
		return inOutInd;
	}

	/**
	 * Sets the value of the inOutInd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInOutInd(String value) {
		this.inOutInd = value;
	}

	/**
	 * Gets the value of the itemSfx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemSfx() {
		return itemSfx;
	}

	/**
	 * Sets the value of the itemSfx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItemSfx(String value) {
		this.itemSfx = value;
	}

	/**
	 * Gets the value of the mdseCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMdseCd() {
		return mdseCd;
	}

	/**
	 * Sets the value of the mdseCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMdseCd(String value) {
		this.mdseCd = value;
	}

	/**
	 * Gets the value of the netAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetAmt() {
		return netAmt;
	}

	/**
	 * Sets the value of the netAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNetAmt(String value) {
		this.netAmt = value;
	}

	/**
	 * Gets the value of the obligorCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObligorCd() {
		return obligorCd;
	}

	/**
	 * Sets the value of the obligorCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObligorCd(String value) {
		this.obligorCd = value;
	}

	/**
	 * Gets the value of the prdPlanCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrdPlanCd() {
		return prdPlanCd;
	}

	/**
	 * Sets the value of the prdPlanCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrdPlanCd(String value) {
		this.prdPlanCd = value;
	}

	/**
	 * Gets the value of the svcLoc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSvcLoc() {
		return svcLoc;
	}

	/**
	 * Sets the value of the svcLoc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSvcLoc(String value) {
		this.svcLoc = value;
	}

	/**
	 * Gets the value of the startDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the startDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartDate(String value) {
		this.startDate = value;
	}

	/**
	 * Gets the value of the taxAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxAmt() {
		return taxAmt;
	}

	/**
	 * Sets the value of the taxAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxAmt(String value) {
		this.taxAmt = value;
	}

	/**
	 * Gets the value of the taxInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxInd() {
		return taxInd;
	}

	/**
	 * Sets the value of the taxInd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxInd(String value) {
		this.taxInd = value;
	}

	/**
	 * Gets the value of the totalAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalAmt() {
		return totalAmt;
	}

	/**
	 * Sets the value of the totalAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTotalAmt(String value) {
		this.totalAmt = value;
	}

	/**
	 * Gets the value of the updateInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUpdateInd() {
		return updateInd;
	}

	/**
	 * Sets the value of the updateInd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUpdateInd(String value) {
		this.updateInd = value;
	}

	/**
	 * Gets the value of the cvrCreditTaxAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCvrCreditTaxAmt() {
		return cvrCreditTaxAmt;
	}

	/**
	 * Sets the value of the cvrCreditTaxAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCvrCreditTaxAmt(String value) {
		this.cvrCreditTaxAmt = value;
	}

	/**
	 * Gets the value of the agmtSfx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgmtSfx() {
		return agmtSfx;
	}

	/**
	 * Sets the value of the agmtSfx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgmtSfx(String value) {
		this.agmtSfx = value;
	}

	/**
	 * Gets the value of the cashDepAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCashDepAmt() {
		return cashDepAmt;
	}

	/**
	 * Sets the value of the cashDepAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCashDepAmt(String value) {
		this.cashDepAmt = value;
	}

	/**
	 * Gets the value of the capFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCapFl() {
		return capFl;
	}

	/**
	 * Sets the value of the capFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCapFl(String value) {
		this.capFl = value;
	}

	public String getSywrUsePoints() {
		return sywrUsePoints;
	}

	public void setSywrUsePoints(String sywrUsePoints) {
		this.sywrUsePoints = sywrUsePoints;
	}

	public String getSywrUseDollars() {
		return sywrUseDollars;
	}

	public void setSywrUseDollars(String sywrUseDollars) {
		this.sywrUseDollars = sywrUseDollars;
	}

	

}
