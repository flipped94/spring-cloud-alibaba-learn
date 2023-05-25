package com.flipped.learn.providerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/msg")
    public String sendMessage() {
        return "This is the message from provider service!";
    }
}
