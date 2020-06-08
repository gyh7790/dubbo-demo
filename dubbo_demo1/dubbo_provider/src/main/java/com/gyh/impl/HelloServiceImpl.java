package com.gyh.impl;

import com.gyh.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello World！" + name;
    }

}
