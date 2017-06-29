
package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for ManualLeadRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualLeadRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://request.domain.os.sears.com}ABaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ledTypCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agmtSrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noComRsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autrhorizedContactDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactReasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subContactReasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custLocSuffix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="earliestCoverageStartDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadContactNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadCustNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="leadScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberApplicancesOwn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneAreaCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneExchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premCustFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceFacUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techAssocNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipExtCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketFactoryNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ManualLeadPendingRequestVO")

public class ManualLeadPendingRequestVO
    extends ManualLeadRequestVO
{}
