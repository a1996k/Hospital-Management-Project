package com.csye6220.esdproject.dao;

import java.util.List;

import com.csye6220.esdproject.model.Patient;

public interface PatientDAO {

	List<Patient> get();
	
	List<String> get(String queryString);
	
	Patient get(int id);
	
	void save(Patient patient);
	
	void delete (int id);
	
	String getPassword(String userName);
}
