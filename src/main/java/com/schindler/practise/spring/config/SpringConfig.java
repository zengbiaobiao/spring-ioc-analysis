package com.schindler.practise.spring.config;


import com.schindler.practise.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.schindler.practise.spring**")
public class SpringConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
