package com.csye6220.esdproject.dao;

import java.util.List;

import com.csye6220.esdproject.model.Admin;

public interface AdminDAO {

	List<Admin> get();
	
	List<String> get(String queryString);
	
	Admin get(int id);
	
	void save(Admin admin);
	
	void delete (int id);

	String getPassword(String userName);
}
