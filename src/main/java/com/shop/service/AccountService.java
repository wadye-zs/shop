package com.shop.service;

import com.shop.beans.Account;

public interface AccountService {

	/**
	 * 通过账号密码查询账号信息
	 * @param username
	 * @param password
	 * @return
	 */
	Account getAccountByNameAndPwd(String username, String password);
	Account getAccountByName(String username);
	boolean updateAccountPwd(String username, String newpwd);
	   //注册

	boolean RegisterAccountPwd(String username, String psssword);
}
