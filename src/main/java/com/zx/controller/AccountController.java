package com.zx.controller;

import com.zx.beans.Account;
import com.zx.service.AccountService;
import com.zx.util.HttpServletRequestUtil;
import com.zx.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> logincheck(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<String, Object>();

		// 获取输入的帐号
		String username = HttpServletRequestUtil.getString(request, "userName");
		// 获取输入的密码
		String password1 = HttpServletRequestUtil.getString(request, "password");
		System.out.println("------------------------------");
		System.out.println(username);
		System.out.println(password1);
		System.out.println("------------------------------");
		// 非空校验
		if (username != null && password1 != null) {
			String password = MD5Util.MD5(password1);
			// 传入帐号和密码去获取平台帐号信息
			Account account = accountService.getAccountByNameAndPwd(username, password);
			if (account != null) {
				// 若能取到帐号信息则登录成功
				modelMap.put("success", true);
				// 同时在session里设置用户信息
				request.getSession().setAttribute("user", account.getUsername());
			} else {
				modelMap.put("success", false);
				modelMap.put("errMsg", "用户名或密码错误");
			}
		} else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "用户名和密码均不能为空");
		}
		return modelMap;
	}
	
	@RequestMapping(value = "/changeuserpwd", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> changeUserPwd(HttpSession session,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "oldpwd") String oldpwd,
			@RequestParam(value = "newpwd") String newpwd,
			HttpServletRequest request) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		Account account = accountService.getAccountByName(username);
		if(account == null){
			System.out.println("------------------------------");
			System.out.println("登录已失效，请重新登录");
			map.put("success", false);
		    map.put("errMsg", "登录已失效，请重新登录");
		}else if(account.getPassword() == oldpwd){
			System.out.println("用户账号密码输入正确");
			if(accountService.updateAccountPwd(username, newpwd)){
				System.out.println("更新密码成功");
				map.put("success", true);
			}
			
		}else if(account.getPassword() != oldpwd){
			System.out.println("密码输入错误");
			map.put("success", false);
			map.put("errMsg", "密码输入错误");
	}
			return map;		
	}
}
