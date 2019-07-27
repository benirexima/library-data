package com.book.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.model.Book;
import com.book.repository.BookRepository;

@Component
public class BookDao {

	@Autowired
	BookRepository bookRepository;
	
	
	public Book create(Book book) {
		
		return bookRepository.save(book);
	}
	public List<Book>getAll(){
		return bookRepository.findAll();
	}
//	public  Book get(String bookName)
//	{
//		Book book=null;
//		for(int i=0;i<library.size();i++) {
//			if((bookName).equals(library.get(i).getBookName())) {
//			
//			System.out.println("bookName=" +" bookName");
//			book=library.get(i);
//			
//			break;
//			}
//		}
//	
//		return book;
//	}
//	public Book delete (String bookName) {
//			Book book=null;
//			for(int i=0;i<library.size();i++) {
//			if((bookName).equals(library.get(i).getBookName())) {
//			library.remove(i);
//			break;
//			}
//		}
//		 
//		return book;
//	}
//public void update(String bookName,Book book) {	
//	
//	for(int i=0;i<library.size();i++)
//{
//		if((bookName).equals(library.get(i).getBookName()))
//		{
//		library.get(i).setBookName(book.getBookName());
//		library.get(i).setAuthorName(book.getAuthorName());
//		library.get(i).setPrice(book.getPrice());
//		}
//		get(bookName);
//	}
//	
//	
//}
}
