package com.tanky.MrVan.API;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.tanky.MrVan.Convert.MonConvert;
import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Service.MonService;

@RestController
@RequestMapping("/api/menu")
public class ThucDonAPI {

	@Autowired
	private MonService monService;
	
	@Autowired
	private MonConvert monConvert;
	
	@GetMapping
	public List<MonEntity> listsMon() {
		List<MonEntity> listsEntity = monService.getAll();
	
		return listsEntity;
	}

	@GetMapping("/{day}")
	public List<MonEntity> byDay(@PathVariable String day) {
		
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		if (!day.equals("today")){
			if (day.equals("tomorrow")){
				dayOfWeek += 1;
				System.out.println(day.equals("tomorrow"));
				return monService.findAllByDay(dayOfWeek);
			}
			else return monService.getNullEntity();
			
		}
		
		return monService.findAllByDay(dayOfWeek);
		
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<MonEntity> AddMon(@RequestBody MonEntity entity, @RequestParam("files") MultipartFile file) {
		 Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
					"cloud_name", "dbqzpdgpi",
					"api_key", "463648723862277",
					"api_secret", "Bo1MvViceCLF9E0HB6hOz9MBC10"
					));
	    	

	        Map<String, String> map = new HashMap<String, String>();
			try {
				map = cloudinary.uploader().upload(file.getBytes(),
				            ObjectUtils.asMap("resource_type", "auto"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        String URL = map.getOrDefault("url", "null URL");
	        entity.setImage(URL);
		
		return ResponseEntity.ok(monService.save(entity));
	}
	
	@PostMapping("/add/all")
	public void AddListMon(@RequestBody List<MonEntity> monEntity) {
		
		monService.saveList(monEntity);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<MonEntity> UpdateMon(@PathVariable String id, @RequestBody MonEntity monEntity , @RequestParam("files") MultipartFile file) {
		MonEntity oldEntity = monService.findOneById(id);
		

		 Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
					"cloud_name", "dbqzpdgpi",
					"api_key", "463648723862277",
					"api_secret", "Bo1MvViceCLF9E0HB6hOz9MBC10"
					));
	    	

	        Map<String, String> map = new HashMap<String, String>();
			try {
				map = cloudinary.uploader().upload(file.getBytes(),
				            ObjectUtils.asMap("resource_type", "auto"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        String URL = map.getOrDefault("url", "null URL");
	        monEntity.setImage(URL);
	        monEntity.setId(id);
		
		
		return ResponseEntity.ok(monService.save(monEntity));
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		
		monService.delete(id);	
	}
	
	@GetMapping("/mon/{name}")
	public List<MonEntity> findAllBy_TenMon(@PathVariable String name) {
		return monService.findAllByName(name);
	}
	
	@PostMapping("/mon/updateAll/{oldName}/{newName}")
	public void updateAll(@PathVariable String oldName, @PathVariable String newName) {
		List<MonEntity> listMonEntity = monService.findAllByName(oldName);
		
		for (MonEntity monEntity : listMonEntity) {
			monEntity.setName(newName);
		}
		 
		monService.saveList(listMonEntity);
	}
	
	
	
	
	
	
}
