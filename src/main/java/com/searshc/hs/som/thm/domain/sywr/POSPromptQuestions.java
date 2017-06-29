
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POSPromptQuestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSPromptQuestions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuestionPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnswerChoices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AnswerOption" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QuestionRuleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSPromptQuestions", propOrder = {
    "questionPackageID",
    "attributeID",
    "answerChoice",
    "questionTextID",
    "answerChoices",
    "questionRuleID"
})
public class POSPromptQuestions {

    @XmlElement(name = "QuestionPackageID")
    protected String questionPackageID;
    @XmlElement(name = "AttributeID")
    protected String attributeID;
    @XmlElement(name = "AnswerChoice")
    protected String answerChoice;
    @XmlElement(name = "QuestionTextID")
    protected String questionTextID;
    @XmlElement(name = "AnswerChoices")
    protected POSPromptQuestions.AnswerChoices answerChoices;
    @XmlElement(name = "QuestionRuleID")
    protected String questionRuleID;

    /**
     * Gets the value of the questionPackageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionPackageID() {
        return questionPackageID;
    }

    /**
     * Sets the value of the questionPackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionPackageID(String value) {
        this.questionPackageID = value;
    }

    /**
     * Gets the value of the attributeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeID(String value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the answerChoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerChoice() {
        return answerChoice;
    }

    /**
     * Sets the value of the answerChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerChoice(String value) {
        this.answerChoice = value;
    }

    /**
     * Gets the value of the questionTextID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionTextID() {
        return questionTextID;
    }

    /**
     * Sets the value of the questionTextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionTextID(String value) {
        this.questionTextID = value;
    }

    /**
     * Gets the value of the answerChoices property.
     * 
     * @return
     *     possible object is
     *     {@link POSPromptQuestions.AnswerChoices }
     *     
     */
    public POSPromptQuestions.AnswerChoices getAnswerChoices() {
        return answerChoices;
    }

    /**
     * Sets the value of the answerChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSPromptQuestions.AnswerChoices }
     *     
     */
    public void setAnswerChoices(POSPromptQuestions.AnswerChoices value) {
        this.answerChoices = value;
    }

    /**
     * Gets the value of the questionRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionRuleID() {
        return questionRuleID;
    }

    /**
     * Sets the value of the questionRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionRuleID(String value) {
        this.questionRuleID = value;
    }


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
     *         &lt;element name="AnswerOption" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "answerOption"
    })
    public static class AnswerChoices {

        @XmlElement(name = "AnswerOption", required = true)
        protected List<POSPromptQuestions.AnswerChoices.AnswerOption> answerOption;

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
         * {@link POSPromptQuestions.AnswerChoices.AnswerOption }
         * 
         * 
         */
        public List<POSPromptQuestions.AnswerChoices.AnswerOption> getAnswerOption() {
            if (answerOption == null) {
                answerOption = new ArrayList<POSPromptQuestions.AnswerChoices.AnswerOption>();
            }
            return this.answerOption;
        }


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
         *         &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

}
