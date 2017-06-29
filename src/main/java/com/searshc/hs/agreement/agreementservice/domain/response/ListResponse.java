package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.request.ArrayOfTns6NillableAgreement;


/**
 * <p>Java class for ListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="agreements" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_Agreement"/>
 *         &lt;element name="cnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ListResponse")

public class ListResponse
    extends ABaseResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableAgreement agreements;
    protected int cnt;

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableAgreement }
     *     
     */
    public ArrayOfTns6NillableAgreement getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableAgreement }
     *     
     */
    public void setAgreements(ArrayOfTns6NillableAgreement value) {
        this.agreements = value;
    }

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListResponse [agreements=");
		builder.append(agreements);
		builder.append(", cnt=");
		builder.append(cnt);
		builder.append("]");
		return builder.toString();
	}

}
