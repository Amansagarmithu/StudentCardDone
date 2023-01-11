package com.AmanSagar.StudentCard.modules;

import com.AmanSagar.StudentCard.enums.CardStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinTable
    @OneToOne
    private Student student;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardstatus;
}
