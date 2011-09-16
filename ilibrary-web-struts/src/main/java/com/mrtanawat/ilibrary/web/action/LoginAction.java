package com.mrtanawat.ilibrary.web.action;

public class LoginAction {
	
	private String username;
	private String error;

	public String login() {
		if("Emp".equals(this.username)) {
			return "passed";
		}
		this.error = "Wrong username.";
		return "failed";
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getError() {
		return error;
	}
}
