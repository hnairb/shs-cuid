
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPartOrderDirectResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPartOrderDirectResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceResponseVO">
 *       &lt;sequence>
 *         &lt;element name="searchOrderList" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_SearchPartOrderVO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPartOrderDirectResponseVO", propOrder = {
    "searchOrderList"
})
public class SearchPartOrderDirectResponseVO
    extends ABaseServiceResponseVO
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3SearchPartOrderVO searchOrderList;

    /**
     * Gets the value of the searchOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3SearchPartOrderVO }
     *     
     */
    public ArrayOfTns3SearchPartOrderVO getSearchOrderList() {
        return searchOrderList;
    }

    /**
     * Sets the value of the searchOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3SearchPartOrderVO }
     *     
     */
    public void setSearchOrderList(ArrayOfTns3SearchPartOrderVO value) {
        this.searchOrderList = value;
    }

}
