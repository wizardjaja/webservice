package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherServiceImpl;
import com.wizard.weather.service.impl.WeatherServiceImplService;

public class WsimportApplication {
    public static void main(String[] args) {
        WeatherServiceImplService service = new WeatherServiceImplService();
        WeatherServiceImpl port = service.getPort(WeatherServiceImpl.class);
        String weather = port.queryWeather("广州");
        System.out.println(weather);

    }

}
