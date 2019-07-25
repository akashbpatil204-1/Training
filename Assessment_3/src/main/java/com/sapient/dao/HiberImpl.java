package com.sapient.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.model.Post;
import com.sapient.model.User;

@Repository("hibernateDAOImpl")
public class HiberImpl implements UserServiceDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		return user;
	}

	public List<User> fetchAllUser() {
		System.out.println("hibernet fetch all");
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.createQuery(" from User ").list();
	}

	@Override
	public User findById(long id) {
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void deleteUser(long id) {
		Session session = sessionFactory.getCurrentSession();
		User p = session.byId(User.class).load(id);
		session.delete(p);

	}

	@Override
	public void updateUser(long id, User user) {
		Session session = sessionFactory.getCurrentSession();
		User p1 = session.byId(User.class).load(id);
		p1.setName(user.getName());

		session.saveOrUpdate(p1);

	}

	// post
	@Override
	public Post savePost(long id, Post post) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(post);
		return post;
	}

	@Override
	public List<Post> fetchAllPost(long id) {
		System.out.println("in hibernet fetch");
		Session session = sessionFactory.getCurrentSession();
		User user = session.byId(User.class).load(id);
		List<Post> pl = user.getPosts();
		
		return pl;
	}

	@Override
	public Post findById(long uid, long pid) {
		System.out.println("in hibernet fetch");
		Session session = sessionFactory.getCurrentSession();
		User user = session.byId(User.class).load(uid);
		List<Post> pl = user.getPosts();
		
		return pl.get((int)pid);
	}

	@Override
	public void deletePost(long uid, long pid) {
		Session session = sessionFactory.getCurrentSession();
		Post post = session.byId(Post.class).load(uid);
		session.delete(post);
	}

	@Override
	public void deleteAllPost(long id) {
		Session session = sessionFactory.getCurrentSession();
		Post post = session.byId(Post.class).load(id);
		session.delete(post);

	}

	// post

}
