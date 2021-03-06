package com.au.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.au.app.model.Clue;
import com.au.app.service.ClueService;

@Controller
@RequestMapping("/clues")
public class ClueController {

	@Autowired
	private ClueService clueService;
	
	//http://localhost:8080/clue/1
	@RequestMapping("/clue/{id}")
	public String getClueByID(@PathVariable("id") long id, Map<String, Object> model) {
		Clue clue = clueService.getClueByID(id);
		model.put("clue", clue);
		return "clueView";
	}
	
	//http://localhost:8080/clues/airdate/2015-01-23T12:00:00.000Z
	@RequestMapping("/airdate/{airdate}")
	public String getCluesByAirDate(@PathVariable("airdate") String airdate, Map<String, Object> model) {
		List<Clue> cluesByAirDate = clueService.getCluesByAirDate(airdate);
		model.put("cluesByAirDate", cluesByAirDate);
		return "cluesByAirDate"; //TODO
	}
	
	//http://localhost:8080/clues/categoryid/2
	@RequestMapping("/categoryid/{categoryid}")	
	public String getCluesByCategory(@PathVariable("categoryid") long categoryID, Map<String, Object> model) {
		List<Clue> cluesByCategory = clueService.getCluesByCategory(categoryID);
		model.put("cluesByCategory", cluesByCategory);
		return "cluesByCategory"; //TODO
	}
}
