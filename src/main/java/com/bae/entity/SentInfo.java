package com.bae.entity;

public class SentInfo {
	
	private String name;
	
	private String time;
	
	public SentInfo(String name, String time) {
		this.name=name;
		this.time=time;
	}
	
	public SentInfo() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
