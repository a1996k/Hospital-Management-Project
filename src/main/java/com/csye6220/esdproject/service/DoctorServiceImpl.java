package com.csye6220.esdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csye6220.esdproject.dao.DoctorDAO;
import com.csye6220.esdproject.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDAO doctorDAO;
	
	@Transactional
	@Override
	public List<Doctor> get() {
		return doctorDAO.get();
	}

	@Transactional
	@Override
	public List<String> get(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Doctor get(int id) {
		return doctorDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Doctor doctor) {
		doctorDAO.save(doctor);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		System.out.println("ID in SERVICE : " + id);
		doctorDAO.delete(id);
		
	}

	@Override
	public String getPassword(String userName) {
		System.out.println("userName in SERVICE : " + userName);
		System.out.println("PASSWORD in SERVICE : " + doctorDAO.getPassword(userName));
		return doctorDAO.getPassword(userName);
	}

}
