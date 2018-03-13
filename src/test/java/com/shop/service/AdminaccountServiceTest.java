package com.shop.service;

import com.shop.beans.AdminAccount;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.BaseTest;

public class AdminaccountServiceTest extends BaseTest{
	@Autowired
	private AdminaccountService adminaccountService;

	@Test
	public void getAdminaccountByNameAndPwd() {
		AdminAccount adminaccount = adminaccountService.getAdminaccountByNameAndPwd("will", "123456");
		System.out.println(adminaccount.getUsername());
	}
}
