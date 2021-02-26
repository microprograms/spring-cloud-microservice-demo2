package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

    @Autowired
    private Demo1Feign demo1Feign;

    @RequestMapping("/health")
    public String health() {
        String demo1HealthResponse = demo1Feign.health();
        if ("Ok".equals(demo1HealthResponse)) {
            return "spring-cloud-microservice-demo1 is Ok and spring-cloud-microservice-demo2 is Ok";
        } else {
            return "spring-cloud-microservice-demo2 is Ok";
        }
    }

}
