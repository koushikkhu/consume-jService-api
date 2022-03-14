package com.au.app.model;

public class Clue {
	long id;
	String answer;
	String question;
	String value;
	String airdate;
	long category_id;
	long game_id;
	int invalid_count;
	public Clue() {
		
	}
	public Clue(long id, String answer, String question, String value, String airdate, long category_id, long game_id,
			int invalid_count) {
		super();
		this.id = id;
		this.answer = answer;
		this.question = question;
		this.value = value;
		this.airdate = airdate;
		this.category_id = category_id;
		this.game_id = game_id;
		this.invalid_count = invalid_count;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAirdate() {
		return airdate;
	}
	public void setAirdate(String airdate) {
		this.airdate = airdate;
	}
	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}
	public long getGame_id() {
		return game_id;
	}
	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}
	public int getInvalid_count() {
		return invalid_count;
	}
	public void setInvalid_count(int invalid_count) {
		this.invalid_count = invalid_count;
	}	

}
