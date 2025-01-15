package com.pembekalan.xsisacademy.controller.dto.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PublisherResponse {
    private Integer id;
    private String name;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isDeleted;
}
