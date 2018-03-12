package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class IAccountController {
	/**
	 * 登录页路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String login() {
		return "account/login";
	}
	/**
	 * 登录成功路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	private String success() {
		return "account/success";
	}
	/**
	 * 登录失败路由
	 * 
	 * @return
	 */
	@RequestMapping(value = "/failed", method = RequestMethod.GET)
	private String failed() {
		return "account/failed";
	}	
}
