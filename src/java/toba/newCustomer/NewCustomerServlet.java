

package toba.newCustomer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import toba.business.User;
import toba.data.UserDB;
/**
 *
 * @author Jennifer Jarrait
 */
public class NewCustomerServlet extends HttpServlet {

 @Override
 protected void doPost(HttpServletRequest request,
                       HttpServletResponse response)
                       throws ServletException, IOException {
     
     String url = "/new_customer.jsp";
     
     // get current action
     String action = request.getParameter("action");
   
     
     // perform action and set URL to appropriate page
     if(action.equals("add")) {
         // get parameters from the request
         String firstName = request.getParameter("firstName");
         String lastName = request.getParameter("lastName");
         String phone = request.getParameter("phone");
         String address = request.getParameter("address");
         String city = request.getParameter("city");
         String state = request.getParameter("state");
         String zipcode = request.getParameter("zipcode");
         String email = request.getParameter("email");
         
         // store data in the User object
         User user = new User(firstName, lastName, phone, address,
                              city, state, zipcode, email);
         
         // validate the parameters
         String message;
         if (firstName == null || lastName == null || phone == null ||
             address == null || city == null || state == null || zipcode == null ||
             email == null || firstName.isEmpty() || lastName.isEmpty() ||
             phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() ||
             zipcode.isEmpty() || email.isEmpty()) {
             message = "Please fill out all the form fields.";
             url = "/new_customer.jsp";
         }
         else {
             message = "";
             url = "/success.html";
             UserDB.insert(user);
         }
         request.setAttribute("user", user);
         request.setAttribute("message", message);
     }
     getServletContext()
             .getRequestDispatcher(url)
             .forward(request, response);
 }
@Override
protected void doGet(HttpServletRequest request,
                     HttpServletResponse response)
                     throws ServletException, IOException {
    doPost(request, response);
}
   
}