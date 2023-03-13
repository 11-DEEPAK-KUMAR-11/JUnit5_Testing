package com.masai.assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.masai.bookStore.model.Book;
import com.masai.bookStore.service.BookService;

public class AssertFalseDemo {

	
	@Test
	public void assertFalseWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty());
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty());
		
	}
	
	@Test
	public void assertFalseWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty(), "List of books is empty!");
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty(), "List of books is not empty!");
		
	}
	
	@Test
	public void assertFalseWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty(), () -> "List of books is empty!");
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book(1, "JUnit5 test in java", "Oliver");
		
//		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty(), () -> "List of books is empty!");
		
	}
	
	
	
}
