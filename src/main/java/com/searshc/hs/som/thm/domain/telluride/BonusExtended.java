
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
 *     &lt;extension base="{http://www.epsilon.com/webservices/}Bonus">
 *       &lt;sequence>
 *         &lt;element name="BonusCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bonusCode"
})
@XmlRootElement(name = "BonusExtended")
public class BonusExtended
    extends Bonus
{

    @XmlElement(name = "BonusCode", required = true)
    protected String bonusCode;

    /**
     * Gets the value of the bonusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusCode() {
        return bonusCode;
    }

    /**
     * Sets the value of the bonusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusCode(String value) {
        this.bonusCode = value;
    }

}
