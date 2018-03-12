package com.zx.dao;
import java.security.MessageDigest;
import java.util.Calendar;

import com.zx.BaseTest;
import com.zx.util.NowDate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountRegisterTest extends BaseTest {
	@Autowired
	private AccountDao accountDao;
	MessageDigest md; 
	@Test
	public void Register(){
		String s=MD5Util_Test.MD5("123");
		System.out.println(s);
		   Calendar ca = Calendar.getInstance();
		      int year = ca.get(Calendar.YEAR);//获取年份
		      int month=ca.get(Calendar.MONTH);//获取月份
		      int day=ca.get(Calendar.DATE);//获取日
		String Date =year+"-"+month+"-"+day;
       accountDao.RegisterAccountPwd("wly2", s, NowDate.date());
	}

}
