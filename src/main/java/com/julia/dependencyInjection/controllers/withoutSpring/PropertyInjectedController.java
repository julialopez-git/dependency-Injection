package com.julia.dependencyInjection.controllers.withoutSpring;

import com.julia.dependencyInjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
