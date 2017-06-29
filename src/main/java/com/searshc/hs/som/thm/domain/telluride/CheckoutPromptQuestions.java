
package com.searshc.hs.som.thm.domain.telluride;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutPromptQuestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutPromptQuestions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionRuleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AnswerChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AnswerChoices" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AnswerOption" maxOccurs="unbounded" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
 *         &lt;element name="ApiToUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="FollowupQuestions" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FollowupQuestion" maxOccurs="unbounded" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FollowupQuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="QuestionToFollowup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="AnswerstoFollowup" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Answer" maxOccurs="unbounded" form="qualified">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupQuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupQuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupQuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupQuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupQuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupAnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupAnswerChoices" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded" form="qualified">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                                                 &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                                                 &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FollowupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="FollowupAttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutPromptQuestions", propOrder = {
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
    "answerChoice",
    "answerChoices",
    "apiToUse",
    "memberAttribute",
    "attrName",
    "followupQuestions"
})
public class CheckoutPromptQuestions {

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
    @XmlElement(name = "AnswerChoice")
    protected String answerChoice;
    @XmlElement(name = "AnswerChoices")
    protected CheckoutPromptQuestions.AnswerChoices answerChoices;
    @XmlElement(name = "ApiToUse")
    protected String apiToUse;
    @XmlElement(name = "MemberAttribute")
    protected String memberAttribute;
    @XmlElement(name = "AttrName")
    protected String attrName;
    @XmlElement(name = "FollowupQuestions")
    protected CheckoutPromptQuestions.FollowupQuestions followupQuestions;

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
     * Gets the value of the answerChoices property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutPromptQuestions.AnswerChoices }
     *     
     */
    public CheckoutPromptQuestions.AnswerChoices getAnswerChoices() {
        return answerChoices;
    }

    /**
     * Sets the value of the answerChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutPromptQuestions.AnswerChoices }
     *     
     */
    public void setAnswerChoices(CheckoutPromptQuestions.AnswerChoices value) {
        this.answerChoices = value;
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
     * Gets the value of the attrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Sets the value of the attrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Gets the value of the followupQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutPromptQuestions.FollowupQuestions }
     *     
     */
    public CheckoutPromptQuestions.FollowupQuestions getFollowupQuestions() {
        return followupQuestions;
    }

    /**
     * Sets the value of the followupQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutPromptQuestions.FollowupQuestions }
     *     
     */
    public void setFollowupQuestions(CheckoutPromptQuestions.FollowupQuestions value) {
        this.followupQuestions = value;
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
     *         &lt;element name="AnswerOption" maxOccurs="unbounded" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
        protected List<CheckoutPromptQuestions.AnswerChoices.AnswerOption> answerOption;

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
         * {@link CheckoutPromptQuestions.AnswerChoices.AnswerOption }
         * 
         * 
         */
        public List<CheckoutPromptQuestions.AnswerChoices.AnswerOption> getAnswerOption() {
            if (answerOption == null) {
                answerOption = new ArrayList<CheckoutPromptQuestions.AnswerChoices.AnswerOption>();
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
         *         &lt;element name="AnswerChoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="ButtonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="AnswerTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FollowupQuestion" maxOccurs="unbounded" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FollowupQuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="QuestionToFollowup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="AnswerstoFollowup" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Answer" maxOccurs="unbounded" form="qualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupQuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupQuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupQuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupQuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupQuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupAnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupAnswerChoices" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded" form="qualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                                       &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                                       &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FollowupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="FollowupAttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
        "followupQuestion"
    })
    public static class FollowupQuestions {

        @XmlElement(name = "FollowupQuestion", required = true)
        protected List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion> followupQuestion;

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
         * {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion }
         * 
         * 
         */
        public List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion> getFollowupQuestion() {
            if (followupQuestion == null) {
                followupQuestion = new ArrayList<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion>();
            }
            return this.followupQuestion;
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
         *         &lt;element name="FollowupQuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="QuestionToFollowup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="AnswerstoFollowup" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Answer" maxOccurs="unbounded" form="qualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
         *         &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupQuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupQuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupQuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupQuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupQuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupAnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupAnswerChoices" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded" form="qualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *                             &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *                             &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
         *         &lt;element name="FollowupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="FollowupAttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
            "followupQuestionTitle",
            "questionToFollowup",
            "answerstoFollowup",
            "followupQuestionTextID",
            "followupAttributeID",
            "followupQuestionLine1",
            "followupQuestionLine2",
            "followupQuestionLine3",
            "followupQuestionLine4",
            "followupQuestionLine5",
            "followupAnswerTemplate",
            "followupAnswerChoices",
            "followupMemberAttribute",
            "followupAttrName"
        })
        public static class FollowupQuestion {

            @XmlElement(name = "FollowupQuestionTitle")
            protected String followupQuestionTitle;
            @XmlElement(name = "QuestionToFollowup")
            protected String questionToFollowup;
            @XmlElement(name = "AnswerstoFollowup")
            protected CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup answerstoFollowup;
            @XmlElement(name = "FollowupQuestionTextID")
            protected String followupQuestionTextID;
            @XmlElement(name = "FollowupAttributeID")
            protected String followupAttributeID;
            @XmlElement(name = "FollowupQuestionLine1")
            protected String followupQuestionLine1;
            @XmlElement(name = "FollowupQuestionLine2")
            protected String followupQuestionLine2;
            @XmlElement(name = "FollowupQuestionLine3")
            protected String followupQuestionLine3;
            @XmlElement(name = "FollowupQuestionLine4")
            protected String followupQuestionLine4;
            @XmlElement(name = "FollowupQuestionLine5")
            protected String followupQuestionLine5;
            @XmlElement(name = "FollowupAnswerTemplate")
            protected String followupAnswerTemplate;
            @XmlElement(name = "FollowupAnswerChoices")
            protected CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices followupAnswerChoices;
            @XmlElement(name = "FollowupMemberAttribute")
            protected String followupMemberAttribute;
            @XmlElement(name = "FollowupAttrName")
            protected String followupAttrName;

            /**
             * Gets the value of the followupQuestionTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionTitle() {
                return followupQuestionTitle;
            }

            /**
             * Sets the value of the followupQuestionTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionTitle(String value) {
                this.followupQuestionTitle = value;
            }

            /**
             * Gets the value of the questionToFollowup property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuestionToFollowup() {
                return questionToFollowup;
            }

            /**
             * Sets the value of the questionToFollowup property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuestionToFollowup(String value) {
                this.questionToFollowup = value;
            }

            /**
             * Gets the value of the answerstoFollowup property.
             * 
             * @return
             *     possible object is
             *     {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup }
             *     
             */
            public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup getAnswerstoFollowup() {
                return answerstoFollowup;
            }

            /**
             * Sets the value of the answerstoFollowup property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup }
             *     
             */
            public void setAnswerstoFollowup(CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup value) {
                this.answerstoFollowup = value;
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
             * Gets the value of the followupQuestionLine1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionLine1() {
                return followupQuestionLine1;
            }

            /**
             * Sets the value of the followupQuestionLine1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionLine1(String value) {
                this.followupQuestionLine1 = value;
            }

            /**
             * Gets the value of the followupQuestionLine2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionLine2() {
                return followupQuestionLine2;
            }

            /**
             * Sets the value of the followupQuestionLine2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionLine2(String value) {
                this.followupQuestionLine2 = value;
            }

            /**
             * Gets the value of the followupQuestionLine3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionLine3() {
                return followupQuestionLine3;
            }

            /**
             * Sets the value of the followupQuestionLine3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionLine3(String value) {
                this.followupQuestionLine3 = value;
            }

            /**
             * Gets the value of the followupQuestionLine4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionLine4() {
                return followupQuestionLine4;
            }

            /**
             * Sets the value of the followupQuestionLine4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionLine4(String value) {
                this.followupQuestionLine4 = value;
            }

            /**
             * Gets the value of the followupQuestionLine5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupQuestionLine5() {
                return followupQuestionLine5;
            }

            /**
             * Sets the value of the followupQuestionLine5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupQuestionLine5(String value) {
                this.followupQuestionLine5 = value;
            }

            /**
             * Gets the value of the followupAnswerTemplate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupAnswerTemplate() {
                return followupAnswerTemplate;
            }

            /**
             * Sets the value of the followupAnswerTemplate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupAnswerTemplate(String value) {
                this.followupAnswerTemplate = value;
            }

            /**
             * Gets the value of the followupAnswerChoices property.
             * 
             * @return
             *     possible object is
             *     {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices }
             *     
             */
            public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices getFollowupAnswerChoices() {
                return followupAnswerChoices;
            }

            /**
             * Sets the value of the followupAnswerChoices property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices }
             *     
             */
            public void setFollowupAnswerChoices(CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices value) {
                this.followupAnswerChoices = value;
            }

            /**
             * Gets the value of the followupMemberAttribute property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupMemberAttribute() {
                return followupMemberAttribute;
            }

            /**
             * Sets the value of the followupMemberAttribute property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupMemberAttribute(String value) {
                this.followupMemberAttribute = value;
            }

            /**
             * Gets the value of the followupAttrName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFollowupAttrName() {
                return followupAttrName;
            }

            /**
             * Sets the value of the followupAttrName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFollowupAttrName(String value) {
                this.followupAttrName = value;
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
             *         &lt;element name="Answer" maxOccurs="unbounded" form="qualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
                "answer"
            })
            public static class AnswerstoFollowup {

                @XmlElement(name = "Answer", required = true)
                protected List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer> answer;

                /**
                 * Gets the value of the answer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the answer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAnswer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer }
                 * 
                 * 
                 */
                public List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer> getAnswer() {
                    if (answer == null) {
                        answer = new ArrayList<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer>();
                    }
                    return this.answer;
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
                 *         &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
                    "answerID"
                })
                public static class Answer {

                    @XmlElement(name = "AnswerID")
                    protected String answerID;

                    /**
                     * Gets the value of the answerID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnswerID() {
                        return answerID;
                    }

                    /**
                     * Sets the value of the answerID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnswerID(String value) {
                        this.answerID = value;
                    }

                }

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
             *         &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded" form="qualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
             *                   &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
             *                   &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
                "followupAnswerChoice"
            })
            public static class FollowupAnswerChoices {

                @XmlElement(name = "FollowupAnswerChoice", required = true)
                protected List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice> followupAnswerChoice;

                /**
                 * Gets the value of the followupAnswerChoice property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the followupAnswerChoice property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFollowupAnswerChoice().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice }
                 * 
                 * 
                 */
                public List<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice> getFollowupAnswerChoice() {
                    if (followupAnswerChoice == null) {
                        followupAnswerChoice = new ArrayList<CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice>();
                    }
                    return this.followupAnswerChoice;
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
                 *         &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
                 *         &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
                 *         &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
                    "followupAnswerID",
                    "followupButtonText",
                    "followupAnswerText"
                })
                public static class FollowupAnswerChoice {

                    @XmlElement(name = "FollowupAnswerID")
                    protected String followupAnswerID;
                    @XmlElement(name = "FollowupButtonText")
                    protected String followupButtonText;
                    @XmlElement(name = "FollowupAnswerText")
                    protected String followupAnswerText;

                    /**
                     * Gets the value of the followupAnswerID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFollowupAnswerID() {
                        return followupAnswerID;
                    }

                    /**
                     * Sets the value of the followupAnswerID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFollowupAnswerID(String value) {
                        this.followupAnswerID = value;
                    }

                    /**
                     * Gets the value of the followupButtonText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFollowupButtonText() {
                        return followupButtonText;
                    }

                    /**
                     * Sets the value of the followupButtonText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFollowupButtonText(String value) {
                        this.followupButtonText = value;
                    }

                    /**
                     * Gets the value of the followupAnswerText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFollowupAnswerText() {
                        return followupAnswerText;
                    }

                    /**
                     * Sets the value of the followupAnswerText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFollowupAnswerText(String value) {
                        this.followupAnswerText = value;
                    }

                }

            }

        }

    }

}
