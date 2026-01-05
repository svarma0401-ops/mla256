package com.test;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    private EmployeeDao dao = new EmployeeDaoImpl();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        if ("add".equals(action)) {
            dao.addEmployee(new Employee(
                    Integer.parseInt(req.getParameter("id")),
                    req.getParameter("name"),
                    Double.parseDouble(req.getParameter("salary")),
                    req.getParameter("department")
            ));
        }
        else if ("update".equals(action)) {
            dao.updateEmployee(new Employee(
                    Integer.parseInt(req.getParameter("id")),
                    req.getParameter("name"),
                    Double.parseDouble(req.getParameter("salary")),
                    req.getParameter("department")
            ));
        }
        else if ("delete".equals(action)) {
            dao.deleteEmployee(Integer.parseInt(req.getParameter("id")));
        }

        resp.sendRedirect("viewEmployees.jsp");
    }
}
