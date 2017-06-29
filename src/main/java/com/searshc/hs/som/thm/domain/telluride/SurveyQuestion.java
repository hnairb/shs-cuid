
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
 *         &lt;element name="QuestionGroupID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}anyType" form="qualified"/>
 *         &lt;element name="QuestionText" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "questionGroupID",
    "questionID",
    "questionText"
})
@XmlRootElement(name = "SurveyQuestion")
public class SurveyQuestion {

    @XmlElement(name = "QuestionGroupID")
    protected Object questionGroupID;
    @XmlElement(name = "QuestionID", required = true)
    protected Object questionID;
    @XmlElement(name = "QuestionText", required = true)
    protected String questionText;

    /**
     * Gets the value of the questionGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuestionGroupID() {
        return questionGroupID;
    }

    /**
     * Sets the value of the questionGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuestionGroupID(Object value) {
        this.questionGroupID = value;
    }

    /**
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuestionID(Object value) {
        this.questionID = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

}
