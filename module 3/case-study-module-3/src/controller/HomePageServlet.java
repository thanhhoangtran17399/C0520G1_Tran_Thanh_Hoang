package controller;

import bo.CustomerBO;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HomePageServlet",urlPatterns = {"","/HomePage"})
public class HomePageServlet extends HttpServlet {
    CustomerBO customerBO = new CustomerBO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "createCustomer":
                createCustomer(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
            int customerId = Integer.parseInt(request.getParameter("customerId"));
            int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
            String customerName = request.getParameter("customerName");
            String customerBirthday = request.getParameter("customerBirthday");
            int customerGender = Integer.parseInt(request.getParameter("customerGender"));
            String customerIdCard = request.getParameter("customerIdCard");
            String customerPhone = request.getParameter("customerPhone");
            String customerEmail = request.getParameter("customerEmail");
            String customerAddress = request.getParameter("customerAddress");

            Customer customer = new Customer(customerId, customerTypeId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
            customerBO.insertCustomer(customer);
            request.setAttribute("customer", customer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }

        switch (action) {
            case "createCustomer":
                showCustomerFom(request, response);
                break;
            case  "listCustomer":
                listCustomer(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/furama-resort/home_page.jsp");
        dispatcher.forward(request, response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList =  customerBO.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCustomerFom(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("customer/create.jsp");
    }


}
