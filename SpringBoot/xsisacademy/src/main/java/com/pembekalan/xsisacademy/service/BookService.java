package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.controller.dto.request.BookRequest;
import com.pembekalan.xsisacademy.controller.dto.response.BookResponse;
import com.pembekalan.xsisacademy.entity.Books;

public interface BookService {
    List<BookResponse> getAllBook();

    BookResponse getBookById(Integer id);

    Books saveBooks(BookRequest bookRequest);

    void deleteBookById(Integer id);

}
