package com.AmanSagar.StudentCard.services;
import com.AmanSagar.StudentCard.enums.CardStatus;
import com.AmanSagar.StudentCard.modules.Card;
import com.AmanSagar.StudentCard.modules.Student;
import com.AmanSagar.StudentCard.repository.CardRepository;
import com.AmanSagar.StudentCard.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentrepository;

    @Autowired
    CardRepository cardrepository;
    public void add_student(Student student){
        studentrepository.save(student);

        Card card = new Card(student);
        card.setCardstatus(CardStatus.ACTIVATED);
        cardrepository.save(card);

    }
    public Student get_student(int id){

        return studentrepository.findById(id).get();
    }
}
