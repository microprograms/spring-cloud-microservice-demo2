package com.github.microprograms.spring_cloud_microservice_demo2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-microservice-demo1")
public interface Demo1FeignClient {

    @GetMapping("health")
    String health();

}