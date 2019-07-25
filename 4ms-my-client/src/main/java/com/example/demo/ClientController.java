package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@RestController
@RequestMapping("/rest/client")
public class ClientController {

	@Autowired //ClientConfig.java
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String invoke() {
		return "Just for demo";
	}
	
	
	@HystrixCommand(fallbackMethod="errorMethod")
	@GetMapping("/callingsevice")
	public String invokeService() {
		String url ="http://My-Service:8091";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String errorMethod() { //invoke service and error method same type
		
		return "<h1>Service is down try later</h1>";
	}
}
