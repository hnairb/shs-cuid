
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for ReprintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReprintResponse">
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
@XmlRootElement(name = "ReprintResponse")
public class ReprintResponse
    extends ABaseResponse
{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReprintResponse []");
		return builder.toString();
	}

	


}
