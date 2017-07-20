
package com.searshc.hs.sywr.hs.searshc.com.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.sywr.hs.searshc.com.response package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.sywr.hs.searshc.com.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BalanceResponse }
     * 
     */
    public BalanceResponse createBalanceResponse() {
        return new BalanceResponse();
    }

    /**
     * Create an instance of {@link LookupResponse }
     * 
     */
    public LookupResponse createLookupResponse() {
        return new LookupResponse();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

}
