package com.aitrich.bookmyshowclone.Domain;

import java.util.List;

public class Movie {
	
	private String name;
	private String language;
	private Ratings rating;
	private List<Theatre> theatre;
	private Formats format;
	
	public Movie() {}
	
	public Movie(String name , String language , Ratings rating , List<Theatre> theatre , Formats format) {
		this.name = name;
		this.language = language;
		this.rating = rating;
		this.theatre = theatre;
		this.format = format;
	}
	
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public Ratings getRating() {
		return rating;
	}
	public List<Theatre> getTheatre() {
		return theatre;
	}
	public Formats getFormat() {
		return format;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setRating(Ratings rating) {
		this.rating = rating;
	}
	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	public void setFormat(Formats format) {
		this.format = format;
	}
}
