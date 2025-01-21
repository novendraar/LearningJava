package com.pembekalan.xsisacademy.controller.dto.request;

import lombok.Data;

@Data
public class AuthorsRequest {
    private Integer id;
    private String name;
    private Integer publishedBooks;
}
