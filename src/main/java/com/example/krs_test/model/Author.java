package com.example.krs_test.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    private Long idAuthor;
    private String name;

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdAuthor() {
        return idAuthor;
    }
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return Objects.equals(idAuthor, author.idAuthor);
    }

    @Override
    public int hashCode() {
        return idAuthor != null ? idAuthor.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Author{" +
                "id=" + idAuthor +
                ", name='" + name + '\'' +
                '}';
    }
}
