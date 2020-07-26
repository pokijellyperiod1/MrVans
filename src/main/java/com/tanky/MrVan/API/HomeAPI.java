package com.tanky.MrVan.API;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.dto.GeneralValue;
import com.tanky.MrVan.dto.WhyChooseWe;
import com.tanky.MrVan.dto.home;

@RestController
@RequestMapping("/home")
public class HomeAPI {

	@GetMapping
	public GeneralValue generalValue() {
		GeneralValue generalValue = new GeneralValue();
		home Trang_Chu = new home();
		Trang_Chu.setSlogan("Hãy để chúng tôi chăm sóc cái bụng của bạn");
		Trang_Chu.setSubSlogan("Thực đơn ngon, gíá hạt dẻ cho một chiếc bụng đói mềm");
		Trang_Chu.setText("Ngó sang menu chúng mình nhé...");
		
		WhyChooseWe whychoosewe = new WhyChooseWe();
		Map<String, String> listCustomerCommand = new HashMap<String, String>();
		listCustomerCommand.put("Customer 1", "Very goood....");
		listCustomerCommand.put("Customer 2", "Good good....");
		listCustomerCommand.put("Customer 3", "Bad bad....");
		
		Map<String, String> sortlistCustomerCommand = listCustomerCommand.entrySet()
				.stream()
				.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
				.collect(Collectors.toMap(
							Map.Entry::getKey,
							Map.Entry::getValue,
							(oldValue, newValue) -> oldValue,
							LinkedHashMap::new
						));
		
		
		Map<String, String> listsBenefit = new HashMap<String, String>();
		listsBenefit.put("Lorem 1", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		listsBenefit.put("Lorem 2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		listsBenefit.put("Lorem 3", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		listsBenefit.put("Lorem 4", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		listsBenefit.put("Lorem 5", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		listsBenefit.put("Lorem 6", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		Map<String, String> sortListBenefits = listsBenefit.entrySet()
															.stream()
															.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
															.collect(Collectors.toMap(
																		Map.Entry::getKey,
																		Map.Entry::getValue,
																		(oldValue, newValue) -> oldValue,
																		LinkedHashMap::new
																	));
		
		
		
		whychoosewe.setCustomerCommand(sortlistCustomerCommand);
		whychoosewe.setListsBenefit(sortListBenefits);
		
		
		generalValue.setHome(Trang_Chu);
		generalValue.setWhy_choose_we(whychoosewe);
		return generalValue;
	}
	
}
