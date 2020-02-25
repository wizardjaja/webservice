package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherWS;
import com.wizard.weather.service.impl.WeatherWS_Service;

public class WsimportApplication {
    public static void main(String[] args) {
        WeatherWS_Service service = new WeatherWS_Service();
        WeatherWS port = service.getPort(WeatherWS.class);
        String weather = port.getWeatherInfo("广州");
        System.out.println(weather);

    }

}
