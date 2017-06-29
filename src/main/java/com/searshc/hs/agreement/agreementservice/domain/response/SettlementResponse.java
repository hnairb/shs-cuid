
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for SettlementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementResponse">
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
@XmlRootElement(name = "SettlementResponse")
public class SettlementResponse
    extends ABaseResponse
{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SettlementResponse []");
		return builder.toString();
	}


}
