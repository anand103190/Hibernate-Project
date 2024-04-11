package com.app;

	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.modal.UserDetails;

	public class UpdateRecordSecondApproach {

		   public static void main(String[] args) {
		        
		        Configuration cfg = new Configuration();
		        
		        cfg.configure("com/rsg/hibernate.cfg.xml");
		        
		        SessionFactory sessionFactory = cfg.buildSessionFactory();
		        
		        Session session = sessionFactory.openSession();
		        
		        UserDetails userDetails = new UserDetails();
		        
		        userDetails.setId(1);
		        
		        userDetails.setUser_Name("Akansha Singh");
		        
		        Transaction tx = session.beginTransaction();
		        
		        session.update(userDetails);
		        
		        tx.commit();
		        
		        System.out.println("Object update successfully...");
		        
		        session.close();
		        sessionFactory.close();

		    }

		}