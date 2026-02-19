package com.api.book.bootrestbook.controller;


import com.api.book.bootrestbook.entities.book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class bookController {

//    @RequestMapping(value = "/books",method = RequestMethod.GET)
    @GetMapping("/books")

    public book getBook(){

        book a = new book();
        a.setId(1234);
        a.setAuthor("Java");
        a.setTitle("XYZ");

        return a;
    }

}
