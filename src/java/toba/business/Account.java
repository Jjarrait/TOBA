

package toba.business;

/**
 *
 * @author Jennifer Jarrait
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.List;


@Entity

public class Account implements Serializable {
    
    
    
    public Account(User user, double balance) {
        this.user = user;
        this.balance = balance;
    }
    
    public Account() {
        
    }
    @ManyToOne
    private User user;
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Transaction> transaction;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Long accountID;
    private double balance;
   
    
   
    public double getAccountID() {
        return accountID;
    }
    
    public double getBalance() {
        return balance;
    }
       
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double Credit() {
        Transaction transaction = new Transaction();
        balance = balance - transaction.getCredit();
        return balance;
        
    }
    
    public double Debit() {
        Transaction transaction = new Transaction();
        balance = balance - transaction.getDebit();
        return balance;
    }
    
    
}
