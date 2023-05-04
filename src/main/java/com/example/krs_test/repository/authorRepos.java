package com.example.krs_test.repository;


import com.example.krs_test.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepos extends CrudRepository<Author, Long>{
}
