package com.sapient.dao;

import java.util.List;

import com.sapient.model.Post;
import com.sapient.model.User;

public interface UserServiceDao {
	public User saveUser(User user);

	public List<User> fetchAllUser();

	public User findById(long id);

	public void deleteUser(long id);
	
	public void updateUser(long id, User user);

	public Post savePost(long id , Post post);

	public List<Post> fetchAllPost(long id);

	public Post findById(long uid, long pid);

	public void deletePost(long uid, long pid );

	public void deleteAllPost(long id);

}
