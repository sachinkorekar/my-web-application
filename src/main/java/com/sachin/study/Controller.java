package com.sachin.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web-application")
public class Controller {
	
	@RequestMapping(method = RequestMethod.GET)
	public String controller() {
		return "My first Web application for doker !";
	}

}
