package com.csye6220.esdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csye6220.esdproject.dao.AdminDAO;
import com.csye6220.esdproject.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	@Transactional
	@Override
	public List<Admin> get() {
		return adminDAO.get();
//		return null;
	}

	@Transactional
	@Override
	public Admin get(int id) {
		return adminDAO.get(id);
//		return null;
	}

	@Transactional
	@Override
	public void save(Admin admin) {
		adminDAO.save(admin);
	}

	@Transactional
	@Override
	public void delete(int id) {
		adminDAO.delete(id);
	}

	@Transactional
	@Override
	public String getPassword(String userName) {
		System.out.println("userName in SERVICE : " + userName);
		System.out.println("PASSWORD in SERVICE : " + adminDAO.getPassword(userName));
		return adminDAO.getPassword(userName);
	}

}
