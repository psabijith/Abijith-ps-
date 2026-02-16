package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitrich.servlets.DAO.EmployerDAO;
import com.aitrich.servlets.Entity.Employer;

@WebServlet("/add-employer")
public class AddEmployerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Employer emp = new Employer();
	EmployerDAO empDAO = new EmployerDAO();
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String companyName = request.getParameter("companyname");
		String email = request.getParameter("email");
		
		emp.setId(id);
		emp.setCompanyName(companyName);
		emp.setEmail(email);
		
		try {
			empDAO.addEmployer(emp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
	}

}
