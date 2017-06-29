
package com.epsilon.webservices;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LevelValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LevelValueDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "levelValue",
    "levelValueDesc"
})
@XmlRootElement(name = "LevelData")
public class LevelData {

    @XmlElement(name = "LevelValue")
    protected String levelValue;
    @XmlElement(name = "LevelValueDesc")
    protected String levelValueDesc;

    /**
     * Gets the value of the levelValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelValue() {
        return levelValue;
    }

    /**
     * Sets the value of the levelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelValue(String value) {
        this.levelValue = value;
    }

    /**
     * Gets the value of the levelValueDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelValueDesc() {
        return levelValueDesc;
    }

    /**
     * Sets the value of the levelValueDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelValueDesc(String value) {
        this.levelValueDesc = value;
    }

}
