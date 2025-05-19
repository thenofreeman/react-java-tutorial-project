package com.packt.cardatabase.domain;

import jakarta.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String brand, model, color, registrationNumber;

	private int modelYear, price;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="owner")
	private Owner owner;

//	@Column(name="explanation", nullable=false, length=512)
//	private String description;

	public Car() { }

	public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {
		super();

		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.modelYear = modelYear;
		this.price = price;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}	

	public String getBrand() {
		return brand;
	}

	public void setBrand() {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getModelYear() {
		return modelYear;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
