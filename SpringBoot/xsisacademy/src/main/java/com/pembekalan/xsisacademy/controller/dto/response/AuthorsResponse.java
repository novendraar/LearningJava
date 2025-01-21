package com.pembekalan.xsisacademy.controller.dto.response;

import lombok.Data;

@Data
public class AuthorsResponse {
    private Integer id;
    private String name;
    private Integer publishedBooks;
}
