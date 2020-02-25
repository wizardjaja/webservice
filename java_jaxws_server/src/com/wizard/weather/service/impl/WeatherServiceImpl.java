package com.wizard.weather.service.impl;

import com.wizard.weather.service.WeatherService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(name = "weatherWS", serviceName = "weatherWS", portName = "weatherWSPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherServiceImpl implements WeatherService {
    @Override
    @WebMethod(operationName = "getWeatherInfo")
    public @WebResult(name = "result")
    String queryWeather(@WebParam(name = "cityName") String cityName) {
        return cityName + "天气...";
    }
}
