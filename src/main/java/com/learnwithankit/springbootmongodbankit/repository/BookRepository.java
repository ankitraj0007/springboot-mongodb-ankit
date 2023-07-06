package com.learnwithankit.springbootmongodbankit.repository;

import com.learnwithankit.springbootmongodbankit.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
