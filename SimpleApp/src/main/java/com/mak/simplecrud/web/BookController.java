package com.mak.simplecrud.web;

import com.mak.simplecrud.domain.Book;
import com.mak.simplecrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for handling HTTP requests related to the <code>Book</code> entity.
 */
@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    /**
     * Retrieves a book by its ID.
     *
     * @param id The ID of the book to retrieve
     * @return ResponseEntity with the retrieved book and HttpStatus OK
     */
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }

    /**
     * Retrieves all books.
     *
     * @return ResponseEntity with the list of all books and HttpStatus OK
     */
    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(bookService.getBooks(), HttpStatus.OK);
    }

    /**
     * Saves a list of books.
     *
     * @param books The list of books to save
     * @return ResponseEntity with the list of saved books and HttpStatus CREATED
     */
    @PostMapping
    public ResponseEntity<List<Book>> saveBooks(@RequestBody List<Book> books) {
        return new ResponseEntity<>(bookService.saveBooks(books), HttpStatus.CREATED);
    }
}
