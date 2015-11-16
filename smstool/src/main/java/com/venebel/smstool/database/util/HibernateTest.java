package com.venebel.smstool.database.util;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.venebel.smstool.database.User;

public class HibernateTest {

	public static void saveUser(String username, String password) {

		Session session = null;

		try {

			session = HibernateUtil.getInstance().getSession();

			session.beginTransaction();

			User user = new User();

			user.setUsername(username);

			StandardPasswordEncoder encoder = new StandardPasswordEncoder();

			user.setPassword(encoder.encode(password));

			session.save(user);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {

				if (session.getTransaction() != null) {
					session.getTransaction().commit();
				}

				session.close();

			}
		}

	}

	public static User getUser(String username) {

		User user = null;
		Session session = null;

		try {

			session = HibernateUtil.getInstance().getSession();

			session.beginTransaction();

			Criteria criteria = null;

			try {

				criteria = session.createCriteria(User.class).add( //
						Restrictions.and(Restrictions.eq("username", username)));

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			user = (User) criteria.uniqueResult();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {

				if (session.getTransaction() != null) {
					session.getTransaction().commit();
				}

				session.close();

			}
		}

		return user;

	}

	public static void main(String[] args) {

		String username = "test";
		String password = "1234";

		StandardPasswordEncoder encoder = new StandardPasswordEncoder();

		HibernateTest.saveUser(username, password);

		User user = HibernateTest.getUser(username);

		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());

		System.out.println("matches ? " + encoder.matches(password, user.getPassword()));
		System.out.println("matches ? " + encoder.matches("pass", user.getPassword()));

		user = HibernateTest.getUser("error");

		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());

	}

}
