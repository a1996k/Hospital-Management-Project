package com.csye6220.esdproject.service;

import java.util.List;

import com.csye6220.esdproject.model.Reception;

public interface ReceptionService {
	
	List<Reception> get();
	
	Reception get(int id);
	
	void save(Reception reception);
	
	void delete (int id);
	
	String getPassword(String userName);

}
