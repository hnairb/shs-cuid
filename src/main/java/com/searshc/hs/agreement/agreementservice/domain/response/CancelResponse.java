
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for CancelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "CancelResponse")

public class CancelResponse
    extends ABaseResponse
{
	
	private String saleCheckNo;
	
	

	public String getSaleCheckNo() {
		return saleCheckNo;
	}



	public void setSaleCheckNo(String saleCheckNo) {
		this.saleCheckNo = saleCheckNo;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CancelResponse [saleCheckNo=");
		builder.append(saleCheckNo);
		builder.append("]");
		return builder.toString();
	}


}
