package com.trishul.springjenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsDemoApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

    @PostConstruct
    public void init() {
        log.info("Application Started!!!");
    }

    public static void main(String[] args) {
        log.info("Application Executed!!!");
        SpringApplication.run(SpringJenkinsDemoApplication.class, args);
    }

}
