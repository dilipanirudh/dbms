package com.deloitte.dept.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DeptDaoImpl implements DeptDao{
	private Connection conn=null;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public void openConnection() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pass = "tiger";
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int insertDept(Dept dept) {
		openConnection();
		int rows=0;
		try {
			pst = conn.prepareStatement(DeptUtils.insertqry);
			pst.setInt(1, dept.getDeptno());
			pst.setString(2, dept.getDname());
			pst.setString(3, dept.getLoc());
			rows=pst.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally{
		close();
	}
	return rows;
	}
	@Override
	public int updateDept(int deptno, String dname, String loc) {
		openConnection();
		int row=0;
		try {
		pst = conn.prepareStatement(DeptUtils.CompleteUpdationQuery);
		pst.setInt(1, deptno);
		pst.setString(2,dname);
		pst.setString(3,loc);
		

		row = pst.executeUpdate();

		} catch (SQLException e) {
		e.printStackTrace();
		}
		close();
		return row;
	}
	@Override
	public int deleteDept(int deptno) {
		openConnection();
		int row=0;
		try {
		pst = conn.prepareStatement(DeptUtils.deleteqry);

		pst.setInt(1,deptno);
		row = pst.executeUpdate();

		} catch (SQLException e) {
		e.printStackTrace();
		}
		close();
		return row;

		}
	}


