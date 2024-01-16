package com.csye6220.esdproject.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csye6220.esdproject.model.Admin;

import jakarta.persistence.EntityManager;

@Component
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Admin> get() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Admin> query = currentSession.createQuery("from Admin", Admin.class);
		List<Admin> list = query.getResultList();
		return list;
	}

	@Override
	public Admin get(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Admin adminObj = currentSession.get(Admin.class, id);
		return adminObj;
	}

	@Override
	public void save(Admin admin) {
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.merge(admin);
		
	}

	@Override
	public void delete(int id) {
		System.out.println("ID in DAO : " + id);
		Session currentSession =  entityManager.unwrap(Session.class);
		Admin adminObj = currentSession.get(Admin.class, id);
		System.out.println("ID in DAO : " + id);
		currentSession.remove(adminObj);
		
	}

	@Override
	public String getPassword(String userName) {
		
		System.out.println("userName in DAO : " + userName);
		String hql = "FROM Admin d WHERE d.userName = :userName";
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Admin> query = currentSession.createQuery(hql, Admin.class);
        query.setParameter("userName", userName);
        List<Admin> results = query.getResultList();
        
        System.out.println("hql --------- > " + hql );
        System.out.println(Arrays.toString(results.toArray()));
        System.out.println("PASSWORD -->  "+ results.get(0).getPassword());
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
