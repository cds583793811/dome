package com.ssm.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.model.Staff;
import com.ssm.result.Result;
import com.ssm.service.StaffService;

@RestController
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	StaffService staffService;
	
	@RequestMapping("/login")
	public Result<Staff> login(@RequestParam("loginName") String loginName,
			@RequestParam("password") String password) {
		Staff staff1 = staffService.getByLoginNamePassword(loginName, password);
		if (staff1 == null) {
			return Result.failure(null, "账号密码不对");
		}
		return Result.success(staff1);
	}
}
