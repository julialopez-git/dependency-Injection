package com.julia.dependencyInjection.controllers;

import com.julia.dependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConstructorInjectedController {
    private final GreetingService greetingService;
    /*the annotation here is really optional on constructors*/
    @Autowired
    public SpringConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
