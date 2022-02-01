package com.julia.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
/*we use Primary annotation to set this service as default, spring will instantiate this one in doubt (when there's an autowired and many possibilities)*/
@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world PRIMARY bean";
    }
}
