package com.zx.service;


import com.zx.beans.AdminAccount;

public interface AdminaccountService {
	
	/**
	 * 通过账号密码查询账号信息
	 * @param username
	 * @param password
	 * @return
	 */
	AdminAccount getAdminaccountByNameAndPwd(String username, String password);
}
