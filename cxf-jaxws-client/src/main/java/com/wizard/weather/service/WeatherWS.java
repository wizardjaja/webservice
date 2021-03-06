package com.wizard.weather.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-20T23:38:40.066+08:00
 * Generated source version: 3.3.5
 */
@WebServiceClient(name = "weatherWS",
        wsdlLocation = "http://localhost:8888/soap/weather?wsdl",
        targetNamespace = "http://service.weather.wizard.com")
public class WeatherWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.weather.wizard.com", "weatherWS");
    public final static QName WeatherWSPort = new QName("http://service.weather.wizard.com", "weatherWSPort");

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8888/soap/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherWS.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "http://localhost:8888/soap/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WeatherWS(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     * @return returns WeatherService
     */
    @WebEndpoint(name = "weatherWSPort")
    public WeatherService getWeatherWSPort() {
        return super.getPort(WeatherWSPort, WeatherService.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns WeatherService
     */
    @WebEndpoint(name = "weatherWSPort")
    public WeatherService getWeatherWSPort(WebServiceFeature... features) {
        return super.getPort(WeatherWSPort, WeatherService.class, features);
    }

}
