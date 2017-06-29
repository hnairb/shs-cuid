
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for TechPASalesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechPASalesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dlyFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saleAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saleReceieveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceCallDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techAssocNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitRecSale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreementSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "TechPASalesResponse")
public class TechPASalesResponse
    extends ABaseResponse
{

    @XmlElement(required = true, nillable = true)
    protected String customerNo;
    @XmlElement(required = true, nillable = true)
    protected String dlyFlag;
    @XmlElement(required = true, nillable = true)
    protected String saleAmount;
    @XmlElement(required = true, nillable = true)
    protected String saleReceieveDate;
    @XmlElement(required = true, nillable = true)
    protected String serviceCallDate;
    @XmlElement(required = true, nillable = true)
    protected String serviceOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String serviceUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String techAssocNo;
    @XmlElement(required = true, nillable = true)
    protected String unitRecSale;
    @XmlElement(required = true, nillable = true)
    protected String agreementSuffix;

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
     * Gets the value of the dlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlyFlag() {
        return dlyFlag;
    }

    /**
     * Sets the value of the dlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlyFlag(String value) {
        this.dlyFlag = value;
    }

    /**
     * Gets the value of the saleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleAmount() {
        return saleAmount;
    }

    /**
     * Sets the value of the saleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleAmount(String value) {
        this.saleAmount = value;
    }

    /**
     * Gets the value of the saleReceieveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleReceieveDate() {
        return saleReceieveDate;
    }

    /**
     * Sets the value of the saleReceieveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleReceieveDate(String value) {
        this.saleReceieveDate = value;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TechPASalesResponse [customerNo=");
		builder.append(customerNo);
		builder.append(", dlyFlag=");
		builder.append(dlyFlag);
		builder.append(", saleAmount=");
		builder.append(saleAmount);
		builder.append(", saleReceieveDate=");
		builder.append(saleReceieveDate);
		builder.append(", serviceCallDate=");
		builder.append(serviceCallDate);
		builder.append(", serviceOrderNo=");
		builder.append(serviceOrderNo);
		builder.append(", serviceUnitNo=");
		builder.append(serviceUnitNo);
		builder.append(", techAssocNo=");
		builder.append(techAssocNo);
		builder.append(", unitRecSale=");
		builder.append(unitRecSale);
		builder.append(", agreementSuffix=");
		builder.append(agreementSuffix);
		builder.append("]");
		return builder.toString();
	}

}
