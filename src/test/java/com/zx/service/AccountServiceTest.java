package com.zx.service;

import com.zx.beans.Account;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zx.BaseTest;

public class AccountServiceTest extends BaseTest {
	@Autowired
	private AccountService accountService;

	@Test
	@Ignore
	public void testGetTestList() {
		Account account = accountService.getAccountByNameAndPwd("12345678901", "123456");
		System.out.println(account.getUsername());
	}
}
