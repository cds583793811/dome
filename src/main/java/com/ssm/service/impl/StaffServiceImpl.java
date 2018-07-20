package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.StaffMapper;
import com.ssm.model.Staff;
import com.ssm.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffMapper staffMapper;
	
	@Override
	public Staff getByLoginNamePassword(Staff staff) {
		if (staff == null) {
			return null;
		}
		return staffMapper.getByLoginNamePassword(staff);
	}

	@Override
	public List<Staff> listAll() {
		return staffMapper.listAll();
	}

}
