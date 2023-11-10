package com.example.demo.eventbus;

import jakarta.annotation.PostConstruct;
import org.greenrobot.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventHandler {

    @Autowired
    private EventBus eventBus;

    @Autowired
    private List<EventListener> eventListeners;

    @PostConstruct
    public void init() {
        for (EventListener e : eventListeners) {
            eventBus.register(e);
        }
    }

    public void eventPost(Object obj) {
        eventBus.post(obj);
        System.out.println("分发消息完成");
    }

}

