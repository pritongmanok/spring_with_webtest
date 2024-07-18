package com.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public Greeting getGreeting(String name) {
        System.currentTimeMillis();
        return new Greeting(100,  "Hello " + name + " from GreetingService.getGreeting service");
    }
}
