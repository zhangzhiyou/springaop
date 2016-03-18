package com.you.email;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhiyou on 16-3-13.
 */
public class EmialNotifier implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent evt) {
        if(evt instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent)evt;
            System.out.println("需要发送邮件的接受地址"+emailEvent.getAddress());
            System.out.println("需要发送的邮件的邮件正文"+emailEvent.getText());
        }
        else {
            System.out.println("其他时间"+evt);
        }
    }

}
