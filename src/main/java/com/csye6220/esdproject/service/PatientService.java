package com.csye6220.esdproject.service;

import java.util.List;

import com.csye6220.esdproject.model.Patient;

public interface PatientService {
	
	List<Patient> get();
	
	List<String> get(String queryString);
	
	Patient get(int id);
	
	void save(Patient patient);
	
	void delete (int id);

}
