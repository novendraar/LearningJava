package com.pembekalan.xsisacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pembekalan.xsisacademy.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
    @Query(value = "select c from Books c order by c.title asc")
    List<Books> getAllBooks();
}
