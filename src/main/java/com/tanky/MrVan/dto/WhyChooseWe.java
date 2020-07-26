package com.tanky.MrVan.dto;

import java.util.List;
import java.util.Map;

public class WhyChooseWe {

	private Map<String, String> customerCommand;
	
	private Map<String, String> listsBenefit;
	
	public WhyChooseWe() {
		// TODO Auto-generated constructor stub
	}

	
	
	public WhyChooseWe(Map<String, String> customerCommand, Map<String, String> listsBenefit) {
		super();
		this.customerCommand = customerCommand;
		this.listsBenefit = listsBenefit;
	}



	public Map<String, String> getCustomerCommand() {
		return customerCommand;
	}



	public void setCustomerCommand(Map<String, String> customerCommand) {
		this.customerCommand = customerCommand;
	}





	public Map<String, String> getListsBenefit() {
		return listsBenefit;
	}


	public void setListsBenefit(Map<String, String> listsBenefit) {
		this.listsBenefit = listsBenefit;
	}

	
	
	
	
	
	
}
