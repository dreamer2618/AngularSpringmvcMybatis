package com.yb.service.impl;

import com.yb.dao.UserDao;
import com.yb.entity.User;
import com.yb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	//public List<User> userList = getAllUsers();
	
	@Resource
	private UserDao userDao;
	
	public User login(User user) {
		return userDao.login(user);
	}
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}

    public void addUser(String userName){
    	userDao.addUser(userName);
    }

    public void deleteUser(String userName){
    	userDao.deleteUser(userName);
    }

    public void deleteAll(){
    	userDao.deleteAll();
    }

}
