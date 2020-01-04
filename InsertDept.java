package com.deloitte.dept.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertDept
 */
@WebServlet("/InsertDept")
public class InsertDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		
		Dept dept=new Dept(deptno,dname,loc);
		DeptDao dao=new DeptDaoImpl();
		int rows = dao.insertDept(dept);
		if(rows>0)
			out.println("inserted");
		else
			out.println("not inserted");
	}

}
