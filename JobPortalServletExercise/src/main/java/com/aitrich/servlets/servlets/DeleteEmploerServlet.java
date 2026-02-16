package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitrich.servlets.DAO.EmployerDAO;

@WebServlet("/delete-employer-by-id")
public class DeleteEmploerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));
	EmployerDAO empDAO = new EmployerDAO();
	empDAO.deleteEmployerById(id);
	response.sendRedirect("ShowAllEmployer");
	}

}
