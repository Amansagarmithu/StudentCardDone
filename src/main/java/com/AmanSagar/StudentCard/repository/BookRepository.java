package com.AmanSagar.StudentCard.repository;

import com.AmanSagar.StudentCard.modules.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
