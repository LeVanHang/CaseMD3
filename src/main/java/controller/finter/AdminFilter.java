package controller.finter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Account;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/admin.jsp")
public class AdminFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account == null) {
            res.sendRedirect("/login");
        } else if (account.getId_role() == 2) {
            chain.doFilter(req, res);
        } else {
            PrintWriter printWriter = res.getWriter();
            printWriter.println("<h1>Quyền User Không có quyền truy cập</h1>");
        }
    }
}

