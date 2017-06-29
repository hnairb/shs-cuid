
package com.epsilon.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAnswerOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAnswerOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnswerOption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnswerOption", propOrder = {
    "answerOption"
})
public class ArrayOfAnswerOption {

    @XmlElement(name = "AnswerOption", nillable = true)
    protected List<ArrayOfAnswerOption.AnswerOption> answerOption;

    /**
     * Gets the value of the answerOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswerOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAnswerOption.AnswerOption }
     * 
     * 
     */
    public List<ArrayOfAnswerOption.AnswerOption> getAnswerOption() {
        if (answerOption == null) {
            answerOption = new ArrayList<ArrayOfAnswerOption.AnswerOption>();
        }
        return this.answerOption;
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
     *         &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "answerChoiceID",
        "answerTxt"
    })
    public static class AnswerOption {

        @XmlElement(name = "AnswerChoiceID")
        protected String answerChoiceID;
        @XmlElement(name = "AnswerTxt")
        protected String answerTxt;

        /**
         * Gets the value of the answerChoiceID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswerChoiceID() {
            return answerChoiceID;
        }

        /**
         * Sets the value of the answerChoiceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswerChoiceID(String value) {
            this.answerChoiceID = value;
        }

        /**
         * Gets the value of the answerTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswerTxt() {
            return answerTxt;
        }

        /**
         * Sets the value of the answerTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswerTxt(String value) {
            this.answerTxt = value;
        }

    }

}
