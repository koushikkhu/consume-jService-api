package com.au.app.service;

import java.util.List;

import com.au.app.model.Clue;

public interface ClueService {
	Clue getClueByID(long id);
	List<Clue> getCluesByAirDate(String airdate);
	List<Clue> getCluesByCategory(long categoryID);
}
