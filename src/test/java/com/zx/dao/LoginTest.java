package com.zx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zx.BaseTest;

public class LoginTest extends BaseTest{
	@Autowired
	private AccountDao accountDao;
	@Test
	public void login(){
       String s= accountDao.Login("123456789");   
		System.out.println(s);
		if(s==null)
			System.out.println("无此账号");
	}
}
