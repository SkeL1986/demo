package ru.example.layers.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.entities.Book;
import ru.example.layers.services.IBookService;

import java.util.Optional;

@Data
@AllArgsConstructor
@RestController
@RequestMapping(value = "/book")
public class BookController {
    private IBookService bookService;

    @PutMapping(value = "/save")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<?> getById(@PathVariable(value = "id") Long id) {
        Optional<Book> optionalBook = bookService.getById(id);

        if (optionalBook.isPresent()) {
            return ResponseEntity.ok(optionalBook.get());
        }
        else {
            return ResponseEntity.ok("There is no such book with id = " + id);
        }
    }
}
