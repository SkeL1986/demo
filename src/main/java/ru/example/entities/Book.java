package ru.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    Integer count;

    public Book() {

    }
}
