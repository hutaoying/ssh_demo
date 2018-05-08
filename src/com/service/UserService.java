package com.service;

import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;

@Transactional
public class UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("service.......");
		userDao.add();
		
	}

}
