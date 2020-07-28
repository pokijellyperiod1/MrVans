package com.tanky.MrVan.Convert;

import org.springframework.stereotype.Component;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.dto.MonDTO;

@Component
public class MonConvert {
	
	public MonDTO from_Entity_To_DTO(MonEntity entity) {
		
		MonDTO monDTO = new MonDTO();
		monDTO.setId(entity.getId());
		monDTO.setName(entity.getName());
		monDTO.setDescription(entity.getDescription());
		monDTO.setPrice(entity.getPrice());
		monDTO.setAmount(entity.getAmount());
		
		
		return monDTO;
	}
	
	
	public MonEntity from_DTO_To_Entity(MonDTO monDTO) {
		
		MonEntity monEntity = new MonEntity();
		monEntity.setId(monDTO.getId());
		monEntity.setName(monDTO.getName());
		monEntity.setDescription(monDTO.getDescription());
		monEntity.setPrice(monDTO.getPrice());
		monEntity.setAmount(monDTO.getAmount());
		
		return monEntity;
	}
	
	
	
	
	
	
	
	
}
