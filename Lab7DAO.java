/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Shoaib
 */
public class Lab7DAO {
       public void save( Challenge c) {
        // Get session factory and open a new session
        SessionFactory factory = HibernateUtil.getSessionFactory();

        // Begin transaction
        try (Session session = factory.openSession()) {
            // Begin transaction
            Transaction t = session.beginTransaction();
            // Persist city and commit changes
            session.persist(c);
            t.commit();
            // Close the session
        }
    }
    
}
