package com.pembekalan.xsisacademy.service.impl;

import java.util.List;
import java.util.stream.Collectors;
// import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pembekalan.xsisacademy.controller.dto.request.BookRequest;
import com.pembekalan.xsisacademy.controller.dto.response.BookResponse;
import com.pembekalan.xsisacademy.entity.Books;
import com.pembekalan.xsisacademy.repository.AuthorRepository;
import com.pembekalan.xsisacademy.repository.BooksRepository;
import com.pembekalan.xsisacademy.repository.CategoryRepository;
import com.pembekalan.xsisacademy.repository.PublisherRepository;
import com.pembekalan.xsisacademy.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    BooksRepository booksRepository;

    // private ModelMapper modelMapper() {
    // return new ModelMapper();
    // }

    @Override
    public List<BookResponse> getAllBook() {
        List<Books> bookList = booksRepository.getAllBooks();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.typeMap(Books.class, BookResponse.class).addMappings(book -> {
            book.map(src -> src.getAuthor().getName(), BookResponse::setAuthorsName);
            book.map(src -> src.getAuthor().getId(), BookResponse::setAuthorId);
            book.map(src -> src.getCategory().getId(), BookResponse::setCategoryId);
            book.map(src -> src.getCategory().getName(), BookResponse::setCategoryName);
            book.map(src -> src.getPublisher().getId(), BookResponse::setPublisherId);
            book.map(src -> src.getPublisher().getName(), BookResponse::setPublisherName);
        });

        List<BookResponse> response = bookList.stream().map(books -> modelMapper.map(books, BookResponse.class))
                .collect(Collectors.toList());
        System.out.println(response);
        return response;
    }

    @Override
    public BookResponse getBookById(Integer id) {
        Books book = booksRepository.findById(id).orElse(null);
        ModelMapper modelMapper = new ModelMapper();
        BookResponse bookResponse = modelMapper.map(book, BookResponse.class);

        bookResponse.setAuthorsName(book.getAuthor().getName());
        bookResponse.setAuthorId(book.getAuthor().getId());
        bookResponse.setCategoryName(book.getCategory().getName());
        bookResponse.setCategoryId(book.getCategory().getId());
        bookResponse.setPublisherName(book.getPublisher().getName());
        bookResponse.setPublisherId(book.getPublisher().getId());
        return bookResponse;
    }

    @Override
    public Books saveBooks(BookRequest bookRequest) {
        ModelMapper modelMapper = new ModelMapper();
        Books book = modelMapper.map(bookRequest, Books.class);
        book.setAuthor(authorRepository.findById(bookRequest.getAuthorId()).orElse(null));
        book.setCategory(categoryRepository.findById(bookRequest.getCategoryId()).orElse(null));
        book.setPublisher(publisherRepository.findById(bookRequest.getAuthorId()).orElse(null));
        return booksRepository.save(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        booksRepository.deleteById(id);
    }

}
