package com.yb.service;


import com.yb.entity.User;

import java.util.List;

public interface UserService {

	public User login(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();

    public void addUser(String userName);

    public void deleteUser(String userName);

    public void deleteAll();
}
