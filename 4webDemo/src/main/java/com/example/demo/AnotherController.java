
package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnotherController {

	
	 public AnotherController() {
		System.out.println("Another controller created");
	}
	
	@RequestMapping("/")
	public String greet() {

		return "login";
	}

	@RequestMapping("/verify")
	public String verifyMethod(HttpServletRequest req) {
		String name = req.getParameter("user"); // called as dependancy injection without creating object
		System.out.println(name);
		HttpSession session = req.getSession();
		session.setAttribute("uname", name);
		return "welcome";

	}

	@RequestMapping("/verify2")
	public String verifyMethod2(@RequestParam("user") String name , HttpSession session) {
		session.setAttribute("uname", name);
		System.out.println(name);
		return "welcome";

	}
	
	@RequestMapping("/verify3")
	public String verifyMethod3( String user ,String pwd, HttpSession session) {
		System.out.println(user);
		session.setAttribute("uname", user);
		session.setAttribute("pass", pwd);
		return "welcome";

	}
	
	@RequestMapping("/verify4")//preffered way
	public ModelAndView verifyMethod4(Person p ) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("per" , p);
		System.out.println(p);
		mv.setViewName("loggedIn");
		return mv;

	}


}
