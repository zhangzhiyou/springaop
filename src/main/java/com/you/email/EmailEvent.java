package com.you.email;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhiyou on 16-3-13.
 * 继承了ApplicationEvent类后该对象就可以就可以作为SPring容器的容器事件
 */
public class EmailEvent extends ApplicationEvent {
    private String address;
    private String text;
    public EmailEvent(Object source) {
        super(source);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }
}
