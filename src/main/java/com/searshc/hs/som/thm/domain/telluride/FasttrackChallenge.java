
package com.searshc.hs.som.thm.domain.telluride;

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
 *         &lt;element name="ChallengeDesc" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ChallengeOffer" maxOccurs="unbounded"/>
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
    "challengeDesc",
    "challengeOffer"
})
@XmlRootElement(name = "FasttrackChallenge")
public class FasttrackChallenge {

    @XmlElement(name = "ChallengeDesc", required = true)
    protected String challengeDesc;
    @XmlElement(name = "ChallengeOffer", required = true)
    protected List<ChallengeOffer> challengeOffer;

    /**
     * Gets the value of the challengeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeDesc() {
        return challengeDesc;
    }

    /**
     * Sets the value of the challengeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeDesc(String value) {
        this.challengeDesc = value;
    }

    /**
     * Gets the value of the challengeOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the challengeOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChallengeOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChallengeOffer }
     * 
     * 
     */
    public List<ChallengeOffer> getChallengeOffer() {
        if (challengeOffer == null) {
            challengeOffer = new ArrayList<ChallengeOffer>();
        }
        return this.challengeOffer;
    }

}
