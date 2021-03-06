package com.au.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.au.app.model.Category;
import com.au.app.service.CategoryService;

@Controller
//@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	//http://localhost:8080/categories
	@RequestMapping("/categories")	
	public String getCategories(Map<String, Object> model) {
		List<Category> categories = categoryService.getCategories();
		model.put("categories", categories);
		return "categoryView"; //TODO
	}
	
	//http://localhost:8080/categories/categoryid/2
	@RequestMapping("/categories/category/{categoryid}")	
	public String getCategoriesByCategoryID(@PathVariable("categoryid") long categoryID, Map<String, Object> model) {
		Category category = categoryService.getCategoryByID(categoryID);
		model.put("category", category);
		return "category"; //TODO
	}
}
