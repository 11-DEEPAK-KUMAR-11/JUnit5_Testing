package com.masai.assertions.assertNull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.masai.bookStore.model.Book;
import com.masai.bookStore.service.BookService;

public class AssertNullDemo {

	@Test
	public void assertNullWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book(2, "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById(4);
		assertNull(actualBook);
	}
	
	@Test
	public void assertNullWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book(2, "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById(4);
		assertNull(actualBook, "Book is not null !");
	}
	
	@Test
	public void assertNullWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book(2, "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById(2);
		assertNull(actualBook, () -> "Book is not null !");
	}
	
}
