package com.tanky.MrVan.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tanky.MrVan.Entity.SecreteKeyEntity;

/**
* @author root {8:50:56 AM}:
 * @version Creation time: Oct 12, 2020 8:50:56 AM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */
@Repository
public interface SecreteKeyRepo extends MongoRepository<SecreteKeyEntity, String> {

	SecreteKeyEntity findOneBySecretKey(String secretKey);
	
}
