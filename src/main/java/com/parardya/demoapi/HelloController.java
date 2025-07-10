package com.parardya.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from API";
    }

    @GetMapping("/time")
    public String time() {
        return "Current time: " + LocalDateTime.now();
    }
}
