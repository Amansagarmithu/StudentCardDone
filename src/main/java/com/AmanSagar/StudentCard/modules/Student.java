package com.AmanSagar.StudentCard.modules;

import com.AmanSagar.StudentCard.enums.CardStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(unique = true)
    private String email;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Card card;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

