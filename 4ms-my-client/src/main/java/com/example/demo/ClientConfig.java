package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {
	
	@LoadBalanced //purpose to denote that one service calling another service
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }

}
