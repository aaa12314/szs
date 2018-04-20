package com.gds.szs.szs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SzsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzsApplication.class, args);
    }

    @RequestMapping(value="/", produces = "text/plain;charset=UTF-8")
    public String index() {
        return "这是我第一个程序！";
    }
}
