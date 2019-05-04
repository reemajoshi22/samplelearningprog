package com.hibernate;

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

public class JDBCSample {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	public Connection connection;

	public JDBCSample() throws SQLException {
		// connection = getConnections();
		// sessionFactory=buildSessionFactory();
	}

	public static SessionFactory buildSessionFactory() {
		System.out.println("buildSessionFactory  loaded");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
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

	public void save() {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		DatabaseModel databaseModel = new DatabaseModel();
		databaseModel.setId(11);
		databaseModel.setName("eleven");
		databaseModel.setAge(11);
		databaseModel.setId(12);
		databaseModel.setName("twelve");
		databaseModel.setAge(12);
		databaseModel.setId(107);
		databaseModel.setName("one zero seven");
		databaseModel.setAge(107);
		session.save(databaseModel);
		transaction.commit();
	}

	public void deleteAll() {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from DatabaseModel");
		
		query.executeUpdate();
		
		transaction.commit();
		session.close();
	}

	public void delete() {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		/*DatabaseModel deleteCriteria = (DatabaseModel) session
				.createCriteria(DatabaseModel.class)
				.add(Restrictions.eq("age", 230)).uniqueResult();*/
		Criteria deleteCriteria = session.createCriteria(DatabaseModel.class);
		List<?> listToBeDeleted =deleteCriteria.list();
		Iterator<?> list=listToBeDeleted.iterator();
		while(list.hasNext()){
			session.delete(list.next());
		}
		transaction.commit();

		session.close();
	}

	public DatabaseModel findByAge(int age) {

		Session session = JDBCSample.getSessionFactory().openSession();
		Criteria cr = session.createCriteria(DatabaseModel.class);
		cr.add(Restrictions.eq("age", age));
		List<?> results = cr.list();

		DatabaseModel model = null;
		if (results != null && results.size() > 0) {
			model = (DatabaseModel) results.get(0);
		}

		return model;
	}

	public void save(DatabaseModel model) {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(model);
		transaction.commit();
	}
	public void saveModelTwo(DatabaseModelTwo model) {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(model);
		transaction.commit();
	}

	public void delete(DatabaseModel model) {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * Object o = session.load(DatabaseModel.class, new Integer(104));
		 * DatabaseModel p = (DatabaseModel) o;
		 */
		session.delete(model);
		transaction.commit();
		session.close();
	}

	public void update(DatabaseModel model) {
		Session session = JDBCSample.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(model);
		transaction.commit();
		session.close();
	}
}
