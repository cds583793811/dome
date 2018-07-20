package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.model.Staff;
import com.ssm.model.User;
import com.ssm.result.Result;
import com.ssm.service.StaffService;
import com.ssm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;  
	@Autowired
	StaffService staffService;
	
	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public Result<Staff> login(Staff staff) {
		Staff data = staffService.getByLoginNamePassword(staff);
		return Result.success(data);
	}
	/**
	 * 查询所有登录用户
	 */
	@RequestMapping("/staff_all")
	public Result<ArrayList<Staff>> listAll() {
		List<Staff> listStaff = staffService.listAll();
		return Result.success((ArrayList)listStaff);
		
	}
	/**
	 * 登录成功跳转到主页面
	 */
	@RequestMapping("main")
	public String toMain() {
		
		return "main";
	}
    /**
     *跳转到添加用户界面
     */
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    /**
     * 添加用户并重定向  
     */
    @RequestMapping("addUser") 
    public String addUser(Model model,User user){
        if(user != null){
            userService.saveUser(user);
        }
        return "redirect:/user/userInfo";
    }

    /**
     * 修改用户
     */
    @RequestMapping("updateUser")  
    public String UpdateUser(Model model,User user){
             if(userService.updateUser(user)){  
                    user = userService.findUserById(user.getId());  
                    model.addAttribute("user", user);  
                    return "redirect:/user/userInfo";  
                } 
         return "/error";  
    }

    /**
     * 查询所有用户
     */
    @RequestMapping("getAllUser")  
    public String getAllUser(Model model){
        List<User> user = userService.findAll();
        model.addAttribute("userList",user);
        return "allUser";
    }

    /**
     * 查询单个用户
     */
    @RequestMapping("/getUser")  
    public String getUser(int id,Model model){
        model.addAttribute("user", userService.findUserById(id));  
        return "editUser";
    }
    /**
     * 根据id删除用户
     */
    @RequestMapping("/delUser") 
    public String deleteUser(int id,Model model){
        model.addAttribute("user", userService.deleteUser(id));  
        return "redirect:/user/userInfo";
    }

    /**
     * 分页查询用户信息
     * @param pn 默认从第一页开始  请求参数
     */
    @RequestMapping("userInfo")
    public String getUsers(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
        //从第一条开始 每页查询五条数据
        PageHelper.startPage(pn, 5);
        List<User> users = userService.findAll();
        //将用户信息放入PageInfo对象里
        PageInfo page = new PageInfo(users,5);
        model.addAttribute("pageInfo", page);
        return "allUser";
    }
}
