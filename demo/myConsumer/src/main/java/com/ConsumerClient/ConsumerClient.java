package com.ConsumerClient;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.myService.HelloService;

public class ConsumerClient {
	public static void main(String[] args) {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");  
        HelloService helloService = (HelloService) context.getBean("helloService");  
        String result = helloService.speakHello("yyf");  
        System.out.println(result);  
    }
}
