
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceCode"/>
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceResponseCode"/>
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceValue"/>
 *         &lt;/choice>
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
    "preferenceCodeOrPreferenceResponseCodeOrPreferenceValue"
})
@XmlRootElement(name = "ExtendedProfilePreference")
public class ExtendedProfilePreference {

    @XmlElementRefs({
        @XmlElementRef(name = "PreferenceCode", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class),
        @XmlElementRef(name = "PreferenceResponseCode", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class),
        @XmlElementRef(name = "PreferenceValue", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> preferenceCodeOrPreferenceResponseCodeOrPreferenceValue;

    /**
     * Gets the value of the preferenceCodeOrPreferenceResponseCodeOrPreferenceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCodeOrPreferenceResponseCodeOrPreferenceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCodeOrPreferenceResponseCodeOrPreferenceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getPreferenceCodeOrPreferenceResponseCodeOrPreferenceValue() {
        if (preferenceCodeOrPreferenceResponseCodeOrPreferenceValue == null) {
            preferenceCodeOrPreferenceResponseCodeOrPreferenceValue = new ArrayList<JAXBElement<String>>();
        }
        return this.preferenceCodeOrPreferenceResponseCodeOrPreferenceValue;
    }

}
