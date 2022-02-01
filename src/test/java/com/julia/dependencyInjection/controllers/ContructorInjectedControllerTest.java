package com.julia.dependencyInjection.controllers;

import com.julia.dependencyInjection.controllers.withoutSpring.ContructorInjectedController;
import com.julia.dependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {

    ContructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}