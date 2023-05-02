package com.example.krs_test.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController
{
    @RequestMapping("/")
    public String helloMessage(Model model) {
        return "books";
    }
}
