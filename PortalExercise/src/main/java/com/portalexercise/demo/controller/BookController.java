//package com.portalexercise.demo.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.PutMapping;
//
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.portalexercise.demo.model.Book;
//import com.portalexercise.demo.service.BookService;
//
//@RestController
//public class BookController
//{
//          @Autowired
//          BookService bSer;
//          @GetMapping("/book")
//          public List<Book> getBook(String bookname)
//          {
//        	  return bSer.getBook(bookname);
//          }
//          @GetMapping("/books/{bookId}")
//          public Optional<Book> getById(@PathVariable int bookId)
//          {
//        	 Optional<Book> l = bSer.getById(bookId);
//        	 return l;
//          }
//          @PostMapping("/postbooks")  
//          public Book saveBook(@RequestBody Book b)
//          {
//        	  return bSer.saveBook(b);
//          }
//
//}