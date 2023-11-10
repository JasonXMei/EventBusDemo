package com.example.demo.eventbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private EventHandler eventHandler;

    @GetMapping("/eventPost")
    public String eventPost() {
        LoginEvent loginEvent = new LoginEvent("22222222", "1111@qq.com", "Java实战");
        eventHandler.eventPost(loginEvent);
        return "ok";
    }

}
