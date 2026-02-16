package com.aitrich.servlets.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.aitrich.servlets.DAO.EmployerDAO;
import com.aitrich.servlets.Entity.Employer;

@WebServlet("/update-employer-by-id")
public class UpdateEmployerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    EmployerDAO dao = new EmployerDAO();

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        Employer emp = dao.getEmployerById(id);

        req.setAttribute("emp", emp);

        req.getRequestDispatcher("updateemployer.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String companyName = req.getParameter("companyName");
        String email = req.getParameter("email");

        Employer emp = new Employer();
        emp.setId(id);
        emp.setCompanyName(companyName);
        emp.setEmail(email);

        dao.updateEmployer(emp);

        res.sendRedirect("ShowAllEmployer");
    }
}