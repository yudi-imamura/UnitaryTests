package com.demo.entity;

import java.time.LocalDate;
import java.util.Date;

public class Location {

	private User user;
	private Movie movie;
	private LocalDate rentalDate;
	private LocalDate returnDate;
	private Double totalValue;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(User user, Movie movie, LocalDate rentalDate, LocalDate returnDate, Double totalValue) {
		super();
		this.user = user;
		this.movie = movie;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.totalValue = totalValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

}