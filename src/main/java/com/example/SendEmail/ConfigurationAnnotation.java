package com.example.SendEmail;

import com.example.SendEmail.Objects.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ExternalPackage"})
public class ConfigurationAnnotation {
    @Bean("blue")
    //@Bean
    public Message getCarObject1()
    {
        System.out.println("Inside bean method getCarObject1" );
        return new Message("Blue");
    }

    @Bean("mail")
    //@Bean
    //@Primary
    public Message getCarObject2()
    {
        System.out.println("Inside bean method getCarObject2" );
        return new Message("Red");
    }
}
