
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RedeemableSurprisePoints" maxOccurs="unbounded"/>
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
    "redeemableSurprisePoints"
})
@XmlRootElement(name = "MaxRedeemableSurprisePointsList")
public class MaxRedeemableSurprisePointsList {

    @XmlElement(name = "RedeemableSurprisePoints", required = true, nillable = true)
    protected List<Object> redeemableSurprisePoints;

    /**
     * Gets the value of the redeemableSurprisePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redeemableSurprisePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedeemableSurprisePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRedeemableSurprisePoints() {
        if (redeemableSurprisePoints == null) {
            redeemableSurprisePoints = new ArrayList<Object>();
        }
        return this.redeemableSurprisePoints;
    }

}
