package com.example.krs_test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {

    private Long idBook;
    private String title;

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdBook() {
        return idBook;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
