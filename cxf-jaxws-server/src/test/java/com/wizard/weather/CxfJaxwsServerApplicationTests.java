package com.wizard.weather;

import com.wizard.weather.service.impl.WeatherServiceImpl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CxfJaxwsServerApplicationTests {

    @Test
    void contextLoads() {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceBean(new WeatherServiceImpl());
        factory.setAddress("http://192.168.43.13:8888/weather");
        factory.create();
    }

}
