package com.tanky.MrVan.dto;

import java.util.HashMap;
import java.util.Map;

public class GeneralValue {

	//home
//	home home;
	private String slogan;
	private String subSlogan;
	private String text;
	
	// WhyChooseWe
//	WhyChooseWe why_choose_we;
	private Map<String, ?> customerCommand = new HashMap<String, String>();
	private Map<String, String> listsBenefit;
	private String even;
	
	//Introduction
//	Introduction introductions;
	private String introduction;
	private String vision;
	private String mission;
	private Map<String, String> contact;
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getSubSlogan() {
		return subSlogan;
	}
	public void setSubSlogan(String subSlogan) {
		this.subSlogan = subSlogan;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Map<String, ?> getCustomerCommand() {
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
	public String getEven() {
		return even;
	}
	public void setEven(String even) {
		this.even = even;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getVision() {
		return vision;
	}
	public void setVision(String vision) {
		this.vision = vision;
	}
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public Map<String, String> getContact() {
		return contact;
	}
	public void setContact(Map<String, String> contact) {
		this.contact = contact;
	}

	
	
	
	
	

}
