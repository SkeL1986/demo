package ru.example.layers.services;

import ru.example.entities.Book;

import java.util.Optional;

public interface IBookService {
    Book save(Book book);

    Optional<Book> getById(Long id);
}
