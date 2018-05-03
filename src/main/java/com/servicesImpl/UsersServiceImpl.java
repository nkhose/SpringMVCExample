package com.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.entities.Users;
import com.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	UsersDao userDao;

	public boolean saveOrUpdate(Users users) {
		// TODO Auto-generated method stub
		return userDao.saveOrUpdate(users);
	}

	public List<Users> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	public boolean delete(Users users) {
		// TODO Auto-generated method stub
		return userDao.delete(users);
	}

}
