package com.julia.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Spanish: Hola!";
    }
}
