
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromptGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxPOSPrompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromptGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptGroup", propOrder = {
    "maxPOSPrompt",
    "promptGroupName"
})
public class PromptGroup {

    @XmlElement(name = "MaxPOSPrompt")
    protected String maxPOSPrompt;
    @XmlElement(name = "PromptGroupName")
    protected String promptGroupName;

    /**
     * Gets the value of the maxPOSPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPOSPrompt() {
        return maxPOSPrompt;
    }

    /**
     * Sets the value of the maxPOSPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPOSPrompt(String value) {
        this.maxPOSPrompt = value;
    }

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

}
