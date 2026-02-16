package com.aitrich.servlets.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.JobDAO;
import com.aitrich.servlets.Entity.Job;

@WebServlet("/ShowAllJob")
public class ShowAllJobServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Job> jobList = new JobDAO().showAllJobs();

        request.setAttribute("jobs", jobList);

        request.getRequestDispatcher("showjob.jsp").forward(request, response);
    }
}