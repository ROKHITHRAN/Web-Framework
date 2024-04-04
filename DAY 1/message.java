package com.example.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class message 
{
    @GetMapping("/welcome")
    public String messageString()
    {
        return "HELL";
    }
}
