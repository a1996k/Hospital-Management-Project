package com.csye6220.esdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csye6220.esdproject.dao.AppointmentDAO;
import com.csye6220.esdproject.model.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDAO appointmentDAO;
	
	@Transactional
	@Override
	public List<Appointment> get() {
		return appointmentDAO.get();
//		return null;
	}

	@Transactional
	@Override
	public Appointment get(int id) {
		return appointmentDAO.get(id);
//		return null;
	}

	@Transactional
	@Override
	public void save(Appointment appointment) {
		appointmentDAO.save(appointment);
	}

	@Transactional
	@Override
	public void delete(int id) {
		appointmentDAO.delete(id);
	}

//	@Transactional
//	@Override
//	public String getPassword(String userName) {
//		System.out.println("userName in SERVICE : " + userName);
//		System.out.println("PASSWORD in SERVICE : " + appointmentDAO.getPassword(userName));
//		return appointmentDAO.getPassword(userName);
//	}

}
