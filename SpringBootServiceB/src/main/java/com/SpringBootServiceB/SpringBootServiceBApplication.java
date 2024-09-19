package com.SpringBootServiceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceBApplication.class, args);
	}

}
