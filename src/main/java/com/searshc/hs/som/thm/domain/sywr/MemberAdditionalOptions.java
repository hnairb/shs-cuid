
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}BirthDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}BirthMonth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}EnrolmentDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CardTypes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SubClubs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPStatusList" maxOccurs="unbounded" minOccurs="0"/>
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
    "birthDate",
    "birthMonth",
    "enrolmentDate",
    "cardTypes",
    "subClubs",
    "vipStatusList"
})
@XmlRootElement(name = "MemberAdditionalOptions")
public class MemberAdditionalOptions {

    @XmlElement(name = "BirthDate")
    protected List<BirthDate> birthDate;
    @XmlElement(name = "BirthMonth")
    protected List<BirthMonth> birthMonth;
    @XmlElement(name = "EnrolmentDate")
    protected List<EnrolmentDate> enrolmentDate;
    @XmlElement(name = "CardTypes")
    protected List<CardTypes> cardTypes;
    @XmlElement(name = "SubClubs")
    protected List<SubClubs> subClubs;
    @XmlElement(name = "VIPStatusList")
    protected List<VIPStatusList> vipStatusList;

    /**
     * Gets the value of the birthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BirthDate }
     * 
     * 
     */
    public List<BirthDate> getBirthDate() {
        if (birthDate == null) {
            birthDate = new ArrayList<BirthDate>();
        }
        return this.birthDate;
    }

    /**
     * Gets the value of the birthMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BirthMonth }
     * 
     * 
     */
    public List<BirthMonth> getBirthMonth() {
        if (birthMonth == null) {
            birthMonth = new ArrayList<BirthMonth>();
        }
        return this.birthMonth;
    }

    /**
     * Gets the value of the enrolmentDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrolmentDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrolmentDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrolmentDate }
     * 
     * 
     */
    public List<EnrolmentDate> getEnrolmentDate() {
        if (enrolmentDate == null) {
            enrolmentDate = new ArrayList<EnrolmentDate>();
        }
        return this.enrolmentDate;
    }

    /**
     * Gets the value of the cardTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTypes }
     * 
     * 
     */
    public List<CardTypes> getCardTypes() {
        if (cardTypes == null) {
            cardTypes = new ArrayList<CardTypes>();
        }
        return this.cardTypes;
    }

    /**
     * Gets the value of the subClubs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subClubs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubClubs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubClubs }
     * 
     * 
     */
    public List<SubClubs> getSubClubs() {
        if (subClubs == null) {
            subClubs = new ArrayList<SubClubs>();
        }
        return this.subClubs;
    }

    /**
     * Gets the value of the vipStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vipStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIPStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VIPStatusList }
     * 
     * 
     */
    public List<VIPStatusList> getVIPStatusList() {
        if (vipStatusList == null) {
            vipStatusList = new ArrayList<VIPStatusList>();
        }
        return this.vipStatusList;
    }

}
