//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.30 at 04:44:08 PM CST 
//


package com.searshc.hs.agreement.agreementservice.domain.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.searshc.hs.agreement.agreementservice.domain.ItemDetail;


/**
 * <p>Java class for itemDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.agreementservice.agreement.hs.searshc.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="cnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="details" type="{http://domain.agreementservice.agreement.hs.searshc.com}itemDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="ItemDetailsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDetailsResponse", propOrder = {
    "cnt",
    "details"
})
public class ItemDetailsResponse
    extends ABaseResponse
{

    protected int cnt;
    @XmlElement(nillable = true)
    protected List<ItemDetail> details;

    /**
     * Gets the value of the cnt property.
     * 
     */
    public int getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     */
    public void setCnt(int value) {
        this.cnt = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetail }
     * 
     * 
     */
    public List<ItemDetail> getDetails() {
        if (details == null) {
            details = new ArrayList<ItemDetail>();
        }
        return this.details;
    }

}
