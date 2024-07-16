package com.devprobootcamp.dvs.driver_violation_service.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean(name = "rt1")
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }

    @Bean(name = "rt2")
    public RestTemplate restTemplate2() {
        return new RestTemplateBuilder()
                .build();
    }

}
