package com.example.demo.eventbus;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.stereotype.Component;

@Component
public class LoginEventTelephoneListener implements EventListener {

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void telephoneNotification(LoginEvent loginEvent) throws InterruptedException {
        Thread.sleep(3000L);
        System.out.println("接收到登录消息++发送短信，telePhone=" + loginEvent.getTelePhone() + ", goodsName=" + loginEvent.getGoodsName());
    }

}
