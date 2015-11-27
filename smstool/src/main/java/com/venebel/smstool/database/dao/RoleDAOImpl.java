package com.venebel.smstool.database.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.venebel.smstool.database.Role;
import com.venebel.smstool.database.util.HibernateUtil;

public class RoleDAOImpl implements RoleDAO {

	@Override
	public Role getRole(int id) {
		
		Session session = null;
		Role role = null;
		
		try {
			session = HibernateUtil.openSession();
			role = (Role) session.load(Role.class, id);
		} catch (HibernateException he) { 
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
		
        return role;
	}

}
