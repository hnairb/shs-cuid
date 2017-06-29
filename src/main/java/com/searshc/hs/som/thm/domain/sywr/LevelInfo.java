
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LevelMetaData" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LevelData" minOccurs="0"/>
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
    "levelMetaData",
    "levelData"
})
@XmlRootElement(name = "LevelInfo")
public class LevelInfo {

    @XmlElement(name = "LevelMetaData")
    protected LevelMetaData levelMetaData;
    @XmlElement(name = "LevelData")
    protected LevelData levelData;

    /**
     * Gets the value of the levelMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link LevelMetaData }
     *     
     */
    public LevelMetaData getLevelMetaData() {
        return levelMetaData;
    }

    /**
     * Sets the value of the levelMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelMetaData }
     *     
     */
    public void setLevelMetaData(LevelMetaData value) {
        this.levelMetaData = value;
    }

    /**
     * Gets the value of the levelData property.
     * 
     * @return
     *     possible object is
     *     {@link LevelData }
     *     
     */
    public LevelData getLevelData() {
        return levelData;
    }

    /**
     * Sets the value of the levelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelData }
     *     
     */
    public void setLevelData(LevelData value) {
        this.levelData = value;
    }

}