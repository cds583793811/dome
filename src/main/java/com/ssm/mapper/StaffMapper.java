package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Staff;


public interface StaffMapper {

	Staff getByLoginNamePassword(Staff staff);

	List<Staff> listAll();

	Staff getByLoginNamePassword(@Param("loginName") String loginName,@Param("password") String password);
}
