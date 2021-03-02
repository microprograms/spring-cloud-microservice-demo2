package com.github.microprograms.spring_cloud_microservice_demo2.client;

import com.github.microprograms.spring_cloud_microservice_demo2.client.Demo1FeignClient.Fallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo1", fallback = Fallback.class)
public interface Demo1FeignClient {

    @GetMapping("health")
    String health();

    @Component
    public class Fallback implements Demo1FeignClient {
        @Override
        public String health() {
            return "Unknown";
        }
    }
}
