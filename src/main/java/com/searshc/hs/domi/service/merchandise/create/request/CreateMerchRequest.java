//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.20 at 11:01:46 AM CDT 
//


package com.searshc.hs.domi.service.merchandise.create.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.searshc.hs.base.ABase;


/**
 * <p>Java class for createMerchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMerchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}aBase">
 *       &lt;sequence>
 *         &lt;element name="adjustReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedWarrantyExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedWarrantyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laborWarrantyExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laborWarrantyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logonUnitNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchandiseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notPromoteMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notPromoteOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oriCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partsWarrantyExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partsWarrantyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoteMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoteOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceOrderNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceUnitNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spPgmMkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sppPgmMkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whereBought" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xrefCustNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="CreateMerchRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMerchRequest", propOrder = {
    "adjustReason",
    "brand",
    "componentIndicator",
    "custNum",
    "division",
    "empId",
    "extendedWarrantyExpire",
    "extendedWarrantyReason",
    "itemNum",
    "itemSuffix",
    "laborWarrantyExpire",
    "laborWarrantyReason",
    "logonUnitNum",
    "merchandiseCode",
    "modelNum",
    "notPromoteMA",
    "notPromoteOther",
    "oriCode",
    "partsWarrantyExpire",
    "partsWarrantyReason",
    "promoteMA",
    "promoteOther",
    "purchaseDate",
    "receiveDate",
    "serialNumber",
    "serviceOrderNum",
    "serviceUnitNum",
    "spPgmMkey",
    "sppPgmMkey",
    "statusIndicator",
    "storeNumber",
    "usageType",
    "whereBought",
    "xrefCustNum"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMerchRequest
    extends ABase
{

    protected String adjustReason;
    protected String brand;
    protected String componentIndicator;
    protected String custNum;
    protected String division;
    protected String empId;
    protected String extendedWarrantyExpire;
    protected String extendedWarrantyReason;
    protected String itemNum;
    protected String itemSuffix;
    protected String laborWarrantyExpire;
    protected String laborWarrantyReason;
    protected String logonUnitNum;
    protected String merchandiseCode;
    protected String modelNum;
    protected String notPromoteMA;
    protected String notPromoteOther;
    protected String oriCode;
    protected String partsWarrantyExpire;
    protected String partsWarrantyReason;
    protected String promoteMA;
    protected String promoteOther;
    protected String purchaseDate;
    protected String receiveDate;
    protected String serialNumber;
    protected String serviceOrderNum;
    protected String serviceUnitNum;
    protected String spPgmMkey;
    protected String sppPgmMkey;
    protected String statusIndicator;
    protected String storeNumber;
    protected String usageType;
    protected String whereBought;
    protected String xrefCustNum;

    /**
     * Gets the value of the adjustReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustReason() {
        return adjustReason;
    }

    /**
     * Sets the value of the adjustReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustReason(String value) {
        this.adjustReason = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the componentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentIndicator() {
        return componentIndicator;
    }

    /**
     * Sets the value of the componentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentIndicator(String value) {
        this.componentIndicator = value;
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
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the extendedWarrantyExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedWarrantyExpire() {
        return extendedWarrantyExpire;
    }

    /**
     * Sets the value of the extendedWarrantyExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedWarrantyExpire(String value) {
        this.extendedWarrantyExpire = value;
    }

    /**
     * Gets the value of the extendedWarrantyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedWarrantyReason() {
        return extendedWarrantyReason;
    }

    /**
     * Sets the value of the extendedWarrantyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedWarrantyReason(String value) {
        this.extendedWarrantyReason = value;
    }

    /**
     * Gets the value of the itemNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNum() {
        return itemNum;
    }

    /**
     * Sets the value of the itemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNum(String value) {
        this.itemNum = value;
    }

    /**
     * Gets the value of the itemSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSuffix() {
        return itemSuffix;
    }

    /**
     * Sets the value of the itemSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSuffix(String value) {
        this.itemSuffix = value;
    }

    /**
     * Gets the value of the laborWarrantyExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborWarrantyExpire() {
        return laborWarrantyExpire;
    }

    /**
     * Sets the value of the laborWarrantyExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborWarrantyExpire(String value) {
        this.laborWarrantyExpire = value;
    }

    /**
     * Gets the value of the laborWarrantyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborWarrantyReason() {
        return laborWarrantyReason;
    }

    /**
     * Sets the value of the laborWarrantyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborWarrantyReason(String value) {
        this.laborWarrantyReason = value;
    }

    /**
     * Gets the value of the logonUnitNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogonUnitNum() {
        return logonUnitNum;
    }

    /**
     * Sets the value of the logonUnitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogonUnitNum(String value) {
        this.logonUnitNum = value;
    }

    /**
     * Gets the value of the merchandiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    /**
     * Sets the value of the merchandiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseCode(String value) {
        this.merchandiseCode = value;
    }

    /**
     * Gets the value of the modelNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNum() {
        return modelNum;
    }

    /**
     * Sets the value of the modelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNum(String value) {
        this.modelNum = value;
    }

    /**
     * Gets the value of the notPromoteMA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotPromoteMA() {
        return notPromoteMA;
    }

    /**
     * Sets the value of the notPromoteMA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotPromoteMA(String value) {
        this.notPromoteMA = value;
    }

    /**
     * Gets the value of the notPromoteOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotPromoteOther() {
        return notPromoteOther;
    }

    /**
     * Sets the value of the notPromoteOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotPromoteOther(String value) {
        this.notPromoteOther = value;
    }

    /**
     * Gets the value of the oriCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriCode() {
        return oriCode;
    }

    /**
     * Sets the value of the oriCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriCode(String value) {
        this.oriCode = value;
    }

    /**
     * Gets the value of the partsWarrantyExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsWarrantyExpire() {
        return partsWarrantyExpire;
    }

    /**
     * Sets the value of the partsWarrantyExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsWarrantyExpire(String value) {
        this.partsWarrantyExpire = value;
    }

    /**
     * Gets the value of the partsWarrantyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsWarrantyReason() {
        return partsWarrantyReason;
    }

    /**
     * Sets the value of the partsWarrantyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsWarrantyReason(String value) {
        this.partsWarrantyReason = value;
    }

    /**
     * Gets the value of the promoteMA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoteMA() {
        return promoteMA;
    }

    /**
     * Sets the value of the promoteMA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoteMA(String value) {
        this.promoteMA = value;
    }

    /**
     * Gets the value of the promoteOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoteOther() {
        return promoteOther;
    }

    /**
     * Sets the value of the promoteOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoteOther(String value) {
        this.promoteOther = value;
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
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serviceOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderNum() {
        return serviceOrderNum;
    }

    /**
     * Sets the value of the serviceOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderNum(String value) {
        this.serviceOrderNum = value;
    }

    /**
     * Gets the value of the serviceUnitNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUnitNum() {
        return serviceUnitNum;
    }

    /**
     * Sets the value of the serviceUnitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUnitNum(String value) {
        this.serviceUnitNum = value;
    }

    /**
     * Gets the value of the spPgmMkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpPgmMkey() {
        return spPgmMkey;
    }

    /**
     * Sets the value of the spPgmMkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpPgmMkey(String value) {
        this.spPgmMkey = value;
    }

    /**
     * Gets the value of the sppPgmMkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSppPgmMkey() {
        return sppPgmMkey;
    }

    /**
     * Sets the value of the sppPgmMkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSppPgmMkey(String value) {
        this.sppPgmMkey = value;
    }

    /**
     * Gets the value of the statusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusIndicator() {
        return statusIndicator;
    }

    /**
     * Sets the value of the statusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusIndicator(String value) {
        this.statusIndicator = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the whereBought property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhereBought() {
        return whereBought;
    }

    /**
     * Sets the value of the whereBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhereBought(String value) {
        this.whereBought = value;
    }

    /**
     * Gets the value of the xrefCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefCustNum() {
        return xrefCustNum;
    }

    /**
     * Sets the value of the xrefCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefCustNum(String value) {
        this.xrefCustNum = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateMerchRequest [adjustReason=");
		builder.append(adjustReason);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", componentIndicator=");
		builder.append(componentIndicator);
		builder.append(", custNum=");
		builder.append(custNum);
		builder.append(", division=");
		builder.append(division);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", extendedWarrantyExpire=");
		builder.append(extendedWarrantyExpire);
		builder.append(", extendedWarrantyReason=");
		builder.append(extendedWarrantyReason);
		builder.append(", itemNum=");
		builder.append(itemNum);
		builder.append(", itemSuffix=");
		builder.append(itemSuffix);
		builder.append(", laborWarrantyExpire=");
		builder.append(laborWarrantyExpire);
		builder.append(", laborWarrantyReason=");
		builder.append(laborWarrantyReason);
		builder.append(", logonUnitNum=");
		builder.append(logonUnitNum);
		builder.append(", merchandiseCode=");
		builder.append(merchandiseCode);
		builder.append(", modelNum=");
		builder.append(modelNum);
		builder.append(", notPromoteMA=");
		builder.append(notPromoteMA);
		builder.append(", notPromoteOther=");
		builder.append(notPromoteOther);
		builder.append(", oriCode=");
		builder.append(oriCode);
		builder.append(", partsWarrantyExpire=");
		builder.append(partsWarrantyExpire);
		builder.append(", partsWarrantyReason=");
		builder.append(partsWarrantyReason);
		builder.append(", promoteMA=");
		builder.append(promoteMA);
		builder.append(", promoteOther=");
		builder.append(promoteOther);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", receiveDate=");
		builder.append(receiveDate);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append(", serviceOrderNum=");
		builder.append(serviceOrderNum);
		builder.append(", serviceUnitNum=");
		builder.append(serviceUnitNum);
		builder.append(", spPgmMkey=");
		builder.append(spPgmMkey);
		builder.append(", sppPgmMkey=");
		builder.append(sppPgmMkey);
		builder.append(", statusIndicator=");
		builder.append(statusIndicator);
		builder.append(", storeNumber=");
		builder.append(storeNumber);
		builder.append(", usageType=");
		builder.append(usageType);
		builder.append(", whereBought=");
		builder.append(whereBought);
		builder.append(", xrefCustNum=");
		builder.append(xrefCustNum);
		builder.append("]");
		return builder.toString();
	}

}
