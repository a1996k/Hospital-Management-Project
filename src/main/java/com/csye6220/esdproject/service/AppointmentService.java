package com.csye6220.esdproject.service;

import java.util.List;

import com.csye6220.esdproject.model.Appointment;

public interface AppointmentService {
	
	List<Appointment> get();
	
	Appointment get(int id);
	
	void save(Appointment appointment);
	
	void delete (int id);

}
