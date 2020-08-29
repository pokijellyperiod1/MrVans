package com.tanky.MrVan.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.ls.LSInput;

import com.mongodb.ClientSessionOptions;
import com.mongodb.client.ChangeStreamIterable;
import com.mongodb.client.ClientSession;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.connection.ClusterDescription;
import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Repo.MonRepository;

@Service
public class MonService {

	@Autowired
	private MonRepository monRepository;
	
	
	public List<MonEntity> getNullEntity() {
		return new ArrayList<MonEntity>();
		
	}
	
	public List<MonEntity> getAll() {
		return monRepository.findAll();
	}
	
	public MonEntity findOneById(String idMon) {
		return monRepository.findOneById(idMon);
	}
	
	public List<MonEntity> findAllByDay(int day) {
		return monRepository.findAllByDay(day);
	}
	
	public MonEntity save(MonEntity entity) {
		return monRepository.save(entity);
	}
	
	public MonEntity saveList(List<MonEntity> entity) {
		for (MonEntity monEntity : entity) {
			monRepository.save(monEntity);
		}
		return null;
	}
	
	public MonEntity update(MonEntity monEntity) {
		MonEntity newMonEntity = monRepository.findById(monEntity.getId()).orElse(null);
		
		if (monEntity != null) {
			newMonEntity.setName(monEntity.getName());
			newMonEntity.setDescription(monEntity.getDescription());
			newMonEntity.setPrice(monEntity.getPrice());
			newMonEntity.setAmount(monEntity.getAmount());
		}
		return monRepository.save(newMonEntity);
	}
	
	public void delete(String idMon) {
		MonEntity monEntity = monRepository.findById(idMon).orElse(null);
		if (monEntity != null) {
			monRepository.delete(monEntity);
		}
		
	}
	
	
	
	
	
	
	
}
