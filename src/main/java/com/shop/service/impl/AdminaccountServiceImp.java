package com.shop.service.impl;

import com.shop.beans.AdminAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.AdminaccountDao;
import com.shop.service.AdminaccountService;

@Service
public class AdminaccountServiceImp implements AdminaccountService {
	
	@Autowired
	private AdminaccountDao adminaccountDao;
	
	@Override
	public AdminAccount getAdminaccountByNameAndPwd(String username, String password) {
		
		return adminaccountDao.queryAdminaccountByNameAndPwd(username, password);
		
	}

}
