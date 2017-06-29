
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for LeadDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadDetailsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="custLocSuffix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadContactNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadCustNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "LeadDetailsRequest")

public class LeadDetailsRequest
    extends ABaseRequest
{

    protected int custLocSuffix;
    protected int leadContactNo;
    protected long leadCustNo;
    protected int leadNo;

    /**
     * Gets the value of the custLocSuffix property.
     * 
     */
    public int getCustLocSuffix() {
        return custLocSuffix;
    }

    /**
     * Sets the value of the custLocSuffix property.
     * 
     */
    public void setCustLocSuffix(int value) {
        this.custLocSuffix = value;
    }

    /**
     * Gets the value of the leadContactNo property.
     * 
     */
    public int getLeadContactNo() {
        return leadContactNo;
    }

    /**
     * Sets the value of the leadContactNo property.
     * 
     */
    public void setLeadContactNo(int value) {
        this.leadContactNo = value;
    }

    /**
     * Gets the value of the leadCustNo property.
     * 
     */
    public long getLeadCustNo() {
        return leadCustNo;
    }

    /**
     * Sets the value of the leadCustNo property.
     * 
     */
    public void setLeadCustNo(long value) {
        this.leadCustNo = value;
    }

    /**
     * Gets the value of the leadNo property.
     * 
     */
    public int getLeadNo() {
        return leadNo;
    }

    /**
     * Sets the value of the leadNo property.
     * 
     */
    public void setLeadNo(int value) {
        this.leadNo = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadDetailsRequest [custLocSuffix=");
		builder.append(custLocSuffix);
		builder.append(", leadContactNo=");
		builder.append(leadContactNo);
		builder.append(", leadCustNo=");
		builder.append(leadCustNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append("]");
		return builder.toString();
	}
    
    

}
