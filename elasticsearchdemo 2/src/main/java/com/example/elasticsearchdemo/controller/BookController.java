package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.model.Book;
import com.example.elasticsearchdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping(value = "/book")
    public Book insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @GetMapping(value = "/books")
    public Iterable<Book> findAllBooks(){
        return bookService.getAllBooks();
    }
}
