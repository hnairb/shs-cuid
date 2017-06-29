
package com.epsilon.webservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumQuestionsReturned" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CheckoutPrompt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CheckoutPromptQuestions" type="{http://www.epsilon.com/webservices/}CheckoutPromptQuestions" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AnsweredPrompt" minOccurs="0"/&gt;
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
    "responseDate",
    "responseTime",
    "memberNumber",
    "numQuestionsReturned",
    "checkoutPrompt",
    "answeredPrompt"
})
@XmlRootElement(name = "GetMemberPromptsReply")
public class GetMemberPromptsReply {

    @XmlElement(name = "ResponseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(name = "ResponseTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar responseTime;
    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "NumQuestionsReturned", required = true)
    protected BigInteger numQuestionsReturned;
    @XmlElement(name = "CheckoutPrompt")
    protected GetMemberPromptsReply.CheckoutPrompt checkoutPrompt;
    @XmlElement(name = "AnsweredPrompt")
    protected AnsweredPrompt answeredPrompt;

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTime(XMLGregorianCalendar value) {
        this.responseTime = value;
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
     * Gets the value of the numQuestionsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumQuestionsReturned() {
        return numQuestionsReturned;
    }

    /**
     * Sets the value of the numQuestionsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumQuestionsReturned(BigInteger value) {
        this.numQuestionsReturned = value;
    }

    /**
     * Gets the value of the checkoutPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberPromptsReply.CheckoutPrompt }
     *     
     */
    public GetMemberPromptsReply.CheckoutPrompt getCheckoutPrompt() {
        return checkoutPrompt;
    }

    /**
     * Sets the value of the checkoutPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberPromptsReply.CheckoutPrompt }
     *     
     */
    public void setCheckoutPrompt(GetMemberPromptsReply.CheckoutPrompt value) {
        this.checkoutPrompt = value;
    }

    /**
     * Gets the value of the answeredPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link AnsweredPrompt }
     *     
     */
    public AnsweredPrompt getAnsweredPrompt() {
        return answeredPrompt;
    }

    /**
     * Sets the value of the answeredPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsweredPrompt }
     *     
     */
    public void setAnsweredPrompt(AnsweredPrompt value) {
        this.answeredPrompt = value;
    }


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
     *         &lt;element name="CheckoutPromptQuestions" type="{http://www.epsilon.com/webservices/}CheckoutPromptQuestions" maxOccurs="unbounded"/&gt;
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
        "checkoutPromptQuestions"
    })
    public static class CheckoutPrompt {

        @XmlElement(name = "CheckoutPromptQuestions", required = true)
        protected List<CheckoutPromptQuestions> checkoutPromptQuestions;

        /**
         * Gets the value of the checkoutPromptQuestions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkoutPromptQuestions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckoutPromptQuestions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CheckoutPromptQuestions }
         * 
         * 
         */
        public List<CheckoutPromptQuestions> getCheckoutPromptQuestions() {
            if (checkoutPromptQuestions == null) {
                checkoutPromptQuestions = new ArrayList<CheckoutPromptQuestions>();
            }
            return this.checkoutPromptQuestions;
        }

    }

}
