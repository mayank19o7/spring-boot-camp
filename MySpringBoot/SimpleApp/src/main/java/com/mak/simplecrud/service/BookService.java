package com.mak.simplecrud.service;

import com.mak.simplecrud.domain.Book;
import com.mak.simplecrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for performing operations related to the <code>Book</code> entity.
 */
@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    /**
     * Retrieves all books from the repository.
     *
     * @return List of all books
     */
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    /**
     * Retrieves a book by its ID from the repository.
     *
     * @param id The ID of the book to retrieve
     * @return The book with the specified ID
     * @throws RuntimeException if no book is found for the given ID
     */
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent())
            return book.get();
        throw new RuntimeException(String.format("Book not found for the Id : %d", id));
    }

    /**
     * Saves a list of books to the repository.
     *
     * @param books The list of books to save
     * @return The list of saved books
     */
    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }
}
