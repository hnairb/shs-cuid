package com.searshc.hs.agreement.agreementservice.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.searshc.hs.agreement.agreementservice.domain.request.ArrayOfTns6NillableAddItemStatus;

/**
 * <p>
 * Java class for AddStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AddStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="items" type="{http://service.agreement.hs.sears.com}ArrayOf_tns6_nillable_AddItemStatus"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AddStatus", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStatus", propOrder = { "agmtSfx", "cnt", "items",
		"addGiftCardStatus", "message", "statusCode", "totalAmount",
		"salesAuthNum" })
public class AddStatus {

	@XmlElement(required = true, nillable = true)
	protected String agmtSfx;
	protected int cnt;
	@XmlElement(required = true, nillable = true)
	protected ArrayOfTns6NillableAddItemStatus items;

	protected List<AddGiftCardStatus> addGiftCardStatus;
	@XmlElement(required = true, nillable = true)
	protected String message;
	@XmlElement(required = true, nillable = true)
	protected String statusCode;
	@XmlElement(required = true, nillable = true)
	protected String totalAmount;
	@XmlElement(required = true, nillable = true)
	protected String salesAuthNum;

	/**
	 * Gets the value of the agmtSfx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgmtSfx() {
		return agmtSfx;
	}

	/**
	 * Sets the value of the agmtSfx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgmtSfx(String value) {
		this.agmtSfx = value;
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

	/**
	 * Gets the value of the items property.
	 * 
	 * @return possible object is {@link ArrayOfTns6NillableAddItemStatus }
	 * 
	 */
	public ArrayOfTns6NillableAddItemStatus getItems() {
		return items;
	}

	/**
	 * Sets the value of the items property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfTns6NillableAddItemStatus }
	 * 
	 */
	public void setItems(ArrayOfTns6NillableAddItemStatus value) {
		this.items = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the statusCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the value of the statusCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatusCode(String value) {
		this.statusCode = value;
	}

	/**
	 * Gets the value of the totalAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalAmount() {
		return totalAmount;
	}

	/**
	 * Sets the value of the totalAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTotalAmount(String value) {
		this.totalAmount = value;
	}

	public List<AddGiftCardStatus> getAddGiftCardStatus() {
		return addGiftCardStatus;
	}

	public void setAddGiftCardStatus(List<AddGiftCardStatus> addGiftCardStatus) {
		this.addGiftCardStatus = addGiftCardStatus;
	}

	public String getSalesAuthNum() {
		return salesAuthNum;
	}

	public void setSalesAuthNum(String salesAuthNum) {
		this.salesAuthNum = salesAuthNum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddStatus [agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", cnt=");
		builder.append(cnt);
		builder.append(", items=");
		builder.append(items);
		builder.append(", message=");
		builder.append(message);
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append(", totalAmount=");
		builder.append(totalAmount);
		builder.append("]");
		return builder.toString();
	}

}
