package com.tanky.MrVan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanky.MrVan.Entity.SecreteKeyEntity;
import com.tanky.MrVan.Repo.SecreteKeyRepo;

/**
* @author root {8:51:25 AM}:
 * @version Creation time: Oct 12, 2020 8:51:25 AM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */
@Service
public class SecreteKeyService {

	@Autowired
	private SecreteKeyRepo secreteKeyRepo;
	
	public List<SecreteKeyEntity> getAll() {
		return secreteKeyRepo.findAll();
	}
	
	public SecreteKeyEntity findOneBySecreteKey(String secreteKey) {
		return secreteKeyRepo.findOneBySecreteKey(secreteKey);
	}
	
	public SecreteKeyEntity save(SecreteKeyEntity secreteKeyEntity) {
		return secreteKeyRepo.save(secreteKeyEntity);
	}
	
	public void delete(String id) {
		secreteKeyRepo.deleteById(id);
	}
	
	
	
}
