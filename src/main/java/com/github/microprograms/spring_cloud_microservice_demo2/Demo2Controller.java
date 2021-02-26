package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Demo2Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/health")
    public String health() {
        String demo1HealthResponse = restTemplate.getForObject("http://spring-cloud-microservice-demo1/health",
                String.class);
        if ("Ok".equals(demo1HealthResponse)) {
            return "spring-cloud-microservice-demo1 is Ok and spring-cloud-microservice-demo2 is Ok";
        } else {
            return "spring-cloud-microservice-demo2 is Ok";
        }
    }

}
