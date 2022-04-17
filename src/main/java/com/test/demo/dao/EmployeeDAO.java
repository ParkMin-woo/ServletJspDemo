package com.test.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.demo.vo.EmployeeVO;

public class EmployeeDAO {
	public EmployeeVO searchEmployee(int empNo) {
		/*
		EmployeeVO vo = new EmployeeVO();
		vo.setEmpNo(1001);
		vo.setEmpName("박민우");
		vo.setEmpAddr("경기도 안산시");
		vo.setEmpAge(31);
		return vo;
		*/
		EmployeeVO vo = new EmployeeVO();
		try {
			String className = "org.mariadb.jdbc.Driver";
			Class.forName(className);
			
			String url = "jdbc:mariadb://localhost:3306/test";
			String user = "temp1";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from emp_test_table where emp_no=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, empNo);
			ResultSet rs = st.executeQuery();
			if( rs.next() ) {
				// return true;
				vo.setEmpNo(rs.getInt(1));
				vo.setEmpName(rs.getString(2));
				vo.setEmpAddr(rs.getString(3));
				vo.setEmpAge(rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
}
