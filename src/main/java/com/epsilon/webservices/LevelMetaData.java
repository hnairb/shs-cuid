
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
 *         &lt;element name="LevelDesig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LevelDesigDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "levelDesig",
    "levelDesigDesc"
})
@XmlRootElement(name = "LevelMetaData")
public class LevelMetaData {

    @XmlElement(name = "LevelDesig")
    protected String levelDesig;
    @XmlElement(name = "LevelDesigDesc")
    protected String levelDesigDesc;

    /**
     * Gets the value of the levelDesig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelDesig() {
        return levelDesig;
    }

    /**
     * Sets the value of the levelDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelDesig(String value) {
        this.levelDesig = value;
    }

    /**
     * Gets the value of the levelDesigDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelDesigDesc() {
        return levelDesigDesc;
    }

    /**
     * Sets the value of the levelDesigDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelDesigDesc(String value) {
        this.levelDesigDesc = value;
    }

}
