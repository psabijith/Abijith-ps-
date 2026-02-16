package com.aitrich.servlets.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitrich.servlets.DAO.EmployerDAO;
import com.aitrich.servlets.Entity.Employer;


@WebServlet("/ShowAllEmployer")
public class ShowAllEmployer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Employer> employerList = new EmployerDAO().showAllEmployee();
		
		request.setAttribute("employers", employerList);
		
		request.getRequestDispatcher("showemployer.jsp").forward(request, response);
	}

}
