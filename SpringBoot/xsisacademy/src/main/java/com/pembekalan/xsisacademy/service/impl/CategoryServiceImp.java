package com.pembekalan.xsisacademy.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pembekalan.xsisacademy.controller.dto.request.CategoryRequest;
import com.pembekalan.xsisacademy.controller.dto.response.CategoryResponse;
import com.pembekalan.xsisacademy.entity.Category;
import com.pembekalan.xsisacademy.repository.CategoryRepository;
import com.pembekalan.xsisacademy.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    private ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public List<CategoryResponse> getAllCategory() {
        List<Category> categories = categoryRepository.getAllCategories();
        List<CategoryResponse> categoryResponses = categories.stream()
                .map(category -> modelMapper().map(category, CategoryResponse.class)).collect(Collectors.toList());
        return categoryResponses;
    }

    @Override
    public CategoryResponse getCategoryById(Integer id) {
        Category category = categoryRepository.findById(id).orElse(null);
        CategoryResponse categoryResponse = modelMapper().map(category, CategoryResponse.class);
        return categoryResponse;
    }

    @Override
    public Category saveCategory(CategoryRequest categoryRequest) {
        Category category = modelMapper().map(categoryRequest, Category.class);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

}
