package com.tanky.MrVan.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tanky.MrVan.Entity.SanPhamEntity;

@Repository
public interface SanPhamRepo extends MongoRepository<SanPhamEntity, String> {

	SanPhamEntity findOneById(int id);
	
}
