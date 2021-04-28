package org.barberini.sfgdi.services;

// import org.springframework.context.annotation.Profile;
// import org.springframework.stereotype.Service;

import org.barberini.sfgdi.repositories.EnglishGreetingRepository;

// @Profile("EN")
// @Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
