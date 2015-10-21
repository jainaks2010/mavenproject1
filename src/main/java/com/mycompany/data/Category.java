package com.mycompany.data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Category implements Serializable{
	Long categoryId;
	String categoryName;
	Category parentCategory;	
	Set<Category> subCategories = new HashSet<Category>();
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Set<Category> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(Set<Category> subCategories) {
		this.subCategories = subCategories;
	}

}
