package com.example.mail.springbootmaindemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import javax.xml.ws.Action;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMainDemoApplicationTests {
    @Autowired
    private JavaMailSenderImpl javaMailSender;
    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("1931189761@qq.com");
        message.setFrom("1931189761@qq.com");

        javaMailSender.send(message);
    }
    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天 7:30 开会</b>",true);

        helper.setTo("2076678900@qq.com");
        helper.setFrom("1931189761@qq.com");


        //上传文件
        helper.addAttachment("1.jpg",new File("D:\\demo\\exam\\uploadImage\\11221320835909591043.jpg"));
        javaMailSender.send(mimeMessage);

    }
}
