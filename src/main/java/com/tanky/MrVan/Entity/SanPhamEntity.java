package com.tanky.MrVan.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "san_pham")
public class SanPhamEntity {

	private int id;
	
	private String name;

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
	
	
	
}
