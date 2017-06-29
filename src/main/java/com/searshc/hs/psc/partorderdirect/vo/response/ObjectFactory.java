
package com.searshc.hs.psc.partorderdirect.vo.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.searshc.hs.psc.partorderdirectservice.ws.service.CreatePartOrderDirectResponseVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.GetRefundPartOrderDirectResponseVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDetailsResponseVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.UpdatePartOrderDirectResponseVO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.searshc.hs.psc.partorderdirect.vo.response package. 
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

    private final static QName _GetRefundPartOrderDirectResponseVO_QNAME = new QName("http://response.vo.partorderdirect.psc.hs.searshc.com", "getRefundPartOrderDirectResponseVO");
    private final static QName _SearchPartOrderDirectResponseVO_QNAME = new QName("http://response.vo.partorderdirect.psc.hs.searshc.com", "searchPartOrderDirectResponseVO");
    private final static QName _CreatePartOrderDirectResponseVO_QNAME = new QName("http://response.vo.partorderdirect.psc.hs.searshc.com", "createPartOrderDirectResponseVO");
    private final static QName _SearchPartOrderDetailsResponseVO_QNAME = new QName("http://response.vo.partorderdirect.psc.hs.searshc.com", "searchPartOrderDetailsResponseVO");
    private final static QName _UpdatePartOrderDirectResponseVO_QNAME = new QName("http://response.vo.partorderdirect.psc.hs.searshc.com", "updatePartOrderDirectResponseVO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.searshc.hs.psc.partorderdirect.vo.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefundPartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.vo.partorderdirect.psc.hs.searshc.com", name = "getRefundPartOrderDirectResponseVO")
    public JAXBElement<GetRefundPartOrderDirectResponseVO> createGetRefundPartOrderDirectResponseVO(GetRefundPartOrderDirectResponseVO value) {
        return new JAXBElement<GetRefundPartOrderDirectResponseVO>(_GetRefundPartOrderDirectResponseVO_QNAME, GetRefundPartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.vo.partorderdirect.psc.hs.searshc.com", name = "searchPartOrderDirectResponseVO")
    public JAXBElement<SearchPartOrderDirectResponseVO> createSearchPartOrderDirectResponseVO(SearchPartOrderDirectResponseVO value) {
        return new JAXBElement<SearchPartOrderDirectResponseVO>(_SearchPartOrderDirectResponseVO_QNAME, SearchPartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.vo.partorderdirect.psc.hs.searshc.com", name = "createPartOrderDirectResponseVO")
    public JAXBElement<CreatePartOrderDirectResponseVO> createCreatePartOrderDirectResponseVO(CreatePartOrderDirectResponseVO value) {
        return new JAXBElement<CreatePartOrderDirectResponseVO>(_CreatePartOrderDirectResponseVO_QNAME, CreatePartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDetailsResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.vo.partorderdirect.psc.hs.searshc.com", name = "searchPartOrderDetailsResponseVO")
    public JAXBElement<SearchPartOrderDetailsResponseVO> createSearchPartOrderDetailsResponseVO(SearchPartOrderDetailsResponseVO value) {
        return new JAXBElement<SearchPartOrderDetailsResponseVO>(_SearchPartOrderDetailsResponseVO_QNAME, SearchPartOrderDetailsResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.vo.partorderdirect.psc.hs.searshc.com", name = "updatePartOrderDirectResponseVO")
    public JAXBElement<UpdatePartOrderDirectResponseVO> createUpdatePartOrderDirectResponseVO(UpdatePartOrderDirectResponseVO value) {
        return new JAXBElement<UpdatePartOrderDirectResponseVO>(_UpdatePartOrderDirectResponseVO_QNAME, UpdatePartOrderDirectResponseVO.class, null, value);
    }

}
