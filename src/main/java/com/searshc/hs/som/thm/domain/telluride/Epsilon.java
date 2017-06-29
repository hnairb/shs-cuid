
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="MTServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Response" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Additional" minOccurs="0"/>
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
    "mtServerName",
    "response",
    "additional"
})
@XmlRootElement(name = "Epsilon")
public class Epsilon {

    @XmlElementRef(name = "MTServerName", namespace = "http://www.epsilon.com/webservices/", type = JAXBElement.class)
    protected JAXBElement<String> mtServerName;
    @XmlElement(name = "Response")
    protected Response response;
    @XmlElement(name = "Additional")
    protected Additional additional;

    /**
     * Gets the value of the mtServerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTServerName() {
        return mtServerName;
    }

    /**
     * Sets the value of the mtServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTServerName(JAXBElement<String> value) {
        this.mtServerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link Additional }
     *     
     */
    public Additional getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Additional }
     *     
     */
    public void setAdditional(Additional value) {
        this.additional = value;
    }

}
