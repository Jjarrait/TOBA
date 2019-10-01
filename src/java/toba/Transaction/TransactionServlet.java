

package toba.Transaction;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.business.Account;
import toba.business.Transaction;
import toba.data.AccountDB;
import toba.data.TransactionDB;

/**
 *
 * @author Jennifer Jarrait
 */
public class TransactionServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/transaction.jsp";
        
        
            
        // get current action
        String action = request.getParameter("action");
        if (action.equals("add")) {
            // get parameters from the request
            String checkBalance = request.getParameter("checkBalance");
            String credit = request.getParameter("credit");
            String debit = request.getParameter("debit");
            
            
           
            
            // store data in Transaction object and save in database            
            Transaction transaction = new Transaction(Double.parseDouble(checkBalance),
                                          Double.parseDouble(credit), Double.parseDouble(debit));
            
            TransactionDB.insert(transaction);
        }
        
        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    
}
