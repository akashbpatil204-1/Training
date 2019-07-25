package com.sapient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.model.Post;
import com.sapient.model.User;
import com.sapient.dao.*;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier(value = "hibernateDAOImpl")
	private UserServiceDao userServiceDao;

	public UserServiceImpl(@Qualifier(value = "hibernateDAOImpl") UserServiceDao userServiceDao) {
		this.userServiceDao = userServiceDao;
	}

	@Transactional
	public User saveUser(User user) {
		System.out.println("Inside the save product method of Product service class ....");
		return userServiceDao.saveUser(user);
	}

	@Transactional
	public List<User> fetchAllUser() {
		// TODO Auto-generated method stub
		return userServiceDao.fetchAllUser();
	}

	@Transactional
	public User findById(long id) {
		System.out.println("Inside the find by id  user service class ....");
		return userServiceDao.findById(id);
	}

	@Transactional
	public void deleteUser(long id) {
		 userServiceDao.deleteUser(id);
	}

	@Transactional
	public void updateUser(long id, User user) {
		System.out.println("Inside the update product method of Product service class ....");
		 userServiceDao.updateUser(id, user);
		
	}

	@Transactional
	public Post savePost(long id, Post post) {
		// TODO Auto-generated method stub
		
		return userServiceDao.savePost(id, post);
	}

	@Transactional
	public List<Post> fetchAllPost(long id) {
		// TODO Auto-generated method stub
		return userServiceDao.fetchAllPost(id);
	}

	@Transactional
	public Post findById(long uid, long pid) {
		// TODO Auto-generated method stub
		return userServiceDao.findById(uid, pid);
	}

	@Transactional
	public void deletePost(long uid, long pid) {
		// TODO Auto-generated method stub
		userServiceDao.deletePost(uid, pid);	
	}

	@Transactional
	public void deleteAllPost(long id) {
		// TODO Auto-generated method stub
		userServiceDao.deleteAllPost(id);
	}

}
