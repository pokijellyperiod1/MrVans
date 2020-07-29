package com.tanky.MrVan.API;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Service.MonService;

@RestController
@RequestMapping("/api/menu")
public class ThucDonMonTheoNgay_API {

	@Autowired
	private MonService monService;
	
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
	
	
	
}
