package com.julia.dependencyInjection.controllers;

import com.julia.dependencyInjection.controllers.withoutSpring.SetterBasedController;
import com.julia.dependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpringSetterInjectedControllerTest {

    SetterBasedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}