//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.10 at 12:44:04 PM IST 
//


package com.searshc.hs.som.thm.domain.sywr;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rewards.sears.com/schemas/profile/}CheckoutPromptQuestions" maxOccurs="unbounded"/>
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
    "checkoutPromptQuestions"
})
@XmlRootElement(name = "CheckoutPrompt")
public class CheckoutPrompt {

    @XmlElement(name = "CheckoutPromptQuestions", required = true)
    protected List<CheckoutPromptQuestions> checkoutPromptQuestions;

    /**
     * Gets the value of the checkoutPromptQuestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkoutPromptQuestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckoutPromptQuestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckoutPromptQuestions }
     * 
     * 
     */
    public List<CheckoutPromptQuestions> getCheckoutPromptQuestions() {
        if (checkoutPromptQuestions == null) {
            checkoutPromptQuestions = new ArrayList<CheckoutPromptQuestions>();
        }
        return this.checkoutPromptQuestions;
    }

}
