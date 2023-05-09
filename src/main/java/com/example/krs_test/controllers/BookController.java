package com.example.krs_test.controllers;


import com.example.krs_test.model.Book;
import com.example.krs_test.repository.authorRepos;
import com.example.krs_test.repository.bookRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BookController
{

    @Autowired
    public bookRepos bkRepository;
    @RequestMapping ("/books")
    public String helloMessage(Model model) {
        Iterable<Book> books = bkRepository.findAll();
        model.addAttribute("books", books);
        return "books.html";
    }
}
