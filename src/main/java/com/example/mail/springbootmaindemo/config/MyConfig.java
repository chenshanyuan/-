package com.example.mail.springbootmaindemo.config;

/**
 * @Author chen
 * @description
 * @Date Create In 19:36 2019/12/22
 */
//@Component
public class MyConfig {
    public MyConfig(){
        System.out.println("myconfig 初始化");
    }
    public String show(){
        System.out.println("myconfig-------------v1分支--------");
        return "myconfig";
    }
}
