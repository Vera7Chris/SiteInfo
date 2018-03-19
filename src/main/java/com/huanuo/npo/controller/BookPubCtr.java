package com.huanuo.npo.controller;

import com.huanuo.npo.Dao.BookRepository;
import com.huanuo.npo.Dao.PublisherRepository;
import com.huanuo.npo.pojo.Book;
import com.huanuo.npo.pojo.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

@RestController
public class BookPubCtr {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRepository publisherRepository;
    @PostMapping("book")
    public Integer post(){
        final  Publisher publisherA = new Publisher("Publisher A");
        final  Publisher publisherB = new Publisher("Publisher B");
        final  Publisher publisherC = new Publisher("Publisher C");
        bookRepository.save(new HashSet<Book>(){{
            add(new Book("Book A", new HashSet<Publisher>(){{
                add(publisherA);
                add(publisherB);
            }}));

            add(new Book("Book B", new HashSet<Publisher>(){{
                add(publisherA);
                add(publisherC);
            }}));
        }});


        // save a couple of publishers
        final   Book bookA = new Book("Book A");
        final  Book bookB = new Book("Book B");

        publisherRepository.save(new HashSet<Publisher>() {{
            add(new Publisher("Publisher A", new HashSet<Book>() {{
                add(bookA);
                add(bookB);
            }}));

            add(new Publisher("Publisher B", new HashSet<Book>() {{
                add(bookA);
                add(bookB);
            }}));
        }});

        return 200;
    }
    @GetMapping("book")
    public List<Book> get(){
        return bookRepository.findAll();
    }
}



