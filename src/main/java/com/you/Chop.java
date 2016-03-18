package com.you;

import com.you.email.EmailEvent;
import com.you.people.Chain;
import com.you.people.Japan;
import com.you.people.Person;
import com.you.service.BankServlceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.jar.JarEntry;

/**
 * Created by zhiyou on 16-3-6.
 */
public class Chop {
   static int arr[] = new int[10];
    public static void main(String[] args){
        //使用配置文件引入
     //   System.out.println(arr[1]);


        /*
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applycationContext.xml");
        EmailEvent ele = new EmailEvent("test","spring@163.com","thismomisn");
        ctx.publishEvent(ele);
//        Person p = ctx.getBean("chain", Chain.class);
//        p.userAxe();
*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applycationContext.xml");
        BankServlceimpl bankServiceimpl = ctx.getBean("bankServlceimpl",BankServlceimpl.class);
        bankServiceimpl.transferAccounts(50,"A","B");

        //使用注解引入
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Japan.class);
//        Japan japan =ctx.getBean(Japan.class);
//        japan.stoneAxe();
//



    }
}
