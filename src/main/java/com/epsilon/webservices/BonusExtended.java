
package com.epsilon.webservices;

import java.math.BigDecimal;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.epsilon.com/webservices/}Bonus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BonusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QualifiedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bonusCode",
    "qualifiedAmount"
})
@XmlRootElement(name = "BonusExtended")
public class BonusExtended
    extends Bonus
{

    @XmlElement(name = "BonusCode", required = true)
    protected String bonusCode;
    @XmlElement(name = "QualifiedAmount", required = true)
    protected BigDecimal qualifiedAmount;

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

    /**
     * Gets the value of the qualifiedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQualifiedAmount() {
        return qualifiedAmount;
    }

    /**
     * Sets the value of the qualifiedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQualifiedAmount(BigDecimal value) {
        this.qualifiedAmount = value;
    }

}
