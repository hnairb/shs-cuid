
package com.searshc.hs.som.thm.domain.sywr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPOSPrompt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPOSPrompt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSPromptQuestions" type="{http://www.epsilon.com/webservices/}POSPromptQuestions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPOSPrompt", propOrder = {
    "posPromptQuestions"
})
public class ArrayOfPOSPrompt {

    @XmlElement(name = "POSPromptQuestions")
    protected POSPromptQuestions posPromptQuestions;

    /**
     * Gets the value of the posPromptQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link POSPromptQuestions }
     *     
     */
    public POSPromptQuestions getPOSPromptQuestions() {
        return posPromptQuestions;
    }

    /**
     * Sets the value of the posPromptQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSPromptQuestions }
     *     
     */
    public void setPOSPromptQuestions(POSPromptQuestions value) {
        this.posPromptQuestions = value;
    }

}
