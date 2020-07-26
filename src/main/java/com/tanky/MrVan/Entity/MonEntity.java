package com.tanky.MrVan.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Entity
//@Table(name = "mon")


@Document(collection = "mon")
public class MonEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
//	@Column(name = "name")

	private String name;
	
//	@Column(name = "day")
	private String day;
	
//	@Column(name = "description")
    private String description;
	
//	@Column(name = "price")
    private float price;
	
//	@Column(name = "amount")
    private int amount;
	
	
//	@OneToMany(mappedBy = "idMon")	
//    private List<Image_MonEntity> images;
    
    

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
	
	

	

//	public List<Image_MonEntity> getImages() {
//		return images;
//	}
//
//	public void setImages(List<Image_MonEntity> images) {
//		this.images = images;
//	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public float getPrice() {
		return price;
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
