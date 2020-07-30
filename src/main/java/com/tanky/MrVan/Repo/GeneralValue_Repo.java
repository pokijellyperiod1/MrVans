package com.tanky.MrVan.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tanky.MrVan.Entity.GeneralValue_Entity;

@Repository
public interface GeneralValue_Repo extends MongoRepository<GeneralValue_Entity, String> {

	GeneralValue_Entity findOneById(String id);
	
}
