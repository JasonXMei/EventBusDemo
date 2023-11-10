package com.example.demo.eventbus;

import java.io.Serializable;

public class LoginEvent implements Serializable {

    private static final long serialVersionUID = -6787105919337013565L;

    private String telePhone;
    private String email;
    private String goodsName;

    public LoginEvent(String telePhone, String email, String goodsName) {
        this.telePhone = telePhone;
        this.email = email;
        this.goodsName = goodsName;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
