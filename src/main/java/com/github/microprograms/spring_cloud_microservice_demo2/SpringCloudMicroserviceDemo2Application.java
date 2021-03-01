package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SocketUtils;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudMicroserviceDemo2Application {

	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			// 定制嵌入式的servlet容器相关规则
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				int port = SocketUtils.findAvailableTcpPort(1024, 9999);
				factory.setPort(port);
				System.getProperties().put("server.port", port);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceDemo2Application.class, args);
	}

}
