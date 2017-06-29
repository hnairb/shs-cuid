package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SettlementItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coverageMths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="assocDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cashDepAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coverageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvrCreditAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvrCreditTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deductAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discOverFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divisionNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="inOutInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSfx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mdseCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="obligorCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcPrdPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcLoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="updateInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otherDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "SettlementItem", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementItem", propOrder = { "coverageMths", "assocDiscAmt",
		"cashDepAmt", "coverageType", "cvrCreditAmt", "cvrCreditTaxAmt",
		"deductAmt", "discAmt", "discOverFl", "divisionNo", "expireDate",
		"grossAmt", "inOutInd", "itemSfx", "mdseCd", "netAmt", "obligorCd",
		"svcPrdPlanCd", "startDate", "svcLoc", "taxAmt", "taxFl", "totalAmt",
		"updateInd", "otherDiscAmt", "capFl", "sywrUsePoints",
		"sywrUseDollars"

})
public class SettlementItem {

	protected int coverageMths;
	protected double assocDiscAmt;
	protected double cashDepAmt;
	@XmlElement(required = true, nillable = true)
	protected String coverageType;
	@XmlElement(required = true, nillable = true)
	protected String cvrCreditAmt;
	@XmlElement(required = true, nillable = true)
	protected String cvrCreditTaxAmt;
	protected double deductAmt;
	protected double discAmt;
	@XmlElement(required = true, nillable = true)
	protected String discOverFl;
	@XmlElement(required = true, nillable = true)
	protected String divisionNo;
	@XmlElement(required = true, nillable = true)
	protected String expireDate;
	protected double grossAmt;
	@XmlElement(required = true, nillable = true)
	protected String inOutInd;
	protected int itemSfx;
	@XmlElement(required = true, nillable = true)
	protected String mdseCd;
	protected double netAmt;
	@XmlElement(required = true, nillable = true)
	protected String obligorCd;
	@XmlElement(required = true, nillable = true)
	protected String svcPrdPlanCd;
	@XmlElement(required = true, nillable = true)
	protected String startDate;
	@XmlElement(required = true, nillable = true)
	protected String svcLoc;
	protected double taxAmt;
	@XmlElement(required = true, nillable = true)
	protected String taxFl;
	protected double totalAmt;
	@XmlElement(required = true, nillable = true)
	protected String updateInd;
	protected double otherDiscAmt;
	@XmlElement(required = true, nillable = true)
	protected String capFl;
	@XmlElement(required = true, nillable = true)
	protected String sywrUsePoints;
	@XmlElement(required = true, nillable = true)
	protected String sywrUseDollars;

	/**
	 * Gets the value of the coverageMths property.
	 * 
	 */
	public int getCoverageMths() {
		return coverageMths;
	}

	/**
	 * Sets the value of the coverageMths property.
	 * 
	 */
	public void setCoverageMths(int value) {
		this.coverageMths = value;
	}

	/**
	 * Gets the value of the assocDiscAmt property.
	 * 
	 */
	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	/**
	 * Sets the value of the assocDiscAmt property.
	 * 
	 */
	public void setAssocDiscAmt(double value) {
		this.assocDiscAmt = value;
	}

	/**
	 * Gets the value of the cashDepAmt property.
	 * 
	 */
	public double getCashDepAmt() {
		return cashDepAmt;
	}

	/**
	 * Sets the value of the cashDepAmt property.
	 * 
	 */
	public void setCashDepAmt(double value) {
		this.cashDepAmt = value;
	}

	/**
	 * Gets the value of the coverageType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageType() {
		return coverageType;
	}

	/**
	 * Sets the value of the coverageType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCoverageType(String value) {
		this.coverageType = value;
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
	 * Gets the value of the deductAmt property.
	 * 
	 */
	public double getDeductAmt() {
		return deductAmt;
	}

	/**
	 * Sets the value of the deductAmt property.
	 * 
	 */
	public void setDeductAmt(double value) {
		this.deductAmt = value;
	}

	/**
	 * Gets the value of the discAmt property.
	 * 
	 */
	public double getDiscAmt() {
		return discAmt;
	}

	/**
	 * Sets the value of the discAmt property.
	 * 
	 */
	public void setDiscAmt(double value) {
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
	 * Gets the value of the divisionNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDivisionNo() {
		return divisionNo;
	}

	/**
	 * Sets the value of the divisionNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDivisionNo(String value) {
		this.divisionNo = value;
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
	 */
	public double getGrossAmt() {
		return grossAmt;
	}

	/**
	 * Sets the value of the grossAmt property.
	 * 
	 */
	public void setGrossAmt(double value) {
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
	 */
	public int getItemSfx() {
		return itemSfx;
	}

	/**
	 * Sets the value of the itemSfx property.
	 * 
	 */
	public void setItemSfx(int value) {
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
	 */
	public double getNetAmt() {
		return netAmt;
	}

	/**
	 * Sets the value of the netAmt property.
	 * 
	 */
	public void setNetAmt(double value) {
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
	 * Gets the value of the svcPrdPlanCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSvcPrdPlanCd() {
		return svcPrdPlanCd;
	}

	/**
	 * Sets the value of the svcPrdPlanCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSvcPrdPlanCd(String value) {
		this.svcPrdPlanCd = value;
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
	 * Gets the value of the taxAmt property.
	 * 
	 */
	public double getTaxAmt() {
		return taxAmt;
	}

	/**
	 * Sets the value of the taxAmt property.
	 * 
	 */
	public void setTaxAmt(double value) {
		this.taxAmt = value;
	}

	/**
	 * Gets the value of the taxFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxFl() {
		return taxFl;
	}

	/**
	 * Sets the value of the taxFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxFl(String value) {
		this.taxFl = value;
	}

	/**
	 * Gets the value of the totalAmt property.
	 * 
	 */
	public double getTotalAmt() {
		return totalAmt;
	}

	/**
	 * Sets the value of the totalAmt property.
	 * 
	 */
	public void setTotalAmt(double value) {
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
	 * Gets the value of the otherDiscAmt property.
	 * 
	 */
	public double getOtherDiscAmt() {
		return otherDiscAmt;
	}

	/**
	 * Sets the value of the otherDiscAmt property.
	 * 
	 */
	public void setOtherDiscAmt(double value) {
		this.otherDiscAmt = value;
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

	public void setSywrUsetDollars(String sywrUsetDollars) {
		this.sywrUseDollars = sywrUsetDollars;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SettlementItem [coverageMths=");
		builder.append(coverageMths);
		builder.append(", assocDiscAmt=");
		builder.append(assocDiscAmt);
		builder.append(", cashDepAmt=");
		builder.append(cashDepAmt);
		builder.append(", coverageType=");
		builder.append(coverageType);
		builder.append(", cvrCreditAmt=");
		builder.append(cvrCreditAmt);
		builder.append(", cvrCreditTaxAmt=");
		builder.append(cvrCreditTaxAmt);
		builder.append(", deductAmt=");
		builder.append(deductAmt);
		builder.append(", discAmt=");
		builder.append(discAmt);
		builder.append(", discOverFl=");
		builder.append(discOverFl);
		builder.append(", divisionNo=");
		builder.append(divisionNo);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", grossAmt=");
		builder.append(grossAmt);
		builder.append(", inOutInd=");
		builder.append(inOutInd);
		builder.append(", itemSfx=");
		builder.append(itemSfx);
		builder.append(", mdseCd=");
		builder.append(mdseCd);
		builder.append(", netAmt=");
		builder.append(netAmt);
		builder.append(", obligorCd=");
		builder.append(obligorCd);
		builder.append(", svcPrdPlanCd=");
		builder.append(svcPrdPlanCd);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", svcLoc=");
		builder.append(svcLoc);
		builder.append(", taxAmt=");
		builder.append(taxAmt);
		builder.append(", taxFl=");
		builder.append(taxFl);
		builder.append(", totalAmt=");
		builder.append(totalAmt);
		builder.append(", updateInd=");
		builder.append(updateInd);
		builder.append(", otherDiscAmt=");
		builder.append(otherDiscAmt);
		builder.append(", capFl=");
		builder.append(capFl);
		builder.append(", sywrUsePoints=");
		builder.append(sywrUsePoints);
		builder.append(", sywrUseDollars=");
		builder.append(sywrUseDollars);
		builder.append("]");
		return builder.toString();
	}

}
