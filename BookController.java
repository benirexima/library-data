package com.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.BookService;

@RequestMapping("library")
@RestController
public class BookController {


	@Autowired
	BookService bookservice;
	
	@PostMapping("create")
	public Book create (@RequestBody Book book) 
	{
		return bookservice.create(book);	
	}

//	@GetMapping("get/{bookName}")
//	private Book get(@PathVariable("bookName")String bookName ) {
//		return bookservice.get(bookName);
//	}

	
	@GetMapping("getall")
	private List<Book>getAllBook(){
		return bookservice.getAllBook();
	}

//	@PutMapping("update/{bookName}")
//	private void update(@PathVariable("bookName")String bookName,@RequestBody Book book) {
//		bookservice.update(bookName,book);
//	}
//	
//	
//	@DeleteMapping("delete/{bookName}")
//	private void delete(@PathVariable("bookName")String bookName) {
//		  bookservice.delete(bookName);
//	} 
}
