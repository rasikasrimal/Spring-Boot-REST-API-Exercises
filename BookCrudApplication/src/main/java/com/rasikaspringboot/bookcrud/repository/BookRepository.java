package com.rasikaspringboot.bookcrud.repository;

import com.rasikaspringboot.bookcrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
