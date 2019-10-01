

package toba.newCustomer;
	

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	
        import toba.business.Account;
        import toba.data.AccountDB;
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
	     
	     String url = "";
	         
	     // get current action
	     String action = request.getParameter("action");   
	     
	     // perform action and set URL to appropriate section
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
	         String username = request.getParameter("lastName") +
	                           request.getParameter("zipcode");
	         String password = ("Welcome1");
	                                         
	         // store data in the User object
                 User user = new User();
                 user.setFirstName(firstName);
                 user.setLastName(lastName);
                 user.setPhone(phone);
                 user.setAddress(address);
                 user.setCity(city);
                 user.setState(state);
                 user.setZipcode(zipcode);
                 user.setEmail(email);
                 user.setUsername(username);
                 user.setPassword(password);



	         
	           // store the User object as a session attribute
	        HttpSession session = request.getSession();
	        session.setAttribute("user", user);
	        
	        
	             
	         // validate the parameters
	         String message="";
	         if (firstName == null || lastName == null || phone == null ||
	             address == null || city == null || state == null || zipcode == null ||
	             email == null ||  firstName.isEmpty() || lastName.isEmpty() ||phone.isEmpty() || 
	             address.isEmpty() || city.isEmpty() || state.isEmpty() ||
	             zipcode.isEmpty() || email.isEmpty()) {
	             message = "Please fill out all the form fields.";
	             url = "/new_customer.jsp";
	         }
	        else {
	             message = "";
	             url = "/success.jsp";
                    // create Account object
                    Account account = new Account(user, 25.00);
                    AccountDB.insert(account);

	             UserDB.insert(user);
	             
	         }
	         
	         request.setAttribute("user", user);
	         request.setAttribute("message", message);
	         
	     }
	         else if (action.equals("resetPassword")) {
	             url = resetPassword(request, response);
	         }
	        
	     
	     getServletContext()
	             .getRequestDispatcher(url)
	             .forward(request, response);
	 }
	
	      
	        
	 
	 
	 private String resetPassword(HttpServletRequest request,
	                              HttpServletResponse response) {
	              
	     HttpSession session = request.getSession();
	     User user = (User) session.getAttribute("user");
	               
	     // store the data in the User object
	     user.setPassword(request.getParameter("password"));
	     
	     // store as a session attribute
	     session.setAttribute("user", user);
	            
	     // return a URL for the account_activity page
	        String url = "/account_activity.jsp";
                UserDB.update(user);
	        return url;  
	 }
	@Override
	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response)
	                     throws ServletException, IOException {
	    doPost(request, response);
	}
	

	

	   
	}
       


