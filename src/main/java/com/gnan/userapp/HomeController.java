package com.gnan.userapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String welcomeMsg() {
		return "Index.jsp";
	}

}
