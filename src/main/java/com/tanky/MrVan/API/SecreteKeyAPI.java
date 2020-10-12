package com.tanky.MrVan.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Entity.SecreteKeyEntity;
import com.tanky.MrVan.Service.SecreteKeyService;

/**
* @author root {8:42:08 AM}:
 * @version Creation time: Oct 12, 2020 8:42:08 AM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */
@RestController
@RequestMapping("/api/secret-key")
public class SecreteKeyAPI {

	@Autowired
	private SecreteKeyService secreateService;
	
	@GetMapping
	public List<SecreteKeyEntity> getAll() {
		return secreateService.getAll();
	}
	
	@PostMapping("/add")
	public ResponseEntity<SecreteKeyEntity> save(@RequestBody SecreteKeyEntity secreteKeyEntity) {
		return ResponseEntity.ok(secreateService.save(secreteKeyEntity));
	}
	
	@PostMapping
	public ResponseEntity<String> compareSecreteKey(@RequestBody String entity) {
		if (secreateService.findOneBySecreteKey(entity) != null) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
		
		return ResponseEntity.ok().build();
	}
	
}
