package com.pembekalan.xsisacademy.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pembekalan.xsisacademy.controller.dto.request.PublisherRequest;
import com.pembekalan.xsisacademy.controller.dto.response.PublisherResponse;
import com.pembekalan.xsisacademy.entity.Publisher;
import com.pembekalan.xsisacademy.repository.PublisherRepository;
import com.pembekalan.xsisacademy.service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    PublisherRepository publisherRepository;

    private ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public List<PublisherResponse> getAllPublishers() {
        List<Publisher> publishers = publisherRepository.findAll();
        List<PublisherResponse> publisherResponses = publishers.stream()
                .map(publisher -> modelMapper().map(publisher, PublisherResponse.class)).collect(Collectors.toList());
        return publisherResponses;
    }

    @Override
    public PublisherResponse getPublisherById(Integer id) {
        Publisher publisher = publisherRepository.findById(id).orElse(null);
        PublisherResponse publisherResponse = modelMapper().map(publisher, PublisherResponse.class);
        return publisherResponse;
    }

    @Override
    public Publisher savePublisher(PublisherRequest publisherRequest) {
        Publisher publisher = modelMapper().map(publisherRequest, Publisher.class);
        return publisherRepository.save(publisher);
    }

    @Override
    public void deletePublisherById(Integer id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public PublisherResponse updatePublisher(PublisherResponse publisherResponse, PublisherRequest publisherRequest) {

        Publisher publisher = modelMapper().map(publisherResponse, Publisher.class);
        publisher.setName(publisherRequest.getName());
        publisher.setAddress(publisherRequest.getAddress());
        publisherRepository.save(publisher);
        PublisherResponse publisherResponses = modelMapper().map(publisher, PublisherResponse.class);
        return publisherResponses;
    }

}
