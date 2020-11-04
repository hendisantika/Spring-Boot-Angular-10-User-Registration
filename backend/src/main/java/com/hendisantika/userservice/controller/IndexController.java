package com.hendisantika.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/11/20
 * Time: 06.28
 */
@RestController
@RequestMapping
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Spring Boot User Service " + LocalDateTime.now();
    }
}
