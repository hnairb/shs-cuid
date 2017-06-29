
package com.searshc.hs.psc.partorderdirect.vo.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.searshc.hs.psc.partorderdirectservice.ws.service.CreatePartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDetailsRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.UpdatePartOrderDirectRequestVO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.searshc.hs.psc.partorderdirect.vo.request package. 
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

    private final static QName _CreatePartOrderDirectRequestVO_QNAME = new QName("http://request.vo.partorderdirect.psc.hs.searshc.com", "createPartOrderDirectRequestVO");
    private final static QName _GetRefundPartOrderDirectRequestVO_QNAME = new QName("http://request.vo.partorderdirect.psc.hs.searshc.com", "getRefundPartOrderDirectRequestVO");
    private final static QName _UpdatePartOrderDirectRequestVO_QNAME = new QName("http://request.vo.partorderdirect.psc.hs.searshc.com", "updatePartOrderDirectRequestVO");
    private final static QName _SearchPartOrderDirectRequestVO_QNAME = new QName("http://request.vo.partorderdirect.psc.hs.searshc.com", "searchPartOrderDirectRequestVO");
    private final static QName _SearchPartOrderDetailsRequestVO_QNAME = new QName("http://request.vo.partorderdirect.psc.hs.searshc.com", "searchPartOrderDetailsRequestVO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.searshc.hs.psc.partorderdirect.vo.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRefundPartOrderDirectRequestVO }
     * 
     */
    public GetRefundPartOrderDirectRequestVO createGetRefundPartOrderDirectRequestVO() {
        return new GetRefundPartOrderDirectRequestVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.vo.partorderdirect.psc.hs.searshc.com", name = "createPartOrderDirectRequestVO")
    public JAXBElement<CreatePartOrderDirectRequestVO> createCreatePartOrderDirectRequestVO(CreatePartOrderDirectRequestVO value) {
        return new JAXBElement<CreatePartOrderDirectRequestVO>(_CreatePartOrderDirectRequestVO_QNAME, CreatePartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefundPartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.vo.partorderdirect.psc.hs.searshc.com", name = "getRefundPartOrderDirectRequestVO")
    public JAXBElement<GetRefundPartOrderDirectRequestVO> createGetRefundPartOrderDirectRequestVO(GetRefundPartOrderDirectRequestVO value) {
        return new JAXBElement<GetRefundPartOrderDirectRequestVO>(_GetRefundPartOrderDirectRequestVO_QNAME, GetRefundPartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.vo.partorderdirect.psc.hs.searshc.com", name = "updatePartOrderDirectRequestVO")
    public JAXBElement<UpdatePartOrderDirectRequestVO> createUpdatePartOrderDirectRequestVO(UpdatePartOrderDirectRequestVO value) {
        return new JAXBElement<UpdatePartOrderDirectRequestVO>(_UpdatePartOrderDirectRequestVO_QNAME, UpdatePartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.vo.partorderdirect.psc.hs.searshc.com", name = "searchPartOrderDirectRequestVO")
    public JAXBElement<SearchPartOrderDirectRequestVO> createSearchPartOrderDirectRequestVO(SearchPartOrderDirectRequestVO value) {
        return new JAXBElement<SearchPartOrderDirectRequestVO>(_SearchPartOrderDirectRequestVO_QNAME, SearchPartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDetailsRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.vo.partorderdirect.psc.hs.searshc.com", name = "searchPartOrderDetailsRequestVO")
    public JAXBElement<SearchPartOrderDetailsRequestVO> createSearchPartOrderDetailsRequestVO(SearchPartOrderDetailsRequestVO value) {
        return new JAXBElement<SearchPartOrderDetailsRequestVO>(_SearchPartOrderDetailsRequestVO_QNAME, SearchPartOrderDetailsRequestVO.class, null, value);
    }

}
