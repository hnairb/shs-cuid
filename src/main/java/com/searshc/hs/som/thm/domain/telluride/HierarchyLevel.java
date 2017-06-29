
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LevelCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="LevelCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="LevelValue" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyLevel", propOrder = {
    "levelCode",
    "levelCodeDescription",
    "levelValue"
})
public class HierarchyLevel {

    @XmlElement(name = "LevelCode", required = true)
    protected String levelCode;
    @XmlElement(name = "LevelCodeDescription", required = true)
    protected String levelCodeDescription;
    @XmlElement(name = "LevelValue", required = true)
    protected String levelValue;

    /**
     * Gets the value of the levelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCode() {
        return levelCode;
    }

    /**
     * Sets the value of the levelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCode(String value) {
        this.levelCode = value;
    }

    /**
     * Gets the value of the levelCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCodeDescription() {
        return levelCodeDescription;
    }

    /**
     * Sets the value of the levelCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCodeDescription(String value) {
        this.levelCodeDescription = value;
    }

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

}
