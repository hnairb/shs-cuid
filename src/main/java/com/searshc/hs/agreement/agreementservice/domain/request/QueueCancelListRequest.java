
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for QueueCancelListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueCancelListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="unitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "QueueCancelListRequest")

public class QueueCancelListRequest
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String unitNo;

    /**
     * Gets the value of the unitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNo() {
        return unitNo;
    }

    /**
     * Sets the value of the unitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNo(String value) {
        this.unitNo = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancelListRequest [unitNo=");
		builder.append(unitNo);
		builder.append("]");
		return builder.toString();
	}

    
}
