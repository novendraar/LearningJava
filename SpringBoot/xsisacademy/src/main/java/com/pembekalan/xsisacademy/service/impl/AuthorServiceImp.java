package com.pembekalan.xsisacademy.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pembekalan.xsisacademy.controller.dto.request.AuthorsRequest;
import com.pembekalan.xsisacademy.controller.dto.response.AuthorsResponse;
import com.pembekalan.xsisacademy.entity.Authors;
import com.pembekalan.xsisacademy.repository.AuthorRepository;
import com.pembekalan.xsisacademy.service.AuthorService;

@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    private ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public List<AuthorsResponse> getAllAuthors() {
        List<Authors> authors = authorRepository.getAllAuthors();
        List<AuthorsResponse> authorsResponses = authors.stream()
                .map(author -> modelMapper().map(author, AuthorsResponse.class)).collect(Collectors.toList());
        return authorsResponses;
    }

    @Override
    public AuthorsResponse getAuthorById(Integer id) {
        Authors author = authorRepository.findById(id).orElse(null);
        AuthorsResponse authorsResponse = modelMapper().map(author, AuthorsResponse.class);
        return authorsResponse;
    }

    @Override
    public Authors saveAuthor(AuthorsRequest authorsRequest) {
        Authors author = modelMapper().map(authorsRequest, Authors.class);
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthorById(Integer id) {
        authorRepository.deleteById(id);
    }

}
