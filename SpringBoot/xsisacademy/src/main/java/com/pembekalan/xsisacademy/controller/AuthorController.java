package com.pembekalan.xsisacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pembekalan.xsisacademy.controller.dto.request.AuthorsRequest;
import com.pembekalan.xsisacademy.controller.dto.response.AuthorsResponse;
import com.pembekalan.xsisacademy.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("")
    public ModelAndView getAllAuthors() {
        ModelAndView view = new ModelAndView("/author/index");
        List<AuthorsResponse> authors = authorService.getAllAuthors();
        String title = "Authors Page";
        view.addObject("title", title);
        view.addObject("authors", authors);
        return view;
    }

    @GetMapping("/add")
    public ModelAndView addAuthors() {
        ModelAndView view = new ModelAndView("author/form");
        AuthorsResponse authorsResponse = new AuthorsResponse();
        view.addObject("author", authorsResponse);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView saveAuthors(@ModelAttribute AuthorsRequest authorsRequest, BindingResult result) {
        if (!result.hasErrors()) {
            authorService.saveAuthor(authorsRequest);
        }
        return new ModelAndView("redirect:/author");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editPublisher(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("author/form");
        AuthorsResponse authorsResponse = authorService.getAuthorById(id);
        view.addObject("author", authorsResponse);
        return view;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteAuthors(@PathVariable Integer id) {
        authorService.deleteAuthorById(id);
        return new ModelAndView("redirect:/author");
    }

}
