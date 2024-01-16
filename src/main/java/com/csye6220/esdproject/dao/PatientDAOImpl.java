package com.csye6220.esdproject.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csye6220.esdproject.model.Patient;

import jakarta.persistence.EntityManager;

@Component
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Patient> get() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Patient> query = currentSession.createQuery("from Patient", Patient.class);
		List<Patient> list = query.getResultList();
		return list;
	}

	@Override
	public Patient get(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Patient patientObj = currentSession.get(Patient.class, id);
		return patientObj;
	}

	@Override
	public void save(Patient patient) {
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.merge(patient);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Patient patientObj = currentSession.get(Patient.class, id);
		currentSession.remove(patientObj);
		
	}

//	@Override
//	public List<String> get(String queryString) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public List<String> get(String queryString) {
		
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<String> query = currentSession.createQuery(queryString, String.class);
		List<String> list = query.getResultList();
		System.out.println("IN DAO   : " + Arrays.toString(list.toArray()));
		
		return list;
//		return null;
	}

	@Override
	public String getPassword(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
