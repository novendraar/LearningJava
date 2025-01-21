package com.pembekalan.xsisacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pembekalan.xsisacademy.controller.dto.request.PublisherRequest;
import com.pembekalan.xsisacademy.controller.dto.response.PublisherResponse;
import com.pembekalan.xsisacademy.service.PublisherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping("")
    public ModelAndView getAllPublisher() {
        ModelAndView view = new ModelAndView("publisher/index");
        List<PublisherResponse> publishers = publisherService.getAllPublishers();
        String title = "Publisher Page";
        view.addObject("title", title);
        view.addObject("publisher", publishers);
        return view;

    }

    @GetMapping("/add")
    public ModelAndView addPublisher() {
        ModelAndView view = new ModelAndView("publisher/form");
        PublisherResponse publisherResponse = new PublisherResponse();
        view.addObject("publisher", publisherResponse);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView savePublisher(@ModelAttribute PublisherRequest publisherRequest, BindingResult result) {
        if (!result.hasErrors()) {
            publisherService.savePublisher(publisherRequest);
        }
        return new ModelAndView("redirect:/publisher");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editPublisher(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("publisher/form");
        PublisherResponse publisherResponse = publisherService.getPublisherById(id);
        view.addObject("publisher", publisherResponse);
        return view;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deletePublisher(@PathVariable Integer id) {
        publisherService.deletePublisherById(id);
        return new ModelAndView("redirect:/publisher");
    }

}
