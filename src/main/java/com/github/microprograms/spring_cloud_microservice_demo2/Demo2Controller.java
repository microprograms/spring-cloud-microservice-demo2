package com.github.microprograms.spring_cloud_microservice_demo2;

import com.github.microprograms.spring_cloud_microservice_demo2.client.Demo1FeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

    @Autowired
    private Demo1FeignClient demo1FeignClient;

    @GetMapping("/health")
    public String health() {
        return "demo1 health response is " + demo1FeignClient.health();
    }

}
