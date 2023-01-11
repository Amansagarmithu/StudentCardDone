package com.AmanSagar.StudentCard.modules;

import com.AmanSagar.StudentCard.enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Card")
@Getter
@Setter
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn
    @JsonIgnore
    @OneToOne
    private Student student;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardstatus;

    public Card(Student student) {
        this.student = student;
    }
}
