package com.sapient.service;

import com.sapient.model.*;
import java.util.List;

public interface UserService {
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
