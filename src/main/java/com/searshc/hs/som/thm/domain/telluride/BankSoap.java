
package com.searshc.hs.som.thm.domain.telluride;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BankSoap", targetNamespace = "http://www.epsilon.com/webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankSoap {


    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(operationName = "AddMemberToGroup", action = "http://www.epsilon.com/webservices/AddMemberToGroup")
    @WebResult(name = "AddMemberToGroupResponse", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public Object addMemberToGroup(
        @WebParam(name = "AddMemberToGroup", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
        AddMemberToGroup parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(operationName = "PostAdjustmentPoints", action = "http://www.epsilon.com/webservices/PostAdjustmentPoints")
    @WebResult(name = "PostAdjustmentPointsResponse", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public Object postAdjustmentPoints(
        @WebParam(name = "PostAdjustmentPoints", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
        PostAdjustmentPoints parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns OfferRegistrationResponse
     */
    @WebMethod(operationName = "OfferRegistration", action = "http://www.epsilon.com/webservices/OfferRegistration")
    @WebResult(name = "OfferRegistrationResponse", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public OfferRegistrationResponse offerRegistration(
        @WebParam(name = "OfferRegistration", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
        OfferRegistration parameters);

    /**
     * 
     * @param memberNumber
     * @param messageVersion
     * @param txnTimeStamp
     * @param trialBalanceFlag
     * @param txnId
     * @param currentTime
     * @param storeNumber
     * @param offerMemberGroupList
     * @param currentDate
     * @param txnNumber
     * @param clubCode
     * @param memberId
     * @param isReprocess
     * @param registerNumber
     * @param requestorID
     * @return
     *     returns com.searshc.hs.som.thm.domain.telluride.TestPostPointsResponse.TestBankResult
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.epsilon.com/webservices/TestPostPoints")
    @WebResult(name = "TestBankResult", targetNamespace = "http://www.epsilon.com/webservices/")
    @RequestWrapper(localName = "testPostPoints", targetNamespace = "http://www.epsilon.com/webservices/", className = "com.searshc.hs.som.thm.domain.telluride.TestPostPoints")
    @ResponseWrapper(localName = "TestPostPointsResponse", targetNamespace = "http://www.epsilon.com/webservices/", className = "com.searshc.hs.som.thm.domain.telluride.TestPostPointsResponse")
    public com.searshc.hs.som.thm.domain.telluride.TestPostPointsResponse.TestBankResult testPostPoints(
        @WebParam(name = "MessageVersion", targetNamespace = "http://www.epsilon.com/webservices/")
        String messageVersion,
        @WebParam(name = "ClubCode", targetNamespace = "http://www.epsilon.com/webservices/")
        String clubCode,
        @WebParam(name = "MemberNumber", targetNamespace = "http://www.epsilon.com/webservices/")
        String memberNumber,
        @WebParam(name = "TxnId", targetNamespace = "http://www.epsilon.com/webservices/")
        String txnId,
        @WebParam(name = "RequestorID", targetNamespace = "http://www.epsilon.com/webservices/")
        String requestorID,
        @WebParam(name = "RegisterNumber", targetNamespace = "http://www.epsilon.com/webservices/")
        String registerNumber,
        @WebParam(name = "StoreNumber", targetNamespace = "http://www.epsilon.com/webservices/")
        String storeNumber,
        @WebParam(name = "txnTimeStamp", targetNamespace = "http://www.epsilon.com/webservices/")
        String txnTimeStamp,
        @WebParam(name = "txnNumber", targetNamespace = "http://www.epsilon.com/webservices/")
        String txnNumber,
        @WebParam(name = "isReprocess", targetNamespace = "http://www.epsilon.com/webservices/")
        String isReprocess,
        @WebParam(name = "currentDate", targetNamespace = "http://www.epsilon.com/webservices/")
        String currentDate,
        @WebParam(name = "currentTime", targetNamespace = "http://www.epsilon.com/webservices/")
        String currentTime,
        @WebParam(name = "trialBalanceFlag", targetNamespace = "http://www.epsilon.com/webservices/")
        String trialBalanceFlag,
        @WebParam(name = "memberId", targetNamespace = "http://www.epsilon.com/webservices/")
        String memberId,
        @WebParam(name = "OfferMemberGroupList", targetNamespace = "http://www.epsilon.com/webservices/")
        LineItemList offerMemberGroupList)
        throws Exception_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(operationName = "PostPartnerPoints", action = "http://www.epsilon.com/webservices/PostPartnerPoints")
    @WebResult(name = "PostPartnerPointsResponse", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public Object postPartnerPoints(
        @WebParam(name = "PostPartnerPoints", targetNamespace = "http://www.epsilon.com/webservices/", partName = "parameters")
        PostPartnerPoints parameters);

}
