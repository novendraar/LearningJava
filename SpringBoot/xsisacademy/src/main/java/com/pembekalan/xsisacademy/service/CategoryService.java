package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.controller.dto.request.CategoryRequest;
import com.pembekalan.xsisacademy.controller.dto.response.CategoryResponse;
import com.pembekalan.xsisacademy.entity.Category;

public interface CategoryService {
    List<CategoryResponse> getAllCategory();

    CategoryResponse getCategoryById(Integer id);

    Category saveCategory(CategoryRequest categoryRequest);

    void deleteCategoryById(Integer id);
}