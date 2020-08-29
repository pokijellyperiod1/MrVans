package com.tanky.MrVan.API;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Convert.MonConvert;
import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Repo.MonRepository;
import com.tanky.MrVan.Service.MonService;
import com.tanky.MrVan.dto.MonDTO;

@RestController
@RequestMapping("/api/menu")
public class ThucDonMonTheoNgay_API {

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
	public ResponseEntity<MonEntity> AddMon(@RequestBody MonEntity entity) {

		
		return ResponseEntity.ok(monService.save(entity));
	}
	
	@PostMapping("/add/all")
	public void AddListMon(@RequestBody List<MonEntity> monEntity) {
		
		monService.saveList(monEntity);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<MonEntity> UpdateMon(@PathVariable String id, @RequestBody MonEntity monEntity) {
		MonEntity oldEntity = monService.findOneById(id);
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
