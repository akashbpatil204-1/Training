package com.sapient.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.model.Post;
import com.sapient.model.User;
import com.sapient.service.UserService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/save", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public void saveUser(@Valid @RequestBody User user) {
		System.out.println("Inside save  userCont..");
		this.userService.saveUser(user);
	}

	@GetMapping(value = "/{id}", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public User findById(
			@ApiParam(value = "${UserController.getUserById}", required = true) @PathVariable("id") int id) {
		User p = this.userService.findById(id);
		return p;
	}

	@GetMapping(value = "/", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	// @ApiOperation(value = "Fetch all employees", notes = "API to fetch all the
	// employees")
	public List<User> listAll() {
		List<User> users = this.userService.fetchAllUser();
		return users;
	}

	@PutMapping(value = "/{id}", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		System.out.println("Came inside update User method");
		this.userService.updateUser(id, user);
	}

	@PostMapping(value = "/{id}")
	public void deleteUser(@PathVariable int id) {
		System.out.println("Deleted the User successfully");
		this.userService.deleteUser(id);
	}
////post

	@PostMapping(value = "/psave", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public Post createPost1(
			@ApiParam(value = "${UserController.getUserById}", required = true) @PathVariable("id") long id,
			Post post) {
		this.userService.savePost(id, post);
		return post;
	}

	@GetMapping(value = "/fetchall/{id}", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public List<Post> fetchAllPost1(
			@ApiParam(value = "${UserController.getUserById}", required = true) @PathVariable("id") long id) {
		// TODO
		List<Post> ll = userService.fetchAllPost(id);
		return ll;
	}

	@GetMapping(value = "/postbyid/{uid}/{pid}", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public Post findById(

			@ApiParam(value = "${ProductController.getProductById}", required = true) @PathVariable("uid") int uid,

			@ApiParam(value = "${ProductController.getProductById}", required = true) @PathVariable("ppid") int pid) {
		Post p = this.userService.findById(uid, pid);
		return p;
	}

	@DeleteMapping(value = "/dpost/{id}/{id}")
	public void deletePostByUserId1(
			@ApiParam(value = "${ProductController.getProductById}", required = true) @PathVariable("uid") int uid,
			@ApiParam(value = "${ProductController.getProductById}", required = true) @PathVariable("ppid") int pid) 
	{ 
		this.userService.deletePost(uid, pid);;
		
	}
	
	@DeleteMapping(value = "/dallpost/{id}")
	public Post deleteAllPostByUserId1(@ApiParam(value = "${ProductController.getProductById}", required = true) @PathVariable("uid") long uid) { // TODO Auto-generated method stub
		this.userService.deleteAllPost(uid);
		return null;
	}

}
