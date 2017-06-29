
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
 *         &lt;element name="Affinity" type="{http://www.epsilon.com/webservices/}Affinity" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AffinityExtended" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AffinityForMemberPricing" maxOccurs="unbounded" minOccurs="0"/>
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
    "affinity",
    "affinityExtended",
    "affinityForMemberPricing"
})
@XmlRootElement(name = "Affinities")
public class Affinities {

    @XmlElement(name = "Affinity")
    protected List<Affinity> affinity;
    @XmlElement(name = "AffinityExtended")
    protected List<AffinityExtended> affinityExtended;
    @XmlElement(name = "AffinityForMemberPricing")
    protected List<AffinityForMemberPricing> affinityForMemberPricing;

    /**
     * Gets the value of the affinity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Affinity }
     * 
     * 
     */
    public List<Affinity> getAffinity() {
        if (affinity == null) {
            affinity = new ArrayList<Affinity>();
        }
        return this.affinity;
    }

    /**
     * Gets the value of the affinityExtended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityExtended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinityExtended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityExtended }
     * 
     * 
     */
    public List<AffinityExtended> getAffinityExtended() {
        if (affinityExtended == null) {
            affinityExtended = new ArrayList<AffinityExtended>();
        }
        return this.affinityExtended;
    }

    /**
     * Gets the value of the affinityForMemberPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityForMemberPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinityForMemberPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityForMemberPricing }
     * 
     * 
     */
    public List<AffinityForMemberPricing> getAffinityForMemberPricing() {
        if (affinityForMemberPricing == null) {
            affinityForMemberPricing = new ArrayList<AffinityForMemberPricing>();
        }
        return this.affinityForMemberPricing;
    }

}
