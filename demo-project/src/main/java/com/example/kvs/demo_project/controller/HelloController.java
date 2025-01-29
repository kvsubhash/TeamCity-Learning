package com.example.kvs.demo_project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = {"/hello"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> sayHello() {
        Map<String, String> messages = new HashMap<String, String>();
        messages.put("message", "Hello from Spring-boot application");
        return ResponseEntity.ok().body(messages);
    }

    
}
