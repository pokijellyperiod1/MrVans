package com.tanky.MrVan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Entity.SanPhamEntity;
import com.tanky.MrVan.Repo.SanPhamRepo;

@Service
public class SanPhamService{

	@Autowired
	private SanPhamRepo sanPhamRepo;
	
	public List<SanPhamEntity> getAll() {
		return sanPhamRepo.findAll();
	}
	
	public SanPhamEntity findOneById(int id) {
		return sanPhamRepo.findOneById(id);
	}
	
	public SanPhamEntity save(SanPhamEntity sanPhamEntity) {
		return sanPhamRepo.save(sanPhamEntity);
	}
	
	public void save(List<SanPhamEntity> listSanPhamEntity) {
		for (SanPhamEntity entity : listSanPhamEntity) {
			sanPhamRepo.save(entity);
		}
		
	}
	
	
	
}
