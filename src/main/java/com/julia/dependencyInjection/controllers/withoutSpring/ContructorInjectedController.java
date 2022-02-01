package com.julia.dependencyInjection.controllers.withoutSpring;

import com.julia.dependencyInjection.services.GreetingService;

public class ContructorInjectedController {
    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
