package com.MrBoo.learn_springboot_codecousin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/response1")
    public GiveResponse1 response1() {
        return new GiveResponse1("Hi Kingston");
    }

    @GetMapping("/response2")
    public GiveResponse2 response2() {
        return new GiveResponse2("Hi Kingston", List.of("sec1","sec2","sec3"),new Person("Hi Kingston"));
    }

    record Person(String name){}
    record GiveResponse1(String message){}
    record GiveResponse2(String message, List<String> Section, Person person ){}
}
