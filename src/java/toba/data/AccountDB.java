

package toba.data;

/**
 *
 * @author Jennifer Jarrait
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import toba.business.Account;


public class AccountDB {
    public static void insert(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.persist(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public static Account getAccountById(long accountID) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            Account account = em.find(Account.class, accountID);
            return account;
        } finally {
            em.close();
        }
    }
}
