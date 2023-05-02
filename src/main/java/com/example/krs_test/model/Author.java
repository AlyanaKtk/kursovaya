package com.example.krs_test.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
    private Long idAuthor;

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdAuthor() {
        return idAuthor;
    }
}
