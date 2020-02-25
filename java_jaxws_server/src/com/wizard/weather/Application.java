package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        Endpoint.publish("http://192.168.43.13:8888/weather", new WeatherServiceImpl());
    }
}
