package com.csye6220.esdproject.dao;

import java.util.List;


import com.csye6220.esdproject.model.User;

public interface UserDAO {
	
	List<User> get();
	
	User get(int id);
	
	void save(User user);
	
	void delete (int id);

}
