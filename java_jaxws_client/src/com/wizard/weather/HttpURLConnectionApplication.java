package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherServiceImpl;
import com.wizard.weather.service.impl.WeatherServiceImplService;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionApplication {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://192.168.43.13:8888/weather");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type","application/soap+xml; charset=utf-8");
        urlConnection.setDoOutput(true);
        OutputStream outputStream = urlConnection.getOutputStream();
        outputStream.write(getXMLByArgs("广州").getBytes());

        InputStream inputStream = urlConnection.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes, 0, len));
        }


    }

    private static String getXMLByArgs(String cityName){
        return "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:impl=\"http://impl.service.weather.wizard.com/\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <impl:queryWeather>\n" +
                "         <!--Optional:-->\n" +
                "         <arg0>"+ cityName +"</arg0>\n" +
                "      </impl:queryWeather>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
    }

}
