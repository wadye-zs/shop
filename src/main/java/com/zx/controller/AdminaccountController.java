package com.zx.controller;


import com.zx.beans.AdminAccount;
import com.zx.service.AdminaccountService;
import com.zx.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/adminaccount")
public class AdminaccountController {
	@Autowired
	private AdminaccountService adminaccountService;

	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> logincheck(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<String, Object>();

		// 获取输入的帐号
		String username = HttpServletRequestUtil.getString(request, "userName");
		// 获取输入的密码
		String password = HttpServletRequestUtil.getString(request, "password");
		System.out.println("------------------------------");
		System.out.println(username);
		System.out.println(password);
		System.out.println("------------------------------");
		// 非空校验
		if (username != null && password != null) {
			// 传入帐号和密码去获取平台帐号信息
			AdminAccount adminaccount = adminaccountService.getAdminaccountByNameAndPwd(username, password);
			if (adminaccount != null) {
				// 若能取到帐号信息则登录成功
				modelMap.put("success", true);
				// 同时在session里设置用户信息
				request.getSession().setAttribute("user", adminaccount.getUsername());
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
}
