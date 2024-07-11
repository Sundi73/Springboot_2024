package com.book.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.api.entities.Book;
import com.book.api.services.BookService;


@RestController
public class bookcontroller {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> list = bookService.getAllBooks();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBook(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		this.bookService.addBook(book);
		return book;
	}
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		 bookService.deleteBook(id);
		
	}
	
	@PutMapping("/books/{id}")
	public void updateBookDetail(@PathVariable("id") int id,@RequestBody Book book) {
	bookService.updateBookDetail(id,book);		
		
	}

}
