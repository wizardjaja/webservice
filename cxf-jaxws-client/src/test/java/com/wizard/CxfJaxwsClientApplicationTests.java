package com.wizard;

import com.wizard.weather.service.WeatherService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CxfJaxwsClientApplicationTests {

    @Test
    void contextLoads() {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WeatherService.class);
        factoryBean.setAddress("http://localhost:8888/soap/weather?wsdl");
        WeatherService ws = factoryBean.create(WeatherService.class);
        ws.getCitys("广东").forEach(System.out::println);
        System.out.println(ws.getWeatherInfo("广州"));


    }

}
