package com.pembekalan.xsisacademy.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pembekalan.xsisacademy.controller.dto.request.PublisherRequest;
import com.pembekalan.xsisacademy.controller.dto.response.PublisherResponse;
import com.pembekalan.xsisacademy.entity.Publisher;
import com.pembekalan.xsisacademy.repository.PublisherRepository;
import com.pembekalan.xsisacademy.service.PublisherService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/publisher")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @Autowired
    PublisherRepository publisherRepository;

    @GetMapping("")
    public ResponseEntity<?> getAllPublisher() {
        List<PublisherResponse> publisherResponse = publisherService.getAllPublishers();
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "Success");
        resultMap.put("data", publisherResponse);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPublisherById(@PathVariable Integer id) {
        PublisherResponse publisherResponse = publisherService.getPublisherById(id);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "Success");
        resultMap.put("data", publisherResponse);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> savePublisher(@RequestBody PublisherRequest publisherRequest) {
        Publisher publisher = publisherService.savePublisher(publisherRequest);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "Success");
        resultMap.put("data", publisher);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePublisher(@PathVariable Integer id, @RequestBody PublisherRequest publisherRequest) {
        PublisherResponse publisherResponse = publisherService.getPublisherById(id);
        PublisherResponse updatePublisherResponse = publisherService.updatePublisher(publisherResponse,
                publisherRequest);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "Success");
        resultMap.put("data", updatePublisherResponse);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePublisher(@PathVariable Integer id) {
        publisherService.deletePublisherById(id);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "Success");
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

}
