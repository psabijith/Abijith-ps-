package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.JobSeekerDAO;
import com.aitrich.servlets.Entity.JobSeeker;

@WebServlet("/update-jobseeker-by-id")
public class UpdateJobSeekerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    JobSeekerDAO dao = new JobSeekerDAO();

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        JobSeeker js = dao.getJobSeekerById(id);

        req.setAttribute("js", js);

        req.getRequestDispatcher("updatejobseeker.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String skills = req.getParameter("skills");
        String resume = req.getParameter("resume");

        JobSeeker js = new JobSeeker();
        js.setId(id);
        js.setName(name);
        js.setEmail(email);
        js.setSkills(skills);
        js.setResume(resume);

        dao.updateJobSeeker(js);

        res.sendRedirect("ShowAllJobSeeker");
    }
}