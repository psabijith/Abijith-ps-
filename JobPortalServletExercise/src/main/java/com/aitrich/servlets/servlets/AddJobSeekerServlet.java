package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitrich.servlets.DAO.JobSeekerDAO;
import com.aitrich.servlets.Entity.JobSeeker;

@WebServlet("/add-job-seeker")
public class AddJobSeekerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	JobSeeker js = new JobSeeker();
	JobSeekerDAO jsDAO = new JobSeekerDAO();
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String skills = request.getParameter("skills");
		String resume = request.getParameter("resume");
		
		js.setId(id);
		js.setName(name);
		js.setEmail(email);
		js.setSkills(skills);
		js.setResume(resume);
		
		jsDAO.addJobSeeker(js);
		
		response.sendRedirect("index.jsp");
	}

}
