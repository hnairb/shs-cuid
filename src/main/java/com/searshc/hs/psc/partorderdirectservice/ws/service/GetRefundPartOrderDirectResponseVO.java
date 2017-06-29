
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRefundPartOrderDirectResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRefundPartOrderDirectResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceResponseVO">
 *       &lt;sequence>
 *         &lt;element name="reCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderRefundList" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_PartOrderRefundVO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRefundPartOrderDirectResponseVO", propOrder = {
    "reCntr",
    "partOrderRefundList"
})
public class GetRefundPartOrderDirectResponseVO
    extends ABaseServiceResponseVO
{

    protected int reCntr;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3PartOrderRefundVO partOrderRefundList;

    /**
     * Gets the value of the reCntr property.
     * 
     */
    public int getReCntr() {
        return reCntr;
    }

    /**
     * Sets the value of the reCntr property.
     * 
     */
    public void setReCntr(int value) {
        this.reCntr = value;
    }

    /**
     * Gets the value of the partOrderRefundList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3PartOrderRefundVO }
     *     
     */
    public ArrayOfTns3PartOrderRefundVO getPartOrderRefundList() {
        return partOrderRefundList;
    }

    /**
     * Sets the value of the partOrderRefundList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3PartOrderRefundVO }
     *     
     */
    public void setPartOrderRefundList(ArrayOfTns3PartOrderRefundVO value) {
        this.partOrderRefundList = value;
    }

}
