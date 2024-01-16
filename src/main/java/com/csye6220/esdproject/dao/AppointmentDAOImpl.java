package com.csye6220.esdproject.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csye6220.esdproject.model.Appointment;

import jakarta.persistence.EntityManager;

@Component
public class AppointmentDAOImpl implements AppointmentDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Appointment> get() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Appointment> query = currentSession.createQuery("from Appointment", Appointment.class);
		List<Appointment> list = query.getResultList();
		return list;
	}

	@Override
	public Appointment get(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Appointment appointmentObj = currentSession.get(Appointment.class, id);
		return appointmentObj;
	}

	@Override
	public void save(Appointment appointment) {
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.merge(appointment);
		
	}

	@Override
	public void delete(int id) {
		System.out.println("ID in DAO : " + id);
		Session currentSession =  entityManager.unwrap(Session.class);
		Appointment appointmentObj = currentSession.get(Appointment.class, id);
		System.out.println("ID in DAO : " + id);
		currentSession.remove(appointmentObj);
		
	}

	@Override
	public List<String> get(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
