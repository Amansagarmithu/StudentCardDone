package com.AmanSagar.StudentCard.RequestDTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDto {
    private String name;
    @Column(unique = true)
    private String email;

    private int age;
}
