package com.tanky.MrVan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanky.MrVan.Entity.ImageEntity;
import com.tanky.MrVan.Repo.ImageRepo;

@Service
public class ImageService {

	@Autowired
	private ImageRepo imageRepo;
	
	public List<ImageEntity> getAll() {
		return imageRepo.findAll();
	}
	
	public ImageEntity getOneImage(String id) {
		return imageRepo.findOneById(id);
	}
	
	public ImageEntity save(ImageEntity entity) {
		return imageRepo.save(entity);
	}
	
	
}
