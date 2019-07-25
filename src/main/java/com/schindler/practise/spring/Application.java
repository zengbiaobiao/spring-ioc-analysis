package com.schindler.practise.spring;

import com.schindler.practise.spring.config.SpringConfig;
import com.schindler.practise.spring.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 */
public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello();
    }
}
