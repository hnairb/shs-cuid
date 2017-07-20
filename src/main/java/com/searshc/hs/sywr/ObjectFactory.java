
package com.searshc.hs.sywr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.searshc.hs.sywr.hs.searshc.com.request.LookupRequest;
import com.searshc.hs.sywr.hs.searshc.com.response.BalanceResponse;
import com.searshc.hs.sywr.hs.searshc.com.response.LookupResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sywr.hs.searshc.com.request package. 
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

    private final static QName _BalanceResponse_QNAME = new QName("http://com.searshc.hs.sywr/request", "BalanceResponse");
    private final static QName _LookupRequest_QNAME = new QName("http://com.searshc.hs.sywr/request", "LookupRequest");
    private final static QName _LookupResponse_QNAME = new QName("http://com.searshc.hs.sywr/request", "LookupResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sywr.hs.searshc.com.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.searshc.hs.sywr/request", name = "BalanceResponse")
    public JAXBElement<BalanceResponse> createBalanceResponse(BalanceResponse value) {
        return new JAXBElement<BalanceResponse>(_BalanceResponse_QNAME, BalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.searshc.hs.sywr/request", name = "LookupRequest")
    public JAXBElement<LookupRequest> createLookupRequest(LookupRequest value) {
        return new JAXBElement<LookupRequest>(_LookupRequest_QNAME, LookupRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.searshc.hs.sywr/request", name = "LookupResponse")
    public JAXBElement<LookupResponse> createLookupResponse(LookupResponse value) {
        return new JAXBElement<LookupResponse>(_LookupResponse_QNAME, LookupResponse.class, null, value);
    }

}
