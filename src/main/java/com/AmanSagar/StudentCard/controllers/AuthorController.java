package com.AmanSagar.StudentCard.controllers;

import com.AmanSagar.StudentCard.RequestDTO.AuthorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @PostMapping("/add_Author")
    public ResponseEntity<String> add_Author(AuthorDto authordto){

        return new ResponseEntity("Sucessfully added", HttpStatus.OK);
    }
}
