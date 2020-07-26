package com.tanky.MrVan.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Entity.SanPhamEntity;
import com.tanky.MrVan.Service.SanPhamService;

@RestController
@RequestMapping("/sanpham")
public class SanPham_API {

	@Autowired
	private SanPhamService sanphamService;
	
	@GetMapping
	public List<SanPhamEntity> getAll() {
		
		return sanphamService.getAll();
	}
	
	@GetMapping("/{id}")
	public SanPhamEntity getOne(@PathVariable int id) {
		
		return sanphamService.findOneById(id);
	}
	
	@PostMapping
	public void addSanPham(@RequestBody List<SanPhamEntity> listEntity) {
		sanphamService.save(listEntity);
	}
	
}
