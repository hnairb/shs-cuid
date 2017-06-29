
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for ReprintRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReprintRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ReprintRequest")

public class ReprintRequest
    extends ABaseRequest
{

    @XmlElement(required = true, nillable = true)
    protected String agmtSfx;
    @XmlElement(required = true, nillable = true)
    protected String custNum;
    @XmlElement(required = true, nillable = true)
    protected String empId;
    @XmlElement(required = true, nillable = true)
    protected String serviceUnit;

    /**
     * Gets the value of the agmtSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtSfx() {
        return agmtSfx;
    }

    /**
     * Sets the value of the agmtSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtSfx(String value) {
        this.agmtSfx = value;
    }

    /**
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNum(String value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the serviceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUnit() {
        return serviceUnit;
    }

    /**
     * Sets the value of the serviceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUnit(String value) {
        this.serviceUnit = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReprintRequest [agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", custNum=");
		builder.append(custNum);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", serviceUnit=");
		builder.append(serviceUnit);
		builder.append("]");
		return builder.toString();
	}
    
    

}
