package com.csye6220.esdproject.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csye6220.esdproject.model.Doctor;
import com.csye6220.esdproject.model.Reception;

import jakarta.persistence.EntityManager;

@Component
public class ReceptionDAOImpl implements ReceptionDAO {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Reception> get() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Reception> query = currentSession.createQuery("from Reception", Reception.class);
		List<Reception> list = query.getResultList();
		return list;
	}

	@Override
	public Reception get(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Reception receptionObj = currentSession.get(Reception.class, id);
		return receptionObj;
	}

	@Override
	public void save(Reception reception) {
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.merge(reception);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Reception receptionObj = currentSession.get(Reception.class, id);
		currentSession.remove(receptionObj);
		
	}

	@Override
	public List<String> get(String queryString) {
		
//		Session currentSession =  entityManager.unwrap(Session.class);
//		Query<String> query = currentSession.createQuery("SELECT u.name FROM User u", String.class);
//		List<String> list = query.getResultList();
//		return list;
		return null;
	}

	@Override
	public String getPassword(String userName) {
		
		System.out.println("userName in DAO : " + userName);
		String hql = "FROM Reception r WHERE r.userName = :userName";
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Reception> query = currentSession.createQuery(hql, Reception.class);
        query.setParameter("userName", userName);
        List<Reception> results = query.getResultList();
        
        System.out.println("hql --------- > " + hql );
        System.out.println(Arrays.toString(results.toArray()));
        System.out.println("PASSWORD -->  "+ results.get(0).getPassword());
        String pw = results.get(0).getPassword();
        System.out.println("PW IN DAO -->  "+pw);
		return pw;

	}

}
