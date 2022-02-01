package com.julia.dependencyInjection.controllers.withoutSpring;

import com.julia.dependencyInjection.services.GreetingService;

public class SetterBasedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
