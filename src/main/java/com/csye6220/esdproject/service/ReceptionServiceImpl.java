package com.csye6220.esdproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csye6220.esdproject.dao.ReceptionDAO;
import com.csye6220.esdproject.model.Reception;

@Service
public class ReceptionServiceImpl implements ReceptionService {

	@Autowired
	private ReceptionDAO receptionDAO;
	
	@Transactional
	@Override
	public List<Reception> get() {
		return receptionDAO.get();
	}

	@Transactional
	@Override
	public Reception get(int id) {
		return receptionDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Reception reception) {
		receptionDAO.save(reception);
	}

	@Transactional
	@Override
	public void delete(int id) {
		receptionDAO.delete(id);
	}

	@Transactional
	@Override
	public String getPassword(String userName) {
		System.out.println("userName in SERVICE : " + userName);
		System.out.println("PASSWORD in SERVICE : " + receptionDAO.getPassword(userName));
		return receptionDAO.getPassword(userName);
	}

}
