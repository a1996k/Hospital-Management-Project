package com.csye6220.esdproject.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csye6220.esdproject.model.Doctor;

import jakarta.persistence.EntityManager;

@Component
public class DoctorDAOImpl implements DoctorDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Doctor> get() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Doctor> query = currentSession.createQuery("from Doctor", Doctor.class);
		List<Doctor> list = query.getResultList();
		return list;
	}

	@Override
	public Doctor get(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Doctor doctorObj = currentSession.get(Doctor.class, id);
		return doctorObj;
	}

	@Override
	public void save(Doctor doctor) {
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.merge(doctor);
		
	}

	@Override
	public void delete(int id) {
		System.out.println("ID in DAO : " + id);
		Session currentSession =  entityManager.unwrap(Session.class);
		Doctor doctorObj = currentSession.get(Doctor.class, id);
		System.out.println("ID in DAO : " + id);
		currentSession.remove(doctorObj);
		
	}

	@Override
	public String getPassword(String userName) {
		
		System.out.println("userName in DAO : " + userName);
		String hql = "FROM Doctor d WHERE d.userName = :userName";
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Doctor> query = currentSession.createQuery(hql, Doctor.class);
        query.setParameter("userName", userName);
        List<Doctor> results = query.getResultList();
        
        System.out.println("hql --------- > " + hql );
        System.out.println(Arrays.toString(results.toArray()));
        System.out.println("PASSWORD -->  "+ results.get(0).getPassword());
//        return results.get(0);
        String pw = results.get(0).getPassword();
        System.out.println("PW IN DAO -->  "+pw);
		return pw;
//        return null;
	}

	@Override
	public List<String> get(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
