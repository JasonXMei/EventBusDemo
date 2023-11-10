package com.example.demo.eventbus;

import org.greenrobot.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

    @Bean
    public EventBus eventBus() {
        return EventBus.getDefault();
    }

}

