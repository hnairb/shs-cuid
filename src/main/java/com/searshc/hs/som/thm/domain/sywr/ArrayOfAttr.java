
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAttr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attr" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="attrname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="attrvalue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttr", propOrder = {
    "attr"
})
public class ArrayOfAttr {

    @XmlElement(name = "Attr", nillable = true)
    protected List<ArrayOfAttr.Attr> attr;

    /**
     * Gets the value of the attr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAttr.Attr }
     * 
     * 
     */
    public List<ArrayOfAttr.Attr> getAttr() {
        if (attr == null) {
            attr = new ArrayList<ArrayOfAttr.Attr>();
        }
        return this.attr;
    }


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
     *       &lt;/sequence>
     *       &lt;attribute name="attrname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="attrvalue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Attr {

        @XmlAttribute
        protected String attrname;
        @XmlAttribute
        protected String attrvalue;

        /**
         * Gets the value of the attrname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttrname() {
            return attrname;
        }

        /**
         * Sets the value of the attrname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttrname(String value) {
            this.attrname = value;
        }

        /**
         * Gets the value of the attrvalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttrvalue() {
            return attrvalue;
        }

        /**
         * Sets the value of the attrvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttrvalue(String value) {
            this.attrvalue = value;
        }

    }

}