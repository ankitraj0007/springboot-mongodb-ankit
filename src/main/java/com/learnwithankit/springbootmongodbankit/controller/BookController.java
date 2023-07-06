package com.learnwithankit.springbootmongodbankit.controller;

import com.learnwithankit.springbootmongodbankit.model.Book;
import com.learnwithankit.springbootmongodbankit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public String saveBook(@RequestBody Book book){
        bookService.saveBook(book);
        return "Book saved to mongodb with id :"+book.getId();
    }

    @GetMapping("/books")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable int id){
        bookService.deleteBookById(id);
        return "book deleted with id: "+id;
    }
}
