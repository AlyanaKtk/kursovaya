package com.example.krs_test.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBook;
    private String title;
    private String price;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book() {

    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }
    public Book(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public Long getIdBook() {
        return idBook;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(idBook, book.idBook);
    }

    @Override
    public int hashCode() {
        return idBook != null ? idBook.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + idBook +
                ", title='" + title + '\'' +
                '}';
    }
}
