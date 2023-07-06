package com.learnwithankit.springbootmongodbankit.service;

import com.learnwithankit.springbootmongodbankit.model.Book;
import com.learnwithankit.springbootmongodbankit.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book){
        Book book1 = bookRepository.save(book);
        LOGGER.info(String.format("saved book -> %s",book1));
    }

    public List<Book> getAllBook(){
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book getBookById(int id){
        Book book = (Book) bookRepository.findById(id).get();
        return book;
    }

    public void deleteBookById(int id){
        bookRepository.deleteById(id);
    }
}
