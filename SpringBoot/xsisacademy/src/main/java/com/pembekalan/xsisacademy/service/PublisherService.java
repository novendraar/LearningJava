package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.controller.dto.request.PublisherRequest;
import com.pembekalan.xsisacademy.controller.dto.response.PublisherResponse;
import com.pembekalan.xsisacademy.entity.Publisher;

public interface PublisherService {
    List<PublisherResponse> getAllPublishers();

    PublisherResponse getPublisherById(Integer id);

    Publisher savePublisher(PublisherRequest publisherRequest);

    PublisherResponse updatePublisher(PublisherResponse publisherResponse, PublisherRequest publisherRequest);

    void deletePublisherById(Integer id);
}