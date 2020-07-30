package com.tanky.MrVan.Service;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tanky.MrVan.Entity.ImageEntity;
import com.tanky.MrVan.Repo.ImageRepo;

@Service
public class ImageService {

	@Autowired
	private ImageRepo imageRepo;
	
	public String addPhoto(String title, MultipartFile file) throws IOException { 
        ImageEntity photo = new ImageEntity(title); 
        photo.setImage(
          new Binary(BsonBinarySubType.BINARY, file.getBytes())); 
        photo = imageRepo.insert(photo); return photo.getId(); 
    }
 
    public ImageEntity getPhoto(String id) { 
        return imageRepo.findById(id).get(); 
    }
		
	
}
