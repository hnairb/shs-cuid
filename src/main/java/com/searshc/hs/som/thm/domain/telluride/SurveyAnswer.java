
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
 *         &lt;element name="AnswerGroupID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AnswerID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="AnswerType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="AnswerText" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="AnswerValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "answerGroupID",
    "answerID",
    "answerType",
    "answerText",
    "answerValue"
})
@XmlRootElement(name = "SurveyAnswer")
public class SurveyAnswer {

    @XmlElement(name = "AnswerGroupID", namespace = "")
    protected Object answerGroupID;
    @XmlElement(name = "AnswerID", namespace = "", required = true)
    protected Object answerID;
    @XmlElement(name = "AnswerType", namespace = "", required = true)
    protected Object answerType;
    @XmlElement(name = "AnswerText", namespace = "", required = true)
    protected Object answerText;
    @XmlElement(name = "AnswerValue", namespace = "", required = true)
    protected Object answerValue;

    /**
     * Gets the value of the answerGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnswerGroupID() {
        return answerGroupID;
    }

    /**
     * Sets the value of the answerGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnswerGroupID(Object value) {
        this.answerGroupID = value;
    }

    /**
     * Gets the value of the answerID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnswerID() {
        return answerID;
    }

    /**
     * Sets the value of the answerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnswerID(Object value) {
        this.answerID = value;
    }

    /**
     * Gets the value of the answerType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnswerType(Object value) {
        this.answerType = value;
    }

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnswerText(Object value) {
        this.answerText = value;
    }

    /**
     * Gets the value of the answerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnswerValue() {
        return answerValue;
    }

    /**
     * Sets the value of the answerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnswerValue(Object value) {
        this.answerValue = value;
    }

}
