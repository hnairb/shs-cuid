
package com.epsilon.webservices;

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
 * &lt;complexType name="POSPromptQuestions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromptGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerChoices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QuestionRuleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FollowupQuestion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FollowupAnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FollowupAnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AnswerChoices" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "POSPromptQuestions", propOrder = {
    "promptGroupName",
    "questionPackageID",
    "attributeID",
    "answerChoice",
    "questionTextID",
    "answerChoices",
    "questionRuleID",
    "followupQuestions"
})
public class POSPromptQuestions {

    @XmlElement(name = "PromptGroupName")
    protected String promptGroupName;
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
    @XmlElement(name = "FollowupQuestions")
    protected POSPromptQuestions.FollowupQuestions followupQuestions;

    /**
     * Gets the value of the promptGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptGroupName() {
        return promptGroupName;
    }

    /**
     * Sets the value of the promptGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptGroupName(String value) {
        this.promptGroupName = value;
    }

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
     * Gets the value of the followupQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link POSPromptQuestions.FollowupQuestions }
     *     
     */
    public POSPromptQuestions.FollowupQuestions getFollowupQuestions() {
        return followupQuestions;
    }

    /**
     * Sets the value of the followupQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSPromptQuestions.FollowupQuestions }
     *     
     */
    public void setFollowupQuestions(POSPromptQuestions.FollowupQuestions value) {
        this.followupQuestions = value;
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
     *         &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
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
     *         &lt;element name="FollowupQuestion" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FollowupAnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FollowupAnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AnswerChoices" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "followupQuestion"
    })
    public static class FollowupQuestions {

        @XmlElement(name = "FollowupQuestion", required = true)
        protected List<POSPromptQuestions.FollowupQuestions.FollowupQuestion> followupQuestion;

        /**
         * Gets the value of the followupQuestion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the followupQuestion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFollowupQuestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSPromptQuestions.FollowupQuestions.FollowupQuestion }
         * 
         * 
         */
        public List<POSPromptQuestions.FollowupQuestions.FollowupQuestion> getFollowupQuestion() {
            if (followupQuestion == null) {
                followupQuestion = new ArrayList<POSPromptQuestions.FollowupQuestions.FollowupQuestion>();
            }
            return this.followupQuestion;
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
         *         &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FollowupAnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FollowupAnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AnswerChoices" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
        @XmlType(name = "", propOrder = {
            "followupAttributeID",
            "followupAnswerChoiceID",
            "followupAnswerChoice",
            "followupQuestionTextID",
            "answerChoices"
        })
        public static class FollowupQuestion {

            @XmlElement(name = "FollowupAttributeID")
            protected String followupAttributeID;
            @XmlElement(name = "FollowupAnswerChoiceID")
            protected String followupAnswerChoiceID;
            @XmlElement(name = "FollowupAnswerChoice")
            protected String followupAnswerChoice;
            @XmlElement(name = "FollowupQuestionTextID")
            protected String followupQuestionTextID;
            @XmlElement(name = "AnswerChoices")
            protected POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices answerChoices;

            /**
             * Gets the value of the followupAttributeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupAttributeID() {
                return followupAttributeID;
            }

            /**
             * Sets the value of the followupAttributeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupAttributeID(String value) {
                this.followupAttributeID = value;
            }

            /**
             * Gets the value of the followupAnswerChoiceID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupAnswerChoiceID() {
                return followupAnswerChoiceID;
            }

            /**
             * Sets the value of the followupAnswerChoiceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupAnswerChoiceID(String value) {
                this.followupAnswerChoiceID = value;
            }

            /**
             * Gets the value of the followupAnswerChoice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupAnswerChoice() {
                return followupAnswerChoice;
            }

            /**
             * Sets the value of the followupAnswerChoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupAnswerChoice(String value) {
                this.followupAnswerChoice = value;
            }

            /**
             * Gets the value of the followupQuestionTextID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionTextID() {
                return followupQuestionTextID;
            }

            /**
             * Sets the value of the followupQuestionTextID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionTextID(String value) {
                this.followupQuestionTextID = value;
            }

            /**
             * Gets the value of the answerChoices property.
             * 
             * @return
             *     possible object is
             *     {@link POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices }
             *     
             */
            public POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices getAnswerChoices() {
                return answerChoices;
            }

            /**
             * Sets the value of the answerChoices property.
             * 
             * @param value
             *     allowed object is
             *     {@link POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices }
             *     
             */
            public void setAnswerChoices(POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices value) {
                this.answerChoices = value;
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
             *         &lt;element name="AnswerOption" maxOccurs="unbounded"&gt;
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
            @XmlType(name = "", propOrder = {
                "answerOption"
            })
            public static class AnswerChoices {

                @XmlElement(name = "AnswerOption", required = true)
                protected List<POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices.AnswerOption> answerOption;

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
                 * {@link POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices.AnswerOption }
                 * 
                 * 
                 */
                public List<POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices.AnswerOption> getAnswerOption() {
                    if (answerOption == null) {
                        answerOption = new ArrayList<POSPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerChoices.AnswerOption>();
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

        }

    }

}
