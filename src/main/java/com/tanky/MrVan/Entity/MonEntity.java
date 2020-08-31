package com.tanky.MrVan.Entity;

import javax.websocket.OnError;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.tanky.MrVan.dto.Image;

@Document(collection = "mon")
public class MonEntity {

	@Id
	private String id;
	
	private String name;
	
	private int[] day;
	
    private String description;
	
    private String price = "Liên hệ";
	
    private int amount;
    
//    private String imageURL = "https://res.cloudinary.com/dbqzpdgpi/image/upload/v1596088950/MrVans/MrVans_Image_df9p6s.png";
    private String imageURL;

	public MonEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", Ten: " + name + ", Description:  " + description + ", price: " + price + ", amount: " + amount;
	}
	

	public MonEntity(String id, String name, String description, String price, int amount) {
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
	

	public String getPrice() {
		return price;
	}

	public int[] getDay() {
		return day;
	}

	public void setDay(int[] day) {
		this.day = day;
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

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	
	
	


	
	
	
	
	
    
    
    
    
	
}
