package com.hibernate_nv_xml;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static  void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(10);
		e.setFirstName("vikrant");
		e.setLastName("varma"); 
		
		SessionFactory sessionfact=new Configuration().configure().buildSessionFactory();
		
		Session  session=sessionfact.openSession();
		session.beginTransaction();
		
		session.save(e);
		session.getTransaction().commit();
		session.close();
		
		
	}
	

}
