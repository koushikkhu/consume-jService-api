package com.au.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.au.app.model.Category;

public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${rootJServiceApiURL}")
	private String rootJServiceApiURL;
	
	public List<Category> getCategories() {
		ResponseEntity<List<Category>> categoryResponse =
		        restTemplate.exchange(rootJServiceApiURL+"/categories",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Category>>() {
		            });
		return categoryResponse.getBody();
	}

	public Category getCategoryByID(long id) {
		return restTemplate.getForObject(rootJServiceApiURL+"/categories/" + id + ".json", Category.class);		
	}
}
