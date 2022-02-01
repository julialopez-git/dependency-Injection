package com.julia.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
/*we annotate this with profile EN for spring to instantiate this service when the active profile is EN (configured in resources> application.properties)*/
@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "English: Hello!";
    }
}
