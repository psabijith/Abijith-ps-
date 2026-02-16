package com.aitrich.servlets.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitrich.servlets.DAO.JobSeekerDAO;
import com.aitrich.servlets.Entity.JobSeeker;


@WebServlet("/ShowAllJobSeeker")
public class ShowAllJobSeekersServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<JobSeeker> seekerList = new JobSeekerDAO().showAllJobSeekers();

        request.setAttribute("jobseekers", seekerList);

        request.getRequestDispatcher("showjobseeker.jsp").forward(request, response);
    }
}

