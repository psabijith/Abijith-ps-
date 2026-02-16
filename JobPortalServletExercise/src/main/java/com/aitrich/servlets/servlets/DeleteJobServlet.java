package com.aitrich.servlets.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.JobDAO;

@WebServlet("/delete-job-by-id")
public class DeleteJobServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        JobDAO dao = new JobDAO();
        dao.deleteJobById(id);

        response.sendRedirect("ShowAllJob");
    }
}