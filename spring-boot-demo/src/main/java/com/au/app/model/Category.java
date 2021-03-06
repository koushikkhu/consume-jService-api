package com.au.app.model;

public class Category {
	private long id;
	private String title;
	private int clues_count;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getClues_count() {
		return clues_count;
	}
	public void setClues_count(int clues_count) {
		this.clues_count = clues_count;
	}
	public Category() {
		
	}
	public Category(long id, String title, int clues_count) {
		super();
		this.id = id;
		this.title = title;
		this.clues_count = clues_count;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", clues_count=" + clues_count + "]";
	}	
}
