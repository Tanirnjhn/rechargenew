package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="b_masters")
public class Book {
@Id
@Column(name="isbn", length=20)
private int ISBN;

@Column(name="title_name", length=25)
private String title;

@Column(name="price", length=10)
private float price;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="auth_book", joinColumns= 
{@JoinColumn(name="b_masters")},
inverseJoinColumns={@JoinColumn(name="Author_masters")})

Set<Author> auth= new HashSet<Author>();


public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public Book(int ISBN, String title, float price) {
	super();
	ISBN = ISBN;
	this.title = title;
	this.price = price;
}

public int getISBN() {
	return ISBN;
}

public void setISBN(int ISBN) {
	this.ISBN = ISBN;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public Set<Author> getAuth() {
	return auth;
}

public void setAuth(Set<Author> auth) {
	this.auth = auth;
}

@Override
public String toString() {
	return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
}

	
}
