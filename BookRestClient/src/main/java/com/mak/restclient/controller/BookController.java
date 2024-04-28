package com.mak.restclient.controller;

import com.mak.restclient.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

    private static final String HOST = "http://book-client/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        // Make a request to your API to get the list of objects
        Book[] objectsArray = restTemplate.getForObject(HOST + "books", Book[].class);
        List<Book> objectsList = Arrays.asList(objectsArray);
        return ResponseEntity.ok(objectsList);
    }

    @PostMapping
    public ResponseEntity<List<Book>> saveBooks(@RequestBody List<Book> books) {
        // Make a POST request to another API
        Book[] responseArray = restTemplate.postForObject(HOST + "books", books, Book[].class);
        List<Book> responseList = Arrays.asList(responseArray);
        return ResponseEntity.ok(responseList);
    }
}
