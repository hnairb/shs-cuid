
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns5_PartOrderMarkdownVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns5_PartOrderMarkdownVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}PartOrderMarkdownVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns5_PartOrderMarkdownVO", propOrder = {
    "item"
})
public class ArrayOfTns5PartOrderMarkdownVO {

    protected List<PartOrderMarkdownVO> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartOrderMarkdownVO }
     * 
     * 
     */
    public List<PartOrderMarkdownVO> getItem() {
        if (item == null) {
            item = new ArrayList<PartOrderMarkdownVO>();
        }
        return this.item;
    }

}
