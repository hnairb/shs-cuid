
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.searshc.hs.psc.partorderdirect.vo.request.GetRefundPartOrderDirectRequestVO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.searshc.hs.psc.partorderdirectservice.ws.service package. 
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

    private final static QName _CreatePartOrderDirectRequestVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "CreatePartOrderDirectRequestVO");
    private final static QName _SearchPartOrderDetailsResponseVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "SearchPartOrderDetailsResponseVO");
    private final static QName _SearchPartOrderDetailsRequestVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "SearchPartOrderDetailsRequestVO");
    private final static QName _SearchPartOrderDirectRequestVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "SearchPartOrderDirectRequestVO");
    private final static QName _GetRefundPartOrderDirectRequestVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "GetRefundPartOrderDirectRequestVO");
    private final static QName _UpdatePartOrderDirectResponseVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "UpdatePartOrderDirectResponseVO");
    private final static QName _UpdatePartOrderDirectRequestVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "UpdatePartOrderDirectRequestVO");
    private final static QName _CreatePartOrderDirectResponseVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "CreatePartOrderDirectResponseVO");
    private final static QName _GetRefundPartOrderDirectResponseVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "GetRefundPartOrderDirectResponseVO");
    private final static QName _SearchPartOrderDirectResponseVO_QNAME = new QName("http://service.ws.partorderdirectservice.psc.hs.searshc.com", "SearchPartOrderDirectResponseVO");
    private final static QName _SearchPartOrderDirectRequestVOOrderReferenceNo_QNAME = new QName("", "orderReferenceNo");
    private final static QName _SearchPartOrderDirectRequestVOPartOrderDate_QNAME = new QName("", "partOrderDate");
    private final static QName _SearchPartOrderDirectRequestVOExtClientOrderNo_QNAME = new QName("", "extClientOrderNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.searshc.hs.psc.partorderdirectservice.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePartOrderDirectResponseVO }
     * 
     */
    public CreatePartOrderDirectResponseVO createCreatePartOrderDirectResponseVO() {
        return new CreatePartOrderDirectResponseVO();
    }

    /**
     * Create an instance of {@link UpdatePartOrderDirectResponseVO }
     * 
     */
    public UpdatePartOrderDirectResponseVO createUpdatePartOrderDirectResponseVO() {
        return new UpdatePartOrderDirectResponseVO();
    }

    /**
     * Create an instance of {@link GetRefundPartOrderDirectResponseVO }
     * 
     */
    public GetRefundPartOrderDirectResponseVO createGetRefundPartOrderDirectResponseVO() {
        return new GetRefundPartOrderDirectResponseVO();
    }

    /**
     * Create an instance of {@link SearchPartOrderDirectResponseVO }
     * 
     */
    public SearchPartOrderDirectResponseVO createSearchPartOrderDirectResponseVO() {
        return new SearchPartOrderDirectResponseVO();
    }

    /**
     * Create an instance of {@link SearchPartOrderDetailsResponseVO }
     * 
     */
    public SearchPartOrderDetailsResponseVO createSearchPartOrderDetailsResponseVO() {
        return new SearchPartOrderDetailsResponseVO();
    }

    /**
     * Create an instance of {@link SearchPartOrderDetailsRequestVO }
     * 
     */
    public SearchPartOrderDetailsRequestVO createSearchPartOrderDetailsRequestVO() {
        return new SearchPartOrderDetailsRequestVO();
    }

    /**
     * Create an instance of {@link SearchPartOrderDirectRequestVO }
     * 
     */
    public SearchPartOrderDirectRequestVO createSearchPartOrderDirectRequestVO() {
        return new SearchPartOrderDirectRequestVO();
    }

    /**
     * Create an instance of {@link CreatePartOrderDirectRequestVO }
     * 
     */
    public CreatePartOrderDirectRequestVO createCreatePartOrderDirectRequestVO() {
        return new CreatePartOrderDirectRequestVO();
    }

    /**
     * Create an instance of {@link UpdatePartOrderDirectRequestVO }
     * 
     */
    public UpdatePartOrderDirectRequestVO createUpdatePartOrderDirectRequestVO() {
        return new UpdatePartOrderDirectRequestVO();
    }

    /**
     * Create an instance of {@link ABaseServiceResponseVO }
     * 
     */
    public ABaseServiceResponseVO createABaseServiceResponseVO() {
        return new ABaseServiceResponseVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3SearchPartOrderVO }
     * 
     */
    public ArrayOfTns3SearchPartOrderVO createArrayOfTns3SearchPartOrderVO() {
        return new ArrayOfTns3SearchPartOrderVO();
    }

    /**
     * Create an instance of {@link PartOrderPaymentRefundVO }
     * 
     */
    public PartOrderPaymentRefundVO createPartOrderPaymentRefundVO() {
        return new PartOrderPaymentRefundVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3OrderNameAddressVO }
     * 
     */
    public ArrayOfTns3OrderNameAddressVO createArrayOfTns3OrderNameAddressVO() {
        return new ArrayOfTns3OrderNameAddressVO();
    }

    /**
     * Create an instance of {@link SearchPartOrderVO }
     * 
     */
    public SearchPartOrderVO createSearchPartOrderVO() {
        return new SearchPartOrderVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns5PartOrderMarkdownVO }
     * 
     */
    public ArrayOfTns5PartOrderMarkdownVO createArrayOfTns5PartOrderMarkdownVO() {
        return new ArrayOfTns5PartOrderMarkdownVO();
    }

    /**
     * Create an instance of {@link PartOrderCommentVO }
     * 
     */
    public PartOrderCommentVO createPartOrderCommentVO() {
        return new PartOrderCommentVO();
    }

    /**
     * Create an instance of {@link PartOrderLineVO2 }
     * 
     */
    public PartOrderLineVO2 createPartOrderLineVO2() {
        return new PartOrderLineVO2();
    }

    /**
     * Create an instance of {@link ArrayOfTns3PartOrderLineVO2 }
     * 
     */
    public ArrayOfTns3PartOrderLineVO2 createArrayOfTns3PartOrderLineVO2() {
        return new ArrayOfTns3PartOrderLineVO2();
    }

    /**
     * Create an instance of {@link SYWRTransVo }
     * 
     */
    public SYWRTransVo createSYWRTransVo() {
        return new SYWRTransVo();
    }

    /**
     * Create an instance of {@link ArrayOfTns3PartOrderLineVO }
     * 
     */
    public ArrayOfTns3PartOrderLineVO createArrayOfTns3PartOrderLineVO() {
        return new ArrayOfTns3PartOrderLineVO();
    }

    /**
     * Create an instance of {@link ABaseServiceRequestVO }
     * 
     */
    public ABaseServiceRequestVO createABaseServiceRequestVO() {
        return new ABaseServiceRequestVO();
    }

    /**
     * Create an instance of {@link PartOrderLineRefundVO }
     * 
     */
    public PartOrderLineRefundVO createPartOrderLineRefundVO() {
        return new PartOrderLineRefundVO();
    }

    /**
     * Create an instance of {@link EmailParam }
     * 
     */
    public EmailParam createEmailParam() {
        return new EmailParam();
    }

    /**
     * Create an instance of {@link ArrayOfTns3PartOrderPaymentRefundVO }
     * 
     */
    public ArrayOfTns3PartOrderPaymentRefundVO createArrayOfTns3PartOrderPaymentRefundVO() {
        return new ArrayOfTns3PartOrderPaymentRefundVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns5SYWRTransVo }
     * 
     */
    public ArrayOfTns5SYWRTransVo createArrayOfTns5SYWRTransVo() {
        return new ArrayOfTns5SYWRTransVo();
    }

    /**
     * Create an instance of {@link ArrayOfTns5EmailParam }
     * 
     */
    public ArrayOfTns5EmailParam createArrayOfTns5EmailParam() {
        return new ArrayOfTns5EmailParam();
    }

    /**
     * Create an instance of {@link OrderNameAddressVO }
     * 
     */
    public OrderNameAddressVO createOrderNameAddressVO() {
        return new OrderNameAddressVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns5PartOrderDetailVO }
     * 
     */
    public ArrayOfTns5PartOrderDetailVO createArrayOfTns5PartOrderDetailVO() {
        return new ArrayOfTns5PartOrderDetailVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3OrderPaymentVO }
     * 
     */
    public ArrayOfTns3OrderPaymentVO createArrayOfTns3OrderPaymentVO() {
        return new ArrayOfTns3OrderPaymentVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3PartOrderLineRefundVO }
     * 
     */
    public ArrayOfTns3PartOrderLineRefundVO createArrayOfTns3PartOrderLineRefundVO() {
        return new ArrayOfTns3PartOrderLineRefundVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3PartOrderRefundVO }
     * 
     */
    public ArrayOfTns3PartOrderRefundVO createArrayOfTns3PartOrderRefundVO() {
        return new ArrayOfTns3PartOrderRefundVO();
    }

    /**
     * Create an instance of {@link PartOrderRefundVO }
     * 
     */
    public PartOrderRefundVO createPartOrderRefundVO() {
        return new PartOrderRefundVO();
    }

    /**
     * Create an instance of {@link PartOrderMarkdownVO }
     * 
     */
    public PartOrderMarkdownVO createPartOrderMarkdownVO() {
        return new PartOrderMarkdownVO();
    }

    /**
     * Create an instance of {@link PartOrderDetailVO }
     * 
     */
    public PartOrderDetailVO createPartOrderDetailVO() {
        return new PartOrderDetailVO();
    }

    /**
     * Create an instance of {@link OrderReferenceVO }
     * 
     */
    public OrderReferenceVO createOrderReferenceVO() {
        return new OrderReferenceVO();
    }

    /**
     * Create an instance of {@link OrderPhoneVO }
     * 
     */
    public OrderPhoneVO createOrderPhoneVO() {
        return new OrderPhoneVO();
    }

    /**
     * Create an instance of {@link ArrayOfTns3OrderPhoneVO }
     * 
     */
    public ArrayOfTns3OrderPhoneVO createArrayOfTns3OrderPhoneVO() {
        return new ArrayOfTns3OrderPhoneVO();
    }

    /**
     * Create an instance of {@link PartOrderLineVO }
     * 
     */
    public PartOrderLineVO createPartOrderLineVO() {
        return new PartOrderLineVO();
    }

    /**
     * Create an instance of {@link OrderPaymentVO }
     * 
     */
    public OrderPaymentVO createOrderPaymentVO() {
        return new OrderPaymentVO();
    }

    /**
     * Create an instance of {@link PartOrderVO }
     * 
     */
    public PartOrderVO createPartOrderVO() {
        return new PartOrderVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "CreatePartOrderDirectRequestVO")
    public JAXBElement<CreatePartOrderDirectRequestVO> createCreatePartOrderDirectRequestVO(CreatePartOrderDirectRequestVO value) {
        return new JAXBElement<CreatePartOrderDirectRequestVO>(_CreatePartOrderDirectRequestVO_QNAME, CreatePartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDetailsResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "SearchPartOrderDetailsResponseVO")
    public JAXBElement<SearchPartOrderDetailsResponseVO> createSearchPartOrderDetailsResponseVO(SearchPartOrderDetailsResponseVO value) {
        return new JAXBElement<SearchPartOrderDetailsResponseVO>(_SearchPartOrderDetailsResponseVO_QNAME, SearchPartOrderDetailsResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDetailsRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "SearchPartOrderDetailsRequestVO")
    public JAXBElement<SearchPartOrderDetailsRequestVO> createSearchPartOrderDetailsRequestVO(SearchPartOrderDetailsRequestVO value) {
        return new JAXBElement<SearchPartOrderDetailsRequestVO>(_SearchPartOrderDetailsRequestVO_QNAME, SearchPartOrderDetailsRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "SearchPartOrderDirectRequestVO")
    public JAXBElement<SearchPartOrderDirectRequestVO> createSearchPartOrderDirectRequestVO(SearchPartOrderDirectRequestVO value) {
        return new JAXBElement<SearchPartOrderDirectRequestVO>(_SearchPartOrderDirectRequestVO_QNAME, SearchPartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefundPartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "GetRefundPartOrderDirectRequestVO")
    public JAXBElement<GetRefundPartOrderDirectRequestVO> createGetRefundPartOrderDirectRequestVO(GetRefundPartOrderDirectRequestVO value) {
        return new JAXBElement<GetRefundPartOrderDirectRequestVO>(_GetRefundPartOrderDirectRequestVO_QNAME, GetRefundPartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "UpdatePartOrderDirectResponseVO")
    public JAXBElement<UpdatePartOrderDirectResponseVO> createUpdatePartOrderDirectResponseVO(UpdatePartOrderDirectResponseVO value) {
        return new JAXBElement<UpdatePartOrderDirectResponseVO>(_UpdatePartOrderDirectResponseVO_QNAME, UpdatePartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartOrderDirectRequestVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "UpdatePartOrderDirectRequestVO")
    public JAXBElement<UpdatePartOrderDirectRequestVO> createUpdatePartOrderDirectRequestVO(UpdatePartOrderDirectRequestVO value) {
        return new JAXBElement<UpdatePartOrderDirectRequestVO>(_UpdatePartOrderDirectRequestVO_QNAME, UpdatePartOrderDirectRequestVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "CreatePartOrderDirectResponseVO")
    public JAXBElement<CreatePartOrderDirectResponseVO> createCreatePartOrderDirectResponseVO(CreatePartOrderDirectResponseVO value) {
        return new JAXBElement<CreatePartOrderDirectResponseVO>(_CreatePartOrderDirectResponseVO_QNAME, CreatePartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefundPartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "GetRefundPartOrderDirectResponseVO")
    public JAXBElement<GetRefundPartOrderDirectResponseVO> createGetRefundPartOrderDirectResponseVO(GetRefundPartOrderDirectResponseVO value) {
        return new JAXBElement<GetRefundPartOrderDirectResponseVO>(_GetRefundPartOrderDirectResponseVO_QNAME, GetRefundPartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartOrderDirectResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.partorderdirectservice.psc.hs.searshc.com", name = "SearchPartOrderDirectResponseVO")
    public JAXBElement<SearchPartOrderDirectResponseVO> createSearchPartOrderDirectResponseVO(SearchPartOrderDirectResponseVO value) {
        return new JAXBElement<SearchPartOrderDirectResponseVO>(_SearchPartOrderDirectResponseVO_QNAME, SearchPartOrderDirectResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderReferenceNo", scope = SearchPartOrderDirectRequestVO.class)
    public JAXBElement<Long> createSearchPartOrderDirectRequestVOOrderReferenceNo(Long value) {
        return new JAXBElement<Long>(_SearchPartOrderDirectRequestVOOrderReferenceNo_QNAME, Long.class, SearchPartOrderDirectRequestVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partOrderDate", scope = SearchPartOrderDirectRequestVO.class)
    public JAXBElement<String> createSearchPartOrderDirectRequestVOPartOrderDate(String value) {
        return new JAXBElement<String>(_SearchPartOrderDirectRequestVOPartOrderDate_QNAME, String.class, SearchPartOrderDirectRequestVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extClientOrderNo", scope = SearchPartOrderDirectRequestVO.class)
    public JAXBElement<String> createSearchPartOrderDirectRequestVOExtClientOrderNo(String value) {
        return new JAXBElement<String>(_SearchPartOrderDirectRequestVOExtClientOrderNo_QNAME, String.class, SearchPartOrderDirectRequestVO.class, value);
    }

}
