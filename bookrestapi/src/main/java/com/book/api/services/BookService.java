package com.book.api.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.book.api.entities.Book;
@Component
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(109,"Java by XYZ","Ram xyz"));
		list.add(new Book(888,"Spring is framework","qwerty"));
		list.add(new Book(909,"Future is java","mango"));
	}
	
	public List<Book> getAllBooks(){
		return list;
	}

	public Book getBook(int id) {
//		for (Book book : list) {
//			if(book.getId() == id) {
//				return book;
//			}
//		}
//		return null;
		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;	
	}
	
	public void addBook(Book book) {
		list.add(book);
		
	}

	public void deleteBook(int id) {
		
		//list = list.stream().filter(book -> book.getId()!=id).collect(Collectors.toList());
		
		// TODO Auto-generated method stub
		Iterator<Book> iterator = list.iterator();
		while(iterator.hasNext()) {
			Book book = iterator.next();
			
			if(book.getId() == id) {
				iterator.remove();
			}
			
		}
		
	}

	public void updateBookDetail(int id,Book book) {
		
		list.stream().map(b->{
			if(b.getId()==id) {
				b.setAuthor(book.getAuthor());
				b.setName(book.getName());
				
			}
			return b;
		
		}).collect(Collectors.toList());
		
//		for (Book book1 : list) {
//			if(book1.getId()==id) {
//				book1.setAuthor(book.getAuthor());
//				book1.setName(book.getName());
//			}else{
//				System.out.println("Book Not Found");
//			}
//			
//		}
		
		
	}
	
}

