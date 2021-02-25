package ru.example.layers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.example.entities.Book;

@Repository
public interface IBookRepository extends CrudRepository<Book, Long> {
}
