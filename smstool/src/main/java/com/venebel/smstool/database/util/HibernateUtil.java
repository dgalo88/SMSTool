package com.venebel.smstool.database.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	// singleton
	private static HibernateUtil instance = new HibernateUtil();

	private SessionFactory sessionFactory;

	// --------------------------------------------------------------------------------

	private HibernateUtil() {

		Configuration configuration = new Configuration();
		configuration.configure("com/venebel/smstool/database/util/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();

	}

	// --------------------------------------------------------------------------------

	public static HibernateUtil getInstance() {

		if (instance == null) {
			instance = new HibernateUtil();
		}

		return instance;

	}

	// --------------------------------------------------------------------------------

	public Session getSession() {
		return sessionFactory.openSession();
	}

	// --------------------------------------------------------------------------------

	public static Session openSession() {
		return HibernateUtil.getInstance().getSession();
	}

	// --------------------------------------------------------------------------------

}
