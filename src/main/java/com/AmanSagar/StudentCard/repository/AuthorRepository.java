package com.AmanSagar.StudentCard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AmanSagar.StudentCard.modules.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
