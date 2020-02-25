package com.wizard.weather.service.impl;

import com.wizard.weather.service.WeatherService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(name = "weatherWS", serviceName = "weatherWS", portName = "weatherWSPort", targetNamespace = "http://service.weather.wizard.com")
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String queryWeather(String cityName) {
        return cityName + "天气....";
    }

    @Override
    public String[] queryCityByProvice(String provice) {
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = "广州" + i;
        }
        return strings;
    }
}
