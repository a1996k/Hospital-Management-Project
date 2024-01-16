package com.csye6220.esdproject.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csye6220.esdproject.dao.PatientDAO;
import com.csye6220.esdproject.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	@Transactional
	@Override
	public List<Patient> get() {
		return patientDAO.get();
	}

	@Transactional
	@Override
	public Patient get(int id) {
		return patientDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Patient patient) {
		patientDAO.save(patient);
	}

	@Transactional
	@Override
	public void delete(int id) {
		patientDAO.delete(id);
	}

	@Transactional
	@Override
	public List<String> get(String queryString) {
		List<String> l = patientDAO.get(queryString);
		System.out.println("IN SERVICE   : " + Arrays.toString(l.toArray()));
		return l;
	}

}
