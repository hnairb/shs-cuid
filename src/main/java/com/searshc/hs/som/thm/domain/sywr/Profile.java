
package com.searshc.hs.som.thm.domain.sywr;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Profile", targetNamespace = "http://www.epsilon.com/webservices/", wsdlLocation = "profile.wsdl")
public class Profile
    extends Service
{

    private final static URL PROFILE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.searshc.hs.som.thm.domain.sywr.Profile.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.searshc.hs.som.thm.domain.sywr.Profile.class.getResource("");
            url = new URL(baseUrl, "profile.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'profile.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PROFILE_WSDL_LOCATION = url;
    }

    public Profile(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Profile() {
        super(PROFILE_WSDL_LOCATION, new QName("http://www.epsilon.com/webservices/", "Profile"));
    }

    /**
     * 
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap")
    public ProfileSoap getProfileSoap() {
        return super.getPort(new QName("http://www.epsilon.com/webservices/", "ProfileSoap"), ProfileSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap")
    public ProfileSoap getProfileSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.epsilon.com/webservices/", "ProfileSoap"), ProfileSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap12")
    public ProfileSoap getProfileSoap12() {
        return super.getPort(new QName("http://www.epsilon.com/webservices/", "ProfileSoap12"), ProfileSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfileSoap
     */
    @WebEndpoint(name = "ProfileSoap12")
    public ProfileSoap getProfileSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.epsilon.com/webservices/", "ProfileSoap12"), ProfileSoap.class, features);
    }

}
