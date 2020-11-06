package com.example.clientconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ClientconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientconfigApplication.class, args);
    }

    @Value("${docusign.profile.name}")
    private String sampleTxt;
    @RequestMapping("/")
    public String home() {
        return sampleTxt;
    }
}
