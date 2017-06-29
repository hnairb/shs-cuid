
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtendedProfilePreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtendedProfilePreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedProfilePreference" type="{http://www.epsilon.com/webservices/}ExtendedProfilePreference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedProfilePreference", propOrder = {
    "extendedProfilePreference"
})
public class ArrayOfExtendedProfilePreference {

    @XmlElement(name = "ExtendedProfilePreference", nillable = true)
    protected List<ExtendedProfilePreference2> extendedProfilePreference;

    /**
     * Gets the value of the extendedProfilePreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedProfilePreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedProfilePreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedProfilePreference2 }
     * 
     * 
     */
    public List<ExtendedProfilePreference2> getExtendedProfilePreference() {
        if (extendedProfilePreference == null) {
            extendedProfilePreference = new ArrayList<ExtendedProfilePreference2>();
        }
        return this.extendedProfilePreference;
    }

}
