package ru.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.example.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
