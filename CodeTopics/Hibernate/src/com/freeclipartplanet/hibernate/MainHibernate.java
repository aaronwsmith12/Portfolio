package com.freeclipartplanet.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.freeclipartplanet.userdetails.UserDetails;

public class MainHibernate {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Aaron Smith");
		
		// builds a session factory and is assigned to a session object
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.beginTransaction().commit();

	}

}
