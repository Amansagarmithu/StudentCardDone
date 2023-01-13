package com.AmanSagar.StudentCard.Converter;
import com.AmanSagar.StudentCard.modules.Book;
import com.AmanSagar.StudentCard.RequestDTO.BookDto;
import com.AmanSagar.StudentCard.modules.Author;
import com.AmanSagar.StudentCard.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookConvertor {
    @Autowired
    AuthorRepository authorrepository;
    public Book convert(BookDto bookdto){
        Author atr = authorrepository.findById(bookdto.getAuthor_id()).get();
        Book book = Book.builder().name(bookdto.getName()).pages(bookdto.getPages()).author(atr).build();
        return book;
    }
}
