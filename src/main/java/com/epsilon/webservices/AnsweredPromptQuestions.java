
package com.epsilon.webservices;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromptGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionPriorityNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionRuleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                             &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SelectedAnswers" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}FollowupQuestion" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApiToUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "promptGroupName",
    "questionPriorityNum",
    "attributeID",
    "questionPackageID",
    "questionRuleID",
    "questionTextID",
    "questionTitle",
    "questionLine1",
    "questionLine2",
    "questionLine3",
    "questionLine4",
    "questionLine5",
    "answerTemplate",
    "answerChoices",
    "selectedAnswers",
    "followupQuestions",
    "apiToUse",
    "memberAttribute",
    "additionalAttrName"
})
@XmlRootElement(name = "AnsweredPromptQuestions")
public class AnsweredPromptQuestions {

    @XmlElement(name = "PromptGroupName")
    protected String promptGroupName;
    @XmlElement(name = "QuestionPriorityNum")
    protected String questionPriorityNum;
    @XmlElement(name = "AttributeID")
    protected String attributeID;
    @XmlElement(name = "QuestionPackageID")
    protected String questionPackageID;
    @XmlElement(name = "QuestionRuleID")
    protected String questionRuleID;
    @XmlElement(name = "QuestionTextID")
    protected String questionTextID;
    @XmlElement(name = "QuestionTitle")
    protected String questionTitle;
    @XmlElement(name = "QuestionLine1")
    protected String questionLine1;
    @XmlElement(name = "QuestionLine2")
    protected String questionLine2;
    @XmlElement(name = "QuestionLine3")
    protected String questionLine3;
    @XmlElement(name = "QuestionLine4")
    protected String questionLine4;
    @XmlElement(name = "QuestionLine5")
    protected String questionLine5;
    @XmlElement(name = "AnswerTemplate")
    protected String answerTemplate;
    @XmlElement(name = "AnswerChoices")
    protected AnsweredPromptQuestions.AnswerChoices answerChoices;
    @XmlElement(name = "SelectedAnswers")
    protected SelectedAnswers selectedAnswers;
    @XmlElement(name = "FollowupQuestions")
    protected AnsweredPromptQuestions.FollowupQuestions followupQuestions;
    @XmlElement(name = "ApiToUse")
    protected String apiToUse;
    @XmlElement(name = "MemberAttribute")
    protected String memberAttribute;
    @XmlElement(name = "AdditionalAttrName")
    protected String additionalAttrName;

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
     * Gets the value of the questionPriorityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionPriorityNum() {
        return questionPriorityNum;
    }

    /**
     * Sets the value of the questionPriorityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionPriorityNum(String value) {
        this.questionPriorityNum = value;
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
     * Gets the value of the questionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * Sets the value of the questionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionTitle(String value) {
        this.questionTitle = value;
    }

    /**
     * Gets the value of the questionLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLine1() {
        return questionLine1;
    }

    /**
     * Sets the value of the questionLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLine1(String value) {
        this.questionLine1 = value;
    }

    /**
     * Gets the value of the questionLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLine2() {
        return questionLine2;
    }

    /**
     * Sets the value of the questionLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLine2(String value) {
        this.questionLine2 = value;
    }

    /**
     * Gets the value of the questionLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLine3() {
        return questionLine3;
    }

    /**
     * Sets the value of the questionLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLine3(String value) {
        this.questionLine3 = value;
    }

    /**
     * Gets the value of the questionLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLine4() {
        return questionLine4;
    }

    /**
     * Sets the value of the questionLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLine4(String value) {
        this.questionLine4 = value;
    }

    /**
     * Gets the value of the questionLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLine5() {
        return questionLine5;
    }

    /**
     * Sets the value of the questionLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLine5(String value) {
        this.questionLine5 = value;
    }

    /**
     * Gets the value of the answerTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerTemplate() {
        return answerTemplate;
    }

    /**
     * Sets the value of the answerTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerTemplate(String value) {
        this.answerTemplate = value;
    }

    /**
     * Gets the value of the answerChoices property.
     * 
     * @return
     *     possible object is
     *     {@link AnsweredPromptQuestions.AnswerChoices }
     *     
     */
    public AnsweredPromptQuestions.AnswerChoices getAnswerChoices() {
        return answerChoices;
    }

    /**
     * Sets the value of the answerChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsweredPromptQuestions.AnswerChoices }
     *     
     */
    public void setAnswerChoices(AnsweredPromptQuestions.AnswerChoices value) {
        this.answerChoices = value;
    }

    /**
     * Gets the value of the selectedAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedAnswers }
     *     
     */
    public SelectedAnswers getSelectedAnswers() {
        return selectedAnswers;
    }

    /**
     * Sets the value of the selectedAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedAnswers }
     *     
     */
    public void setSelectedAnswers(SelectedAnswers value) {
        this.selectedAnswers = value;
    }

    /**
     * Gets the value of the followupQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link AnsweredPromptQuestions.FollowupQuestions }
     *     
     */
    public AnsweredPromptQuestions.FollowupQuestions getFollowupQuestions() {
        return followupQuestions;
    }

    /**
     * Sets the value of the followupQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsweredPromptQuestions.FollowupQuestions }
     *     
     */
    public void setFollowupQuestions(AnsweredPromptQuestions.FollowupQuestions value) {
        this.followupQuestions = value;
    }

    /**
     * Gets the value of the apiToUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiToUse() {
        return apiToUse;
    }

    /**
     * Sets the value of the apiToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiToUse(String value) {
        this.apiToUse = value;
    }

    /**
     * Gets the value of the memberAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAttribute() {
        return memberAttribute;
    }

    /**
     * Sets the value of the memberAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberAttribute(String value) {
        this.memberAttribute = value;
    }

    /**
     * Gets the value of the additionalAttrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAttrName() {
        return additionalAttrName;
    }

    /**
     * Sets the value of the additionalAttrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAttrName(String value) {
        this.additionalAttrName = value;
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
     *                   &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        protected List<AnsweredPromptQuestions.AnswerChoices.AnswerOption> answerOption;

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
         * {@link AnsweredPromptQuestions.AnswerChoices.AnswerOption }
         * 
         * 
         */
        public List<AnsweredPromptQuestions.AnswerChoices.AnswerOption> getAnswerOption() {
            if (answerOption == null) {
                answerOption = new ArrayList<AnsweredPromptQuestions.AnswerChoices.AnswerOption>();
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
         *         &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "buttonTxt",
            "answerTxt"
        })
        public static class AnswerOption {

            @XmlElement(name = "AnswerChoiceID")
            protected String answerChoiceID;
            @XmlElement(name = "ButtonTxt")
            protected String buttonTxt;
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
             * Gets the value of the buttonTxt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getButtonTxt() {
                return buttonTxt;
            }

            /**
             * Sets the value of the buttonTxt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setButtonTxt(String value) {
                this.buttonTxt = value;
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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}FollowupQuestion" maxOccurs="unbounded"/&gt;
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
        protected List<FollowupQuestion> followupQuestion;

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
         * {@link FollowupQuestion }
         * 
         * 
         */
        public List<FollowupQuestion> getFollowupQuestion() {
            if (followupQuestion == null) {
                followupQuestion = new ArrayList<FollowupQuestion>();
            }
            return this.followupQuestion;
        }

    }

}
