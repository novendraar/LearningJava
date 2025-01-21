package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.controller.dto.request.AuthorsRequest;
import com.pembekalan.xsisacademy.controller.dto.response.AuthorsResponse;
import com.pembekalan.xsisacademy.entity.Authors;

public interface AuthorService {
    List<AuthorsResponse> getAllAuthors();

    AuthorsResponse getAuthorById(Integer id);

    Authors saveAuthor(AuthorsRequest authorsRequest);

    void deleteAuthorById(Integer id);
}
