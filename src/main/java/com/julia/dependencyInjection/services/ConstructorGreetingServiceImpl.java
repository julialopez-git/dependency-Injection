package com.julia.dependencyInjection.services;

import org.springframework.stereotype.Service;

/*This annotation tells spring this is a spring managed component, and tells it to bring an instance of this into the context*/
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - constructor";
    }
}
