package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Component
public class BookService {

   @Autowired
    private BookRepository bookRepository;

//    private static List<Book> list = new ArrayList<>();
//
//    static{
//        list.add(new Book("XYZ",121,"Java"));
//        list.add(new Book("ABC",123,"Java Reference"));
//        list.add(new Book("ASD",150,"Java Basic"));
//    }

//    Get all book
    public List<Book> getAllBooks(){

        List<Book> list = (List<Book>)this.bookRepository.findAll();
        return list;
    }

    // Get Book By id
    public Book getBookById(int id){
        Book book = null;
        try {
//            book = list.stream().filter(e->e.getId()==id).findFirst().get();

            book = this.bookRepository.findById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

//    Adding Book
    public Book addBook(Book b){
        Book result = bookRepository.save(b);
        return result;
    }

//    delete book
    public void deleteBook(int bid){
//        list = list.stream().
//                filter(book ->book.getId()!=bid).
//                collect(Collectors.toList());

        bookRepository.deleteById(bid);
    }

    public void updateBook(Book book, int bookId){
//        list = list.stream().map(b->{
//            if (b.getId()==bookId)
//            {
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());

        book.setId(bookId);
        bookRepository.save(book);
    }
}
