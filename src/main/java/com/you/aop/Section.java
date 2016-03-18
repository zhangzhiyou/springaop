package com.you.aop;

/**
 * Created by zhiyou on 16-3-7.
 */
public class Section {
    public void beforAdd(){
        System.out.println("前置通知在执行操作之前");
    }
    public void afterAdd(){
        System.out.println("执行操作之后");
    }

}
