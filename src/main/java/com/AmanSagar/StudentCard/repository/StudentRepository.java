package com.AmanSagar.StudentCard.repository;

import com.AmanSagar.StudentCard.modules.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
