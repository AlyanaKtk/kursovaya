package com.example.krs_test.repository;
import com.example.krs_test.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface bookRepos extends CrudRepository<Book, Long>{
}
