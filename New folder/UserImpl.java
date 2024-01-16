package com.csye6220.esdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csye6220.esdproject.dao.UserDAO;
import com.csye6220.esdproject.model.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserImpl implements UserServices{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
