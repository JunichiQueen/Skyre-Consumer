package com.bae.entity;

public class SentInfo {
	
	private String name;
	
	private String time;
	
	private String requestType;
	
	private String username;
	
	public SentInfo(String name, String time, String requestType, String username) {
		this.name=name;
		this.time=time;
		this.requestType=requestType;
		this.username=username;
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

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
