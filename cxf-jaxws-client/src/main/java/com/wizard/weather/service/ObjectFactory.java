
package com.wizard.weather.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.wizard.weather.service package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCitys_QNAME = new QName("http://service.weather.wizard.com/", "getCitys");
    private final static QName _GetCitysResponse_QNAME = new QName("http://service.weather.wizard.com/", "getCitysResponse");
    private final static QName _GetWeatherInfo_QNAME = new QName("http://service.weather.wizard.com/", "getWeatherInfo");
    private final static QName _GetWeatherInfoResponse_QNAME = new QName("http://service.weather.wizard.com/", "getWeatherInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wizard.weather.service
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCitys }
     */
    public GetCitys createGetCitys() {
        return new GetCitys();
    }

    /**
     * Create an instance of {@link GetCitysResponse }
     */
    public GetCitysResponse createGetCitysResponse() {
        return new GetCitysResponse();
    }

    /**
     * Create an instance of {@link GetWeatherInfo }
     */
    public GetWeatherInfo createGetWeatherInfo() {
        return new GetWeatherInfo();
    }

    /**
     * Create an instance of {@link GetWeatherInfoResponse }
     */
    public GetWeatherInfoResponse createGetWeatherInfoResponse() {
        return new GetWeatherInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitys }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCitys }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.weather.wizard.com/", name = "getCitys")
    public JAXBElement<GetCitys> createGetCitys(GetCitys value) {
        return new JAXBElement<GetCitys>(_GetCitys_QNAME, GetCitys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitysResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCitysResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.weather.wizard.com/", name = "getCitysResponse")
    public JAXBElement<GetCitysResponse> createGetCitysResponse(GetCitysResponse value) {
        return new JAXBElement<GetCitysResponse>(_GetCitysResponse_QNAME, GetCitysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetWeatherInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.weather.wizard.com/", name = "getWeatherInfo")
    public JAXBElement<GetWeatherInfo> createGetWeatherInfo(GetWeatherInfo value) {
        return new JAXBElement<GetWeatherInfo>(_GetWeatherInfo_QNAME, GetWeatherInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherInfoResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetWeatherInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.weather.wizard.com/", name = "getWeatherInfoResponse")
    public JAXBElement<GetWeatherInfoResponse> createGetWeatherInfoResponse(GetWeatherInfoResponse value) {
        return new JAXBElement<GetWeatherInfoResponse>(_GetWeatherInfoResponse_QNAME, GetWeatherInfoResponse.class, null, value);
    }

}
