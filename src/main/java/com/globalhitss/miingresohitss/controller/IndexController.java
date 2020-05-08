package com.globalhitss.miingresohitss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class IndexController {

    public IndexController() {
    }

    @GetMapping
    public String getAllCliente() {
        return "healthy";
    }
}
