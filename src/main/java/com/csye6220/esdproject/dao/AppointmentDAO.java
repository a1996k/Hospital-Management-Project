package com.csye6220.esdproject.dao;

import java.util.List;

import com.csye6220.esdproject.model.Appointment;

public interface AppointmentDAO {

	List<Appointment> get();
	
	List<String> get(String queryString);
	
	Appointment get(int id);
	
	void save(Appointment admin);
	
	void delete (int id);
}
