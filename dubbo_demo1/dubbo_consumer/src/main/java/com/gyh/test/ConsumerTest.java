package com.gyh.test;

import com.gyh.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        HelloService demoService = (HelloService) context.getBean("helloService");

        System.out.println(demoService.sayHello("测试 "));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
