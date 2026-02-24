package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.entities.Book;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book("XYZ",121,"Java"));
        list.add(new Book("ABC",123,"Java Reference"));
        list.add(new Book("ASD",150,"Java Basic"));
    }

//    Get all book
    public List<Book> getAllBooks(){
        return list;
    }

    // Get Book By id
    public Book getBookById(int id){
        Book book = null;
        book = list.stream().
                filter(e->e.getId()==id)
                .findFirst().get();
        return book;
    }

//    Adding Book
    public Book addBook(Book b){
        list.add(b);
        return b;
    }
}
