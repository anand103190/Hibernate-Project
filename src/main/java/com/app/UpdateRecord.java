package com.app;

	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.modal.UserDetails;

	public class UpdateRecord {

	    public static void main(String[] args) {
	   Configuration cfg = new Configuration();
	        
	        cfg.configure("/com/app/hibernate.cfg.xml");
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session  session = sessionFactory.openSession();
	        Object obj = session.load(UserDetails.class, new Integer(3));
	        UserDetails userDetails = (UserDetails)obj;
	        Transaction tx = session.beginTransaction();
	        userDetails.setUser_Name("Madhu");
	        System.out.println("Update Record");
	        tx.commit();
	        session.close();
	        sessionFactory.close();
	    }

	}

