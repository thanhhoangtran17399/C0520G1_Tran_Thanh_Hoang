import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customerList"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Risa Tachibana","1999-01-01","Japan"));
        customerList.add(new Customer("Konomi Nishinomiya","1999-02-02","Japan"));
        customerList.add(new Customer("Akiho Yoshizawa","1999-03-03","Japan"));
        customerList.add(new Customer("Iori Kogawa","1999-04-04","Japan"));
        customerList.add(new Customer("Tokuda","1900-05-05","Japan"));
        request.setAttribute("CustomerListServlet",customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
