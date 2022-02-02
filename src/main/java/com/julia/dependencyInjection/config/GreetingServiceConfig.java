package com.julia.dependencyInjection.config;

import com.julia.dependencyInjection.services.PropertyGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*This is an example of how to configure spring with Java and not
 stereotype annotations. The PropertyGreetingService will not have
 the @Service annotation*/
@Configuration
public class GreetingServiceConfig {

    @Bean
    PropertyGreetingServiceImpl propertyGreetingServiceImpl(){
        return new PropertyGreetingServiceImpl();
    }
}
