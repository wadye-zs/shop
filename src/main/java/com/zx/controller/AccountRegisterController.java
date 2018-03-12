package com.zx.controller;

import com.zx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountRegisterController {
	@Autowired
	private AccountService accountService;
	
//	@RequestMapping(value = "/resign", method = RequestMethod.POST)
//	@ResponseBody
	// 获取输入的帐号
//	String username = HttpServletRequestUtil.getString(request, "userName");
//	// 获取输入的密码
//	String password = HttpServletRequestUtil.getString(request, "password");
}
