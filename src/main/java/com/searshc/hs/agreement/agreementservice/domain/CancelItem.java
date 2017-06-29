package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CancelItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CancelItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "CancelItem", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelItem", propOrder = { "itemSfx", "netRefund", "status",
		"taxRefund" })
public class CancelItem {

	@XmlElement(required = true, nillable = true)
	protected String itemSfx;
	@XmlElement(required = true, nillable = true)
	protected String netRefund;
	@XmlElement(required = true, nillable = true)
	protected String status;
	@XmlElement(required = true, nillable = true)
	protected String taxRefund;

	/**
	 * Gets the value of the itemSfx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemSfx() {
		return itemSfx;
	}

	/**
	 * Sets the value of the itemSfx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItemSfx(String value) {
		this.itemSfx = value;
	}

	/**
	 * Gets the value of the netRefund property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetRefund() {
		return netRefund;
	}

	/**
	 * Sets the value of the netRefund property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNetRefund(String value) {
		this.netRefund = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the taxRefund property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxRefund() {
		return taxRefund;
	}

	/**
	 * Sets the value of the taxRefund property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxRefund(String value) {
		this.taxRefund = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CancelItem [itemSfx=");
		builder.append(itemSfx);
		builder.append(", netRefund=");
		builder.append(netRefund);
		builder.append(", status=");
		builder.append(status);
		builder.append(", taxRefund=");
		builder.append(taxRefund);
		builder.append("]");
		return builder.toString();
	}

}
