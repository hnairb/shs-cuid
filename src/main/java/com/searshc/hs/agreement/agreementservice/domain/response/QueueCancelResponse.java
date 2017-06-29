
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for QueueCancelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueCancelResponse">
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
@XmlRootElement(name = "QueueCancelResponse")
public class QueueCancelResponse
    extends ABaseResponse
{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancelResponse []");
		return builder.toString();
	}

	


}
