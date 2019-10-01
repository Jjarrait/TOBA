

package toba.data;

/**
 *
 * @author Jennifer Jarrait
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import toba.business.Transaction;

public class TransactionDB {
    public static void insert(Transaction transaction) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try {
            trans.begin();
            em.persist(transaction);
            trans.commit();
            
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public static List<Transaction> selectAll() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT t FROM transaction t";
        TypedQuery<Transaction> q = em.createQuery(qString, Transaction.class);
        
        List<Transaction> transaction;
        try {
            transaction = q.getResultList();
            if (transaction == null || transaction.isEmpty())
                transaction = null;
        }finally {
            em.close();
        }
        return transaction;
        
    }
    
}
