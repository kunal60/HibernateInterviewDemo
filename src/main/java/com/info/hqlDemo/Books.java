package com.info.hqlDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {
	@Id
	String book_id;
	@Column(nullable = false)
	String title;
	@Column(nullable = false)
	String author_last_name;
	String author_first_name;
	Integer rating;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + book_id + "," + title + "," + author_first_name + "," + author_last_name + "," + rating +"]";
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor_last_name() {
		return author_last_name;
	}

	public void setAuthor_last_name(String author_last_name) {
		this.author_last_name = author_last_name;
	}

	public String getAuthor_first_name() {
		return author_first_name;
	}

	public void setAuthor_first_name(String author_first_name) {
		this.author_first_name = author_first_name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
