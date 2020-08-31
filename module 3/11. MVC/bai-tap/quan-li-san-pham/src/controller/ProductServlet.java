package controller;

import dao.ProductDao;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/productServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "update":
                updateProduct(request, response);
                break;
            default:
                break;
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDescription = request.getParameter("productDescription");
        String producer = request.getParameter("producer");
        Product product = new Product(id,name,price,productDescription,producer);
        ProductDao.save(product);
        request.setAttribute("message", "Update product is successfully!!!");
        goStudentList(request,response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int) (Math.random() * 10000);
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDescription = request.getParameter("productDescription");
        String producer = request.getParameter("producer");
        Product product = new Product(id,name,price,productDescription,producer);
        ProductDao.save(product);
        request.setAttribute("message", "Create new product is successfully!!!");
        goStudentList(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            case "create":
                response.sendRedirect("create.jsp");
                break;
            case "detail":
                getInforProduct(request,response);
                break;
            case "update":
                goUpdate(request,response);
                break;
            case "delete":
                goDelete(request,response);
                break;
            default:
            goStudentList(request,response);
            break;
        }
    }

    private void goDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        ProductDao.deleteById(id);
        request.setAttribute("message", "Delete product is successfully!!!");
        goStudentList(request,response);
    }

    private void goUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = ProductDao.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("update.jsp").forward(request,response);

    }

    private void getInforProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = ProductDao.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("detail.jsp").forward(request,response);
    }

    private void goStudentList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listProduct", ProductDao.getListProduct());
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
