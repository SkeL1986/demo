package ru.example.layers.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.entities.Book;
import ru.example.layers.services.IBookService;

import java.util.List;
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

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable(value = "id") Long id)
    {
        bookService.deleteById(id);
    }

    @GetMapping("/books")
    public Iterable<Book> findAll()
    {
        return bookService.findAll();
    }

    @GetMapping(value = "/getbytitle/{title}")
    public Book getByTitle(@PathVariable String title) {
       Book book = bookService.findByTitle(title);

        if (!book.equals(null)) {
            return book;
        }
        else {
            return null;
        }
    }


}
