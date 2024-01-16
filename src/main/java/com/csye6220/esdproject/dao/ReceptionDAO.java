package com.csye6220.esdproject.dao;

import java.util.List;

import com.csye6220.esdproject.model.Reception;

public interface ReceptionDAO {
	
	List<Reception> get();
	
	List<String> get(String queryString);
	
	Reception get(int id);
	
	void save(Reception reception);
	
	void delete (int id);
	
	String getPassword(String userName);

}
