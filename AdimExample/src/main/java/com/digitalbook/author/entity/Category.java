package com.digitalbook.author.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity(name = "tbcategory")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryNme;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryNme() {
		return categoryNme;
	}
	public void setCategoryNme(String categoryNme) {
		this.categoryNme = categoryNme;
	}
	public Category(int categoryId, String categoryNme) {
		super();
		this.categoryId = categoryId;
		this.categoryNme = categoryNme;
	}
	public Category() {
		// TODO Auto-generated constructor stub
	}
    
}



