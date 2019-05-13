package com.demo.entity;

import java.time.LocalDate;

/**
 * @author Yudi
 *
 */
public class Movie {

	private String name;
	private String description;
	private LocalDate releaseDate;
	private Integer stock;
	private Double rentalPrice;  
	
	public Movie() {}
	
	/**
	 * @param name
	 * @param description
	 * @param releaseDate
	 * @param stock
	 * @param rentalPrice
	 */
	public Movie(String name, String description, LocalDate releaseDate, Integer stock, Double rentalPrice) {
		super();
		this.name = name;
		this.description = description;
		this.releaseDate = releaseDate;
		this.stock = stock;
		this.rentalPrice = rentalPrice;
	}



	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.name = nome;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return
	 */
	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	/**
	 * @param releaseDate
	 */
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	/**
	 * @return
	 */
	public Integer getStock() {
		return stock;
	}


	/**
	 * @param stock
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}


	/**
	 * @return
	 */
	public Double getRentalPrice() {
		return rentalPrice;
	}


	/**
	 * @param rentalPrice
	 */
	public void setRentalPrice(Double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
}