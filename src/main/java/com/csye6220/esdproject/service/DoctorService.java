package com.csye6220.esdproject.service;

import java.util.List;

import com.csye6220.esdproject.model.Doctor;

public interface DoctorService {
	
	List<Doctor> get();
	
	List<String> get(String queryString);
	
	Doctor get(int id);
	
	void save(Doctor doctor);
	
	void delete (int id);
	
	String getPassword(String userName);

}
