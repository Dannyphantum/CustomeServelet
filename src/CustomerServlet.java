

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerApplication.Customer;
import customerApplication.CustomerApp;
import customerApplication.DBConnection;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String LastName = request.getParameter("LastName");
		CustomerApp app = new CustomerApp();
		DBConnection connect = new DBConnection();
		Customer cust = new Customer();
		String lname = cust.LastName();
		
		connect.getData("customers", "Company", "customers.CompanyID", "Company.companyID", "customers.LastName", lname, "FullName", 
				"StreetAddress", "City", "ZipCode", "EmailAddress", "Position", "Company");
	}
	

}
