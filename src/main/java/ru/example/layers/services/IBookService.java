package ru.example.layers.services;

import ru.example.entities.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    Book save(Book book);

    Optional<Book> getById(Long id);

    void deleteById(Long id);

    Iterable<Book> findAll();

    Book findByTitle(String title);
}
