package com.shop.dao;

import com.shop.beans.AdminAccount;
import org.apache.ibatis.annotations.Param;


public interface AdminaccountDao {
	/**
	 * 通过账号密码查询账号信息
	 * 
	 * @param username
	 * @param password
	 * @return Account
	 */

	AdminAccount queryAdminaccountByNameAndPwd(@Param("username") String username, @Param("password") String password);
}
