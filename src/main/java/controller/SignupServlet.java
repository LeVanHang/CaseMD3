package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Account;
import service.AccountService;

import java.io.IOException;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(urlPatterns = "/signup")

public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        LocalDate birthday = null;
        try{
             birthday = LocalDate.parse(request.getParameter("birthday"));
        }catch (Exception e){
            e.printStackTrace();
        }

        int role = Integer.parseInt(request.getParameter("id_role"));

        AccountService.addAccount(new Account(id,username,password,address,birthday,role));
        response.sendRedirect("/login");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}