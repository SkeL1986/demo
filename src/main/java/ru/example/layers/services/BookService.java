package ru.example.layers.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.example.entities.Book;
import ru.example.layers.repositories.IBookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@Service
public class BookService implements IBookService {
    private IBookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Iterable<Book> findAll() {

        return bookRepository.findAll();
    }

    @Override
    public Book findByTitle(String title) {

        return bookRepository.findByTitle(title);

    }

}
