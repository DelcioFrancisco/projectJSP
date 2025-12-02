package servlet;

import dao.ResponsibilityDAO;
import model.Responsibility;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/responsibilities")
public class ResponsibilityServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int userId = Integer.parseInt(req.getParameter("id"));

        Responsibility respList =
                new ResponsibilityDAO().getById(userId);

        req.setAttribute("responsibilities", respList);

        req.getRequestDispatcher("responsibilities.jsp")
                .forward(req, resp);
    }
}
