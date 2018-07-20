package com.ssm.service;

import java.util.List;

import com.ssm.model.Staff;

public interface StaffService {

	Staff getByLoginNamePassword(Staff staff);

	List<Staff> listAll();
	
}
