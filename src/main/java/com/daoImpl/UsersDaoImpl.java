package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.entities.Users;

@Repository
@Transactional
public class UsersDaoImpl implements UsersDao {

	SessionFactory session;

	public boolean saveOrUpdate(Users users) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(users);
		return true;
	}

	public List<Users> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Users").list();
	}

	public boolean delete(Users users) {
		// TODO Auto-generated method stub
		try {
			session.getCurrentSession().delete(users);
		} catch (Exception ex) {
			return false;
		}

		return true;
	}

}
