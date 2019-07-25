package com.schindler.practise.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.*;
import org.springframework.stereotype.Service;


@Service
public class HelloService implements BeanFactoryPostProcessor, BeanPostProcessor, InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

    public HelloService() {
        System.out.println("HelloService Constructor invoked!");
    }

    /*@PostConstruct
    public void postConstruct() {
        System.out.println("HelloService.postConstruct() was invoked!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("HelloService.preDestroy() was invoked!");
    }*/

    public void sayHello() {
        System.out.println("HelloService.syaHello() was invoked!");
    }


    public void destroy() {
        System.out.println("HelloService.destroy() was invoked!");
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("HelloService.postProcessBeforeInitialization() was invoked!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("HelloService.postProcessAfterInitialization() was invoked!");
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("HelloService.setApplicationContext() was invoked!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloService.afterPropertiesSet() was invoked!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("HelloService.setBeanName() was invoked!");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("HelloService.postProcessBeanFactory() was invoked!");
    }

    /*public void initMethod() {
        System.out.println("HelloService.initMethod() was invoked!");
    }

    public void destroyMethod() {
        System.out.println("HelloService.destroyMethod() was invoked!");
    }*/
}
