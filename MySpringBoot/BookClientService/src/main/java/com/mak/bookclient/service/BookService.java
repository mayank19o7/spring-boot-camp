package com.mak.bookclient.service;

import com.mak.bookclient.domain.Book;
import com.mak.bookclient.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) return book.get();
        throw new RuntimeException(String.format("Book not found for the Id : %d", id));
    }

    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }
}
