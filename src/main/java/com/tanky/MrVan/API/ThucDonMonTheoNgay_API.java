package com.tanky.MrVan.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Repo.MonRepository;
import com.tanky.MrVan.Service.MonService;

@RestController
@RequestMapping("/list")
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
		return monService.findAllByDay(day);
	}
	
	
	
}
