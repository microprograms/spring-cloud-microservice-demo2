package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-MICROSERVICE-DEMO1")
public interface Demo1Feign {

    @GetMapping("health")
    String health();
}
