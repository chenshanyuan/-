package com.example.mail.springbootmaindemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author chen
 * @description
 * @Date Create In 19:35 2019/12/22
 */
@Configuration
@Import(MyConfig.class)
public class TestConfig {
    private MyConfig myConfig;
    public TestConfig(MyConfig myConfig){
        this.myConfig = myConfig;
    }
    public String show(){
       return myConfig.show();
    }
}
