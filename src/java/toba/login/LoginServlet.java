

package toba.login;

import toba.business.Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import toba.data.LoginDB;

/**
 *
 * @author Jennifer Jarrait
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        String url = "/login.html";
        
        //get current action
        String action = request.getParameter("action");
        
        // perform action and set URL to appropriate page
        if (action.equals("add")) {
            
            // get parameters from the request
            String username = request.getParameter("username");        
            String password = request.getParameter("password");
            
             // store data in Login object 
                Login login = new Login(username, password);
                
                
            if ("jsmith@toba.com".equals(username)&&("letmein".equals(password))) {
               url = "/account_activity.html";
               
                LoginDB.insert(login);
                // set Login object in request object and set URL
                request.setAttribute("login", login);
                
                
            }
            else {
                url = "/login_failure.html";
                
            }
        }
         // forward request and response objects to specified URL
        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
        
       
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }

}
