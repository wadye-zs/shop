package com.zx.beans;

import java.util.Date;

public class UserInfo {

	//编号
	private int user_id;
	
	//用户名
	private String username;
	
	//头像
	private String headphoto;
	
	//昵称
	private String nikename;
	
	//真实姓名
	private String realname;
	
	//邮箱
	private String email;
	
	//性别
	private int sex;
	
	//出生日期
	private Date birthday;
	
	//自我介绍
	private String selfintroduce;
	
	//等级
	private int level;
	
	//积分
	private int integral;
	
	//信用度
	private float credit;
	
	//创建时间
	private Date dt_create;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHeadphoto() {
		return headphoto;
	}

	public void setHeadphoto(String headphoto) {
		this.headphoto = headphoto;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSelfintroduce() {
		return selfintroduce;
	}

	public void setSelfintroduce(String selfintroduce) {
		this.selfintroduce = selfintroduce;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public Date getDt_create() {
		return dt_create;
	}

	public void setDt_create(Date dt_create) {
		this.dt_create = dt_create;
	}
	
	
	
}
