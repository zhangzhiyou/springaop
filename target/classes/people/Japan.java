package com.you.people;

import com.you.axe.Axe;
import com.you.axe.StoneAxe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiyou on 16-3-6.
 */
@Configuration
//修饰一个java配置类
public class Japan {
    //相当于定义了一个personName的变量值为孙悟空f
    @Value("孙悟空") String personName;
    @Bean(name="Chain")
    public Person person(){
        Chain chain = new Chain();
        chain.setAxe(stoneAxe());
        return chain;
    }
    //配置一个Bean: stoneAxe
    @Bean(name = "stoneAxe")
    public Axe stoneAxe(){
        return new StoneAxe();
    }
}
