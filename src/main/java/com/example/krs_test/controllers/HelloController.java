package com.example.krs_test.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController
{
    @RequestMapping("/")
    public String helloMessage(Model model) {

        return "index.html";
    }
}
