package com.MrBoo.learn_springboot_codecousin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnSpringbootCodecousinApplication {

    public static void main(String[] args) {

        SpringApplication.run(LearnSpringbootCodecousinApplication.class, args);
    }

    @GetMapping("/welcome")
    public String SayHi() {
        return "Hi MrBoo";
    }
}
