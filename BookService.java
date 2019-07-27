package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.dao.BookDao;
import com.book.model.Book;


@Service
public class BookService {
	

	@Autowired
	BookDao bookDao;
	
	public Book create(Book book) {
		
		return bookDao.create(book);
	}
	public List<Book> getAllBook(){
		return bookDao.getAll();
		
	}
	
	
//	public Book get(String bookName) {
//		return bookDao.get(bookName);
//	}
//	
//	public void delete(String bookName) {
//		bookDao.delete(bookName);
//	}
//		
//	public void update(String bookName,Book book) {
//		bookDao.update(bookName,book);
//	}

}
