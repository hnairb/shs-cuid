
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePartOrderDirectRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePartOrderDirectRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceRequestVO">
 *       &lt;sequence>
 *         &lt;element name="partOrderComment" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}PartOrderCommentVO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePartOrderDirectRequestVO", propOrder = {
    "partOrderComment"
})
public class UpdatePartOrderDirectRequestVO
    extends ABaseServiceRequestVO
{

    @XmlElement(required = true, nillable = true)
    protected PartOrderCommentVO partOrderComment;

    /**
     * Gets the value of the partOrderComment property.
     * 
     * @return
     *     possible object is
     *     {@link PartOrderCommentVO }
     *     
     */
    public PartOrderCommentVO getPartOrderComment() {
        return partOrderComment;
    }

    /**
     * Sets the value of the partOrderComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartOrderCommentVO }
     *     
     */
    public void setPartOrderComment(PartOrderCommentVO value) {
        this.partOrderComment = value;
    }

}
