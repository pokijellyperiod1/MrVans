package com.tanky.MrVan.Entity;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "general_value")
public class GeneralValue_Entity {

	@Id
	private String id;

	private String slogan;
	private String subSlogan;
	private String text;
	

	private Map<String, String> customerCommand;
	private Map<String, String> listsBenefit;
	private String even;
	

	private String introduction;
	private String vision;	
	private String mission;
	private Map<String, String> contact;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
