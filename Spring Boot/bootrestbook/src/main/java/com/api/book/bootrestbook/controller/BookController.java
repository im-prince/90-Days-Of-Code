package com.api.book.bootrestbook.controller;


import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookServices;


//    @RequestMapping(value = "/books",method = RequestMethod.GET)
//    @GetMapping("/books")
//    public book getBook(){
//        book a = new book();
//        a.setId(1234);
//        a.setAuthor("Java");
//        a.setTitle("XYZ");
//        return a;
//    }

    @GetMapping("/books")
    public List<Book> getBooks()
    {
        return this.bookServices.getAllBooks();

    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return bookServices.getBookById(id);
    }


    @PostMapping("/books")
    public Book addBook(@RequestBody Book book)
    {
        Book b = this.bookServices.addBook(book);
        System.out.println(book);
        return b;
    }


    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        this.bookServices.deleteBook(bookId);
    }


}
