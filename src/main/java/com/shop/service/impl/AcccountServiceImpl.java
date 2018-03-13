package com.shop.service.impl;

import com.shop.beans.Account;
import com.shop.dao.AccountDao;
import com.shop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account getAccountByNameAndPwd(String username, String password) {
		return accountDao.queryAccountByNameAndPwd(username, password);
	}
	@Override
	public Account getAccountByName(String username){
		return accountDao.queryAccountByName(username);
	}
	@Override
	public boolean updateAccountPwd(String username, String password) {
		
		int update = accountDao.updateAccountPwd(username, password);
		if(update == 1)
			return true;
		return false;
	}
	@Override
	public boolean RegisterAccountPwd(String username,String password){
		int register = accountDao.RegisterAccountPwd(username, password,"2017-01-01");
		if(register == 1)
			return true;
		return false;
	}

}
