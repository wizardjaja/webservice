package com.wizard.weather.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherService {

    @WebMethod(operationName = "getWeatherInfo")
    public String queryWeather(@WebParam(name = "cityName")String cityName);

    @WebMethod(operationName = "getCitys")
    public String[] queryCityByProvice(@WebParam(name = "provice")String provice);
}
