
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
 *         &lt;element name="FollowupQuestionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionToFollowup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerstoFollowup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Answer" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="FollowupQuestionTextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupAttributeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestionLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestionLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestionLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestionLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupQuestionLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupAnswerTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupAnswerChoices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SelectedFollowupAnswers" minOccurs="0"/&gt;
 *         &lt;element name="FollowupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowupAttrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "selectedFollowupAnswers",
    "followupMemberAttribute",
    "followupAttrName"
})
@XmlRootElement(name = "FollowupQuestion")
public class FollowupQuestion {

    @XmlElement(name = "FollowupQuestionTitle")
    protected String followupQuestionTitle;
    @XmlElement(name = "QuestionToFollowup")
    protected String questionToFollowup;
    @XmlElement(name = "AnswerstoFollowup")
    protected FollowupQuestion.AnswerstoFollowup answerstoFollowup;
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
    protected FollowupQuestion.FollowupAnswerChoices followupAnswerChoices;
    @XmlElement(name = "SelectedFollowupAnswers")
    protected SelectedFollowupAnswers selectedFollowupAnswers;
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
     *     {@link FollowupQuestion.AnswerstoFollowup }
     *     
     */
    public FollowupQuestion.AnswerstoFollowup getAnswerstoFollowup() {
        return answerstoFollowup;
    }

    /**
     * Sets the value of the answerstoFollowup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowupQuestion.AnswerstoFollowup }
     *     
     */
    public void setAnswerstoFollowup(FollowupQuestion.AnswerstoFollowup value) {
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
     *     {@link FollowupQuestion.FollowupAnswerChoices }
     *     
     */
    public FollowupQuestion.FollowupAnswerChoices getFollowupAnswerChoices() {
        return followupAnswerChoices;
    }

    /**
     * Sets the value of the followupAnswerChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowupQuestion.FollowupAnswerChoices }
     *     
     */
    public void setFollowupAnswerChoices(FollowupQuestion.FollowupAnswerChoices value) {
        this.followupAnswerChoices = value;
    }

    /**
     * Gets the value of the selectedFollowupAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedFollowupAnswers }
     *     
     */
    public SelectedFollowupAnswers getSelectedFollowupAnswers() {
        return selectedFollowupAnswers;
    }

    /**
     * Sets the value of the selectedFollowupAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedFollowupAnswers }
     *     
     */
    public void setSelectedFollowupAnswers(SelectedFollowupAnswers value) {
        this.selectedFollowupAnswers = value;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Answer" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "answer"
    })
    public static class AnswerstoFollowup {

        @XmlElement(name = "Answer", required = true)
        protected List<FollowupQuestion.AnswerstoFollowup.Answer> answer;

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
         * {@link FollowupQuestion.AnswerstoFollowup.Answer }
         * 
         * 
         */
        public List<FollowupQuestion.AnswerstoFollowup.Answer> getAnswer() {
            if (answer == null) {
                answer = new ArrayList<FollowupQuestion.AnswerstoFollowup.Answer>();
            }
            return this.answer;
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
         *         &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FollowupAnswerChoice" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "followupAnswerChoice"
    })
    public static class FollowupAnswerChoices {

        @XmlElement(name = "FollowupAnswerChoice", required = true)
        protected List<FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice> followupAnswerChoice;

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
         * {@link FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice }
         * 
         * 
         */
        public List<FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice> getFollowupAnswerChoice() {
            if (followupAnswerChoice == null) {
                followupAnswerChoice = new ArrayList<FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice>();
            }
            return this.followupAnswerChoice;
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
         *         &lt;element name="FollowupAnswerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FollowupButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FollowupAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
