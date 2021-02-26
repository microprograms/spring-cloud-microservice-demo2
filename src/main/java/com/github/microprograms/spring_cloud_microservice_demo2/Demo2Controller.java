package com.github.microprograms.spring_cloud_microservice_demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo2")
public class Demo2Controller {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return applicationName + " is Ok";
    }

}
