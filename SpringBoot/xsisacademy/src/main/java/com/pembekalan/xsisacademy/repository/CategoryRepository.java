package com.pembekalan.xsisacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pembekalan.xsisacademy.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select c from Category c order by c.name desc")
    List<Category> getAllCategories();
}
