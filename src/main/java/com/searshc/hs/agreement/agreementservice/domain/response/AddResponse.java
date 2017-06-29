
package com.searshc.hs.agreement.agreementservice.domain.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.request.ArrayOfTns6NillableAddStatus;


/**
 * <p>Java class for AddResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="cnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statuses" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_AddStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AddResponse")

public class AddResponse
    extends ABaseResponse
{

    protected int cnt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableAddStatus statuses;

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
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableAddStatus }
     *     
     */
    public ArrayOfTns6NillableAddStatus getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableAddStatus }
     *     
     */
    public void setStatuses(ArrayOfTns6NillableAddStatus value) {
        this.statuses = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddResponse [cnt=");
		builder.append(cnt);
		builder.append(", statuses=");
		builder.append(statuses);
		builder.append(", code=");
		builder.append(code);
		builder.append(", messages=");
		builder.append(Arrays.toString(messages));
		builder.append(", processId=");
		builder.append(processId);
		builder.append(", serverName=");
		builder.append(serverName);
		builder.append(", subCode=");
		builder.append(subCode);
		builder.append("]");
		return builder.toString();
	}

	

}
