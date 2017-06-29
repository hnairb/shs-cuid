
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for ManualLeadRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualLeadRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ledTypCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noComRsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autrhorizedContactDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactReasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subContactReasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custLocSuffix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="earliestCoverageStartDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadContactNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadCustNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberApplicancesOwn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneAreaCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneExchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premCustFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceFacUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techAssocNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipExtCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketFactoryNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ManualLeadRequestVO")

public class ManualLeadRequestVO
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String ledTypCd;
    @XmlElement(required = true, nillable = true)
    protected String agmtSrc;
    @XmlElement(required = true, nillable = true)
    protected String noComRsn;
    @XmlElement(required = true, nillable = true)
    protected String autrhorizedContactDt;
    @XmlElement(required = true, nillable = true)
    protected String callDate;
    @XmlElement(required = true, nillable = true)
    protected String cityName;
    @XmlElement(required = true, nillable = true)
    protected String contactMethodCd;
    @XmlElement(required = true, nillable = true)
    protected String contactReasonCd;
    @XmlElement(required = true, nillable = true)
    protected String subContactReasonCd;
    protected int custLocSuffix;
    @XmlElement(required = true, nillable = true)
    protected String earliestCoverageStartDt;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String lastName;
    protected int leadContactNo;
    protected int leadCustNo;
    protected int leadNo;
    protected int leadScore;
    protected int numberApplicancesOwn;
    @XmlElement(required = true, nillable = true)
    protected String phoneAreaCd;
    @XmlElement(required = true, nillable = true)
    protected String phoneExchange;
    @XmlElement(required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(required = true, nillable = true)
    protected String premCustFlag;
    @XmlElement(required = true, nillable = true)
    protected String segmentNo;
    @XmlElement(required = true, nillable = true)
    protected String serviceFacUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String serviceOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String stateCd;
    @XmlElement(required = true, nillable = true)
    protected String streetAddress;
    @XmlElement(required = true, nillable = true)
    protected String techAssocNo;
    @XmlElement(required = true, nillable = true)
    protected String unitNo;
    @XmlElement(required = true, nillable = true)
    protected String zipCd;
    @XmlElement(required = true, nillable = true)
    protected String zipExtCd;
    @XmlElement(required = true, nillable = true)
    protected String posFl;
    @XmlElement(required = true, nillable = true)
    protected String marketFactoryNo;

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
     * Gets the value of the autrhorizedContactDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutrhorizedContactDt() {
        return autrhorizedContactDt;
    }

    /**
     * Sets the value of the autrhorizedContactDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutrhorizedContactDt(String value) {
        this.autrhorizedContactDt = value;
    }

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDate(String value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
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
     * Gets the value of the contactReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactReasonCd() {
        return contactReasonCd;
    }

    /**
     * Sets the value of the contactReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactReasonCd(String value) {
        this.contactReasonCd = value;
    }

    /**
     * Gets the value of the subContactReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubContactReasonCd() {
        return subContactReasonCd;
    }

    /**
     * Sets the value of the subContactReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubContactReasonCd(String value) {
        this.subContactReasonCd = value;
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
     * Gets the value of the earliestCoverageStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestCoverageStartDt() {
        return earliestCoverageStartDt;
    }

    /**
     * Sets the value of the earliestCoverageStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestCoverageStartDt(String value) {
        this.earliestCoverageStartDt = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
    public int getLeadCustNo() {
        return leadCustNo;
    }

    /**
     * Sets the value of the leadCustNo property.
     * 
     */
    public void setLeadCustNo(int value) {
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
     * Gets the value of the leadScore property.
     * 
     */
    public int getLeadScore() {
        return leadScore;
    }

    /**
     * Sets the value of the leadScore property.
     * 
     */
    public void setLeadScore(int value) {
        this.leadScore = value;
    }

    /**
     * Gets the value of the numberApplicancesOwn property.
     * 
     */
    public int getNumberApplicancesOwn() {
        return numberApplicancesOwn;
    }

    /**
     * Sets the value of the numberApplicancesOwn property.
     * 
     */
    public void setNumberApplicancesOwn(int value) {
        this.numberApplicancesOwn = value;
    }

    /**
     * Gets the value of the phoneAreaCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaCd() {
        return phoneAreaCd;
    }

    /**
     * Sets the value of the phoneAreaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaCd(String value) {
        this.phoneAreaCd = value;
    }

    /**
     * Gets the value of the phoneExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExchange() {
        return phoneExchange;
    }

    /**
     * Sets the value of the phoneExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExchange(String value) {
        this.phoneExchange = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the premCustFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremCustFlag() {
        return premCustFlag;
    }

    /**
     * Sets the value of the premCustFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremCustFlag(String value) {
        this.premCustFlag = value;
    }

    /**
     * Gets the value of the segmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNo() {
        return segmentNo;
    }

    /**
     * Sets the value of the segmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNo(String value) {
        this.segmentNo = value;
    }

    /**
     * Gets the value of the serviceFacUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFacUnitNo() {
        return serviceFacUnitNo;
    }

    /**
     * Sets the value of the serviceFacUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFacUnitNo(String value) {
        this.serviceFacUnitNo = value;
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
     * Gets the value of the stateCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCd() {
        return stateCd;
    }

    /**
     * Sets the value of the stateCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCd(String value) {
        this.stateCd = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
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

    /**
     * Gets the value of the zipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCd() {
        return zipCd;
    }

    /**
     * Sets the value of the zipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCd(String value) {
        this.zipCd = value;
    }

    /**
     * Gets the value of the zipExtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipExtCd() {
        return zipExtCd;
    }

    /**
     * Sets the value of the zipExtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipExtCd(String value) {
        this.zipExtCd = value;
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
     * Gets the value of the marketFactoryNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketFactoryNo() {
        return marketFactoryNo;
    }

    /**
     * Sets the value of the marketFactoryNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketFactoryNo(String value) {
        this.marketFactoryNo = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManualLeadRequestVO [ledTypCd=");
		builder.append(ledTypCd);
		builder.append(", agmtSrc=");
		builder.append(agmtSrc);
		builder.append(", noComRsn=");
		builder.append(noComRsn);
		builder.append(", autrhorizedContactDt=");
		builder.append(autrhorizedContactDt);
		builder.append(", callDate=");
		builder.append(callDate);
		builder.append(", cityName=");
		builder.append(cityName);
		builder.append(", contactMethodCd=");
		builder.append(contactMethodCd);
		builder.append(", contactReasonCd=");
		builder.append(contactReasonCd);
		builder.append(", subContactReasonCd=");
		builder.append(subContactReasonCd);
		builder.append(", custLocSuffix=");
		builder.append(custLocSuffix);
		builder.append(", earliestCoverageStartDt=");
		builder.append(earliestCoverageStartDt);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", leadContactNo=");
		builder.append(leadContactNo);
		builder.append(", leadCustNo=");
		builder.append(leadCustNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", leadScore=");
		builder.append(leadScore);
		builder.append(", numberApplicancesOwn=");
		builder.append(numberApplicancesOwn);
		builder.append(", phoneAreaCd=");
		builder.append(phoneAreaCd);
		builder.append(", phoneExchange=");
		builder.append(phoneExchange);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", premCustFlag=");
		builder.append(premCustFlag);
		builder.append(", segmentNo=");
		builder.append(segmentNo);
		builder.append(", serviceFacUnitNo=");
		builder.append(serviceFacUnitNo);
		builder.append(", serviceOrderNo=");
		builder.append(serviceOrderNo);
		builder.append(", stateCd=");
		builder.append(stateCd);
		builder.append(", streetAddress=");
		builder.append(streetAddress);
		builder.append(", techAssocNo=");
		builder.append(techAssocNo);
		builder.append(", unitNo=");
		builder.append(unitNo);
		builder.append(", zipCd=");
		builder.append(zipCd);
		builder.append(", zipExtCd=");
		builder.append(zipExtCd);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", marketFactoryNo=");
		builder.append(marketFactoryNo);
		builder.append("]");
		return builder.toString();
	}
    
    

}
