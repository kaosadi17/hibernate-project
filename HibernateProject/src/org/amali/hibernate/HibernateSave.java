package org.amali.hibernate;

import org.amali.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSave {

	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Amali");
		
		SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
		Session session =  sessionFac.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

	}

}
