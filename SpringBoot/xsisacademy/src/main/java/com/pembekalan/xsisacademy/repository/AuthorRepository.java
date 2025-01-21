package com.pembekalan.xsisacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pembekalan.xsisacademy.entity.Authors;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Integer> {
    @Query(value = "select c from Authors c order by c.name asc")
    List<Authors> getAllAuthors();
}
