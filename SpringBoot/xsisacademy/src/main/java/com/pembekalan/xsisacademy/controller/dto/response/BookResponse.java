package com.pembekalan.xsisacademy.controller.dto.response;

import java.time.LocalDate;

// import com.pembekalan.xsisacademy.entity.Authors;
// import com.pembekalan.xsisacademy.entity.Category;
// import com.pembekalan.xsisacademy.entity.Publisher;

import lombok.Data;

@Data
public class BookResponse {
    private Integer id;

    private String title;
    private String synopsis;
    private Integer stock;
    private LocalDate published_at;

    private String authorsName;
    private String categoryName;
    private String publisherName;

    private Integer authorId;
    private Integer categoryId;
    private Integer publisherId;

    // private Authors author;
    // private Category category;
    // private Publisher publisher;
}
