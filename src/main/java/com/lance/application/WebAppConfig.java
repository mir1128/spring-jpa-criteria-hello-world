package com.lance.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan("com.lance")
@EntityScan("com.lance.entity")
@EnableJpaRepositories("com.lance.repository")
public class WebAppConfig {
    
    public static void main(String[] args) {
		SpringApplication.run(WebAppConfig.class, args);
	}
}

