package com.tanky.MrVan.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tanky.MrVan.Entity.ImageEntity;

@Repository
public interface ImageRepo extends MongoRepository<ImageEntity, String> {

	ImageEntity findOneById(String id);
	
}
