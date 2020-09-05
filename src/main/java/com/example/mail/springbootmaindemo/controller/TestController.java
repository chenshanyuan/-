package com.example.mail.springbootmaindemo.controller;

import com.example.mail.springbootmaindemo.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chen
 * @description
 * @Date Create In 19:16 2019/12/22
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestConfig testConfig;
    @RequestMapping("/show")
    public String show(){
        return testConfig.show();
    }

}
