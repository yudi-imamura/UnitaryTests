package com.demo.services;

import java.time.LocalDate;
import com.demo.entity.Location;
import com.demo.entity.Movie;
import com.demo.entity.User;

public class LocationService {
	
	public Location rentalMovie(User user, Movie movie) {
		Location location = new Location();
		location.setMovie(movie);
		location.setUser(user);
		location.setRentalDate(LocalDate.now());
		location.setTotalValue(movie.getRentalPrice());
		
		return location;
	}
}