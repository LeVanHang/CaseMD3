package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Product;
import service.ProductService;

import java.io.IOException;

@WebServlet(urlPatterns = "/edit")
public class EditProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (Product p: ProductService.products
             ) {
            if (p.getId() == id ) {
                req.setAttribute("p", p);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("editProduct.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String img = req.getParameter("img");
        int amount = Integer.parseInt(req.getParameter("amount"));

        ProductService.edit( new Product(id, name, price, img, amount));

        resp.sendRedirect("/product");

    }
}
