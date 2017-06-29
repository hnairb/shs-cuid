
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigInteger;
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
 *         &lt;element name="CampaignControlID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SurveyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SurveyDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "campaignControlID",
    "surveyID",
    "categoryID",
    "surveyDescription"
})
@XmlRootElement(name = "Survey")
public class Survey {

    @XmlElement(name = "CampaignControlID")
    protected BigInteger campaignControlID;
    @XmlElement(name = "SurveyID", required = true)
    protected BigInteger surveyID;
    @XmlElement(name = "CategoryID")
    protected BigInteger categoryID;
    @XmlElement(name = "SurveyDescription", required = true)
    protected String surveyDescription;

    /**
     * Gets the value of the campaignControlID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCampaignControlID() {
        return campaignControlID;
    }

    /**
     * Sets the value of the campaignControlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCampaignControlID(BigInteger value) {
        this.campaignControlID = value;
    }

    /**
     * Gets the value of the surveyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSurveyID() {
        return surveyID;
    }

    /**
     * Sets the value of the surveyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSurveyID(BigInteger value) {
        this.surveyID = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryID(BigInteger value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the surveyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyDescription() {
        return surveyDescription;
    }

    /**
     * Sets the value of the surveyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyDescription(String value) {
        this.surveyDescription = value;
    }

}
