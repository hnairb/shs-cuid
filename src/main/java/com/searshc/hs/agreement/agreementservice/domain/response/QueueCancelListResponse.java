
package com.searshc.hs.agreement.agreementservice.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.request.ArrayOfTns6NillableQueueCancel;


/**
 * <p>Java class for QueueCancelListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueCancelListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://response.domain.os.sears.com}ABaseResponse">
 *       &lt;sequence>
 *         &lt;element name="cancelCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cancels" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_QueueCancel"/>
 *         &lt;element name="nonPosCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="posCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "QueueCancelListResponse")
public class QueueCancelListResponse
    extends ABaseResponse
{

    protected int cancelCnt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns6NillableQueueCancel cancels;
    protected int nonPosCnt;
    protected int posCnt;

    /**
     * Gets the value of the cancelCnt property.
     * 
     */
    public int getCancelCnt() {
        return cancelCnt;
    }

    /**
     * Sets the value of the cancelCnt property.
     * 
     */
    public void setCancelCnt(int value) {
        this.cancelCnt = value;
    }

    /**
     * Gets the value of the cancels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns6NillableQueueCancel }
     *     
     */
    public ArrayOfTns6NillableQueueCancel getCancels() {
        return cancels;
    }

    /**
     * Sets the value of the cancels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns6NillableQueueCancel }
     *     
     */
    public void setCancels(ArrayOfTns6NillableQueueCancel value) {
        this.cancels = value;
    }

    /**
     * Gets the value of the nonPosCnt property.
     * 
     */
    public int getNonPosCnt() {
        return nonPosCnt;
    }

    /**
     * Sets the value of the nonPosCnt property.
     * 
     */
    public void setNonPosCnt(int value) {
        this.nonPosCnt = value;
    }

    /**
     * Gets the value of the posCnt property.
     * 
     */
    public int getPosCnt() {
        return posCnt;
    }

    /**
     * Sets the value of the posCnt property.
     * 
     */
    public void setPosCnt(int value) {
        this.posCnt = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancelListResponse [cancelCnt=");
		builder.append(cancelCnt);
		builder.append(", cancels=");
		builder.append(cancels);
		builder.append(", nonPosCnt=");
		builder.append(nonPosCnt);
		builder.append(", posCnt=");
		builder.append(posCnt);
		builder.append("]");
		return builder.toString();
	}

}
