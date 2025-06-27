package com.gigaia.productDataService.model;

import java.util.List;

public class Product {

	private int id;
	private String name;
	private String brand;
	private String category;
	private String gender;
	private List<Variant> variants;
	
	// Constructors
	public Product() {
		super();
	}
	
	public Product(int id, String name, String brand, String category, String gender, List<Variant> variants) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.gender = gender;
		this.variants = variants;
	}

	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}
}
