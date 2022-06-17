package com.greatlearning.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Id")
	private int id;
	
	@Column(name ="tittle", length=150)
	private String title ="";
	
	@Column(name ="author", length=150)
	private String author ="";

	
	@Column(name ="category", length=100)
	private String category ="";
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, String category) {
		super();

		this.title = title;
		this.author = author;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Book [Id=" + id + ", tittle=" + title + ", author=" + author + ", category ="
				+ category+"]";
	}
	
	
}
