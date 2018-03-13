package com.shop.beans;

import java.util.Date;

public class Account {
	
	//ID
	private int account_id;
	
	//username
	private String username;
	
	//password
	private String password;
	
	//dt_create
	private Date dt_create;



	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDt_create() {
		return dt_create;
	}

	public void setDt_create(Date dt_create) {
		this.dt_create = dt_create;
	}
}
