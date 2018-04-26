package com.shiyq.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestApplication.class, args);
	}
}
