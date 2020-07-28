package com.tanky.MrVan.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "mon")
public class MonEntity {

	@Id
	private String id;
	
	private String name;
	
	private int day;
	
    private String description;
	
    private float price;
	
    private int amount;


	public MonEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", Ten: " + name + ", Description:  " + description + ", price: " + price + ", amount: " + amount;
	}
	

	public MonEntity(String id, String name, String description, float price, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.amount = amount;
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public float getPrice() {
		return price;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
    
    
    
    
	
}
