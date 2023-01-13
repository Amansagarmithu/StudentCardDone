package com.AmanSagar.StudentCard.services;

import com.AmanSagar.StudentCard.Converter.BookConvertor;
import com.AmanSagar.StudentCard.RequestDTO.BookDto;
import com.AmanSagar.StudentCard.modules.Author;
import com.AmanSagar.StudentCard.repository.AuthorRepository;
import com.AmanSagar.StudentCard.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AmanSagar.StudentCard.modules.Book;

@Service
public class BookService {
    @Autowired
    BookRepository bookrepositort;
    @Autowired
    BookConvertor bookconvertor;
    @Autowired
    AuthorRepository authorrepo;
    public String add_Book(BookDto bookdto){

        Book book = bookconvertor.convert(bookdto);
        bookrepositort.save(book);
        Author author = authorrepo.findById(book.getId()).get();
        author.getBooks().add(book);
        return "added";
    }
    public Book get_book(int bookid){
        return bookrepositort.findById(bookid).get();
    }
}
