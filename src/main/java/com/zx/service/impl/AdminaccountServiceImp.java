package com.zx.service.impl;

import com.zx.beans.AdminAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.dao.AdminaccountDao;
import com.zx.service.AdminaccountService;

@Service
public class AdminaccountServiceImp implements AdminaccountService {
	
	@Autowired
	private AdminaccountDao adminaccountDao;
	
	@Override
	public AdminAccount getAdminaccountByNameAndPwd(String username, String password) {
		
		return adminaccountDao.queryAdminaccountByNameAndPwd(username, password);
		
	}

}
