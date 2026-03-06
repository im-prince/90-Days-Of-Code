package com.api.book.bootrestbook.controller;


import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<Book>> getBooks()
    {
        List<Book> list = bookServices.getAllBooks();
        if (list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id)
    {
        Book book = bookServices.getBookById(id);
        if (book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
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

    @PutMapping("/books/{bookId}")
    public Book updaeBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        this.bookServices.updateBook(book,bookId);
        return book;
    }

}
