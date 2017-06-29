
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OrderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TenderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CurrentDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="UnconditionalPointsOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="BenefitOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaxBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProductList" type="{http://www.epsilon.com/webservices/}ArrayOfProductList" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageVersion",
    "memberNumber",
    "requestorID",
    "orderStoreNumber",
    "tenderStoreNumber",
    "pickUpStoreNumber",
    "currentDTTM",
    "timeZone",
    "unconditionalPointsOnly",
    "benefitOnly",
    "maxBenefits",
    "productList"
})
@XmlRootElement(name = "GetApplicableOffers")
public class GetApplicableOffers {

    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "OrderStoreNumber")
    protected String orderStoreNumber;
    @XmlElement(name = "TenderStoreNumber")
    protected String tenderStoreNumber;
    @XmlElement(name = "PickUpStoreNumber")
    protected String pickUpStoreNumber;
    @XmlElement(name = "CurrentDTTM")
    protected String currentDTTM;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "UnconditionalPointsOnly")
    protected String unconditionalPointsOnly;
    @XmlElement(name = "BenefitOnly")
    protected String benefitOnly;
    @XmlElement(name = "MaxBenefits")
    protected String maxBenefits;
    @XmlElement(name = "ProductList")
    protected ArrayOfProductList productList;

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
    }

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the orderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStoreNumber() {
        return orderStoreNumber;
    }

    /**
     * Sets the value of the orderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStoreNumber(String value) {
        this.orderStoreNumber = value;
    }

    /**
     * Gets the value of the tenderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderStoreNumber() {
        return tenderStoreNumber;
    }

    /**
     * Sets the value of the tenderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderStoreNumber(String value) {
        this.tenderStoreNumber = value;
    }

    /**
     * Gets the value of the pickUpStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpStoreNumber() {
        return pickUpStoreNumber;
    }

    /**
     * Sets the value of the pickUpStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpStoreNumber(String value) {
        this.pickUpStoreNumber = value;
    }

    /**
     * Gets the value of the currentDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDTTM() {
        return currentDTTM;
    }

    /**
     * Sets the value of the currentDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDTTM(String value) {
        this.currentDTTM = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the unconditionalPointsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalPointsOnly() {
        return unconditionalPointsOnly;
    }

    /**
     * Sets the value of the unconditionalPointsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalPointsOnly(String value) {
        this.unconditionalPointsOnly = value;
    }

    /**
     * Gets the value of the benefitOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitOnly() {
        return benefitOnly;
    }

    /**
     * Sets the value of the benefitOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitOnly(String value) {
        this.benefitOnly = value;
    }

    /**
     * Gets the value of the maxBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxBenefits() {
        return maxBenefits;
    }

    /**
     * Sets the value of the maxBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxBenefits(String value) {
        this.maxBenefits = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductList }
     *     
     */
    public ArrayOfProductList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductList }
     *     
     */
    public void setProductList(ArrayOfProductList value) {
        this.productList = value;
    }

}
