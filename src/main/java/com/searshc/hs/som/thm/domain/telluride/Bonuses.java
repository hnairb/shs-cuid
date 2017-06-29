
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
 *         &lt;element name="Bonus" type="{http://www.epsilon.com/webservices/}Bonus" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}BonusExtended" maxOccurs="unbounded" minOccurs="0"/>
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
    "bonus",
    "bonusExtended"
})
@XmlRootElement(name = "Bonuses")
public class Bonuses {

    @XmlElement(name = "Bonus")
    protected List<Bonus> bonus;
    @XmlElement(name = "BonusExtended")
    protected List<BonusExtended> bonusExtended;

    /**
     * Gets the value of the bonus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bonus }
     * 
     * 
     */
    public List<Bonus> getBonus() {
        if (bonus == null) {
            bonus = new ArrayList<Bonus>();
        }
        return this.bonus;
    }

    /**
     * Gets the value of the bonusExtended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonusExtended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusExtended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusExtended }
     * 
     * 
     */
    public List<BonusExtended> getBonusExtended() {
        if (bonusExtended == null) {
            bonusExtended = new ArrayList<BonusExtended>();
        }
        return this.bonusExtended;
    }

}
