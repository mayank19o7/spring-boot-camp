package com.mak.bookclient.repository;


import com.mak.bookclient.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for performing CRUD operations on the <code>Book</code> entity.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
