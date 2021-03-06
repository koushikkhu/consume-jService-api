package com.au.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.au.app.model.Clue;

@Service
public class ClueServiceImpl implements ClueService{
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${rootJServiceApiURL}")
	private String rootJServiceApiURL;	

	public Clue getClueByID(long id) {
		return restTemplate.getForObject(rootJServiceApiURL + "/clues/" + id + ".json", Clue.class);
	}
	

	public List<Clue> getCluesByAirDate(String airdate) {
		ResponseEntity<List<Clue>> cluesResponse =
		        restTemplate.exchange(rootJServiceApiURL+"/clues",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Clue>>() {
		            });
		List<Clue> clues = cluesResponse.getBody();
		List<Clue> cluesByAirDate = new ArrayList<Clue>();
		for(Clue clue:clues) {
			if(clue.getAirdate()!= null && clue.getAirdate().equalsIgnoreCase(airdate))
				cluesByAirDate.add(clue);
		}
		return cluesByAirDate;
	}
	
	public List<Clue> getCluesByCategory(long categoryID) {
		ResponseEntity<List<Clue>> cluesResponse =
		        restTemplate.exchange(rootJServiceApiURL+"/clues",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Clue>>() {
		            });
		List<Clue> clues = cluesResponse.getBody();
		List<Clue> cluesByCategory = new ArrayList<Clue>();
		for(Clue clue:clues) {
			if(clue.getCategory_id() == categoryID)
				cluesByCategory.add(clue);
		}
		return cluesByCategory;
	}
}
