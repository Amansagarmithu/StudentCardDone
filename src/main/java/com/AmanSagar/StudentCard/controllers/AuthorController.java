package com.AmanSagar.StudentCard.controllers;

import com.AmanSagar.StudentCard.RequestDTO.AuthorDto;
import com.AmanSagar.StudentCard.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.AmanSagar.StudentCard.modules.Author;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorservice;

    @PostMapping("/add_Author")
    public ResponseEntity<String> add_Author(AuthorDto authordto){
        String ans = authorservice.add_Author(authordto);
        return new ResponseEntity(ans, HttpStatus.OK);
    }
    @GetMapping("/get_Author")
    public ResponseEntity<Author> get_author(@RequestParam("id") int id) throws Exception {
        Author atr = authorservice.get_author(id);
        return new ResponseEntity(atr,HttpStatus.OK);
    }

}
