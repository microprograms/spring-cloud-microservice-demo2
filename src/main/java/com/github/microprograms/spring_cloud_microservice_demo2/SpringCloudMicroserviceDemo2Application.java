package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudMicroserviceDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceDemo2Application.class, args);
	}

}
