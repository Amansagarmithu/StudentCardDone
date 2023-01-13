package com.AmanSagar.StudentCard.services;

import com.AmanSagar.StudentCard.Converter.AuthorConverter;
import com.AmanSagar.StudentCard.RequestDTO.AuthorDto;
import com.AmanSagar.StudentCard.modules.Author;
import com.AmanSagar.StudentCard.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorrepo;
    public String add_Author(AuthorDto authordto){

        try{
            Author author = AuthorConverter.author_convertor(authordto);
            authorrepo.save(author);
        }
        catch(Exception e){
            return "Not added";
        }
        return "added succesfully";
    }
    public Author get_author(int id)throws Exception{
        try {
            Author ath = authorrepo.findById(id).get();
            if (ath == null) {
                throw new Exception();
            }
            return ath;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
