package com.julia.dependencyInjection.services;

import org.springframework.stereotype.Service;

/* This service is not annotated because it is ocnfigured
in the PrepertyGreetingServiceConfig file
 */
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - property";
    }
}
