package com.example.springdemo.configuration;

import com.api.email.Email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SprintConf
 */
@Configuration
public class SprintConf {


    @Bean
    public Email getEmail()
    {
        return new Email();
    }

    
}