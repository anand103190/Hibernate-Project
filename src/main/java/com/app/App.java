package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.modal.UserDetails;

public class App {

    
    public static void main(String[] args) {
    System.out.println("First Hibernate Program");
    
    UserDetails userDetails = new UserDetails();
    
    userDetails.setId(5);
    userDetails.setUser_Name("av ");
    
    //Configuration ki help se configure()method call kiya
    Configuration cfg = new Configuration();
    
    // configuration file ko configure()method me load kiya
    cfg.configure("/com/app/hibernate.cfg.xml");
    
    //cfg ki help se Configurationg ka buildSessionFactory()method call kiya or 
    //buildSessionFactory()method hme jo object dega bo =SessionFactoryImpl.
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    
    Session  session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(userDetails);
    session.getTransaction().commit();
    session.close();
    sessionFactory.close();
    System.out.println(sessionFactory);
    
    }

}