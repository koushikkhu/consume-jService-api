package com.au.app.service;

import java.util.List;

import com.au.app.model.Category;

public interface CategoryService {
	List<Category> getCategories();
	Category getCategoryByID(long id);
}
