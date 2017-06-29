
package com.epsilon.webservices.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.epsilon.webservices.Offer;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epsilon.webservices.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DollarValueOfPointsRedeemedOnBaseOffer_QNAME = new QName("http://www.epsilon.com/webservices/common", "DollarValueOfPointsRedeemedOnBaseOffer");
    private final static QName _DollarValueOfPointsRedeemedOnBonusOffer_QNAME = new QName("http://www.epsilon.com/webservices/common", "DollarValueOfPointsRedeemedOnBonusOffer");
    private final static QName _MemberSavingsDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/common", "MemberSavingsDollarValue");
    private final static QName _Offer_QNAME = new QName("http://www.epsilon.com/webservices/common", "Offer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epsilon.webservices.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "DollarValueOfPointsRedeemedOnBaseOffer")
    public JAXBElement<String> createDollarValueOfPointsRedeemedOnBaseOffer(String value) {
        return new JAXBElement<String>(_DollarValueOfPointsRedeemedOnBaseOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "DollarValueOfPointsRedeemedOnBonusOffer")
    public JAXBElement<String> createDollarValueOfPointsRedeemedOnBonusOffer(String value) {
        return new JAXBElement<String>(_DollarValueOfPointsRedeemedOnBonusOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "MemberSavingsDollarValue")
    public JAXBElement<String> createMemberSavingsDollarValue(String value) {
        return new JAXBElement<String>(_MemberSavingsDollarValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Offer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "Offer")
    public JAXBElement<Offer> createOffer(Offer value) {
        return new JAXBElement<Offer>(_Offer_QNAME, Offer.class, null, value);
    }

}
