package com.shop.beans;

import java.util.Date;

public class IntergralList {

	//id
	private int intergral_id;
	
	//用户名
	private String username;
	
	//积分余额
	private int intergral;
	
	//产生时间
	private Date date;
	
	//数量
	private int num;
	
	//描述
	private String describe;
	
	//状态
	private int state;
	
	//创建时间
	private Date dt_create;

	public int getIntergral_id() {
		return intergral_id;
	}

	public void setIntergral_id(int intergral_id) {
		this.intergral_id = intergral_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getIntergral() {
		return intergral;
	}

	public void setIntergral(int intergral) {
		this.intergral = intergral;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getDt_create() {
		return dt_create;
	}

	public void setDt_create(Date dt_create) {
		this.dt_create = dt_create;
	}
	
	
}
