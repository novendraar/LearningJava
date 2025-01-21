package com.pembekalan.xsisacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pembekalan.xsisacademy.controller.dto.request.BookRequest;
import com.pembekalan.xsisacademy.controller.dto.response.AuthorsResponse;
import com.pembekalan.xsisacademy.controller.dto.response.BookResponse;
import com.pembekalan.xsisacademy.controller.dto.response.CategoryResponse;
import com.pembekalan.xsisacademy.controller.dto.response.PublisherResponse;
import com.pembekalan.xsisacademy.service.AuthorService;
import com.pembekalan.xsisacademy.service.BookService;
import com.pembekalan.xsisacademy.service.CategoryService;
import com.pembekalan.xsisacademy.service.PublisherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    AuthorService authorService;

    @Autowired
    PublisherService publisherService;

    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public ModelAndView getAllBooks() {
        ModelAndView view = new ModelAndView("/books/index");
        List<BookResponse> books = bookService.getAllBook();
        String title = "Books Page";
        view.addObject("title", title);
        view.addObject("books", books);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detailBooks(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("books/detail");
        BookResponse bookResponse = bookService.getBookById(id);
        view.addObject("books", bookResponse);
        return view;
    }

    @GetMapping("/add")
    public ModelAndView addData() {
        ModelAndView view = new ModelAndView("books/form");
        BookResponse bookResponse = new BookResponse();
        view.addObject("bookResponse", bookResponse);
        List<CategoryResponse> categoryResponses = categoryService.getAllCategory();
        List<PublisherResponse> publisherResponse = publisherService.getAllPublishers();
        List<AuthorsResponse> authorsResponse = authorService.getAllAuthors();
        view.addObject("category", categoryResponses);
        view.addObject("publisher", publisherResponse);
        view.addObject("author", authorsResponse);
        return view;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editData(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("books/form");
        BookResponse bookResponse = bookService.getBookById(id);
        view.addObject("bookResponse", bookResponse);
        List<CategoryResponse> categoryResponses = categoryService.getAllCategory();
        List<PublisherResponse> publisherResponse = publisherService.getAllPublishers();
        List<AuthorsResponse> authorsResponse = authorService.getAllAuthors();
        view.addObject("category", categoryResponses);
        view.addObject("publisher", publisherResponse);
        view.addObject("author", authorsResponse);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView saveBooks(@ModelAttribute BookRequest bookRequest, BindingResult result) {
        if (!result.hasErrors()) {
            bookService.saveBooks(bookRequest);
        }
        return new ModelAndView("redirect:/books");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteBooks(@PathVariable Integer id) {
        bookService.deleteBookById(id);
        return new ModelAndView("redirect:/books");
    }

}
