package com.csye6220.esdproject.service;

import java.util.List;

import com.csye6220.esdproject.model.Admin;

public interface AdminService {
	
	List<Admin> get();
	
	Admin get(int id);
	
	void save(Admin reception);
	
	void delete (int id);
	
	String getPassword(String userName);

}
