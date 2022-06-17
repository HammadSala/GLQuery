package com.greatlearning.library.service;

import java.util.List;
import com.greatlearning.library.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	public Book getBook(int bookId);
	public void save(Book book);
	public void deleteBook(int bookId);
	public List<Book> searchBook(String title, String author);

}
