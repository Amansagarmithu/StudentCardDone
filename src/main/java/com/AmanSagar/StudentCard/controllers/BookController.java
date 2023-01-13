package com.AmanSagar.StudentCard.controllers;

import com.AmanSagar.StudentCard.RequestDTO.BookDto;
import com.AmanSagar.StudentCard.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.AmanSagar.StudentCard.modules.Book;

@RestController
public class BookController {
    @Autowired
    BookService bookservice;
    @PostMapping("/add_book")
    public ResponseEntity<String> add_book(BookDto bookdto){
        String ans = bookservice.add_Book(bookdto);
        return new ResponseEntity(ans, HttpStatus.OK);
    }
    @GetMapping("/get_book")
    public ResponseEntity<Book> get_book(@RequestParam("id") int id){
        return new ResponseEntity(bookservice.get_book(id),HttpStatus.OK);
    }
}
