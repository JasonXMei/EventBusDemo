package com.example.demo.eventbus;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.stereotype.Component;

@Component
public class LoginEventEmailListener implements EventListener {

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void emailNotification(LoginEvent loginEvent) throws InterruptedException {
        Thread.sleep(5000L);
        System.out.println("接收到登录消息++发送邮件，email=" + loginEvent.getEmail() + ", goodsName=" + loginEvent.getGoodsName());
    }

}
