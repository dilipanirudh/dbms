package com.deloitte.dept.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateDept
 */
@WebServlet("/UpdateDept")
public class UpdateDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname =request.getParameter("dname");
		String loc=request.getParameter("loc");
	
		int rows=0;
		DeptDao dao = new DeptDaoImpl();
		rows=dao.updateDept(deptno,dname,loc);
		if(rows>0)
		{
		out.println("updated<br>");
		out.println(deptno+" "+dname+" "+loc);
		}
		else
		out.println("not updated");


	}

}
