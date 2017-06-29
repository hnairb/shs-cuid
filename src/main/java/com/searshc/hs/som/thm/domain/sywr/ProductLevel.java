
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LevelInfo" minOccurs="0"/>
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
    "levelInfo"
})
@XmlRootElement(name = "ProductLevel")
public class ProductLevel {

    @XmlElement(name = "LevelInfo")
    protected LevelInfo levelInfo;

    /**
     * Gets the value of the levelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LevelInfo }
     *     
     */
    public LevelInfo getLevelInfo() {
        return levelInfo;
    }

    /**
     * Sets the value of the levelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelInfo }
     *     
     */
    public void setLevelInfo(LevelInfo value) {
        this.levelInfo = value;
    }

}
