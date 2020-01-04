package com.deloitte.dept.beans;

public interface DeptDao {
	void openConnection();
	void close();
	int insertDept(Dept dept);
	int updateDept(int deptno, String dname, String loc);
	int deleteDept(int deptno);
	
}
