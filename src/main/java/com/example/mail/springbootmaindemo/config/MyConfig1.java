package com.example.mail.springbootmaindemo.config;

/**
 * @Author chen
 * @description
 * @Date Create In 19:36 2019/12/22
 */
public class MyConfig1 {
    public MyConfig1(){
        System.out.println("myconfig 初始化");
    }
    public String show(){
        System.out.println("myconfig---------------------");
        return "myconfig";
    }
}
