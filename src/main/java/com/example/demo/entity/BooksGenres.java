package com.example.demo.entity;

import java.util.Date;

import lombok.Data;
@Data
public class BooksGenres {
	
	private Integer id;
	private String title;
	private String author;
	private Integer edition;
	private Date issueDate;
	private Date addDate;
	private Date updDate;
	private Integer version;
	private boolean isValid;
	private String genre;

}
