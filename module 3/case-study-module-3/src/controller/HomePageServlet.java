package controller;

import bo.CustomerBO;
import bo.EmployeeBO;
import bo.IServiceBO;
import bo.ServiceBO;
import model.Customer;
import model.Employee;
import model.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;

@WebServlet(name = "HomePageServlet", urlPatterns = {"", "/HomePage"})
public class HomePageServlet extends HttpServlet {
    CustomerBO customerBO = new CustomerBO();
    ServiceBO serviceBO = new ServiceBO();
    EmployeeBO employeeBO = new EmployeeBO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "createCustomer":
                createCustomer(request, response);
                break;
            case "update":
                updateCustomer(request, response);
                break;
            case "createService":
                createService(request, response);
                break;
            case "createEmployee":
                createEmployee(request, response);
                break;
            case "updateEmployee":
                updateEmployee(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday =request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("username");
        Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, username);
        employeeBO.updateEmployee(employee);
        List<Employee> employeeList = employeeBO.selectAllEmployee();
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday =request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("username");
        Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, username);
        employeeBO.insertEmployee(employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/create.jsp");
        dispatcher.forward(request, response);
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        String serviceName = request.getParameter("serviceName");
        int serviceArea = Integer.parseInt(request.getParameter("serviceArea"));
        double serviceCode = Double.parseDouble(request.getParameter("serviceCode"));
        int serviceMaxPeople = Integer.parseInt(request.getParameter("serviceMaxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int serviceTypeId = Integer.parseInt(request.getParameter("serviceTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenionce = request.getParameter("descriptionOtherConvenionce");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        Service service = new Service(serviceId, serviceName, serviceArea, serviceCode, serviceMaxPeople, rentTypeId, serviceTypeId, standardRoom, descriptionOtherConvenionce, poolArea,numberOfFloors );
        serviceBO.insertService(service);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/service/create.jsp");
        dispatcher.forward(request, response);
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        customerBO.updateCustomer(customer);
        List<Customer> customerList = customerBO.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/create.jsp");
        dispatcher.forward(request, response);
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
            case "listCustomer":
                listCustomer(request, response);
                break;
            case "update":
                showUpdateForm(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchById(request, response);
                break;
            case "createService":
                showServiceFom(request, response);
                break;
            case "listService":
                listService(request, response);
                break;
            case "createEmployee":
                showEmployeeFom(request, response);
                break;
            case "listEmployee":
                listEmployee(request, response);
                break;
            case "updateEmployee":
                showUpdateEmpForm(request, response);
                break;
            case "deleteEmployee":
                deleteEmployee(request, response);
                break;
            case "searchEmployee":
                searchEmpById(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    private void searchEmpById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("customerId"));
        List<Employee> employeeList = employeeBO.searchEmpById(employeeId);
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        employeeBO.deleteEmployee(employeeId);
        List<Employee> employeeList = employeeBO.selectAllEmployee();
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showUpdateEmpForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = employeeBO.selectEmployee(employeeId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/update.jsp");
        request.setAttribute("employee", employee);
        dispatcher.forward(request, response);
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeBO.selectAllEmployee();
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showEmployeeFom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/create.jsp");
        dispatcher.forward(request, response);
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = serviceBO.selectAllService();
        request.setAttribute("serviceList", serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/service/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showServiceFom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/service/create.jsp");
        dispatcher.forward(request, response);
    }

    private void searchById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        List<Customer> customerList = customerBO.searchById(customerId);
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        customerBO.deleteCustomer(customerId);
        List<Customer> customerList = customerBO.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        Customer customer = customerBO.selectCustomer(customerId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/update.jsp");
        request.setAttribute("customer", customer);
        dispatcher.forward(request, response);
    }

    private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/furama-resort/home_page.jsp");
        dispatcher.forward(request, response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerBO.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCustomerFom(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/create.jsp");
        dispatcher.forward(request, response);
    }
}
