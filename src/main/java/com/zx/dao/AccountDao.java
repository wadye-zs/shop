package com.zx.dao;


import com.zx.beans.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountDao {
	
	/**
	 * 通过账号密码查询账号信息
	 * @param username
	 * @param password
	 * @return	Account
	 */
	Account queryAccountByNameAndPwd(@Param("username") String username, @Param("password") String password);
	Account queryAccountByName(@Param("username") String username);
	int updateAccountPwd(@Param("username") String username, @Param("password") String password);
	int RegisterAccountPwd(@Param("username") String username, @Param("password") String password, @Param("Dt_create") String Dt_create);
	String Login(@Param("username") String username);
}
