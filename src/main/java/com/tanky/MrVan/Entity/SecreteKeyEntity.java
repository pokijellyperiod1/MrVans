package com.tanky.MrVan.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
* @author root {8:48:40 AM}:
 * @version Creation time: Oct 12, 2020 8:48:40 AM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */
@Document("secretekey")
public class SecreteKeyEntity {

	@Id
	private String id;
	private String secretKey;
	
	public SecreteKeyEntity() {
		// TODO Auto-generated constructor stub
	}

	public SecreteKeyEntity(String id, String secretKey) {
		super();
		this.id = id;
		this.secretKey = secretKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	
	
	
	
	
	
	
	
}
