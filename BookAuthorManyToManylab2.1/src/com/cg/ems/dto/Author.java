package com.cg.ems.dto;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name="Author_masters")

public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="author_id", length=10)
	private int authId;
	
	@Column(name="auth_name" , length=25)
	private String authName;
	
	
	@ManyToMany(mappedBy="auth")
	Set<Book> b=new HashSet<Book>();
	

	public Set<Book> getB() {
		return b;
	}

	public void setB(Set<Book> b) {
		this.b = b;
	}

	public Author() {
		super();
		
	}

	public Author(int authId, String authName) {
		super();
		this.authId = authId;
		this.authName = authName;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	@Override
	public String toString() {
		return "Author [authId=" + authId + ", authName=" + authName + "]";
	}
	
	
}
