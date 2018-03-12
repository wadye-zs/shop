package com.zx.dao;

import com.zx.beans.AdminAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-mybatis.xml"})
public class AdminaccountDaotest {

	@Autowired
	private AdminaccountDao adminAccountDao;
	
	@Test
	public void testGetTestList() {
		AdminAccount adminaccount = adminAccountDao.queryAdminaccountByNameAndPwd("will","123456");

		System.out.println(adminaccount);
	}
}
