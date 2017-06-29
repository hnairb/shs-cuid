
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMemberPrompt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMemberPrompt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromptGroups" type="{http://www.epsilon.com/webservices/}ArrayOfPromptGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMemberPrompt", propOrder = {
    "promptGroups"
})
public class GetMemberPrompt {

    @XmlElement(name = "PromptGroups")
    protected ArrayOfPromptGroup promptGroups;

    /**
     * Gets the value of the promptGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPromptGroup }
     *     
     */
    public ArrayOfPromptGroup getPromptGroups() {
        return promptGroups;
    }

    /**
     * Sets the value of the promptGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPromptGroup }
     *     
     */
    public void setPromptGroups(ArrayOfPromptGroup value) {
        this.promptGroups = value;
    }

}
