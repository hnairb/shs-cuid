
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.searshc.hs.psc.partorderdirect.vo.request.GetRefundPartOrderDirectRequestVO;


/**
 * <p>Java class for ABaseServiceRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ABaseServiceRequestVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABaseServiceRequestVO", propOrder = {
    "clientId"
})
@XmlSeeAlso({
    SearchPartOrderDetailsRequestVO.class,
    SearchPartOrderDirectRequestVO.class,
    GetRefundPartOrderDirectRequestVO.class,
    CreatePartOrderDirectRequestVO.class,
    UpdatePartOrderDirectRequestVO.class
})
public class ABaseServiceRequestVO {

    @XmlElement(name = "ClientId", required = true, nillable = true)
    protected String clientId;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

}
