package com.tanky.MrVan.Entity;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "image")
public class ImageEntity {

	private String id;
    private String title;
    private Binary image;
    
    
	public ImageEntity(String title) {
		super();
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Binary getImage() {
		return image;
	}
	public void setImage(Binary image) {
		this.image = image;
	}
    
    
	
}
