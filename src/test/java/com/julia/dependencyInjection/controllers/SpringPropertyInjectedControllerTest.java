package com.julia.dependencyInjection.controllers;

import com.julia.dependencyInjection.controllers.withoutSpring.PropertyInjectedController;
import com.julia.dependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpringPropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}