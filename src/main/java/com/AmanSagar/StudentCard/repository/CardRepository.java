package com.AmanSagar.StudentCard.repository;
import com.AmanSagar.StudentCard.modules.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
