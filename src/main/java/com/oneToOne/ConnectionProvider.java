package com.oneToOne;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;

import com.example.learning.model.DatabaseModel;
import com.example.learning.model.DatabaseModelTwo;
import com.hibernate.JDBCSample;

public class ConnectionProvider {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	public Connection connection;

	public ConnectionProvider() throws SQLException {
		// connection = getConnections();
		// sessionFactory=buildSessionFactory();
	}

	public static SessionFactory buildSessionFactory() {
		System.out.println("buildSessionFactory  loaded");
		Configuration configuration = new Configuration();
		configuration.configure("oneToOne.cfg.xml");
		System.out.println("Hibernate Configuration loaded");
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build());
		System.out.println("Hibernate above sessionFactory  ");
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getConnections() throws SQLException {
		return sessionFactory.getCurrentSession();

	}
	public void read(DatabaseModel model) {
		Session session = ConnectionProvider.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
	}

	public StoreModel findById(int no_of_copies_avail) {
		Session session = ConnectionProvider.getSessionFactory().openSession();
		Criteria cr = session.createCriteria(StoreModel.class);
		cr.add(Restrictions.eq("no_of_copies_avail", no_of_copies_avail));
		List<?> results = cr.list();
		System.out.println("list is"+results);
		StoreModel bookModel = null;
		if (results != null && results.size() > 0) {
			bookModel = (StoreModel) results.get(0);
		}

		return bookModel;
	}

}
