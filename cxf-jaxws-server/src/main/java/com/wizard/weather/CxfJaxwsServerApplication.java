package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CxfJaxwsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfJaxwsServerApplication.class, args);

//        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//        factory.setServiceBean(new WeatherServiceImpl());
//        factory.setAddress("http://192.168.43.13:8888/weather");
//        factory.create();
    }

}
