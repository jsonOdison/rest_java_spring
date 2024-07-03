package com.jasonRestPract.yes.JasonRestPract.controller;

import com.jasonRestPract.yes.JasonRestPract.interfaces.RestInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController implements RestInterface {
    @Override
    @GetMapping("/hello")
    public String sayHello() {
        return "Hey there";
    }
}
