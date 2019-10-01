

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

@Entity
public class Transaction implements Serializable {
    
    
    
    public Transaction() {
        
    }
    
    public Transaction(double checkBalance, double credit, double debit) {
        this.checkBalance = checkBalance;
        this.credit = credit;
        this.debit = debit;
    }
    
    
    private Long transID;
    private double checkBalance;
    private double credit;
    private double debit;
    
    @ManyToOne
    private Account account;
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)          
    public Long getTransID() {
        return transID;
    }
    
    public double getCheckBalance() {
        return checkBalance;
    }
    
    public double getCredit() {
        return credit;
    }
    
    public double getDebit() {
        return debit;
    }
    
    public void setTransID(Long transID) {
        this.transID = transID;
    }
    
    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }
    
    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    public void setDebit(double debit) {
        this.debit = debit;
    }
}
