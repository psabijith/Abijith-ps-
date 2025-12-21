package com.aitrich.bookmyshowclone.Domain;

import java.time.LocalDateTime;

public class Theatre {
	
	private String name;
	private String location;
	private int totalSeats;
	private int seatsAvailable = totalSeats;
	private LocalDateTime showTiming;
	
	public Theatre() {}
	
	public Theatre(String name , String location , int totalSeats , LocalDateTime showTiming) {
		this.name = name;
		this.location = location;
		this.totalSeats = totalSeats;
		this.showTiming = showTiming;
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public LocalDateTime getShowTiming() {
		return showTiming;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public void setShowTiming(LocalDateTime showTiming) {
		this.showTiming = showTiming;
	}
}
