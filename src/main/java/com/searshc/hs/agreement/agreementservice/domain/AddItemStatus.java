package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AddItemStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AddItemStatus", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemStatus", propOrder = { "errCode", "fieldNo", "itemSfx",
		"recType" })
public class AddItemStatus {

	@XmlElement(required = true, nillable = true)
	protected String errCode;
	@XmlElement(required = true, nillable = true)
	protected String fieldNo;
	@XmlElement(required = true, nillable = true)
	protected String itemSfx;
	@XmlElement(required = true, nillable = true)
	protected String recType;

	/**
	 * Gets the value of the errCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrCode() {
		return errCode;
	}

	/**
	 * Sets the value of the errCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrCode(String value) {
		this.errCode = value;
	}

	/**
	 * Gets the value of the fieldNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFieldNo() {
		return fieldNo;
	}

	/**
	 * Sets the value of the fieldNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFieldNo(String value) {
		this.fieldNo = value;
	}

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
	 * Gets the value of the recType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecType() {
		return recType;
	}

	/**
	 * Sets the value of the recType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecType(String value) {
		this.recType = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddItemStatus [errCode=");
		builder.append(errCode);
		builder.append(", fieldNo=");
		builder.append(fieldNo);
		builder.append(", itemSfx=");
		builder.append(itemSfx);
		builder.append(", recType=");
		builder.append(recType);
		builder.append("]");
		return builder.toString();
	}

	

}
