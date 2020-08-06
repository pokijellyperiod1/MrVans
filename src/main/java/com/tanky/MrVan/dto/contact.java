package com.tanky.MrVan.dto;

import java.util.List;
import java.util.Map;

public class contact {

	private String header;
	private String footer;
	private List<Benefit> paragraph;
	private Vision vision;
	private Mission mission;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public List<Benefit> getParagraph() {
		return paragraph;
	}
	public void setParagraph(List<Benefit> paragraph) {
		this.paragraph = paragraph;
	}
	public Vision getVision() {
		return vision;
	}
	public void setVision(Vision vision) {
		this.vision = vision;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	
	
	
	
	
	
	
	
	
	
}
