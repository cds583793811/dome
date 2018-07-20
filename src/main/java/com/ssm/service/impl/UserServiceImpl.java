package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	 /**
     * 注入UserMapper接口
     */
    @Autowired
    private UserMapper userMapper;
    
	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(id);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		 User user = userMapper.findUserById(id);
	        return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		 List<User> allUser = userMapper.findAll();
	        return allUser;
	}

}
