package com.tanky.MrVan.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tanky.MrVan.Entity.MonEntity;

@Repository		
public interface MonRepository extends MongoRepository<MonEntity, String> {

	List<MonEntity> findAllByName(String name);
	MonEntity findOneById(String id);
	MonEntity findOneByPrice(int price);
	List<MonEntity> findAllByDay(int day);
	
}
