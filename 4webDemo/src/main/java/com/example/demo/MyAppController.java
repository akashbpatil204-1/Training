package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAppController {

	public MyAppController() {
		System.out.println("Myaap controller created");
	}

	@RequestMapping("/abc")
	// @ResponseBody
	public String someMethod() {
		System.out.println("You have access /abc url path....someMethod");
		// return "demo.html";
		// return "<h1>This is data</h1>";
		return "view/demo.jsp";
	}

	@RequestMapping("/xyz")
	public String anotherMethod() {
		return "demo";
	}
}
