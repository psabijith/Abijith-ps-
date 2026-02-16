package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.JobSeekerDAO;

@WebServlet("/delete-jobseeker-by-id")
public class DeleteJobSeekerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        JobSeekerDAO jsDAO = new JobSeekerDAO();
        jsDAO.deleteJobSeekerById(id);

        response.sendRedirect("ShowAllJobSeeker");
    }
}