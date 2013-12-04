package com.jozeflang.wicketpresentation.app;

import javax.management.RuntimeErrorException;

public class UserInfo {

	private String username;
	private String realname;
	private String mail;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public void setMail(String email) {
		this.mail = email;
	}
	
	public String getMail() {
		return mail;
	}
}