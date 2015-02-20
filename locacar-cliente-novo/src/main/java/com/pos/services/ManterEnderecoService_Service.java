
package com.pos.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ManterEnderecoService", targetNamespace = "http://services.pos.com/", wsdlLocation = "http://localhost:8080/LocaCar-App/ManterEnderecoService?WSDL")
public class ManterEnderecoService_Service
    extends Service
{

    private final static URL MANTERENDERECOSERVICE_WSDL_LOCATION;
    private final static WebServiceException MANTERENDERECOSERVICE_EXCEPTION;
    private final static QName MANTERENDERECOSERVICE_QNAME = new QName("http://services.pos.com/", "ManterEnderecoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/LocaCar-App/ManterEnderecoService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANTERENDERECOSERVICE_WSDL_LOCATION = url;
        MANTERENDERECOSERVICE_EXCEPTION = e;
    }

    public ManterEnderecoService_Service() {
        super(__getWsdlLocation(), MANTERENDERECOSERVICE_QNAME);
    }

    public ManterEnderecoService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANTERENDERECOSERVICE_QNAME, features);
    }

    public ManterEnderecoService_Service(URL wsdlLocation) {
        super(wsdlLocation, MANTERENDERECOSERVICE_QNAME);
    }

    public ManterEnderecoService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANTERENDERECOSERVICE_QNAME, features);
    }

    public ManterEnderecoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManterEnderecoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ManterEnderecoService
     */
    @WebEndpoint(name = "ManterEnderecoServicePort")
    public ManterEnderecoService getManterEnderecoServicePort() {
        return super.getPort(new QName("http://services.pos.com/", "ManterEnderecoServicePort"), ManterEnderecoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManterEnderecoService
     */
    @WebEndpoint(name = "ManterEnderecoServicePort")
    public ManterEnderecoService getManterEnderecoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.pos.com/", "ManterEnderecoServicePort"), ManterEnderecoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANTERENDERECOSERVICE_EXCEPTION!= null) {
            throw MANTERENDERECOSERVICE_EXCEPTION;
        }
        return MANTERENDERECOSERVICE_WSDL_LOCATION;
    }

}
