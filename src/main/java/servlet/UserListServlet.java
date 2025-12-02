package servlet;

import dao.UserDAO;
import lombok.SneakyThrows;
import model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class UserListServlet extends HttpServlet {

    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<User> users = new UserDAO().getAll();
        req.setAttribute("users", users);

        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
}
