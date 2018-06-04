package com.service.impl;

import com.myService.HelloService;

public class myProvider implements HelloService {

	public String speakHello(String name) {  
        return "你好：" + name;  
    }

}
