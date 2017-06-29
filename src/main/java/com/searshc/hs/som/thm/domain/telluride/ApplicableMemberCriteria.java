
package com.searshc.hs.som.thm.domain.telluride;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberEarnTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberGroups" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}YearToDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnrollmentTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CurrentPointBalance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberAdditionalOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberEarnTypes",
    "memberNumbers",
    "memberGroups",
    "yearToDate",
    "enrollmentTrackingCode",
    "currentPointBalance",
    "memberAdditionalOptions"
})
@XmlRootElement(name = "ApplicableMemberCriteria")
public class ApplicableMemberCriteria {

    @XmlElement(name = "MemberEarnTypes")
    protected List<MemberEarnTypes> memberEarnTypes;
    @XmlElement(name = "MemberNumbers")
    protected List<MemberNumbers> memberNumbers;
    @XmlElement(name = "MemberGroups")
    protected List<MemberGroups> memberGroups;
    @XmlElement(name = "YearToDate")
    protected List<YearToDate> yearToDate;
    @XmlElement(name = "EnrollmentTrackingCode", namespace = "")
    protected String enrollmentTrackingCode;
    @XmlElement(name = "CurrentPointBalance")
    protected List<CurrentPointBalance> currentPointBalance;
    @XmlElement(name = "MemberAdditionalOptions")
    protected List<MemberAdditionalOptions> memberAdditionalOptions;

    /**
     * Gets the value of the memberEarnTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberEarnTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberEarnTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberEarnTypes }
     * 
     * 
     */
    public List<MemberEarnTypes> getMemberEarnTypes() {
        if (memberEarnTypes == null) {
            memberEarnTypes = new ArrayList<MemberEarnTypes>();
        }
        return this.memberEarnTypes;
    }

    /**
     * Gets the value of the memberNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberNumbers }
     * 
     * 
     */
    public List<MemberNumbers> getMemberNumbers() {
        if (memberNumbers == null) {
            memberNumbers = new ArrayList<MemberNumbers>();
        }
        return this.memberNumbers;
    }

    /**
     * Gets the value of the memberGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberGroups }
     * 
     * 
     */
    public List<MemberGroups> getMemberGroups() {
        if (memberGroups == null) {
            memberGroups = new ArrayList<MemberGroups>();
        }
        return this.memberGroups;
    }

    /**
     * Gets the value of the yearToDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearToDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearToDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YearToDate }
     * 
     * 
     */
    public List<YearToDate> getYearToDate() {
        if (yearToDate == null) {
            yearToDate = new ArrayList<YearToDate>();
        }
        return this.yearToDate;
    }

    /**
     * Gets the value of the enrollmentTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentTrackingCode() {
        return enrollmentTrackingCode;
    }

    /**
     * Sets the value of the enrollmentTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentTrackingCode(String value) {
        this.enrollmentTrackingCode = value;
    }

    /**
     * Gets the value of the currentPointBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentPointBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentPointBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentPointBalance }
     * 
     * 
     */
    public List<CurrentPointBalance> getCurrentPointBalance() {
        if (currentPointBalance == null) {
            currentPointBalance = new ArrayList<CurrentPointBalance>();
        }
        return this.currentPointBalance;
    }

    /**
     * Gets the value of the memberAdditionalOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberAdditionalOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberAdditionalOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberAdditionalOptions }
     * 
     * 
     */
    public List<MemberAdditionalOptions> getMemberAdditionalOptions() {
        if (memberAdditionalOptions == null) {
            memberAdditionalOptions = new ArrayList<MemberAdditionalOptions>();
        }
        return this.memberAdditionalOptions;
    }

}
