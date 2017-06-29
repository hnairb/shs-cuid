
package com.epsilon.webservices;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceCode"/&gt;
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceResponseCode"/&gt;
 *           &lt;element ref="{http://www.epsilon.com/webservices/}PreferenceValue"/&gt;
 *         &lt;/choice&gt;
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
    "preferenceCodeOrPreferenceResponseCodeOrPreferenceValue"
})
@XmlRootElement(name = "ExtendedProfilePreference")
public class ExtendedProfilePreference {

    @XmlElementRefs({
        @XmlElementRef(name = "PreferenceResponseCode", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PreferenceValue", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PreferenceCode", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class, required = false)
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
