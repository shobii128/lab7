/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author Shoaib
 */
public class HibernateUtil {
  private static SessionFactory sessionFactory;

  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    
    return sessionFactory;
  }
}