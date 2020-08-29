package com.tanky.MrVan.dto;

import java.util.List;

public class MonDTO {

	private String id;
	private String day;
    private String name;
    private String description;
    private String price = "Liên hệ";
    private int amount;
    private String imageURL = "https://res.cloudinary.com/dbqzpdgpi/image/upload/v1596088950/MrVans/MrVans_Image_df9p6s.png";
   
    
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
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
	
	
	
    
    
	
}
