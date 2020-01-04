package com.deloitte.dept.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteDept
 */
@WebServlet("/DeleteDept")
public class DeleteDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int deptno=Integer.parseInt(request.getParameter("deptno"));


		int rows=0;
		DeptDao dao = new DeptDaoImpl();
		rows=dao.deleteDept(deptno);
		if(rows>0)
		{
		out.println("deleted<br>");
		out.println(deptno);
		}
		else
		out.println("not deleted");
	}

}
