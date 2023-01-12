package com.AmanSagar.StudentCard.Converter;

import com.AmanSagar.StudentCard.RequestDTO.AuthorDto;
import com.AmanSagar.StudentCard.modules.Author;

public class AuthorConverter {

    public static Author author_convertor(AuthorDto authordto){
        Author author = Author.builder().age(authordto.getAge()).email(authordto.getEmail()).name(authordto.getName()).build();
        return author;
    }
}
