package com.wizard.config;

import com.wizard.resources.HelloResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig(){
        packages("com.wizard.resources");
        register(HelloResource.class);
    }
}
