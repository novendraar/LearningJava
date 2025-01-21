package com.pembekalan.xsisacademy.controller.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookRequest {
    private Integer id;
    private String title;
    private String synopsis;
    private Integer stock;
    private LocalDate published_at;

    private Integer authorId;
    private Integer categoryId;
    private Integer publisherId;

}
