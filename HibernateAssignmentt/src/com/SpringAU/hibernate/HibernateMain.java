package com.SpringAU.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.SpringAU.data.Buyer;
import com.SpringAU.data.Comodity;
import com.SpringAU.data.OnlineShopping;

public class HibernateMain
{
	public static void main(String args[])
	{
		
		OnlineShopping onlineShopping = new OnlineShopping();
		onlineShopping.setItemId(1);
		
		Comodity comodity = new Comodity();
		comodity.setItemName("Maggi");
		comodity.setItemPrice(100);
		
		Buyer buyer = new Buyer("iti layout",123);
		buyer.setId(1);
		buyer.setName("saurabh"); 
		buyer.setOnlineShopping(onlineShopping);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(onlineShopping);
		session.save(comodity);
		session.save(buyer);
		
		session.getTransaction().commit();
		session.close();
		
		
	}
}
