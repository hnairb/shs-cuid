
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDTTM" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SalesCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberNumber",
    "storeFlag",
    "storeNumber",
    "transactionID",
    "terminal",
    "transactionDTTM",
    "claimNumber",
    "salesCheckNumber",
    "contractNumber"
})
@XmlRootElement(name = "RequestMissingTransactionReply")
public class RequestMissingTransactionReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "StoreFlag", required = true)
    protected String storeFlag;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "TransactionDTTM", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDTTM;
    @XmlElement(name = "ClaimNumber", required = true)
    protected String claimNumber;
    @XmlElement(name = "SalesCheckNumber")
    protected String salesCheckNumber;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;

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
     * Gets the value of the storeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFlag() {
        return storeFlag;
    }

    /**
     * Sets the value of the storeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFlag(String value) {
        this.storeFlag = value;
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
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the transactionDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDTTM() {
        return transactionDTTM;
    }

    /**
     * Sets the value of the transactionDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDTTM(XMLGregorianCalendar value) {
        this.transactionDTTM = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the salesCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCheckNumber() {
        return salesCheckNumber;
    }

    /**
     * Sets the value of the salesCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCheckNumber(String value) {
        this.salesCheckNumber = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

}
