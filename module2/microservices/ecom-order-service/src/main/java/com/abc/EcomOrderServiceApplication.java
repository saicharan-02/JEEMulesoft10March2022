package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class EcomOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomOrderServiceApplication.class, args);
	}
	

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}

}
