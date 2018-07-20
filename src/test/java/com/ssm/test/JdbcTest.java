package com.ssm.test;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;

public class JdbcTest {

	String url = "jdbc:mysql://localhost:3306/dome";
	String name = "root";
	String pwd = "123456";
	
	@Test
	public void closed() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(url, name, pwd);
		System.out.println(conn);
	}
}
