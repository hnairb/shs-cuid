
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for TechPASalesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechPASalesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ledTypCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noComRsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceCallDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techAssocNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techAtvCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitRecSale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreementSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "TechPASalesRequest")

public class TechPASalesRequest
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String ledTypCd;
    @XmlElement(required = true, nillable = true)
    protected String agmtSrc;
    @XmlElement(required = true, nillable = true)
    protected String noComRsn;
    @XmlElement(required = true, nillable = true)
    protected String customerNo;
    @XmlElement(required = true, nillable = true)
    protected String netAmount;
    @XmlElement(required = true, nillable = true)
    protected String serviceCallDate;
    @XmlElement(required = true, nillable = true)
    protected String serviceOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String serviceUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String techAssocNo;
    @XmlElement(required = true, nillable = true)
    protected String techAtvCode;
    @XmlElement(required = true, nillable = true)
    protected String unitRecSale;
    @XmlElement(required = true, nillable = true)
    protected String agreementSuffix;
    @XmlElement(required = true, nillable = true)
    protected String posFl;

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
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAmount(String value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the serviceCallDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCallDate() {
        return serviceCallDate;
    }

    /**
     * Sets the value of the serviceCallDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCallDate(String value) {
        this.serviceCallDate = value;
    }

    /**
     * Gets the value of the serviceOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    /**
     * Sets the value of the serviceOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderNo(String value) {
        this.serviceOrderNo = value;
    }

    /**
     * Gets the value of the serviceUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUnitNo() {
        return serviceUnitNo;
    }

    /**
     * Sets the value of the serviceUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUnitNo(String value) {
        this.serviceUnitNo = value;
    }

    /**
     * Gets the value of the techAssocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechAssocNo() {
        return techAssocNo;
    }

    /**
     * Sets the value of the techAssocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechAssocNo(String value) {
        this.techAssocNo = value;
    }

    /**
     * Gets the value of the techAtvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechAtvCode() {
        return techAtvCode;
    }

    /**
     * Sets the value of the techAtvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechAtvCode(String value) {
        this.techAtvCode = value;
    }

    /**
     * Gets the value of the unitRecSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitRecSale() {
        return unitRecSale;
    }

    /**
     * Sets the value of the unitRecSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitRecSale(String value) {
        this.unitRecSale = value;
    }

    /**
     * Gets the value of the agreementSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementSuffix() {
        return agreementSuffix;
    }

    /**
     * Sets the value of the agreementSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementSuffix(String value) {
        this.agreementSuffix = value;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TechPASalesRequest [ledTypCd=");
		builder.append(ledTypCd);
		builder.append(", agmtSrc=");
		builder.append(agmtSrc);
		builder.append(", noComRsn=");
		builder.append(noComRsn);
		builder.append(", customerNo=");
		builder.append(customerNo);
		builder.append(", netAmount=");
		builder.append(netAmount);
		builder.append(", serviceCallDate=");
		builder.append(serviceCallDate);
		builder.append(", serviceOrderNo=");
		builder.append(serviceOrderNo);
		builder.append(", serviceUnitNo=");
		builder.append(serviceUnitNo);
		builder.append(", techAssocNo=");
		builder.append(techAssocNo);
		builder.append(", techAtvCode=");
		builder.append(techAtvCode);
		builder.append(", unitRecSale=");
		builder.append(unitRecSale);
		builder.append(", agreementSuffix=");
		builder.append(agreementSuffix);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append("]");
		return builder.toString();
	}
    
    

}
