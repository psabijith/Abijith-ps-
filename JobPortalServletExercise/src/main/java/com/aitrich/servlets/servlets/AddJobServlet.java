package com.aitrich.servlets.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.JobDAO;
import com.aitrich.servlets.Entity.Job;

@WebServlet("/add-job")
public class AddJobServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    JobDAO dao = new JobDAO();

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int employerId = Integer.parseInt(req.getParameter("employerId"));

        Job job = new Job();
        job.setId(id);
        job.setTitle(title);
        job.setDescription(description);
        job.setSalary(salary);
        job.setEmployerId(employerId);

        dao.addJob(job);

        res.sendRedirect("ShowAllJob");
    }
}