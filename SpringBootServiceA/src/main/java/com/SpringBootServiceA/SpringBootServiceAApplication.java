package com.SpringBootServiceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceAApplication.class, args);
	}

}
