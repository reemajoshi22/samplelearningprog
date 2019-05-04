package com.hibernate.hibernateMappings.oneToOne;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("onetoOneVendorCustomer.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// parent object
		Vendor v = new Vendor();

		v.setVendorId(101);
		v.setVendorName("java4s");

		// creating 3 child objects
		Customer c1 = new Customer();

		c1.setCustomerId(504);
		c1.setCustomerName("customer4");

		Customer c2 = new Customer();

		c2.setCustomerId(505);
		c2.setCustomerName("customer5");

		Customer c3 = new Customer();

		c3.setCustomerId(506);
		c3.setCustomerName("customer6");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();
		//session.save(v);
		System.out.println("Object saved successfully.....!!");

		// deleting single parent object with all its child
		Object o = session.get(Vendor.class, new Integer(101));
		Vendor v1 = (Vendor) o;
		// session.delete(v1);
		// System.out.println("Object deleted successfully.....!!");
		// deleting all the parent objects and all its children
		Query qry = session.createQuery("from Vendor v2");
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object o1 = it.next();
			Vendor v2 = (Vendor) o1;
			session.delete(v2);
		}
		System.out
				.println("One To Many is Done for deleting all parents with childs...!");
		tx.commit();
		session.close();
		factory.close();
	}

}