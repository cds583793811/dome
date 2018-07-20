package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Staff;

public interface StaffMapper {

	Staff getByLoginNamePassword(Staff staff);

	List<Staff> listAll();
}
