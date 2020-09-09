package com.tanky.MrVan.API;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@RestController
public class photoAPI {

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadPhoto(ModelMap model, @RequestParam("files") MultipartFile file) throws IOException {
    	
    	 
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dbqzpdgpi",
				"api_key", "463648723862277",
				"api_secret", "Bo1MvViceCLF9E0HB6hOz9MBC10"
				));
    	

        Map<String, String> map = cloudinary.uploader().upload(file.getBytes(),
                    ObjectUtils.asMap("resource_type", "auto"));

        String URL = map.getOrDefault("url", "null URL");  
    	
        return URL;
	
	}
	
}
