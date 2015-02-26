
package br.com.pos.hotel.services;

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
@WebServiceClient(name = "ReservaServiceService", targetNamespace = "http://services.hotel.pos.com.br/", wsdlLocation = "http://localhost:8080/HotelPOS/ReservaServiceService?WSDL")
public class ReservaServiceService
    extends Service
{

    private final static URL RESERVASERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException RESERVASERVICESERVICE_EXCEPTION;
    private final static QName RESERVASERVICESERVICE_QNAME = new QName("http://services.hotel.pos.com.br/", "ReservaServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelPOS/ReservaServiceService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVASERVICESERVICE_WSDL_LOCATION = url;
        RESERVASERVICESERVICE_EXCEPTION = e;
    }

    public ReservaServiceService() {
        super(__getWsdlLocation(), RESERVASERVICESERVICE_QNAME);
    }

    public ReservaServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVASERVICESERVICE_QNAME, features);
    }

    public ReservaServiceService(URL wsdlLocation) {
        super(wsdlLocation, RESERVASERVICESERVICE_QNAME);
    }

    public ReservaServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVASERVICESERVICE_QNAME, features);
    }

    public ReservaServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservaServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservaService
     */
    @WebEndpoint(name = "ReservaServicePort")
    public ReservaService getReservaServicePort() {
        return super.getPort(new QName("http://services.hotel.pos.com.br/", "ReservaServicePort"), ReservaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservaService
     */
    @WebEndpoint(name = "ReservaServicePort")
    public ReservaService getReservaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.hotel.pos.com.br/", "ReservaServicePort"), ReservaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVASERVICESERVICE_EXCEPTION!= null) {
            throw RESERVASERVICESERVICE_EXCEPTION;
        }
        return RESERVASERVICESERVICE_WSDL_LOCATION;
    }

}
