package com.tanky.MrVan.API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Convert.MonConvert;
import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Service.MonService;
import com.tanky.MrVan.dto.MonDTO;

@RestController
@RequestMapping("/api/mon")
public class MonAPI {

	@Autowired
	private MonService monService;
	
	@Autowired
	private MonConvert monConvert;

	@GetMapping("/{id}")
	public MonEntity getOne(@PathVariable String id) {
		
		return monService.findOneById(id);
	}
	
	
	@PostMapping
	public ResponseEntity<MonEntity> AddMon(@RequestBody MonDTO monDTO) {
		MonEntity entity = monConvert.from_DTO_To_Entity(monDTO);
		
		return ResponseEntity.ok(monService.save(entity));
	}
	
	@PostMapping("/all")
	public void AddListMon(@RequestBody List<MonEntity> monEntity) {
		
		
		monService.saveList(monEntity);
	}
	
	@PutMapping
	public ResponseEntity<MonEntity> UpdateMon(@RequestBody MonDTO monDTO) {
		MonEntity entity = monConvert.from_DTO_To_Entity(monDTO);
		
		return ResponseEntity.ok(monService.save(entity));
	}
	
	
	
	
	
}


















